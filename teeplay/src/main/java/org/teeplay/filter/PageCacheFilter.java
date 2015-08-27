package org.teeplay.filter;

import java.util.Enumeration;

import javax.servlet.FilterChain;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.ehcache.CacheException;
import net.sf.ehcache.constructs.blocking.LockTimeoutException;
import net.sf.ehcache.constructs.web.AlreadyCommittedException;
import net.sf.ehcache.constructs.web.AlreadyGzippedException;
import net.sf.ehcache.constructs.web.filter.FilterNonReentrantException;
import net.sf.ehcache.constructs.web.filter.SimplePageCachingFilter;

import org.apache.log4j.Logger;
import org.teeplay.util.TeeUtil;

public class PageCacheFilter extends SimplePageCachingFilter {
	private final static Logger log = Logger.getLogger(PageCacheFilter.class);
	private final static String NOT_CACHE_URL_LIST = "notCacheUrlList";
	private static String[] notCacheURLs;

	private void init() throws CacheException {
		String notCacheUrlList = filterConfig.getInitParameter(NOT_CACHE_URL_LIST);
		if (!TeeUtil.isNullEmpty(notCacheUrlList)) {
			notCacheURLs = notCacheUrlList.split(",");
		}
	}

	@Override
	protected void doFilter(final HttpServletRequest request, final HttpServletResponse response, final FilterChain chain)
			throws AlreadyGzippedException, AlreadyCommittedException, FilterNonReentrantException, LockTimeoutException, Exception {
		if (notCacheURLs == null) {
			init();
		}
		String request_url = request.getRequestURI();
		boolean flag = false;

		if (notCacheURLs != null && notCacheURLs.length > 0) {
			for (String notCacheURL : notCacheURLs) {
				if (request_url.contains(notCacheURL.trim())) {
					flag = true;
					break;
				}
			}
		}
		// 如果请求的url为不需要缓存的，则执行正常页面转向；否则缓存该页面
		if (flag) {
			chain.doFilter(request, response);
		} else {
			String query = request.getQueryString();
			if (query != null) {
				query = "?" + query;
			}
			log.info("当前请求被缓存：" + request_url + query);
			super.doFilter(request, response, chain);
		}
	}

	private boolean headerContains(final HttpServletRequest request, final String header, final String value) {
		logRequestHeaders(request);
		final Enumeration accepted = request.getHeaders(header);
		while (accepted.hasMoreElements()) {
			final String headerValue = (String) accepted.nextElement();
			if (headerValue.indexOf(value) != -1) {
				return true;
			}
		}
		return false;
	}

	@Override
	protected boolean acceptsGzipEncoding(HttpServletRequest request) {
		boolean ie6 = headerContains(request, "User-Agent", "MSIE 6.0");
		boolean ie7 = headerContains(request, "User-Agent", "MSIE 7.0");
		return acceptsEncoding(request, "gzip") || ie6 || ie7;
	}
}
