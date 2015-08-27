package org.teeplay.cache;
 
import org.apache.log4j.Logger;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.core.io.Resource;

import net.sf.ehcache.config.Configuration;
import net.sf.ehcache.config.ConfigurationFactory;
 
public class EhCacheManager implements CacheManager, InitializingBean,
        DisposableBean {
 
    /**
     * This class's private log instance.
     */
    private static final Logger log = Logger.getLogger(EhCacheManager.class);
 
    /**
     * The EhCache cache manager used by this implementation to create caches.
     */
    protected net.sf.ehcache.CacheManager manager;
 
    /**
     * Indicates if the CacheManager instance was implicitly/automatically
     * created by this instance, indicating that it should be automatically
     * cleaned up as well on shutdown.
     */
    private boolean cacheManagerImplicitlyCreated = false;
 
    private Resource configLocation;
 
    /**
     * Default no argument constructor
     */
    public EhCacheManager() {
    }
 
    /**
     * Returns the wrapped Ehcache {@link net.sf.ehcache.CacheManager
     * CacheManager} instance.
     *
     * @return the wrapped Ehcache {@link net.sf.ehcache.CacheManager
     *         CacheManager} instance.
     */
    public net.sf.ehcache.CacheManager getCacheManager() {
        return manager;
    }
 
    /**
     * Sets the wrapped Ehcache {@link net.sf.ehcache.CacheManager CacheManager}
     * instance.
     *
     * @param manager
     *            the wrapped Ehcache {@link net.sf.ehcache.CacheManager
     *            CacheManager} instance.
     */
    public void setCacheManager(net.sf.ehcache.CacheManager manager) {
        this.manager = manager;
    }
 
    /**
     * @param configLocation
     *            the configLocation to set
     */
    public void setConfigLocation(Resource configLocation) {
        this.configLocation = configLocation;
    }
 
    /**
     * Loads an existing EhCache from the cache manager, or starts a new cache
     * if one is not found.
     *
     * @param name
     *            the name of the cache to load/create.
     */
    public final <K, V> Cache<K, V> getCache(String name) throws CacheException {
 
        if (log.isTraceEnabled()) {
            log.trace("Acquiring EhCache instance named [" + name + "]");
        }
 
        try {
            net.sf.ehcache.Ehcache cache = this.manager
                    .getEhcache(name);
            if (cache == null) {
                if (log.isInfoEnabled()) {
                    log.info("Cache with name " + name
                            + " does not yet exist.  Creating now."
 
                    );
                }
                this.manager.addCache(name);
 
                cache = manager.getCache(name);
 
                if (log.isInfoEnabled()) {
                    log.info("Added EhCache named [" + name + "]");
                }
            } else {
                if (log.isInfoEnabled()) {
                    log.info("Using existing EHCache named [" + cache.getName()
                            + "]");
                }
            }
            return new EhCache<K, V>(cache);
        } catch (net.sf.ehcache.CacheException e) {
            throw new CacheException(e);
        }
    }
 
 
    /**
     * Shuts-down the wrapped Ehcache CacheManager <b>only if implicitly
     * created</b>.
     * <p/>
     * If another component injected a non-null CacheManager into this instace
     * before calling {@link #init() init}, this instance expects that same
     * component to also destroy the CacheManager instance, and it will not
     * attempt to do so.
     */
    public void destroy() {
        if (cacheManagerImplicitlyCreated) {
            try {
                net.sf.ehcache.CacheManager cacheMgr = getCacheManager();
                cacheMgr.shutdown();
            } catch (Exception e) {
                log.warn("Unable to cleanly shutdown implicitly created CacheManager instance.  "
                        + "Ignoring (shutting down)...");
            }
            cacheManagerImplicitlyCreated = false;
        }
    }
 
    public void afterPropertiesSet() throws Exception {
        try {
            if (this.manager == null) {
                if (log.isDebugEnabled()) {
                    log.debug("cacheManager property not set.  Constructing CacheManager instance... ");
                }
//                Configuration configuration = (this.configLocation != null ? EhCacheManagerUtils
//                        .parseConfiguration(this.configLocation)
//                        : ConfigurationFactory.parseConfiguration());
                Configuration configuration = ConfigurationFactory.parseConfiguration();
                this.manager = new net.sf.ehcache.CacheManager(configuration);
                if (log.isTraceEnabled()) {
                    log.trace("instantiated Ehcache CacheManager instance.");
                }
                cacheManagerImplicitlyCreated = true;
                if (log.isDebugEnabled()) {
                    log.debug("implicit cacheManager created successfully.");
                }
            }
        } catch (Exception e) {
            throw new CacheException(e);
        }
         
    }
 
}