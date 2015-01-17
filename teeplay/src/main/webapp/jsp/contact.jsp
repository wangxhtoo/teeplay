<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%
String basePath = request.getContextPath();
%>
<!DOCTYPE HTML>
<head>
<title>Free House Framing Contruction Services Website Template | Contact :: w3layouts</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<link href="/css/style.css" rel="stylesheet" type="text/css" media="all"/>
</head>
<body>
	      <div class="header">
	      	<div class="header_top">
			        <div class="wrap">	 
					<div class="logo">
					  <a href="index.html"><img src="<%=basePath %>/images/logo.png" alt="" /></a>
					</div>
						 <div class="menu">
						    <ul>
								<li><a href="<%=basePath %>/">&nbsp;&nbsp;主页&nbsp;&nbsp;</a></li>
								<li><a href="<%=basePath %>/about">关于我们</a></li>
								<li><a href="<%=basePath %>/services">&nbsp;&nbsp;服务&nbsp;&nbsp;</a></li>
								<li><a href="<%=basePath %>/marketing">&nbsp;&nbsp;购物&nbsp;&nbsp;</a></li>
								<li class="active"><a href="<%=basePath %>/contact">联系我们</a></li>
								<div class="clear"></div>
					        </ul>       
						</div>
						<div class="clear"></div>
				   </div>
		      </div>		     
	    </div>
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
				    	   <img src="<%=basePath %>/images/project1.jpg">
				    	   <img src="<%=basePath %>/images/project2.jpg">
				    	    <div class="view-all"><a href="events.jsp">See All</a></div>
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
						    	<span><label>Name</label></span>
						    	<span><input name="userName" type="text" class="textbox"></span>
						    </div>
						    <div>
						    	<span><label>E-mail</label></span>
						    	<span><input name="userEmail" type="text" class="textbox"></span>
						    </div>
						    <div>
						    	<span><label>Subject</label></span>
						    	<span><textarea name="userMsg"> </textarea></span>
						    </div>
						   <div>
						   		<span><input type="submit" class="submit_button" value="Send"></span>
						  </div>
					    </form>
				  </div>
				 		 <div class="contact_info">
				 		 	<h2>Find Us Here</h2>
					    	  <div class="map">
							   	    <iframe width="100%" height="175" frameborder="0" scrolling="no" marginheight="0" marginwidth="0" src="https://maps.google.co.in/maps?f=q&amp;source=s_q&amp;hl=en&amp;geocode=&amp;q=Lighthouse+Point,+FL,+United+States&amp;aq=4&amp;oq=light&amp;sll=26.275636,-80.087265&amp;sspn=0.04941,0.104628&amp;ie=UTF8&amp;hq=&amp;hnear=Lighthouse+Point,+Broward,+Florida,+United+States&amp;t=m&amp;z=14&amp;ll=26.275636,-80.087265&amp;output=embed"></iframe><br><small><a href="https://maps.google.co.in/maps?f=q&amp;source=embed&amp;hl=en&amp;geocode=&amp;q=Lighthouse+Point,+FL,+United+States&amp;aq=4&amp;oq=light&amp;sll=26.275636,-80.087265&amp;sspn=0.04941,0.104628&amp;ie=UTF8&amp;hq=&amp;hnear=Lighthouse+Point,+Broward,+Florida,+United+States&amp;t=m&amp;z=14&amp;ll=26.275636,-80.087265" style="color:#777;text-align:left;font-size:0.85em">View Larger Map</a></small>
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
		     	<p>It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout.</p>
		     	<span><a href="#">read more</a></span>
		     </div>
		     	 <div class="latestnews_desc">
		     		<h4>Jan 20, 2013</h4>
		     		<p>It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout.</p>
		     		<span><a href="#">read more</a></span>
		     	</div>
		     	<div class="view-all"><a href="events.jsp">ViewAll</a></div>
          </div>	
        </div>
        <div class="sidebar_right_bottom">
        	<h3>Member Login</h3>
        	<div class="login_form">        		
        		<form>
        		 <div>
				   <span><label>User Name</label></span>
				   <span><input name="userName" type="text" class="textbox"></span>
			     </div>
	        	 <div>
				   <span><label>Password</label></span>
				   <span><input name="userName" type="password"></span>
			     </div>
	        	  <div>
					 <span><input type="submit" class="mybutton" value="Submit"></span>
				  </div>
	        	  <span><a href="#">Forgot Password ?</a></span>
	          </form>
        	  	   <h4>Free registration <a href="#">Click here</a></h4>
        	</div>
         </div>
       </div>
    <div class="clear"></div>
 </div>
</div>
    <div class="footer">
	<div class="wrap">
	   <div class="section group">
				<div class="col_1_of_4 span_1_of_4">
				    <div class="location">
				    	<h3>Location</h3>
				    	<ul>
				    		<li><img src="<%=basePath %>/images/footer_logo.png" alt="" /></li>
				    		 <li>1-22-003-55,</li>
						  	  <li>Neque porro quisquam,</li>
						  	  <li>dolor sit amet,</li>
						  	   <li>USA.</li>
						 </ul>
				    </div>			
				</div>
				  <div class="col_1_of_4 span_1_of_4">
					<h3>Information</h3>
					<p>Lorem ipsum dolor sit amet, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud nisi ut aliquip ex ea commodo consequat.<br><span><a href="#">Read More[....]</a></span></p>
				  </div>
				     <div class="col_1_of_4 span_1_of_4">
						<h3>Testimonials</h3>
						<div class="Testimonials_desc">
						<p><span class="up"><img src="<%=basePath %>/images/quotes.png" alt=""></span>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.<span class="down"><img src="./images/quotes-down.png" alt=""></span></p>
					    <h5>- Lorem ipsum dolor</h5>
					   </div>
					</div>
						<div class="col_1_of_4 span_1_of_4">
							   <h3>Contact Us</h3>
							       <ul class="address">
								  	 <li>info(at)yourcompany.com</li>
								  	 <li><span>Mobile :</span> +12 345 67890</li>
								  	 <li><span>Telephone :</span> +00 000 00000</li>
								  	 <li><span>Fax :</span> +00 000 00000</li>
								  </ul>
						  </div>
					  </div>
				</div>
		  <div class="copy-right">
			<div class="wrap">
			 <p>Design by  <a href="http://w3layouts.com">W3Layouts</a></p>
		      <div class="clear"></div>
		</div>	
	</div>
 </div>	
</body>
</html>

