<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

</head>
<body>
<%@include file="header.jsp" %>
	<form action="/login" id="loginform">
		<input type="text" id="username" name="username">
		<input type="text" id="password" name="password">
	</form>
	<input type="button" id="commit" name="commit" value="提交">
	<div id="error" style="color: red;"></div>
<%@include file="footer.jsp" %>
	<script type="text/javascript">
		$(function(){
			$("#commit").click(function(){
				$.ajax({
					url:"/login",
					dataType:"json",
					data:$("#loginform").serialize(),
					type:"POST",
					success:function(data){
						if(data.result){
							window.location.href="/index";
						}else{
							$("#error").html(data.msg);
						}
					},
					error:function(data){
						alert(data.msg);
					}
				});
			});
		});
	</script>
</body>
</html>