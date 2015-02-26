package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.teeplay.util.TeeUtil;

public final class marketing_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t<input id=\"liindex\" value=\"4\" type=\"hidden\">\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("\t<div class=\"main\">\r\n");
      out.write("\t\t<div class=\"wrap\">\r\n");
      out.write("\t\t\t<div class=\"services_grid\">\r\n");
      out.write("\t\t\t\t<div class=\"content_bottom\">\r\n");
      out.write("\t\t\t\t\t<div class=\"image group marketing\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"grid images_3_of_1\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\"><img\r\n");
      out.write("\t\t\t\t\t\t\t\tsrc=\"");
      out.print(basePath);
      out.write("/images/marketing_img1.jpg\" alt=\"\"></a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"grid blog-desc\">\r\n");
      out.write("\t\t\t\t\t\t\t<h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\">Lorem Ipsum is simply dummy text </a>\r\n");
      out.write("\t\t\t\t\t\t\t</h4>\r\n");
      out.write("\t\t\t\t\t\t\t<p>Lorem ipsum dolor sit amet Ut enim ad minim veniam, quis\r\n");
      out.write("\t\t\t\t\t\t\t\tnostrud exercitation ullamco laboris nisi ut aliquip ex ea\r\n");
      out.write("\t\t\t\t\t\t\t\tcommodo consequat. Duis aute irure dolor in reprehenderit in\r\n");
      out.write("\t\t\t\t\t\t\t\tvoluptate velit esse cillum dolore eu fugiat nulla\r\n");
      out.write("\t\t\t\t\t\t\t\tpariatur.Excepteur sint occaecat cupidatat non proident, sunt in\r\n");
      out.write("\t\t\t\t\t\t\t\tculpa qui officia deserunt mollit anim id est laborum.</p>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"view-all\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"events.jsp\">More Info</a>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"image group marketing\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"grid images_3_of_1\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\"><img\r\n");
      out.write("\t\t\t\t\t\t\t\tsrc=\"");
      out.print(basePath);
      out.write("/images/marketing_img2.jpg\" alt=\"\"></a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"grid blog-desc\">\r\n");
      out.write("\t\t\t\t\t\t\t<h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\">Duis aute irure dolor </a>\r\n");
      out.write("\t\t\t\t\t\t\t</h4>\r\n");
      out.write("\t\t\t\t\t\t\t<p>Lorem ipsum dolor sit amet Ut enim ad minim veniam, quis\r\n");
      out.write("\t\t\t\t\t\t\t\tnostrud exercitation ullamco laboris nisi ut aliquip ex ea\r\n");
      out.write("\t\t\t\t\t\t\t\tcommodo consequat. Duis aute irure dolor in reprehenderit in\r\n");
      out.write("\t\t\t\t\t\t\t\tvoluptate velit esse cillum dolore eu fugiat nulla\r\n");
      out.write("\t\t\t\t\t\t\t\tpariatur.Excepteur sint occaecat cupidatat non proident, sunt in\r\n");
      out.write("\t\t\t\t\t\t\t\tculpa qui officia deserunt mollit anim id est laborum.</p>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"view-all\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"events.jsp\">More Info</a>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"image group marketing\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"grid images_3_of_1\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\"><img\r\n");
      out.write("\t\t\t\t\t\t\t\tsrc=\"");
      out.print(basePath);
      out.write("/images/marketing_img3.jpg\" alt=\"\"></a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"grid blog-desc\">\r\n");
      out.write("\t\t\t\t\t\t\t<h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\">Deserunt mollit laborum</a>\r\n");
      out.write("\t\t\t\t\t\t\t</h4>\r\n");
      out.write("\t\t\t\t\t\t\t<p>Lorem ipsum dolor sit amet Ut enim ad minim veniam, quis\r\n");
      out.write("\t\t\t\t\t\t\t\tnostrud exercitation ullamco laboris nisi ut aliquip ex ea\r\n");
      out.write("\t\t\t\t\t\t\t\tcommodo consequat. Duis aute irure dolor in reprehenderit in\r\n");
      out.write("\t\t\t\t\t\t\t\tvoluptate velit esse cillum dolore eu fugiat nulla\r\n");
      out.write("\t\t\t\t\t\t\t\tpariatur.Excepteur sint occaecat cupidatat non proident, sunt in\r\n");
      out.write("\t\t\t\t\t\t\t\tculpa qui officia deserunt mollit anim id est laborum.</p>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"view-all\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"events.jsp\">More Info</a>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
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
      out.write("\t\t\t\t\t\t\t\t<a href=\"events.html\">See All</a>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
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
