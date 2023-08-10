<%@page import="java.time.LocalDate"%>
<%@include file="DBCON.jsp" %>
<%@page import="java.util.Date" %>
<html>
    <body>
        <%
            int c = 0;
            String role = request.getParameter("role");
            String loginid = request.getParameter("loginid");
            String pwd = request.getParameter("loginpwd");
            
            session.setAttribute("login_id", loginid);
            session.setAttribute("login_time",new Date());
            
            try{
                String AccQ = "SELECT * FROM ACCOUNT";
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(AccQ);
            session.setAttribute("login_id",loginid);
            session.setAttribute("login_time",LocalDate.now());
            
            long millis=System.currentTimeMillis();
            Date date = new java.sql.Date(millis);
            session.setAttribute("transaction_date",date);
                
                while(rs.next()){
//                    out.println("<br>");
//                    out.println(" "+rs.getString(1));  // ACC. NUM. ---> LoginID also
//                    out.println(" "+rs.getString(9)); // ROLE
//                    out.println(" "+rs.getString(10)); // PASSWD
                    if(role.equalsIgnoreCase(rs.getString(9)) && loginid.equalsIgnoreCase(rs.getString(1)) && pwd.equals(rs.getString(10))){
                        c++;
                        break;
                    }
                }
                if(c > 0){
                    if(loginid.equals("AD789")){
//                        out.println("<br>Successfully Logged into ADMIN...........");
                        response.sendRedirect("AdminLogin.jsp");
                    }
                    else{
//                        out.println("<br>Successfully Logged into Customer ...........");
                        response.sendRedirect("CustomerLogin.jsp");
                    }
                }
                else{
                    out.println("<br>Oops ..............,Login Operation Failed !!!!!!!!!!!");
                }
            }
            catch(Exception e){
                out.println("<br>Cannot fetch data !!!!!");
            }
        %>
    </body>
</html>