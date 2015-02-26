package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.teeplay.util.TeeUtil;

public final class services_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t<input id=\"liindex\" value=\"3\" type=\"hidden\">\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("\t<div class=\"main\">\r\n");
      out.write("\t\t<div class=\"wrap\">\r\n");
      out.write("\t\t\t<div class=\"services_grid\">\r\n");
      out.write("\t\t\t\t<div class=\"content_bottom\">\r\n");
      out.write("\t\t\t\t\t<div class=\"section group service_desc\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"listview_1_of_2 images_1_of_2\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"listimg listimg_2_of_1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"./images/service-1.png\" alt=\"\" />\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"text list_2_of_1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h4>Service - 01</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit,\r\n");
      out.write("\t\t\t\t\t\t\t\t\tsed do eiusmod tempor incididunt ut labore et dolore.Lorem\r\n");
      out.write("\t\t\t\t\t\t\t\t\tipsum dolor sit amet. Lorem ipsum dolor sit amet, consectetur\r\n");
      out.write("\t\t\t\t\t\t\t\t\tadipisicing elit, sed do eiusmod tempor incididunt ut labore.</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"view-all\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"events.html\">More Info</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"listview_1_of_2 images_1_of_2\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"listimg listimg_2_of_1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"./images/service-2.png\" alt=\"\" />\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"text list_2_of_1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h4>Service - 02</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit,\r\n");
      out.write("\t\t\t\t\t\t\t\t\tsed do eiusmod tempor incididunt ut labore et dolore.Lorem\r\n");
      out.write("\t\t\t\t\t\t\t\t\tipsum dolor sit amet sed do eiusmod tempor incididunt ut\r\n");
      out.write("\t\t\t\t\t\t\t\t\tlabore.Lorem ipsum dolor sit amet, consectetur adipisicing\r\n");
      out.write("\t\t\t\t\t\t\t\t\telit.</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"view-all\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"events.html\">More Info</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"section group service_desc\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"listview_1_of_2 images_1_of_2\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"listimg listimg_2_of_1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"./images/service-3.png\" alt=\"\" />\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"text list_2_of_1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h4>Service - 01</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit,\r\n");
      out.write("\t\t\t\t\t\t\t\t\tsed do eiusmod tempor incididunt ut labore et dolore.Lorem\r\n");
      out.write("\t\t\t\t\t\t\t\t\tipsum dolor sit amet. Lorem ipsum dolor sit amet, consectetur\r\n");
      out.write("\t\t\t\t\t\t\t\t\tadipisicing elit, sed do eiusmod tempor incididunt ut labore.</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"view-all\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"events.html\">More Info</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"listview_1_of_2 images_1_of_2\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"listimg listimg_2_of_1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"./images/service-4.png\" alt=\"\" />\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"text list_2_of_1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h4>Service - 02</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit,\r\n");
      out.write("\t\t\t\t\t\t\t\t\tsed do eiusmod tempor incididunt ut labore et dolore.Lorem\r\n");
      out.write("\t\t\t\t\t\t\t\t\tipsum dolor sit amet sed do eiusmod tempor incididunt ut\r\n");
      out.write("\t\t\t\t\t\t\t\t\tlabore.Lorem ipsum dolor sit amet, consectetur adipisicing\r\n");
      out.write("\t\t\t\t\t\t\t\t\telit.</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"view-all\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"events.html\">More Info</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"section group service_desc\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"listview_1_of_2 images_1_of_2\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"listimg listimg_2_of_1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"./images/service-5.png\" alt=\"\" />\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"text list_2_of_1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h4>Service - 01</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit,\r\n");
      out.write("\t\t\t\t\t\t\t\t\tsed do eiusmod tempor incididunt ut labore et dolore.Lorem\r\n");
      out.write("\t\t\t\t\t\t\t\t\tipsum dolor sit amet. Lorem ipsum dolor sit amet, consectetur\r\n");
      out.write("\t\t\t\t\t\t\t\t\tadipisicing elit, sed do eiusmod tempor incididunt ut labore.</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"view-all\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"events.html\">More Info</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"listview_1_of_2 images_1_of_2\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"listimg listimg_2_of_1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"./images/service-6.png\" alt=\"\" />\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"text list_2_of_1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h4>Service - 02</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit,\r\n");
      out.write("\t\t\t\t\t\t\t\t\tsed do eiusmod tempor incididunt ut labore et dolore.Lorem\r\n");
      out.write("\t\t\t\t\t\t\t\t\tipsum dolor sit amet sed do eiusmod tempor incididunt ut\r\n");
      out.write("\t\t\t\t\t\t\t\t\tlabore.Lorem ipsum dolor sit amet, consectetur adipisicing\r\n");
      out.write("\t\t\t\t\t\t\t\t\telit.</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"view-all\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"events.html\">More Info</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
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
      out.write("\t\t\t\t\t\t\t<a href=\"events.html\">ViewAll</a>\r\n");
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
