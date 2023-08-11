<%@include file="DBCON.jsp" %>

<html>
    <body>
        Customer DBMS
        Welcome <%=session.getAttribute("login_id")%>
                
        <%
            try{
                String CusStV = "select * from "+session.getAttribute("login_id");
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(CusStV);
                
                while(rs.next()){
                    out.println(" <br>");
                    out.println(" "+rs.getString(1));
                    out.println(" "+rs.getString(2));
                    out.println(" "+rs.getString(3));
                    out.println(" "+rs.getString(4));
                    out.println(" "+rs.getInt(5));
                    out.println(" "+rs.getInt(6));
                    out.println(" "+rs.getInt(7));
                }
            }
            catch(Exception e){
                out.println("Some error occured ....<br>"+e);
            }
        %>
    </body>
</html>