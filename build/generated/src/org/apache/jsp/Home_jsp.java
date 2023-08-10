package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>Home Global Bank</title>\n");
      out.write("    <style>\n");
      out.write("        .mynav{\n");
      out.write("            margin-right:5;\n");
      out.write("            padding-right: 10px;\n");
      out.write("        }\n");
      out.write("        body {\n");
      out.write("            font-family: Arial, sans-serif;\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("            background-color: #f7f7f7;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        header {\n");
      out.write("            background-color: #004e98;\n");
      out.write("            color: #fff;\n");
      out.write("            text-align: center;\n");
      out.write("            padding: 20px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        h1 {\n");
      out.write("            margin: 0;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .container {\n");
      out.write("            max-width: 1200px;\n");
      out.write("            margin: 0 auto;\n");
      out.write("            padding: 20px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .cta-container {\n");
      out.write("            text-align: center;\n");
      out.write("            margin-top: 50px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .cta-button {\n");
      out.write("            background-color: #004e98;\n");
      out.write("            color: #fff;\n");
      out.write("            font-size: 18px;\n");
      out.write("            padding: 10px 30px;\n");
      out.write("            border: none;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            cursor: pointer;\n");
      out.write("            text-decoration: none;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .cta-button:hover {\n");
      out.write("            background-color: #003e78;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .feature {\n");
      out.write("            display: flex;\n");
      out.write("            justify-content: space-between;\n");
      out.write("            margin-top: 30px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .feature-icon {\n");
      out.write("            font-size: 30px;\n");
      out.write("            color: #004e98;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .feature-text {\n");
      out.write("            flex: 1;\n");
      out.write("            margin-left: 15px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        footer {\n");
      out.write("            background-color: #004e98;\n");
      out.write("            color: #fff;\n");
      out.write("            text-align: center;\n");
      out.write("            padding: 10px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        a {\n");
      out.write("            color: #004e98;\n");
      out.write("            text-decoration: none;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        a:hover {\n");
      out.write("            text-decoration: underline;\n");
      out.write("        }\n");
      out.write("        ul {\n");
      out.write("  list-style-type: none;\n");
      out.write("  margin: 0;\n");
      out.write("  padding: 0;\n");
      out.write("  overflow: hidden;\n");
      out.write("}\n");
      out.write("\n");
      out.write("li {\n");
      out.write("  float: left;\n");
      out.write("  \n");
      out.write("}\n");
      out.write("\n");
      out.write("li a {\n");
      out.write("  display: block;\n");
      out.write("  padding: 8px;\n");
      out.write("  background-color: #dddddd;\n");
      out.write("  margin-right:5;\n");
      out.write("}\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <header>\n");
      out.write("        <h1 style=\"display: block;\">Welcome to the Global Bank</h1>\n");
      out.write("        <nav >\n");
      out.write("            <div class=\"mynav\">\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"Home.jsp\">Home</a></li>\n");
      out.write("                    <li><a>Contact</a></li>\n");
      out.write("                    <li><a>About Us</a></li>\n");
      out.write("                    <li><a>News</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("    </header>\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"cta-container\">\n");
      out.write("            <a href=\"Login.jsp\" class=\"cta-button\">Login</a>\n");
      out.write("            <a href=\"NewAccount.jsp\" class=\"cta-button\">Register</a>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"feature\">\n");
      out.write("            <div class=\"feature-icon\">&#128197;</div>\n");
      out.write("            <div class=\"feature-text\">\n");
      out.write("                <h2>Safe and Secure Banking</h2>\n");
      out.write("                <p>At Global Bank, we prioritize the security of your financial transactions.</p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"feature\">\n");
      out.write("            <div class=\"feature-icon\">&#128179;</div>\n");
      out.write("            <div class=\"feature-text\">\n");
      out.write("                <h2>Easy Online Banking</h2>\n");
      out.write("                <p>Access your accounts, make payments, and manage your finances online with ease.</p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"feature\">\n");
      out.write("            <div class=\"feature-icon\">&#127970;</div>\n");
      out.write("            <div class=\"feature-text\">\n");
      out.write("                <h2>24/7 Customer Support</h2>\n");
      out.write("                <p>Our dedicated support team is available around the clock to assist you with any inquiries.</p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <footer>\n");
      out.write("        &copy; 2023 Global Bank. All rights reserved.\n");
      out.write("    </footer>\n");
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
