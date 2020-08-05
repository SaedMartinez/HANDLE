package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registryusers_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>H A N D L E |Registrar Usuarios</title>\n");
      out.write("\n");
      out.write("        <!-- CSS -->\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Zilla+Slab:wght@500&display=swap\" rel=\"stylesheet\">\n");
      out.write("        <link rel='stylesheet' href='http://fonts.googleapis.com/css?family=PT+Sans:400,700'>\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/style.css\"> \n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"inside-box\">\n");
      out.write("            <div class=\"leftside\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"rightside\">\n");
      out.write("                <h2 id=\"titleregistro\">Informacion de nuevo usuario</h2>\n");
      out.write("                <p id=\"textregistro\">Ingresa todos los datos del usuario que desear registrar</p>\n");
      out.write("                <form action=\"Registro\" id=\"registro\" method=\"post\">\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label>Nombre</label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" name=\"fuser\" placeholder=\"Nombre\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label>Contraseña</label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" name=\"fpassword\" placeholder=\"Contraseña\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label>Estado</label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" name=\"fstatus\" placeholder=\"Estado de usuario\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label>Cargo</label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" name=\"fposition\" placeholder=\"Cargo\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label>Nivel</label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" name=\"flevel\" placeholder=\"Nivel\">\n");
      out.write("                    </div>\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-primary\" name=\"fsend\">Crear</button>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
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
