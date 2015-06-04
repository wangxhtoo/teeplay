1、配置Spring
	applicationContext.xml
2、数据源
	dataSource.xml
2、配置SpringMVC
	springMVC-servlet.xml
3、pom.xml中引入jar包
4、引入jetty插件
5、配置web.xml
6、Spring国际化配置
	1)、配置如下bean，basename中指定文件的基本名称，如下：message为基本名称，/internal为路径，有了
		基本名称spring会结合语言组成文件名，message_zh_CN.properties
	2)、在jsp页面中引入标签：
			<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
	3)、使用spring标签取值
			<spring:message code="title"/>

7、集成Shiro
第一部分集成登录验证功能
	1）pom.xml文件配置
		<dependency>
			<groupId>org.apache.shiro</groupId>
			<artifactId>shiro-core</artifactId>
			<version>1.2.3</version>
		</dependency>
		<dependency>
			<groupId>org.apache.shiro</groupId>
			<artifactId>shiro-web</artifactId>
			<version>1.2.3</version>
		</dependency>
		<dependency>
			<groupId>org.apache.shiro</groupId>
			<artifactId>shiro-spring</artifactId>
			<version>1.2.3</version>
		</dependency>
		<dependency>
			<groupId>org.apache.shiro</groupId>
			<artifactId>shiro-ehcache</artifactId>
			<version>1.2.3</version>
		</dependency>
	2）web.xml配置
		<filter>
	        <filter-name>shiroFilter</filter-name>
	        <filter-class>org.springframework.web.filter.DelegatingFilterProxy</filter-class>
	        <init-param>
	             <param-name>targetFilterLifecycle</param-name>
	             <param-value>true</param-value>
	        </init-param>
	   </filter>
	   
	   <filter-mapping>
	        <filter-name>shiroFilter</filter-name>
	        <url-pattern>/*</url-pattern>
	   </filter-mapping>
	3）创建applicationContext-shiro.xml文件
	4）创建TeeplayRealm.java文件
	5）实现登录方法：
		UsernamePasswordToken token = new UsernamePasswordToken(username, password);
		token.setRememberMe(true);
		Subject subject = SecurityUtils.getSubject();
		subject.login(token);	








