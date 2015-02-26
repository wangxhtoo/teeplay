package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.teeplay.util.TeeUtil;

public final class contact_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

	String basePath = request.getContextPath();

      out.write("\r\n");
      out.write("<!DOCTYPE HTML>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>");
      out.print(TeeUtil.HTML_TITLE );
      out.write("</title>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<meta name=\"viewport\"\r\n");
      out.write("\tcontent=\"width=device-width, initial-scale=1, maximum-scale=1\">\r\n");
      out.write("<link href=\"/css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"/js/jquery-1.9.0.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<input id=\"liindex\" value=\"5\" type=\"hidden\">\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("\t<div class=\"main\">\r\n");
      out.write("\t\t<div class=\"wrap\">\r\n");
      out.write("\t\t\t<div class=\"sidebar\">\r\n");
      out.write("\t\t\t\t<div class=\"sidebar_left_top\">\r\n");
      out.write("\t\t\t\t\t<div class=\"services\">\r\n");
      out.write("\t\t\t\t\t\t<h3>Services</h3>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"services_list\">\r\n");
      out.write("\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Lorem ipsum dolor sit</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Duis aute irure dolor</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Sunt in culpa qui officia</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">vel illum qui dolorem eum</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">The wise man therefore</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Sunt in culpa qui officia</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Duis aute irure dolor</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Sunt in culpa qui officia</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Duis aute irure dolor</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"sidebar_left_bottom\">\r\n");
      out.write("\t\t\t\t\t<div class=\"projects\">\r\n");
      out.write("\t\t\t\t\t\t<h3>Projects</h3>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"project_img\">\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"");
      out.print(basePath);
      out.write("/images/project1.jpg\"> <img\r\n");
      out.write("\t\t\t\t\t\t\t\tsrc=\"");
      out.print(basePath);
      out.write("/images/project2.jpg\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"view-all\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"events.jsp\">See All</a>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"content\">\r\n");
      out.write("\t\t\t\t<div class=\"content_bottom\">\r\n");
      out.write("\t\t\t\t\t<h2>Contact Us</h2>\r\n");
      out.write("\t\t\t\t\t<div class=\"contact-form\">\r\n");
      out.write("\t\t\t\t\t\t<form method=\"post\" action=\"contact-post.jsp\">\r\n");
      out.write("\t\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span><label>Name</label></span> <span><input\r\n");
      out.write("\t\t\t\t\t\t\t\t\tname=\"userName\" type=\"text\" class=\"textbox\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span><label>E-mail</label></span> <span><input\r\n");
      out.write("\t\t\t\t\t\t\t\t\tname=\"userEmail\" type=\"text\" class=\"textbox\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span><label>Subject</label></span> <span><textarea\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tname=\"userMsg\"> </textarea></span>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span><input type=\"submit\" class=\"submit_button\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tvalue=\"Send\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"contact_info\">\r\n");
      out.write("\t\t\t\t\t\t<h2>Find Us Here</h2>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"map\">\r\n");
      out.write("\t\t\t\t\t\t\t<iframe width=\"100%\" height=\"175\" frameborder=\"0\" scrolling=\"no\"\r\n");
      out.write("\t\t\t\t\t\t\t\tmarginheight=\"0\" marginwidth=\"0\"\r\n");
      out.write("\t\t\t\t\t\t\t\tsrc=\"https://maps.google.co.in/maps?f=q&amp;source=s_q&amp;hl=en&amp;geocode=&amp;q=Lighthouse+Point,+FL,+United+States&amp;aq=4&amp;oq=light&amp;sll=26.275636,-80.087265&amp;sspn=0.04941,0.104628&amp;ie=UTF8&amp;hq=&amp;hnear=Lighthouse+Point,+Broward,+Florida,+United+States&amp;t=m&amp;z=14&amp;ll=26.275636,-80.087265&amp;output=embed\"></iframe>\r\n");
      out.write("\t\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t\t<small><a\r\n");
      out.write("\t\t\t\t\t\t\t\thref=\"https://maps.google.co.in/maps?f=q&amp;source=embed&amp;hl=en&amp;geocode=&amp;q=Lighthouse+Point,+FL,+United+States&amp;aq=4&amp;oq=light&amp;sll=26.275636,-80.087265&amp;sspn=0.04941,0.104628&amp;ie=UTF8&amp;hq=&amp;hnear=Lighthouse+Point,+Broward,+Florida,+United+States&amp;t=m&amp;z=14&amp;ll=26.275636,-80.087265\"\r\n");
      out.write("\t\t\t\t\t\t\t\tstyle=\"color: #777; text-align: left; font-size: 0.85em\">View\r\n");
      out.write("\t\t\t\t\t\t\t\t\tLarger Map</a></small>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"sidebar\">\r\n");
      out.write("\t\t\t\t<div class=\"sidebar_right_top\">\r\n");
      out.write("\t\t\t\t\t<h3>Latest News</h3>\r\n");
      out.write("\t\t\t\t\t<div class=\"latestnews\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"latestnews_desc\">\r\n");
      out.write("\t\t\t\t\t\t\t<h4>Jan 15, 2012</h4>\r\n");
      out.write("\t\t\t\t\t\t\t<p>It is a long established fact that a reader will be\r\n");
      out.write("\t\t\t\t\t\t\t\tdistracted by the readable content of a page when looking at its\r\n");
      out.write("\t\t\t\t\t\t\t\tlayout.</p>\r\n");
      out.write("\t\t\t\t\t\t\t<span><a href=\"#\">read more</a></span>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"latestnews_desc\">\r\n");
      out.write("\t\t\t\t\t\t\t<h4>Jan 20, 2013</h4>\r\n");
      out.write("\t\t\t\t\t\t\t<p>It is a long established fact that a reader will be\r\n");
      out.write("\t\t\t\t\t\t\t\tdistracted by the readable content of a page when looking at its\r\n");
      out.write("\t\t\t\t\t\t\t\tlayout.</p>\r\n");
      out.write("\t\t\t\t\t\t\t<span><a href=\"#\">read more</a></span>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"view-all\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"events.jsp\">ViewAll</a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"sidebar_right_bottom\">\r\n");
      out.write("\t\t\t\t\t<h3>Member Login</h3>\r\n");
      out.write("\t\t\t\t\t<div class=\"login_form\">\r\n");
      out.write("\t\t\t\t\t\t<form>\r\n");
      out.write("\t\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span><label>User Name</label></span> <span><input\r\n");
      out.write("\t\t\t\t\t\t\t\t\tname=\"userName\" type=\"text\" class=\"textbox\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span><label>Password</label></span> <span><input\r\n");
      out.write("\t\t\t\t\t\t\t\t\tname=\"userName\" type=\"password\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span><input type=\"submit\" class=\"mybutton\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tvalue=\"Submit\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<span><a href=\"#\">Forgot Password ?</a></span>\r\n");
      out.write("\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t<h4>\r\n");
      out.write("\t\t\t\t\t\t\tFree registration <a href=\"#\">Click here</a>\r\n");
      out.write("\t\t\t\t\t\t</h4>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"clear\"></div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
