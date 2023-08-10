<%@include file="DBCON.jsp" %>
<html>
    <body>
        <% 
                try{
                    String CusPfQ = "select * from account where accountno='"+session.getAttribute("login_id")+"'";
                    Statement st = con.createStatement();
                    ResultSet rs = st.executeQuery(CusPfQ);
                    
                    while(rs.next()){
                            out.println("<br> "+rs.getString(1));
                            out.println(" "+rs.getString(2));
                            out.println(" "+rs.getString(3));
                            out.println(" "+rs.getString(4));
                            out.println(" "+rs.getString(5));
                            out.println(" "+rs.getString(6));
                            out.println(" "+rs.getInt(8));
                            out.println(" "+rs.getString(9));
                            out.println(" "+rs.getString(10));
                            out.println(" "+rs.getString(11));
                            out.println(" "+rs.getString(12));
                    }
                }catch(Exception e){
                    out.println("An exception ocurred "+e);
                }
           %>
    </body>
</html>