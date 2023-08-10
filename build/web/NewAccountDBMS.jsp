<%@include file="DBCON.jsp" %>
<html>
    <body>
        <%
            try{
                String AccountNo = request.getParameter("accno");
                String Name = request.getParameter("cname");
                String Cfname = request.getParameter("fname");
                String DOB = request.getParameter("dob");
                String Gd = request.getParameter("gender");
                String AccDate = request.getParameter("opdate");
                String Add = request.getParameter("address");
                String ContactNo = request.getParameter("cno");
                
                String Role = request.getParameter("role");
                String passwd = request.getParameter("password");
                String sq = request.getParameter("SecQ");
                String sa = request.getParameter("SecA");
                
                String acIQ = "insert into account values(?,?,?,?,?,?,?,?,?,?,?,?);";
                PreparedStatement ps = con.prepareStatement(acIQ);
                ps.setString(1, AccountNo);
                ps.setString(2, Name);
                ps.setString(3, Cfname);
                ps.setString(4, DOB);
                ps.setString(5, Gd);
                ps.setString(6, AccDate);
                ps.setString(7, Add);
                ps.setInt(8, Integer.parseInt(ContactNo));
                
                ps.setString(9,Role);
                ps.setString(10,passwd);
                ps.setString(11,sq);
                ps.setString(12,sa);
                
                ps.executeUpdate();
                out.println("<br> Account Created Successfully !!!!!!");
                
                String cTable = "create table "+AccountNo+"(accNum varchar(20), ref varchar(20), Transaction varchar(20), tid varchar(20), DepAmt int, WdAmt int, AVLBalance int);";
                PreparedStatement ps2 = con.prepareStatement(cTable);
                
                ps2.executeUpdate();
                out.println("<br> Customer transaction table created also.......");
            }
            catch(Exception e){
                out.println("Cannot insert here .........., Account not exists!!!!");
            }
        %>
    </body>
</html>