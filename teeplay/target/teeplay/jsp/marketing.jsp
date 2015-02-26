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
<link href="/css/style.css" rel="stylesheet" type="text/css" media="all" />
<script type="text/javascript" src="/js/jquery-1.9.0.min.js"></script>
</head>
<body>
	<input id="liindex" value="4" type="hidden">
	<jsp:include  page="header.jsp"/>
	<div class="main">
		<div class="wrap">
			<div class="services_grid">
				<div class="content_bottom">
					<div class="image group marketing">
						<div class="grid images_3_of_1">
							<a href="#"><img
								src="<%=basePath%>/images/marketing_img1.jpg" alt=""></a>
						</div>
						<div class="grid blog-desc">
							<h4>
								<a href="#">Lorem Ipsum is simply dummy text </a>
							</h4>
							<p>Lorem ipsum dolor sit amet Ut enim ad minim veniam, quis
								nostrud exercitation ullamco laboris nisi ut aliquip ex ea
								commodo consequat. Duis aute irure dolor in reprehenderit in
								voluptate velit esse cillum dolore eu fugiat nulla
								pariatur.Excepteur sint occaecat cupidatat non proident, sunt in
								culpa qui officia deserunt mollit anim id est laborum.</p>
							<div class="view-all">
								<a href="events.jsp">More Info</a>
							</div>
						</div>
					</div>
					<div class="image group marketing">
						<div class="grid images_3_of_1">
							<a href="#"><img
								src="<%=basePath%>/images/marketing_img2.jpg" alt=""></a>
						</div>
						<div class="grid blog-desc">
							<h4>
								<a href="#">Duis aute irure dolor </a>
							</h4>
							<p>Lorem ipsum dolor sit amet Ut enim ad minim veniam, quis
								nostrud exercitation ullamco laboris nisi ut aliquip ex ea
								commodo consequat. Duis aute irure dolor in reprehenderit in
								voluptate velit esse cillum dolore eu fugiat nulla
								pariatur.Excepteur sint occaecat cupidatat non proident, sunt in
								culpa qui officia deserunt mollit anim id est laborum.</p>
							<div class="view-all">
								<a href="events.jsp">More Info</a>
							</div>
						</div>
					</div>
					<div class="image group marketing">
						<div class="grid images_3_of_1">
							<a href="#"><img
								src="<%=basePath%>/images/marketing_img3.jpg" alt=""></a>
						</div>
						<div class="grid blog-desc">
							<h4>
								<a href="#">Deserunt mollit laborum</a>
							</h4>
							<p>Lorem ipsum dolor sit amet Ut enim ad minim veniam, quis
								nostrud exercitation ullamco laboris nisi ut aliquip ex ea
								commodo consequat. Duis aute irure dolor in reprehenderit in
								voluptate velit esse cillum dolore eu fugiat nulla
								pariatur.Excepteur sint occaecat cupidatat non proident, sunt in
								culpa qui officia deserunt mollit anim id est laborum.</p>
							<div class="view-all">
								<a href="events.jsp">More Info</a>
							</div>
						</div>
					</div>
				</div>
			</div>
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
							<img src="<%=basePath%>/images/project1.jpg"> <img
								src="<%=basePath%>/images/project2.jpg">
							<div class="view-all">
								<a href="events.html">See All</a>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="clear"></div>
		</div>
	</div>
	<jsp:include  page="footer.jsp"/>
</body>
</html>

