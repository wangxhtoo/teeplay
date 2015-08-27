/**
 *  Copyright 2015 WMS(560130911@163.com)
 *  
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *  
 *      http://www.apache.org/licenses/LICENSE-2.0
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.teeplay.cache;
 
/**
 * @author WMS
 * @date 2015年7月18日-下午8:57:03
 * @version 1.0
 */
@SuppressWarnings("serial")
public class CacheException extends RuntimeException {
 
    /**
     * 创建一个新的 <code>CacheException</code>.
     */
    public CacheException() {
        super();
    }
 
    /**
     * 创建一个新的 <code>CacheException</code>.
     *
     * @param message
     *            抛出异常的原因.
     */
    public CacheException(String message) {
        super(message);
    }
 
    /**
     * 创建一个新的 <code>CacheException</code>.
     *
     * @param cause
     *            抛出异常的底层原因.
     */
    public CacheException(Throwable cause) {
        super(cause);
    }
 
    /**
     * 创建一个新的 <code>CacheException</code>.
     *
     * @param message
     *            抛出异常的原因.
     * @param cause
     *            抛出异常的底层原因.
     */
    public CacheException(String message, Throwable cause) {
        super(message, cause);
    }
}