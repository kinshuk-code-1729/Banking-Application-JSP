package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>Login Page</title>\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            background-color: pink;\n");
      out.write("            font-family: Arial, sans-serif;\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("        table {\n");
      out.write("            border: 5px solid #333;\n");
      out.write("            margin: 50px auto;\n");
      out.write("            padding: 20px;\n");
      out.write("            background-color: #f9f9f9;\n");
      out.write("            border-radius: 10px;\n");
      out.write("        }\n");
      out.write("        td {\n");
      out.write("            padding: 10px;\n");
      out.write("        }\n");
      out.write("        select, input[type=\"text\"], input[type=\"password\"] {\n");
      out.write("            width: 200px;\n");
      out.write("            padding: 5px;\n");
      out.write("            border: 1px solid #ccc;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            font-size: 16px;\n");
      out.write("        }\n");
      out.write("        input[type=\"submit\"], input[type=\"reset\"] {\n");
      out.write("            padding: 10px 20px;\n");
      out.write("            background-color: #333;\n");
      out.write("            color: #fff;\n");
      out.write("            border: none;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            cursor: pointer;\n");
      out.write("            font-size: 16px;\n");
      out.write("        }\n");
      out.write("        input[type=\"submit\"]:hover, input[type=\"reset\"]:hover {\n");
      out.write("            background-color: #555;\n");
      out.write("        }\n");
      out.write("        a {\n");
      out.write("            color: #333;\n");
      out.write("            text-decoration: none;\n");
      out.write("        }\n");
      out.write("        a:hover {\n");
      out.write("            color: #555;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <form action=\"Check.jsp\" method=\"post\">\n");
      out.write("        <table border=\"0\" align=\"center\">\n");
      out.write("            <tr>\n");
      out.write("                <td>Select Role</td>\n");
      out.write("                <td>\n");
      out.write("                    <select name=\"role\">\n");
      out.write("                        <option value=\"select\">Select</option>\n");
      out.write("                        <option value=\"admin\">ADMIN</option>\n");
      out.write("                        <option value=\"customer\">CUSTOMER</option>\n");
      out.write("                    </select>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Login ID</td>\n");
      out.write("                <td><input type=\"text\" name=\"loginid\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Password</td>\n");
      out.write("                <td><input type=\"password\" name=\"loginpwd\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td><input type=\"submit\" name=\"b1\" value=\"Login\"></td>\n");
      out.write("                <td><input type=\"reset\" name=\"b2\" value=\"Reset\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td colspan=\"1\"><a href=\"ForgetPassword.jsp\">Forget Password</a></td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("    </form>\n");
      out.write("</body>\n");
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
