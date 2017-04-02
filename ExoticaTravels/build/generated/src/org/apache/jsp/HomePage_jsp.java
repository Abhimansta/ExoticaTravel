package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class HomePage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <style>\n");
      out.write("            \n");
      out.write(" .frm1 {\n");
      out.write("\n");
      out.write("   float: left;\n");
      out.write("   border:0px;\n");
      out.write(" overflow: scroll;\n");
      out.write(" background: #b3dced; /* Old browsers */\n");
      out.write("background: -moz-linear-gradient(top,  #b3dced 0%, #29b8e5 50%, #bce0ee 100%); /* FF3.6+ */\n");
      out.write("background: -webkit-gradient(linear, left top, left bottom, color-stop(0%,#b3dced), color-stop(50%,#29b8e5), color-stop(100%,#bce0ee)); /* Chrome,Safari4+ */\n");
      out.write("background: -webkit-linear-gradient(top,  #b3dced 0%,#29b8e5 50%,#bce0ee 100%); /* Chrome10+,Safari5.1+ */\n");
      out.write("background: -o-linear-gradient(top,  #b3dced 0%,#29b8e5 50%,#bce0ee 100%); /* Opera 11.10+ */\n");
      out.write("background: -ms-linear-gradient(top,  #b3dced 0%,#29b8e5 50%,#bce0ee 100%); /* IE10+ */\n");
      out.write("background: linear-gradient(to bottom,  #b3dced 0%,#29b8e5 50%,#bce0ee 100%); /* W3C */\n");
      out.write("filter: progid:DXImageTransform.Microsoft.gradient( startColorstr='#b3dced', endColorstr='#bce0ee',GradientType=0 ); /* IE6-9 */\n");
      out.write("\n");
      out.write("}\n");
      out.write(".frm2 {\n");
      out.write("\n");
      out.write("float: right;\n");
      out.write("   border:0px;\n");
      out.write("   background-color: darkorange;\n");
      out.write("overflow: scroll;\n");
      out.write("   }\n");
      out.write(".frm3 {\n");
      out.write("float: middle;\n");
      out.write("border:0px; \n");
      out.write("overflow: scroll;\n");
      out.write("background: #b9f2b8; /* Old browsers */\n");
      out.write("background: -moz-linear-gradient(top,  #b9f2b8 0%, #29b8e5 50%, #bce0ee 100%); /* FF3.6+ */\n");
      out.write("background: -webkit-gradient(linear, left top, left bottom, color-stop(0%,#b9f2b8), color-stop(50%,#29b8e5), color-stop(100%,#bce0ee)); /* Chrome,Safari4+ */\n");
      out.write("background: -webkit-linear-gradient(top,  #b9f2b8 0%,#29b8e5 50%,#bce0ee 100%); /* Chrome10+,Safari5.1+ */\n");
      out.write("background: -o-linear-gradient(top,  #b9f2b8 0%,#29b8e5 50%,#bce0ee 100%); /* Opera 11.10+ */\n");
      out.write("background: -ms-linear-gradient(top,  #b9f2b8 0%,#29b8e5 50%,#bce0ee 100%); /* IE10+ */\n");
      out.write("background: linear-gradient(to bottom,  #b9f2b8 0%,#29b8e5 50%,#bce0ee 100%); /* W3C */\n");
      out.write("filter: progid:DXImageTransform.Microsoft.gradient( startColorstr='#b9f2b8', endColorstr='#bce0ee',GradientType=0 ); /* IE6-9 */\n");
      out.write("\n");
      out.write("\n");
      out.write("}\n");
      out.write(".frm4{\n");
      out.write("float: left;\n");
      out.write("border:0px;    \n");
      out.write("\n");
      out.write("overflow: scroll;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Home Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("         <iframe class=\"frm3\" frameborder=\"0\" id=\"top\" align=\"top\" name=\"top\"src=\"HeadingFramePage.jsp\" width=\"100%\" height=\"130\" seamless></iframe>\n");
      out.write("        <iframe class=\"frm1\" frameborder=\"0\" id=\"left\" name=\"left\" align=\"left\" src=\"LinksPage.jsp\"  width=\"13%\" height=\"480\" seamless></iframe>\n");
      out.write("        <iframe class=\"frm4\" frameborder=\"0\" id=\"middle\" name=\"middle\" align=\"right\" src=\"MainPage.jsp\" width=\"87%\" height=\"480\" seamless></iframe>   \n");
      out.write("\n");
      out.write("   \n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
