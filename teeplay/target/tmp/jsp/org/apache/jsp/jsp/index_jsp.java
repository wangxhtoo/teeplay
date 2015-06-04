package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.teeplay.util.TeeUtil;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");

	String basePath = request.getContextPath();

      out.write("\r\n");
      out.write("<!DOCTYPE HTML>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>");
      out.print(TeeUtil.HTML_TITLE);
      out.write("</title>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\">\r\n");
      out.write("<link href=\"/css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("<link href=\"/css/slider.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"/js/jquery-1.9.0.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/js/jquery.nivo.slider.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/js/cookie.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/js/login.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t$(window).load(function() {\r\n");
      out.write("\t\t$('#slider').nivoSlider();\r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<input id=\"liindex\" value=\"1\" type=\"hidden\">\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("\t<!------ Slider ------------>\r\n");
      out.write("\t<div class=\"slider\">\r\n");
      out.write("\t\t<div class=\"slider-wrapper theme-default\">\r\n");
      out.write("\t\t\t<div id=\"slider\" class=\"nivoSlider\">\r\n");
      out.write("\t\t\t\t<img src=\"/images/1.jpg\" data-thumb=\"/images/1.jpg\" alt=\"\" /> <img\r\n");
      out.write("\t\t\t\t\tsrc=\"/images/2.jpg\" data-thumb=\"/images/2.jpg\" alt=\"\" /> <img\r\n");
      out.write("\t\t\t\t\tsrc=\"/images/3.jpg\" data-thumb=\"/images/3.jpg\" alt=\"\" /> <img\r\n");
      out.write("\t\t\t\t\tsrc=\"/images/4.jpg\" data-thumb=\"/images/4.jpg\" alt=\"\" />\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!------End Slider ------------>\r\n");
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
      out.write("\t\t\t\t\t\t\t<img src=\"/images/project1.jpg\"> <img\r\n");
      out.write("\t\t\t\t\t\t\t\tsrc=\"/images/project2.jpg\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"view-all\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"events.jsp\">See All</a>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"content\">\r\n");
      out.write("\t\t\t\t<div class=\"content_bottom\">\r\n");
      out.write("\t\t\t\t\t<h2>Welcome to our company</h2>\r\n");
      out.write("\t\t\t\t\t<h3>Lorem Ipsum is simply dummy text of the printing atque\r\n");
      out.write("\t\t\t\t\t\tcorrupti quos dolores et quas molestias excepturi sint occaecati\r\n");
      out.write("\t\t\t\t\t\tcupiditate non provident, similique sunt in culpa qui officia\r\n");
      out.write("\t\t\t\t\t\tdeserunt mollitia animi, id est laborum et dolorum fuga.</h3>\r\n");
      out.write("\t\t\t\t\t<p>At vero eos et accusamus et iusto odio dignissimos ducimus\r\n");
      out.write("\t\t\t\t\t\tqui blanditiis praesentium voluptatum deleniti atque corrupti quos\r\n");
      out.write("\t\t\t\t\t\tdolores et quas molestias excepturi sint occaecati cupiditate non\r\n");
      out.write("\t\t\t\t\t\tprovident.At vero eos et accusamus et iusto odio dignissimos\r\n");
      out.write("\t\t\t\t\t\tducimus qui blanditiis praesentium voluptatum deleniti atque\r\n");
      out.write("\t\t\t\t\t\tcorrupti quos dolores et quas molestias excepturi sint occaecati\r\n");
      out.write("\t\t\t\t\t\tcupiditate non provident, similique sunt in culpa qui officia\r\n");
      out.write("\t\t\t\t\t\tdeserunt mollitia animi, id est laborum et dolorum fuga.</p>\r\n");
      out.write("\t\t\t\t\t<p>Atque corrupti quos dolores et quas molestias excepturi sint\r\n");
      out.write("\t\t\t\t\t\toccaecati cupiditate non provident, similique sunt in culpa qui\r\n");
      out.write("\t\t\t\t\t\tofficia deserunt mollitia animi, id est laborum et dolorum fuga.</p>\r\n");
      out.write("\t\t\t\t\t<div class=\"feature_list\">\r\n");
      out.write("\t\t\t\t\t\t<h2>Featured Services</h2>\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t<li>Duis aute irure dolor Sunt in culpa</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li>Sunt in culpa qui officia vel illum</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li>vel illum qui dolorem eum The wise</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li>The wise man therefore Lorem ipsum</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li>vel illum qui dolorem eum The wise</li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<p>At vero eos et accusamus et iusto odio dignissimos ducimus\r\n");
      out.write("\t\t\t\t\t\tqui blanditiis praesentium voluptatum deleniti atque corrupti quos\r\n");
      out.write("\t\t\t\t\t\tdolores et quas molestias excepturi sint occaecati cupiditate non\r\n");
      out.write("\t\t\t\t\t\tprovident.At vero eos et accusamus et iusto odio dignissimos\r\n");
      out.write("\t\t\t\t\t\tducimus qui blanditiis praesentium voluptatum deleniti atque\r\n");
      out.write("\t\t\t\t\t\tcorrupti quos dolores et quas molestias excepturi sint occaecati\r\n");
      out.write("\t\t\t\t\t\tcupiditate non provident, similique sunt in culpa qui officia\r\n");
      out.write("\t\t\t\t\t\tdeserunt mollitia.</p>\r\n");
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
      out.write("\t\t\t\t<div class=\"sidebar_right_bottom\" style=\"display: none;\" id=\"userinfo\">\r\n");
      out.write("\t\t\t\t\t<h3>Member Login</h3>\r\n");
      out.write("\t\t\t\t\t<div class=\"login_form\">\r\n");
      out.write("\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t<span><label>User Name</label></span> <span><input\r\n");
      out.write("\t\t\t\t\t\t\t\ttype=\"text\" class=\"textbox\" disabled=\"disabled\"></span>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t<span><label>email</label></span> <span><input type=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\t\tdisabled=\"disabled\"></span>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
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
      out.write("</html>");
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
