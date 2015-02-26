package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t$(document).ready(function(){\r\n");
      out.write("\t\tvar n = $(\"#liindex\").val();\r\n");
      out.write("\t\tfor(var i=1;i<=5;i++){\r\n");
      out.write("\t\t\tif(n == i){\r\n");
      out.write("\t\t\t\t$(\"#li\"+i).attr(\"class\",\"active\");\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\t$(\"#li\"+i).attr(\"class\",\"\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
      out.write("<div class=\"header\">\r\n");
      out.write("\t<div class=\"header_top\">\r\n");
      out.write("\t\t<div class=\"wrap\">\r\n");
      out.write("\t\t\t<div class=\"logo\">\r\n");
      out.write("\t\t\t\t<a href=\"/\"><img src=\"/images/logo.png\"\r\n");
      out.write("\t\t\t\t\talt=\"\" /></a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"menu\">\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t<li id=\"li1\" ><a href=\"/\">&nbsp;&nbsp;主页&nbsp;&nbsp;</a></li>\r\n");
      out.write("\t\t\t\t\t<li id=\"li2\" ><a href=\"/about\">关于我们</a></li>\r\n");
      out.write("\t\t\t\t\t<li id=\"li3\" ><a href=\"/services\">&nbsp;&nbsp;服务&nbsp;&nbsp;</a></li>\r\n");
      out.write("\t\t\t\t\t<li id=\"li4\" ><a href=\"/marketing\">&nbsp;&nbsp;产品&nbsp;&nbsp;</a></li>\r\n");
      out.write("\t\t\t\t\t<li id=\"li5\" ><a href=\"/contact\">联系我们</a></li>\r\n");
      out.write("\t\t\t\t\t<div class=\"clear\"></div>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"clear\"></div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>");
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
