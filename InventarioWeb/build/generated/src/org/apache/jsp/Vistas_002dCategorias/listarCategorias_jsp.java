package org.apache.jsp.Vistas_002dCategorias;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Modelo.Categoria;

public final class listarCategorias_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/Vistas-Categorias/../WEB-INF/Vista-Parciales/css-js.jspf");
    _jspx_dependants.add("/Vistas-Categorias/../WEB-INF/Vista-Parciales/encabezado.jspf");
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
      out.write("\n");
      java.util.List lista = null;
      synchronized (session) {
        lista = (java.util.List) _jspx_page_context.getAttribute("lista", PageContext.SESSION_SCOPE);
        if (lista == null){
          try {
            lista = (java.util.List) java.beans.Beans.instantiate(this.getClass().getClassLoader(), "java.util.List");
          } catch (ClassNotFoundException exc) {
            throw new InstantiationException(exc.getMessage());
          } catch (Exception exc) {
            throw new ServletException("Cannot create bean of class " + "java.util.List", exc);
          }
          _jspx_page_context.setAttribute("lista", lista, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Control de Inventario</title>\n");
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
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("<div>\n");
      out.write("    <div class = \"encabezado\" text-aline = \"center\">\n");
      out.write("        Sistema de Control de Inventario\n");
      out.write("        <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("        <a href=\"index\" class=\"btn btn-primary btn-sm\" role=\"button\">Inicio</a>\n");
      out.write("        <a href=\"categoria\" class=\"btn btn-primary btn-sm\" role=\"button\">Categorias</a>\n");
      out.write("        </ul>\n");
      out.write("    </div>\n");
      out.write("<div class = \"contenido\">\n");
      out.write("<!--Este DIV no se cierra aqui, se cierran en pie.jspf-->\n");
      out.write("\n");
      out.write("        \n");
      out.write("        <div style=\"width: 600px;\">\n");
      out.write("            <a href=\"#\" class =\"btn btn-success btn-sm glyphicon glyphicon-pencil\" role=\"button\">Nueva Categoria</a>\n");
      out.write("            <h3>Listado de categorias Registradas</h3>\n");
      out.write("            <table class=\"table table-striped\">\n");
      out.write("              <!--  <tr>\n");
      out.write("                    <th>ID</th><th>NOMBRE</th><th>ESTADO</th><th>ACCION</th>\n");
      out.write("                </tr>\n");
      out.write("              \n");
      out.write("              -->\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
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
