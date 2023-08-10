package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.sql.*;

public final class CashDepositDBMS_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
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
      out.write("    <body>\n");
      out.write("        ");

        String words = "";
        String unitsArray[] = { "zero", "one", "two", "three", "four", "five", "six", 
                      "seven", "eight", "nine", "ten", "eleven", "twelve",
                      "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", 
                      "eighteen", "nineteen" };
	String tensArray[] = { "zero", "ten", "twenty", "thirty", "forty", "fifty",
                      "sixty", "seventy", "eighty", "ninety" };
            try{
                /*int prevBal = 0;
                String lastQ = "select * from BankTransactions";
                Statement s1 = con.createStatement();
                ResultSet r2 = s1.executeQuery(lastQ);
                
                while(r2.next()){
                    prevBal = r2.getInt(7);
                }*/
//                out.println(prevBal);
                String anum = request.getParameter("accno");
                String rn = request.getParameter("refname");
                String Dtt = request.getParameter("dot");
                String Tid = request.getParameter("tid");
                int Damt = Integer.parseInt(request.getParameter("depamt"));
                
               /* String DpQ = "insert into BankTransactions values(?,?,?,?,?,?,?);";
                PreparedStatement ps = con.prepareStatement(DpQ);
                
                ps.setString(1,anum );
                ps.setString(2,rn );
                ps.setString(3,Dtt );
                ps.setString(4,Tid );
                ps.setInt(5, Damt);
                ps.setInt(6, 0);
                ps.setInt(7, (prevBal+Damt));
                
                ps.executeUpdate();*/
                int number = Damt;
//                if (number < 0) { 
//                    out.println("Amount cannot be negative ");
//                } 
        while(number > 0){
            if (number == 0) {
                    words = "zero";
            }
            if ((number / 100000) > 0) {
	   words += number / 100000 + " lakh ";
	   number %= 100000;
	}
	// check if number is divisible by 1 thousand
	if ((number / 1000) > 0) {
	    words += number / 1000 + " thousand ";
	    number %= 1000;
	}
	// check if number is divisible by 1 hundred
	if ((number / 100) > 0) {
	     words += number / 100 + " hundred ";
	     number %= 100;
	}
 
	if (number > 0) {
	     // check if number is within teens
	     if (number < 20) { 
                    // fetch the appropriate value from unit array
                    words += unitsArray[number];
             } else { 
                // fetch the appropriate value from tens array
                words += tensArray[number / 10]; 
                if ((number % 10) > 0) {
		    words += "-" + unitsArray[number % 10];
                }  
	     }
          }
	
   }
        out.println(words);
//                out.println("<br>Cash Amount Deposited Successfully in Bank Schema !!!!!!!!!!!");
                
//                For Customer.....................
                int cusPrevBal = 0;
                String CusLastQ = "select * from "+anum;
                Statement s2 = con.createStatement();
                ResultSet r3 = s2.executeQuery(CusLastQ);
                
                while(r3.next()){
                    cusPrevBal = r3.getInt(7);
                }
                
                String CusDpQ = "insert into "+anum+"  values(?,?,?,?,?,?,?);";
                PreparedStatement ps2 = con.prepareStatement(CusDpQ);
                
                ps2.setString(1,anum);
                ps2.setString(2,rn);
                ps2.setString(3,Dtt);
                ps2.setString(4,Tid);
                ps2.setInt(5, Damt);
                ps2.setInt(6, 0);
                ps2.setInt(7, (cusPrevBal+Damt));
                
                ps2.executeUpdate();
                out.println("<br>Cash Amount Deposited Successfully in  "+anum+" Table !!!!!!!!!!!");
            }
            catch(Exception e){
                out.println("<br>Oops !!!! Transaction Failed.................., Cash not deposited <br>"+e);
            }
        
      out.write("\n");
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
