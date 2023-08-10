package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class CustomerLogin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

Connection con=null;
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/DBCON.jsp");
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

      out.write("\n");
      out.write("<html>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("        ");

            try {
            Class.forName("com.mysql.jdbc.Driver");
            String connectionURL = "jdbc:mysql://localhost:3306/GlobalBankingDB";
            
            String dbuser="root";
            String dbpass="root";
            con = DriverManager.getConnection(connectionURL,dbuser, dbpass);

            out.println("Successfully Connected .....");
            }
            catch (Exception e) {
            out.println("Connection failed ....." + e);
            }
        
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <style>\n");
      out.write("        body {\n");
      out.write("            font-family: Arial, sans-serif;\n");
      out.write("            background-color: #f0f0f0;\n");
      out.write("            text-align: center;\n");
      out.write("            margin: 50px;\n");
      out.write("        }\n");
      out.write("        h1 {\n");
      out.write("            color: #333;\n");
      out.write("        }\n");
      out.write("        h2 {\n");
      out.write("            color: #666;\n");
      out.write("        }\n");
      out.write("        h3 {\n");
      out.write("            color: #333;\n");
      out.write("            margin-top: 30px;\n");
      out.write("        }\n");
      out.write("        h4 {\n");
      out.write("            color: #999;\n");
      out.write("        }\n");
      out.write("        table {\n");
      out.write("            border-collapse: collapse;\n");
      out.write("            margin: 20px auto;\n");
      out.write("        }\n");
      out.write("        th, td {\n");
      out.write("            padding: 10px;\n");
      out.write("            border: 1px solid #ccc;\n");
      out.write("        }\n");
      out.write("        a {\n");
      out.write("            display: block;\n");
      out.write("            padding: 10px;\n");
      out.write("            margin-bottom: 5px;\n");
      out.write("            background-color: #007bff;\n");
      out.write("            color: #fff;\n");
      out.write("            text-decoration: none;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            width: 150px;\n");
      out.write("            margin: 5px auto;\n");
      out.write("        }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Hello ");
      out.print(session.getAttribute("login_id"));
      out.write("</h1>\n");
      out.write("        <h2>Welcome to the customer login page..........</h2>\n");
      out.write("        <h4>Last Login at ");
      out.print(session.getAttribute("login_time") );
      out.write("</h4>\n");
      out.write("       <table>\n");
      out.write("        <thead>\n");
      out.write("            <tr>\n");
      out.write("                <th>Account Holder Name</th>\n");
      out.write("            </tr>\n");
      out.write("        </thead>\n");
      out.write("        <tbody>\n");
      out.write("            ");

            try {
                String AccHNQ = "select * from account where accountno='"+session.getAttribute("login_id")+"'";
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(AccHNQ);

                while(rs.next()){
                    
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td>");
      out.print( rs.getString(2) );
      out.write("</td>\n");
      out.write("                    </tr>\n");
      out.write("                    ");

                }
            }
            catch(Exception e){
                out.println("Some error occurred ....<br>"+e);
            }
            
      out.write("\n");
      out.write("        </tbody>\n");
      out.write("    </table>\n");
      out.write("        <h3>\n");
      out.write("            <a href=\"CustomerStatement.jsp\">View Statement</a><br>\n");
      out.write("            <a href=\"CustomerProfile.jsp\">Customer Profile</a><br>\n");
      out.write("            <a href=\"CustomerFundTransfer.jsp\">Customer Fund Transfer</a><br>\n");
      out.write("            <a href=\"ChangePassword.jsp\">Change Password</a><br>\n");
      out.write("            <a href=\"INFO.jsp\">INFO</a><br>\n");
      out.write("        </h3>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
