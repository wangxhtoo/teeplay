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
	<input id="liindex" value="5" type="hidden">
	<jsp:include page="header.jsp" />
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
							<img src="<%=basePath%>/images/project1.jpg"> <img
								src="<%=basePath%>/images/project2.jpg">
							<div class="view-all">
								<a href="events.jsp">See All</a>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="content">
				<div class="content_bottom">
					<h2>Contact Us</h2>
					<div class="contact-form">
						<form method="post" action="contact-post.jsp">
							<div>
								<span><label>Name</label></span> <span><input
									name="userName" type="text" class="textbox"></span>
							</div>
							<div>
								<span><label>E-mail</label></span> <span><input
									name="userEmail" type="text" class="textbox"></span>
							</div>
							<div>
								<span><label>Subject</label></span> <span><textarea
										name="userMsg"> </textarea></span>
							</div>
							<div>
								<span><input type="submit" class="submit_button"
									value="Send"></span>
							</div>
						</form>
					</div>
					<div class="contact_info">
						<h2>Find Us Here</h2>
						<div class="map">
							<iframe width="100%" height="175" frameborder="0" scrolling="no"
								marginheight="0" marginwidth="0"
								src="https://maps.google.co.in/maps?f=q&amp;source=s_q&amp;hl=en&amp;geocode=&amp;q=Lighthouse+Point,+FL,+United+States&amp;aq=4&amp;oq=light&amp;sll=26.275636,-80.087265&amp;sspn=0.04941,0.104628&amp;ie=UTF8&amp;hq=&amp;hnear=Lighthouse+Point,+Broward,+Florida,+United+States&amp;t=m&amp;z=14&amp;ll=26.275636,-80.087265&amp;output=embed"></iframe>
							<br>
							<small><a
								href="https://maps.google.co.in/maps?f=q&amp;source=embed&amp;hl=en&amp;geocode=&amp;q=Lighthouse+Point,+FL,+United+States&amp;aq=4&amp;oq=light&amp;sll=26.275636,-80.087265&amp;sspn=0.04941,0.104628&amp;ie=UTF8&amp;hq=&amp;hnear=Lighthouse+Point,+Broward,+Florida,+United+States&amp;t=m&amp;z=14&amp;ll=26.275636,-80.087265"
								style="color: #777; text-align: left; font-size: 0.85em">View
									Larger Map</a></small>
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
							<a href="events.jsp">ViewAll</a>
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

