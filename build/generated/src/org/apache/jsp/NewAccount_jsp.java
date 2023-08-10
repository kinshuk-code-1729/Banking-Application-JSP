package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class NewAccount_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\n");
      out.write("    <title>New Account Registration</title>\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            font-family: Arial, sans-serif;\n");
      out.write("            background-color: #34ebe5;\n");
      out.write("            margin: 20px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        h1 {\n");
      out.write("            text-align: center;\n");
      out.write("            color: #333;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        form {\n");
      out.write("            width: 400px;\n");
      out.write("            margin: 0 auto;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        table {\n");
      out.write("            border: 5px solid #333;\n");
      out.write("            margin: 50px auto;\n");
      out.write("            padding: 20px;\n");
      out.write("            background-color: #f9f9f9;\n");
      out.write("            border-radius: 10px;\n");
      out.write("            /*border-collapse: collapse;*/\n");
      out.write("            width: 150%;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        td {\n");
      out.write("            padding: 10px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        input[type=\"text\"],\n");
      out.write("        input[type=\"date\"],\n");
      out.write("        input[type=\"password\"],\n");
      out.write("        input[type=\"submit\"],\n");
      out.write("        input[type=\"reset\"],\n");
      out.write("        select {\n");
      out.write("            width: 100%;\n");
      out.write("            padding: 8px;\n");
      out.write("            font-size: 16px;\n");
      out.write("            border: 1px solid #ccc;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            margin-bottom: 15px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        input[type=\"radio\"] {\n");
      out.write("            margin-right: 5px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        input[type=\"submit\"],\n");
      out.write("        input[type=\"reset\"] {\n");
      out.write("            border: none;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            background-color: #4CAF50;\n");
      out.write("            color: white;\n");
      out.write("            cursor: pointer;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        input[type=\"submit\"]:hover,\n");
      out.write("        input[type=\"reset\"]:hover {\n");
      out.write("            background-color: #45a049;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        select {\n");
      out.write("            height: 38px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        td:first-child {\n");
      out.write("            font-weight: bold;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<h1>New Account Registration</h1>\n");
      out.write("<form action=\"NewAccountDBMS.jsp\" method=\"post\">\n");
      out.write("    <table>\n");
      out.write("        <tr>\n");
      out.write("            <td>Account Number</td>\n");
      out.write("            <td><input type=\"text\" name=\"accno\"></td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td>Customer Name</td>\n");
      out.write("            <td><input type=\"text\" name=\"cname\"></td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td>Father Name</td>\n");
      out.write("            <td><input type=\"text\" name=\"fname\"></td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td>DOB</td>\n");
      out.write("            <td><input type=\"date\" name=\"dob\"></td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td>Gender</td>\n");
      out.write("            <td>\n");
      out.write("                Male <input type=\"radio\" name=\"gender\" value=\"Male\">\n");
      out.write("                Female <input type=\"radio\" name=\"gender\" value=\"Female\">\n");
      out.write("            </td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td>Account Opening Date</td>\n");
      out.write("            <td><input type=\"date\" name=\"opdate\"></td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td>Address</td>\n");
      out.write("            <td><input type=\"text\" name=\"address\"></td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td>Contact Number</td>\n");
      out.write("            <td><input type=\"text\" name=\"cno\"></td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td>Select Your Role</td>\n");
      out.write("            <td>\n");
      out.write("                <select name=\"role\">\n");
      out.write("                    <option value=\"Admin\">ADMIN</option>\n");
      out.write("                    <option value=\"Customer\">CUSTOMER</option>\n");
      out.write("                </select>\n");
      out.write("            </td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td>Password</td>\n");
      out.write("            <td><input type=\"password\" name=\"password\"></td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td>Security Question</td>\n");
      out.write("            <td>\n");
      out.write("                <select name=\"SecQ\">\n");
      out.write("                    <option value=\"bplace\">Birth Place</option>\n");
      out.write("                    <option value=\"FSchool\">First School</option>\n");
      out.write("                    <option value=\"bff\">Best Friend</option>\n");
      out.write("                </select>\n");
      out.write("            </td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td>Security Answer</td>\n");
      out.write("            <td><input type=\"text\" name=\"SecA\"></td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td><input type=\"submit\" name=\"b1\" value=\"Save\"></td>\n");
      out.write("            <td><input type=\"reset\" name=\"b2\" value=\"RESET\"></td>\n");
      out.write("        </tr>\n");
      out.write("    </table>\n");
      out.write("</form>\n");
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
