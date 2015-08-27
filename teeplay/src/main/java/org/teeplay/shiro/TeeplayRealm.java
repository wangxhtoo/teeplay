/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.teeplay.shiro;

import java.io.Serializable;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.teeplay.model.account.User;
import org.teeplay.service.account.UserService;

/**
 * Realm that exists to support salted credentials.  The JdbcRealm implementation needs to be updated in a future
 * Shiro release to handle this.
 */
public class TeeplayRealm extends AuthorizingRealm {

    private static final Logger log = LoggerFactory.getLogger(TeeplayRealm.class);

    public UserService userService;
    
	public UserService getUserService() {
		return userService;
	}

	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(
			PrincipalCollection principals) {
		log.info("[doGetAuthorizationInfo][principals:"+principals.toString()+"]");
		
		ShiroUser shiroUser = (ShiroUser)principals.getPrimaryPrincipal();
		User u = userService.getUserByU(shiroUser.loginName);
		SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
//		for (Role role : .getRoleList()) {
//			// 基于Role的权限信息
//			info.addRole(role.getName());
//			// 基于Permission的权限信息
//			info.addStringPermissions(role.getPermissionList());
//		}
		return info;
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(
			AuthenticationToken token) throws AuthenticationException {
		UsernamePasswordToken t = (UsernamePasswordToken)token;
		String username = t.getUsername();
		log.info("[doGetAuthenticationInfo][username:"+username+"]");
		User u = userService.getUserByU(username);
		if(u!=null){
			return new SimpleAuthenticationInfo(new ShiroUser(u.getLoginName(),u.getUserName()),u.getPassword(),
					ByteSource.Util.bytes(u.getUserName()), getName());
		}
		return null;
	}
	
	/**
	 * 自定义Authentication对象，使得Subject除了携带用户的登录名外还可以携带更多信息.
	 */
	public static class ShiroUser implements Serializable {

		/**
		* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)
		*/ 
		private static final long serialVersionUID = -4688213377814927100L;
		public String loginName;
		public String name;
		

		public ShiroUser(String loginName,String name) {
			this.loginName = loginName;
			this.name = name;
		}

		public String getName() {
			return name;
		}

		/**
		 * 本函数输出将作为默认的<shiro:principal/>输出.
		 */
		@Override
		public String toString() {
			return loginName;
		}

		/**
		 * 重载equals,只计算loginName;
		 */
		@Override
		public int hashCode() {
			return HashCodeBuilder.reflectionHashCode(this);
		}

		/**
		 * 重载equals,只比较loginName
		 */
		@Override
		public boolean equals(Object obj) {
			return EqualsBuilder.reflectionEquals(this, obj);
		}
	}

}
