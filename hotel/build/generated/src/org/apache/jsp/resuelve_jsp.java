package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class resuelve_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"extra.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"reset.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <section id=\"romis\">\n");
      out.write("        <h2>Extras</h2>\n");
      out.write("        <div class=\"room\">\n");
      out.write("          <h2>MASAJES RELAJANTES</h2>\n");
      out.write("          <input type=\"checkbox\" id=\"checkbox1\">\n");
      out.write("          <img src=\"ima/masaje.jpg\" alt=\"extra1\">\n");
      out.write("          <p>Después de un agotador viaje, programe con anticipación el servicio de masajes relajantes o descontracturantes, dependiendo de la zona o zonas a tratar: espalda, piernas, cervical o craneal, incluye aromaterapia con aceites y cremas magistrales destinadas a relajar toda la musculatura del cuerpo, eliminar tensiones y elevar las vibraciones energéticas. Sesión para 01 persona. Tiempo de duración: 01 hora.</p>\n");
      out.write("        <div class=\"room\">\n");
      out.write("          <h2>PAQUETE ROMANTICO CON CENA</h2>\n");
      out.write("          <input type=\"checkbox\" id=\"checkbox2\">\n");
      out.write("          <img src=\"ima/cena.jpg\" alt=\"extra2\">\n");
      out.write("          <p>Disfruta en pareja de este plan: Incluye:Decoración en la habitación con globos y detalles románticos ,Cena o almuerzo para 02 personas (entrada, plato de fondo y postre) , 02 cocktails a elegir (pisco sour o piña colada) , 01 docena de chocolates.</p>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"room\"> \n");
      out.write("          <h2>PAQUETE ROMÁNTICO SÚTIL</h2>\n");
      out.write("          <input type=\"checkbox\" id=\"checkbox3\">\n");
      out.write("          <img src=\"ima/trago.jpg\" alt=\"extra3\">  \n");
      out.write("          <p>Sorprende a tu pareja contratando este paquete adicional: Incluye: , Decoración en la habitación con globos y detalles románticos , 02 cocktails a elegir (pisco sour ó  piña colada ).</p>\n");
      out.write("        </div>\n");
      out.write("         <div class=\"room\">\n");
      out.write("          <h2>PAQUETE DE CUMPLEAÑOSL</h2>\n");
      out.write("          <input type=\"checkbox\" id=\"checkbox4\">\n");
      out.write("          <img src=\"ima/cumple.jpg\" alt=\"extra4\">\n");
      out.write("          <p>¡Regale esta sorpresa a su familiar ó amigos! Incluye : Decoración con globos en la habitación , Una torta tamaño pequeño , 01 ronda de piqueo Gran Palma , 04 bebidas frias (agua o gaseosas).</p>\n");
      out.write("          \n");
      out.write("        </div>\n");
      out.write("      </section>\n");
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
