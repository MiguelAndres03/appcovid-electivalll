package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class sintomas_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Sintomas</title>\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            \n");
      out.write("            body{\n");
      out.write("               margin: 0;\n");
      out.write("               padding: 0;\n");
      out.write("               position: absolute;\n");
      out.write("               overflow: hidden;\n");
      out.write("               height: 100vh;\n");
      out.write("               background-image: url(fondo.jpg);\n");
      out.write("\n");
      out.write("           }\n");
      out.write("           \n");
      out.write("           \n");
      out.write("            .cap{\n");
      out.write("               width: 400px;\n");
      out.write("               background: #eafcfc;\n");
      out.write("               padding: 30px;\n");
      out.write("               margin: auto;\n");
      out.write("               margin-top: 200px;\n");
      out.write("               margin-left: 500px;\n");
      out.write("               border-radius: 4px;\n");
      out.write("               font-family: 'calibir';\n");
      out.write("               color: black;\n");
      out.write("               box-shadow: 7px 13px 37px #000;\n");
      out.write("           }\n");
      out.write("           \n");
      out.write("                      .cap .boton{\n");
      out.write("               width: 100%;\n");
      out.write("               background: #000;\n");
      out.write("               border-radius: none;\n");
      out.write("               color: white;\n");
      out.write("               margin: 16px 0;\n");
      out.write("               font-size: 18px;\n");
      out.write("           }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <form class=\"cap\" method=\"post\" action=\"DatosSintomas\">\n");
      out.write("            <p>\n");
      out.write("                A Continuación se presenta un listado de los sintomas que comunmente son asociados al COVID-19, seleccione las\n");
      out.write("                casillas indicando si usted presenta alguno de estos sintomas.\n");
      out.write("            </p>\n");
      out.write("        <input type=\"checkbox\" name=\"cbox1\" id=\"cbox1\" value=\"checkbox1\"> <label for=\"cbox1\"> Fiebre</label><br>\n");
      out.write("        <input type=\"checkbox\" name=\"cbox2\" id=\"cbox2\" value=\"checkbox2\"> <label for=\"cbox2\">Toz seca</label><br>\n");
      out.write("        <input type=\"checkbox\" name=\"cbox3\" id=\"cbox3\" value=\"checkbox3\"> <label for=\"cbox3\">Cansancio</label><br>\n");
      out.write("        <input type=\"checkbox\" name=\"cbox4\" id=\"cbox4\" value=\"checkbox4\"> <label for=\"cbox4\">Dolor muscular</label><br>\n");
      out.write("        <input type=\"checkbox\" name=\"cbox5\" id=\"cbox5\" value=\"checkbox5\"> <label for=\"cbox5\">Dificultad para respirar</label><br>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <input class=\"boton\" type=\"submit\" value=\"Enviar\">\n");
      out.write("        </form>\n");
      out.write("        \n");
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
