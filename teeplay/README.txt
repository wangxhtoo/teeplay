1、配置Spring
	applicationContext.xml
2、数据源
	dataSource.xml
2、配置SpringMVC
	springMVC-servlet.xml
3、pom.xml中引入jar包
4、引入jetty插件
5、创建controller，页面jsp
6、Spring国际化配置
	1)、配置如下bean，basename中指定文件的基本名称，如下：message为基本名称，/internal为路径，有了
		基本名称spring会结合语言组成文件名，message_zh_CN.properties
	2)、在jsp页面中引入标签：
			<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
	3)、使用spring标签取值
			<spring:message code="title"/>
7、创建login.jsp作为登陆页面，创建LoginFilter.java作为登陆控制filter，所有未登陆的跳转到登陆页