<%@page import="org.teeplay.util.TeeUtil"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%
	String basePath = request.getContextPath();
%>
<!DOCTYPE HTML>
<html>
<head>
<title><%=TeeUtil.HTML_TITLE %></title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<link href="/css/style.css" rel="stylesheet" type="text/css"
	media="all" />
<link href="/css/slider.css" rel="stylesheet"
	type="text/css" media="all" />
<script type="text/javascript" src="/js/jquery-1.9.0.min.js"></script>
<script type="text/javascript" src="/js/jquery.nivo.slider.js"></script>
<script type="text/javascript" src="/js/cookie.js"></script>
<script type="text/javascript" src="/js/login.js"></script>
<script type="text/javascript">
	$(window).load(function() {
		$('#slider').nivoSlider();
	});
</script>
</head>
<body>
	<input id="liindex" value="1" type="hidden">
	<jsp:include page="header.jsp" />
	<!------ Slider ------------>
	<div class="slider">
		<div class="slider-wrapper theme-default">
			<div id="slider" class="nivoSlider">
				<img src="/images/1.jpg" data-thumb="/images/1.jpg" alt="" /> 
				<img src="/images/2.jpg" data-thumb="/images/2.jpg" alt="" /> 
				<img src="/images/3.jpg" data-thumb="/images/3.jpg" alt="" /> 
				<img src="/images/4.jpg" data-thumb="/images/4.jpg" alt="" />
			</div>
		</div>
	</div>
	<!------End Slider ------------>
	<div class="main">
		<div class="wrap">
			<div class="sidebar">
				<div class="sidebar_left_top">
					<div class="services">
						<h3>Services</h3>
						<div class="services_list">
							<ul>
								<li><a href="#">Lorem ipsum dolor sit</a></li>
								<li><a href="#">Duis aute irure dolor</a></li>
								<li><a href="#">Sunt in culpa qui officia</a></li>
								<li><a href="#">vel illum qui dolorem eum</a></li>
								<li><a href="#">The wise man therefore</a></li>
								<li><a href="#">Sunt in culpa qui officia</a></li>
								<li><a href="#">Duis aute irure dolor</a></li>
								<li><a href="#">Sunt in culpa qui officia</a></li>
								<li><a href="#">Duis aute irure dolor</a></li>
							</ul>
						</div>
					</div>
				</div>
				<div class="sidebar_left_bottom">
					<div class="projects">
						<h3>Projects</h3>
						<div class="project_img">
							<img src="/images/project1.jpg"> <img
								src="/images/project2.jpg">
							<div class="view-all">
								<a href="events.jsp">See All</a>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="content">
				<div class="content_bottom">
					<h2>Welcome to our company</h2>
					<h3>Lorem Ipsum is simply dummy text of the printing atque
						corrupti quos dolores et quas molestias excepturi sint occaecati
						cupiditate non provident, similique sunt in culpa qui officia
						deserunt mollitia animi, id est laborum et dolorum fuga.</h3>
					<p>At vero eos et accusamus et iusto odio dignissimos ducimus
						qui blanditiis praesentium voluptatum deleniti atque corrupti quos
						dolores et quas molestias excepturi sint occaecati cupiditate non
						provident.At vero eos et accusamus et iusto odio dignissimos
						ducimus qui blanditiis praesentium voluptatum deleniti atque
						corrupti quos dolores et quas molestias excepturi sint occaecati
						cupiditate non provident, similique sunt in culpa qui officia
						deserunt mollitia animi, id est laborum et dolorum fuga.</p>
					<p>Atque corrupti quos dolores et quas molestias excepturi sint
						occaecati cupiditate non provident, similique sunt in culpa qui
						officia deserunt mollitia animi, id est laborum et dolorum fuga.</p>
					<div class="feature_list">
						<h2>Featured Services</h2>
						<ul>
							<li>Duis aute irure dolor Sunt in culpa</li>
							<li>Sunt in culpa qui officia vel illum</li>
							<li>vel illum qui dolorem eum The wise</li>
							<li>The wise man therefore Lorem ipsum</li>
							<li>vel illum qui dolorem eum The wise</li>
						</ul>
					</div>
					<p>At vero eos et accusamus et iusto odio dignissimos ducimus
						qui blanditiis praesentium voluptatum deleniti atque corrupti quos
						dolores et quas molestias excepturi sint occaecati cupiditate non
						provident.At vero eos et accusamus et iusto odio dignissimos
						ducimus qui blanditiis praesentium voluptatum deleniti atque
						corrupti quos dolores et quas molestias excepturi sint occaecati
						cupiditate non provident, similique sunt in culpa qui officia
						deserunt mollitia.</p>
				</div>
			</div>
			<div class="sidebar">
				<div class="sidebar_right_top">
					<h3>Latest News</h3>
					<div class="latestnews">
						<div class="latestnews_desc">
							<h4>Jan 15, 2012</h4>
							<p>It is a long established fact that a reader will be
								distracted by the readable content of a page when looking at its
								layout.</p>
							<span><a href="#">read more</a></span>
						</div>
						<div class="latestnews_desc">
							<h4>Jan 20, 2013</h4>
							<p>It is a long established fact that a reader will be
								distracted by the readable content of a page when looking at its
								layout.</p>
							<span><a href="#">read more</a></span>
						</div>
						<div class="view-all">
							<a href="events.jsp">ViewAll</a>
						</div>
					</div>
				</div>
				<div class="sidebar_right_bottom" id="logininfo">
					<h3>Member Login</h3>
					<div class="login_form">
						<form id="loginForm">
							<div>
								<span><label>User Name</label></span> <span><input
									name="username" type="text" class="textbox"></span>
							</div>
							<div>
								<span><label>Password</label></span> <span><input
									name="password" type="password"></span>
							</div>
							<div>
								<span><input type="button" class="mybutton"
									value="Submit" onclick="login();"></span>
							</div>
							<span><a href="#">Forgot Password ?</a></span>
						</form>
						<h4>
							Free registration <a href="#">Click here</a>
						</h4>
					</div>
				</div>
				<div class="sidebar_right_bottom" style="display: none;" id="userinfo">
					<h3>Member Login</h3>
					<div class="login_form">
						<div>
							<span><label>User Name</label></span> <span><input
								type="text" class="textbox" disabled="disabled" ></span>
						</div>
						<div>
							<span><label>email</label></span> <span><input
								type="text" disabled="disabled"></span>
						</div>
						<h4>
							Free registration <a href="#">Click here</a>
						</h4>
					</div>
				</div>
			</div>
			<div class="clear"></div>
		</div>
	</div>
	<jsp:include page="footer.jsp" />
</body>
</html>