<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.7.2.min.js"></script>
</head>
<body>
<div>
	<form action="${basePath}/index" method="post" id="loginBtn" name="loginBtn" autocomplete="off">
		用户名：<input type="text" id="email" name="email" />
		<br/>
		密码:<input type="password" id="password" name="password"/>
		<br/>
		<input type="submit" value="登录" >
	</form>
	<div id="error" style="display: none;"></div>
</div>
<script type="text/javascript">
	$(function(){
		$("#loginBtn").ajaxForm({
			dataType : 'json',
			success : function(data) {
				alert(data.result);
				if (data.result == "true") {
					//location.href="/user/getUsers";			
				}else{
					$('#error').html(data.msg);
					return;
				}
			}
		});
	});
</script>
</body>
</html>