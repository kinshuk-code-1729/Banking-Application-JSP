<%@include file="DBCON.jsp" %>
<html>
    <body>
        <br>
        Welcome dear 
        <%
        String loginid = request.getParameter("loginid");
        String sq = request.getParameter("secq");
        String sa = request.getParameter("seca");
        
        out.println(loginid);
        out.println(sq);
        out.println(sa);
        
//        try{
//            String pwdChQ = "select * from account where accountno='"+session.getAttribute("login_id")+"'";
//            Statement st = con.createStatement();
//            ResultSet rs = st.executeQuery(pwdChQ);
//            
//            int c=0;
//            while(rs.next()){
////                out.println(rs.getString(10));
//                if(opwd.equals(rs.getString(10))){
//                    c++;
//                    break;
//                }
//            }
//            if(c > 0){
//                out.println("<br> Old passwords matched !!!!!!!!!! <br>");
//                if(npwd.equals(cnpwd)){
//                    out.println("New Passwords matched Successfully ..........<br>");
//                    String UdpwdQ = "update account set pwd='"+npwd+"'where accountno='"+session.getAttribute("login_id")+"'";
//                    PreparedStatement ps = con.prepareStatement(UdpwdQ);
//                    ps.executeUpdate();
//                    out.println("Password updated.........");
//                    out.println("<br><a href=Login.jsp> Now Login Again </a>");
//                }
//                else{
//                    out.println("New Passwords not matched ..........<br>");
//                }
//            }
//            else{
//                out.println("<br> Old passwords doesn't match !!!!!!!!!!");
//            }
//            out.println("");
//        }
//        catch(Exception e){
//            out.println("<br>Password not updated ..................<br>"+e);
//        }
        %>
    </body>
</html>