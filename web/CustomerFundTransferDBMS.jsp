<%@include file="DBCON.jsp" %>
<html>
    <body>
        Welcome dear <%=session.getAttribute("login_id")%><br>
        <%
            try{
                int prevBal = 0;
                String lastQ = "select * from "+session.getAttribute("login_id");
                Statement s1 = con.createStatement();
                ResultSet r2 = s1.executeQuery(lastQ);
                
                while(r2.next()){
                    prevBal = r2.getInt(7);
                }
//                out.println(prevBal);
                String anum = request.getParameter("accno");
                String rn = request.getParameter("refname");
                String Dtt = request.getParameter("dot");
                String Tid = request.getParameter("tid");
                int Damt = Integer.parseInt(request.getParameter("depamt"));
                
                String DpQ = "insert into "+session.getAttribute("login_id")+" values(?,?,?,?,?,?,?);";
                PreparedStatement ps = con.prepareStatement(DpQ);
                
                ps.setString(1,rn );
                ps.setString(2,anum );
                ps.setString(3,Dtt );
                ps.setString(4,Tid );
                ps.setInt(5, 0);
                ps.setInt(6,Damt);
                ps.setInt(7, (prevBal-Damt));
                
                ps.executeUpdate();
                out.println("<br>Fund Transfered from "+session.getAttribute("login_id")+" Successfully <br>");
                
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
        %>
    </body>
</html>