package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

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
      out.write("        <title>Inicio</title>\n");
      out.write("        \n");
      out.write("       <style type=\"text/css\">\n");
      out.write("          \n");
      out.write("           *{\n");
      out.write("               margin:0;\n");
      out.write("               padding:0;\n");
      out.write("               box-sizing: border-box;\n");
      out.write("           }\n");
      out.write("           \n");
      out.write("           .form-register{\n");
      out.write("               width: 400px;\n");
      out.write("               background: #eafcfc;\n");
      out.write("               padding: 30px;\n");
      out.write("               margin: auto;\n");
      out.write("               margin-top: 100px;\n");
      out.write("               margin-left: 900px;\n");
      out.write("               border-radius: 4px;\n");
      out.write("               font-family: 'calibir';\n");
      out.write("               color: black;\n");
      out.write("               box-shadow: 7px 13px 37px #000;\n");
      out.write("           }\n");
      out.write("           \n");
      out.write("           .controls {\n");
      out.write("               width: 100%;\n");
      out.write("               background: #eafcfc;\n");
      out.write("               padding: 10px; \n");
      out.write("               border-radius: 4px;\n");
      out.write("               margin-bottom: 16px;\n");
      out.write("               border: 1px solid #1f53c5;\n");
      out.write("               font-family: 'calibri';\n");
      out.write("               font-size: 18px;\n");
      out.write("                   \n");
      out.write("           }\n");
      out.write("           \n");
      out.write("           .form-register .boton{\n");
      out.write("               width: 100%;\n");
      out.write("               background: #000;\n");
      out.write("               border-radius: none;\n");
      out.write("               color: white;\n");
      out.write("               margin: 16px 0;\n");
      out.write("               font-size: 18px;\n");
      out.write("           }\n");
      out.write("           \n");
      out.write("           \n");
      out.write("           .cont{\n");
      out.write("               width: 800px;\n");
      out.write("               background: #eafcfc;\n");
      out.write("               padding: 78px;\n");
      out.write("               margin: auto;\n");
      out.write("               margin-top: -415px;\n");
      out.write("               margin-left: 30px;\n");
      out.write("               border-radius: 4px;\n");
      out.write("               font-family: 'calibir';\n");
      out.write("               color: white;\n");
      out.write("               box-shadow: 7px 13px 37px #000;\n");
      out.write("           }\n");
      out.write("           \n");
      out.write("             .cont .boton{\n");
      out.write("               width: 100%;\n");
      out.write("               background: #000;\n");
      out.write("               border-radius: none;\n");
      out.write("               color: white;\n");
      out.write("               margin: 16px 0;\n");
      out.write("               font-size: 18px;\n");
      out.write("           }\n");
      out.write("           .cont p{\n");
      out.write("             width: 100%;\n");
      out.write("             color: black;\n");
      out.write("             align-content: center;\n");
      out.write("             text-align: justify;\n");
      out.write("           }\n");
      out.write("           \n");
      out.write("           body{\n");
      out.write("               margin: 0;\n");
      out.write("               padding: 0;\n");
      out.write("               position: absolute;\n");
      out.write("               overflow: hidden;\n");
      out.write("               height: 100vh;\n");
      out.write("               background-image: url(fondo.jpg);\n");
      out.write("\n");
      out.write("           }\n");
      out.write("           \n");
      out.write("           h1{\n");
      out.write("               margin-left: 400px;\n");
      out.write("               font-size: 90px;\n");
      out.write("               font-family: 'rockwell';\n");
      out.write("           }\n");
      out.write("       </style>\n");
      out.write("        \n");
      out.write("        <script>\n");
      out.write("        function letras(e)\n");
      out.write("        {\n");
      out.write("            key= e.keyCode || e.which;\n");
      out.write("            teclado = String.fromCharCode(key).toLowerCase();\n");
      out.write("            caracter = \"abcdefghijklmnopqrstuvwxyzñ \"\n");
      out.write("\n");
      out.write("            if(caracter.indexOf(teclado)==-1 )\n");
      out.write("            {\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            \n");
      out.write("        }\n");
      out.write("        function numeros(e)\n");
      out.write("        {\n");
      out.write("            key= e.keyCode || e.which;\n");
      out.write("            \n");
      out.write("            teclado = String.fromCharCode(key);\n");
      out.write("            caracter = \"0123456789\";\n");
      out.write("            \n");
      out.write("            if(caracter.indexOf(teclado)==-1)\n");
      out.write("            {\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            \n");
      out.write("        }\n");
      out.write("\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("        \n");
      out.write("       \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>BIENVENIDOS</h1>\n");
      out.write("        <br/>\n");
      out.write("        \n");
      out.write("        <form  method=\"post\" action=\"DatosRegistro\" class=\"form-register\">\n");
      out.write("            <input class=\"controls\" type=\"text\" name=\"nombre\" placeholder=\"Ingrese su(s) nombre(s)\" onkeypress=\"return letras(event) \"> <br>\n");
      out.write("            <input class=\"controls\" type=\"text\" name=\"apellido\" placeholder=\"Ingrese su(s) apellido(s)\" onkeypress=\"return letras(event) \"> <br>\n");
      out.write("            <input class=\"controls\" type=\"text\" name=\"cedula\" placeholder=\"Ingrese su número de cédula\" onkeypress=\"return numeros(event) \"> <br>\n");
      out.write("            <input class=\"controls\" type=\"email\" name=\"correo\" placeholder=\"Ingrese su correo electrónico\"> <br>\n");
      out.write("                \n");
      out.write("           \n");
      out.write("            <input class=\"boton\" type=\"submit\" value=\"Enviar\">\n");
      out.write("            <input class=\"boton\" type=\"reset\" value=\"Borrar\"> \n");
      out.write("         \n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("        <form class=\"cont\" method=\"post\" action=\"conteo\">\n");
      out.write("          <p> Los coronavirus (CoV) son virus que surgen periódicamente en diferentes áreas del mundo y que causan Infección Respiratoria Aguda (IRA), es decir gripa, que pueden llegar a ser leve, moderada o grave.\n");
      out.write("\n");
      out.write("El nuevo Coronavirus (COVID-19) ha sido catalogado por la Organización Mundial de la Salud como una emergencia en salud pública de importancia internacional (ESPII). Se han identificado casos en todos los continentes y, el 6 de marzo se confirmó el primer caso en Colombia.\n");
      out.write("\n");
      out.write("<br><br> La infección se produce cuando una persona enferma tose o estornuda y expulsa partículas del virus que entran en contacto con otras personas.\n");
      out.write("          \n");
      out.write("<br><br> A continuación podrá ver un conteo de las personas que han indicado tener sintomas asociados al COVID-19</p>\n");
      out.write("          <input class=\"boton\" type=\"submit\" value=\"Ver conteo de sintomas\">\n");
      out.write("        </form>\n");
      out.write("        \n");
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
