<%@include file="DBCON.jsp" %>
<html>
    <body>
        <br>
        <%
        String un = request.getParameter("uname");
        String npwd = request.getParameter("newpwd");
        
        try{
            String pwdChQ = "select * from account where accountno='"+un+"'";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(pwdChQ);
//            while(rs.next()){
//                out.println(rs.getString(1));
//            }
            String UdpwdQ = "update account set pwd='"+npwd+"'where accountno='"+un+"'";
            PreparedStatement ps = con.prepareStatement(UdpwdQ);
                    ps.executeUpdate();
                    out.println("Password updated.........");
                    out.println("");
        }
        catch(Exception e){
            out.println("<br>Password not updated ..................<br>"+e);
        }
        %>
    </body>
</html>