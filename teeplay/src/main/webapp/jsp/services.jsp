<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%
String basePath = request.getContextPath();
%>
<!DOCTYPE HTML>
<html>
<head>
<title>${html.title}</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<link href="/css/style.css" rel="stylesheet" type="text/css" media="all" />
<script type="text/javascript" src="/js/jquery-1.9.0.min.js"></script>
</head>
<body>
	<input id="liindex" value="3" type="hidden">
	<jsp:include  page="header.jsp"/>
	<div class="main">
		<div class="wrap">
			<div class="services_grid">
				<div class="content_bottom">
					<div class="section group service_desc">
						<div class="listview_1_of_2 images_1_of_2">
							<div class="listimg listimg_2_of_1">
								<img src="./images/service-1.png" alt="" />
							</div>
							<div class="text list_2_of_1">
								<h4>Service - 01</h4>
								<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit,
									sed do eiusmod tempor incididunt ut labore et dolore.Lorem
									ipsum dolor sit amet. Lorem ipsum dolor sit amet, consectetur
									adipisicing elit, sed do eiusmod tempor incididunt ut labore.</p>
								<div class="view-all">
									<a href="events.html">More Info</a>
								</div>
							</div>
						</div>
						<div class="listview_1_of_2 images_1_of_2">
							<div class="listimg listimg_2_of_1">
								<img src="./images/service-2.png" alt="" />
							</div>
							<div class="text list_2_of_1">
								<h4>Service - 02</h4>
								<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit,
									sed do eiusmod tempor incididunt ut labore et dolore.Lorem
									ipsum dolor sit amet sed do eiusmod tempor incididunt ut
									labore.Lorem ipsum dolor sit amet, consectetur adipisicing
									elit.</p>
								<div class="view-all">
									<a href="events.html">More Info</a>
								</div>
							</div>
						</div>
					</div>
					<div class="section group service_desc">
						<div class="listview_1_of_2 images_1_of_2">
							<div class="listimg listimg_2_of_1">
								<img src="./images/service-3.png" alt="" />
							</div>
							<div class="text list_2_of_1">
								<h4>Service - 01</h4>
								<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit,
									sed do eiusmod tempor incididunt ut labore et dolore.Lorem
									ipsum dolor sit amet. Lorem ipsum dolor sit amet, consectetur
									adipisicing elit, sed do eiusmod tempor incididunt ut labore.</p>
								<div class="view-all">
									<a href="events.html">More Info</a>
								</div>
							</div>
						</div>
						<div class="listview_1_of_2 images_1_of_2">
							<div class="listimg listimg_2_of_1">
								<img src="./images/service-4.png" alt="" />
							</div>
							<div class="text list_2_of_1">
								<h4>Service - 02</h4>
								<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit,
									sed do eiusmod tempor incididunt ut labore et dolore.Lorem
									ipsum dolor sit amet sed do eiusmod tempor incididunt ut
									labore.Lorem ipsum dolor sit amet, consectetur adipisicing
									elit.</p>
								<div class="view-all">
									<a href="events.html">More Info</a>
								</div>
							</div>
						</div>
					</div>
					<div class="section group service_desc">
						<div class="listview_1_of_2 images_1_of_2">
							<div class="listimg listimg_2_of_1">
								<img src="./images/service-5.png" alt="" />
							</div>
							<div class="text list_2_of_1">
								<h4>Service - 01</h4>
								<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit,
									sed do eiusmod tempor incididunt ut labore et dolore.Lorem
									ipsum dolor sit amet. Lorem ipsum dolor sit amet, consectetur
									adipisicing elit, sed do eiusmod tempor incididunt ut labore.</p>
								<div class="view-all">
									<a href="events.html">More Info</a>
								</div>
							</div>
						</div>
						<div class="listview_1_of_2 images_1_of_2">
							<div class="listimg listimg_2_of_1">
								<img src="./images/service-6.png" alt="" />
							</div>
							<div class="text list_2_of_1">
								<h4>Service - 02</h4>
								<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit,
									sed do eiusmod tempor incididunt ut labore et dolore.Lorem
									ipsum dolor sit amet sed do eiusmod tempor incididunt ut
									labore.Lorem ipsum dolor sit amet, consectetur adipisicing
									elit.</p>
								<div class="view-all">
									<a href="events.html">More Info</a>
								</div>
							</div>
						</div>
					</div>
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
							<a href="events.html">ViewAll</a>
						</div>
					</div>
				</div>
				<div class="sidebar_right_bottom">
					<h3>Member Login</h3>
					<div class="login_form">
						<form>
							<div>
								<span><label>User Name</label></span> <span><input
									name="userName" type="text" class="textbox"></span>
							</div>
							<div>
								<span><label>Password</label></span> <span><input
									name="userName" type="password"></span>
							</div>
							<div>
								<span><input type="submit" class="mybutton"
									value="Submit"></span>
							</div>
							<span><a href="#">Forgot Password ?</a></span>
						</form>
						<h4>
							Free registration <a href="#">Click here</a>
						</h4>
					</div>
				</div>
			</div>
			<div class="clear"></div>
		</div>
	</div>
	<jsp:include  page="footer.jsp"/>
</body>
</html>

