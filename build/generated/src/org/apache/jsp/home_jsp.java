package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\" class=\"no-js\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>H A N D L E |Inicio</title>\r\n");
      out.write("\r\n");
      out.write("        <!-- CSS -->\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Zilla+Slab:wght@500&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("        <link rel='stylesheet' href='http://fonts.googleapis.com/css?family=PT+Sans:400,700'>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/reset.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/supersized.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/style.css\">   \r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("        <!--contenedor body-------------------------------------------------------------------------------------->\r\n");
      out.write("        <div class=\"page-container\">\r\n");
      out.write("        <!--contenedor navbar-------------------------------------------------------------------------------------->\r\n");
      out.write("            <div class=\"navbar\">\r\n");
      out.write("                <div class=\"menu\">\r\n");
      out.write("                    <h3 id=\"elemento1\">Perfil</h3>\r\n");
      out.write("                    <h3 id=\"elemento2\">Configuración</h3>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"logo\">\r\n");
      out.write("                <h1>H A N D L E</h1>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        <!--contenedor contenido------------ aca utilizaremos iframees-------------------------------------------------------------------------->\r\n");
      out.write("            <div class=\"box\">\r\n");
      out.write("                <iframe frameborder=\"0\" id=\"frame\" src=\"registryusers.jsp\"></iframe>\r\n");
      out.write("            </div>\r\n");
      out.write("        <!--contenedor footer-------------------------------------------------------------------------------------->\r\n");
      out.write("            <div class=\"footer\">\r\n");
      out.write("                <p class=\"tf\">Herramientas para tu inventario:</p>\r\n");
      out.write("                <p class=\"tf2\">\r\n");
      out.write("                    <a class=\"informacion\" href=\"\"></a>\r\n");
      out.write("                    <a class=\"lapiz\" href=\"\"></a>\r\n");
      out.write("                </p>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!-- Javascript -->\r\n");
      out.write("        <script src=\"assets/js/jquery-1.8.2.min.js\"></script>\r\n");
      out.write("        <script src=\"assets/js/supersized.3.2.7.min.js\"></script>\r\n");
      out.write("        <script src=\"assets/js/supersized-init.js\"></script>\r\n");
      out.write("        <script src=\"assets/js/scripts.js\"></script>\r\n");
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
