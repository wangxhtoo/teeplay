package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class footer_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<div class=\"footer\">\n");
      out.write("\t<div class=\"wrap\">\n");
      out.write("\t\t<div class=\"section group\">\n");
      out.write("\t\t\t<div class=\"col_1_of_4 span_1_of_4\">\n");
      out.write("\t\t\t\t<div class=\"location\">\n");
      out.write("\t\t\t\t\t<h3>Location</h3>\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li><img src=\"/images/footer_logo.png\" alt=\"\" /></li>\n");
      out.write("\t\t\t\t\t\t<li>1-22-003-55,</li>\n");
      out.write("\t\t\t\t\t\t<li>Neque porro quisquam,</li>\n");
      out.write("\t\t\t\t\t\t<li>dolor sit amet,</li>\n");
      out.write("\t\t\t\t\t\t<li>USA.</li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col_1_of_4 span_1_of_4\">\n");
      out.write("\t\t\t\t<h3>Information</h3>\n");
      out.write("\t\t\t\t<p>\n");
      out.write("\t\t\t\t\tLorem ipsum dolor sit amet, sed do eiusmod tempor incididunt ut\n");
      out.write("\t\t\t\t\tlabore et dolore magna aliqua. Ut enim ad minim veniam, quis\n");
      out.write("\t\t\t\t\tnostrud nisi ut aliquip ex ea commodo consequat.<br> <span><a\n");
      out.write("\t\t\t\t\t\thref=\"#\">Read More[....]</a></span>\n");
      out.write("\t\t\t\t</p>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col_1_of_4 span_1_of_4\">\n");
      out.write("\t\t\t\t<h3>Testimonials</h3>\n");
      out.write("\t\t\t\t<div class=\"Testimonials_desc\">\n");
      out.write("\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\t<span class=\"up\"><img src=\"/images/quotes.png\" alt=\"\"></span>Lorem\n");
      out.write("\t\t\t\t\t\tipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod\n");
      out.write("\t\t\t\t\t\ttempor incididunt ut labore et dolore magna aliqua. Ut enim ad\n");
      out.write("\t\t\t\t\t\tminim veniam, quis nostrud exercitation ullamco laboris nisi ut\n");
      out.write("\t\t\t\t\t\taliquip ex ea commodo consequat.<span class=\"down\"><img\n");
      out.write("\t\t\t\t\t\t\tsrc=\"./images/quotes-down.png\" alt=\"\"></span>\n");
      out.write("\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t<h5>- Lorem ipsum dolor</h5>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col_1_of_4 span_1_of_4\">\n");
      out.write("\t\t\t\t<h3>Contact Us</h3>\n");
      out.write("\t\t\t\t<ul class=\"address\">\n");
      out.write("\t\t\t\t\t<li>info(at)yourcompany.com</li>\n");
      out.write("\t\t\t\t\t<li><span>Mobile :</span> +12 345 67890</li>\n");
      out.write("\t\t\t\t\t<li><span>Telephone :</span> +00 000 00000</li>\n");
      out.write("\t\t\t\t\t<li><span>Fax :</span> +00 000 00000</li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"copy-right\">\n");
      out.write("\t\t<div class=\"wrap\">\n");
      out.write("\t\t\t<p>\n");
      out.write("\t\t\t\tDesign by <a href=\"http://w3layouts.com\">W3Layouts</a>\n");
      out.write("\t\t\t</p>\n");
      out.write("\t\t\t<div class=\"clear\"></div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
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
