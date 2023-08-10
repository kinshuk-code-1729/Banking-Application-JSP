package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class CashWithdraw_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 Random r2;
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
      out.write("    <title>Transaction for Customer</title>\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            background-color: violet;\n");
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
      out.write("        select, input[type=\"text\"], input[type=\"password\"],input[type=\"date\"] {\n");
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
      out.write('\n');

    r2 = new Random();

      out.write("\n");
      out.write("<h1>Transaction for customer</h1>\n");
      out.write("<h2>Withdraw your amount here.........</h2>\n");
      out.write("<h3>\n");
      out.write("    <form action=\"CashWithdrawDBMS.jsp\" method=\"post\">\n");
      out.write("        <table>\n");
      out.write("            <tr>\n");
      out.write("                <td>Account Number</td>\n");
      out.write("                <td><input type=\"text\" name=\"accno\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Reference</td>\n");
      out.write("                <td><input type=\"text\" name=\"refname\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Date of Transaction</td>\n");
      out.write("                <td><input type=\"date\" name=\"dot\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Transaction ID</td>\n");
      out.write("                <td><input type=\"text\" name=\"tid\" value=\"TRX");
      out.print(r2.nextInt());
      out.write("\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Withdraw Amount</td>\n");
      out.write("                <td><input type=\"text\" name=\"wdamt\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td><input type=\"submit\" name=\"b1\" value=\"Withdraw\"></td>\n");
      out.write("                <td><input type=\"reset\" name=\"b2\" value=\"Reset\"></td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("    </form>\n");
      out.write("</h3>\n");
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
