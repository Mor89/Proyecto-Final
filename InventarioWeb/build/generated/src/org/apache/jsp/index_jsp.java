package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/WEB-INF/Vista-Parciales/css-js.jspf");
    _jspx_dependants.add("/WEB-INF/Vista-Parciales/encabezado.jspf");
    _jspx_dependants.add("/WEB-INF/Vista-Parciales/pie.jspf");
  }

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

      out.write("<!DOCTYPE html>\r\n");
      out.write("<!--\r\n");
      out.write("To change this license header, choose License Headers in Project Properties.\r\n");
      out.write("To change this template file, choose Tools | Templates\r\n");
      out.write("and open the template in the editor.\r\n");
      out.write("-->\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>Control de Inventario</title>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <!--Incluimos la vista parcial la cual contienen las url de las librerias \r\n");
      out.write("        correspondientes a estilos y js -->\r\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("<!--Estilo personalisado-->\n");
      out.write("<link href=\"bootstrap337/css/estilo-base.css\" type=\"text/css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("<!--Estilo Bootstrap-->\n");
      out.write("<link href=\"bootstrap337/css/bootstrap-theme.css\" type=\"text/css\" rel=\"stylesheet\"/>\n");
      out.write("<link href=\"bootstrap337/css/bootstrap-theme.min.css\" type=\"text/css\" rel=\"stylesheet\"/>\n");
      out.write("<link href=\"bootstrap337/css/bootstrap.css\" type=\"text/css\" rel=\"stylesheet\"/>\n");
      out.write("<link href=\"bootstrap337/css/bootstrap.min.css\" type=\"text/css\" rel=\"stylesheet\"/>\n");
      out.write("\n");
      out.write("<!-- Scritp js de bootstrap-->\n");
      out.write("<script src=\"bootstrap/js/bootstrap.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"bootstrap/js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("<!-- Sritp libreria Jquery-->\n");
      out.write("<script src=\"bootstrap/js/jquery-3.6.0.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"bootstrap/js/jquery-3.6.0.min.js\" type=\"text/javascript\"></script>\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <!--Vista parcial de la parte superior de nuestra aplicacion -->\r\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("<div>\n");
      out.write("    <div class = \"encabezado\" text-aline = \"center\">\n");
      out.write("        Sistema de Control de Inventario\n");
      out.write("        <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("        <a href=\"index\" class=\"btn btn-primary btn-sm\" role=\"button\">Inicio</a>\n");
      out.write("        <a href=\"categorias\" class=\"btn btn-primary btn-sm\" role=\"button\">Categorias</a>\n");
      out.write("        </ul>\n");
      out.write("    </div>\n");
      out.write("<div class = \"contenido\">\n");
      out.write("<!--Este DIV no se cierra aqui, se cierran en pie.jspf-->\n");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("        <h3>¡Bienvenid@!</h3><!--Todo en contenido de la aplicacion -->\r\n");
      out.write("        \r\n");
      out.write("        <!--vista parcial de la parte inferior de nuestra aplicacion-->\r\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("<!--aqui se debe cerrar las div abiertos en el encabezados.jspf-->\n");
      out.write("</div>\n");
      out.write("<div class=\"pie\">\n");
      out.write("    &COPY; Luis Alexander MP\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
