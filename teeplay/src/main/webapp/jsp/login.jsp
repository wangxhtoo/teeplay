<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body  align="center">

	<div>你还没登陆呢</div>
	
	<form action="/login" method="post">
		<input type="text" id="username" name="username"/>
		<br>
		<input type="text" id="password" name="password"/>
		<br>
		<input type="submit" value="登陆"/>
		<br>
		<a href="regist.jsp">注册</a>
	</form>

</body>
</html>