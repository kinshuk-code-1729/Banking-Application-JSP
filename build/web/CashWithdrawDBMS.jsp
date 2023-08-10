<%@include file="DBCON.jsp" %>
<html>
    <body>
        <%
            try{
                int prevBal = 0;
                String lastQ = "select * from BankTransactions";
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
                int WdAmt = Integer.parseInt(request.getParameter("wdamt"));
                
                String WdQ = "insert into BankTransactions values(?,?,?,?,?,?,?);";
                PreparedStatement ps = con.prepareStatement(WdQ);
                
                ps.setString(1,anum );
                ps.setString(2,rn );
                ps.setString(3,Dtt );
                ps.setString(4,Tid );
                ps.setInt(5, 0);
                ps.setInt(6, WdAmt);
                ps.setInt(7, (prevBal-WdAmt));
                
                ps.executeUpdate();
                out.println("<br>Cash Amount Withdrawan Successfully from Bank Schema !!!!!!!!!!!");
                
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
                ps2.setInt(5, 0);
                ps2.setInt(6, WdAmt);
                ps2.setInt(7, (cusPrevBal - WdAmt));
                
                ps2.executeUpdate();
                out.println("<br>Cash Amount Withdrawan Successfully from  "+anum+" Table !!!!!!!!!!!");
                int num = WdAmt;
              String arr[] = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
              String[] tensArr = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
              String[] teensArr = {"", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
              String[] thousandsArr = {"", "Thousand", "Lakh", "Crore", "Arab", "Kharab", "Neel", "Padma", "Shankh"};

              String amountInWords = "";
              int thousandsIndex = 0;

              if (num == 0) {
                  amountInWords = arr[0] + " Rupees";  // Zero case
              } else {
                  while (num > 0) {
                      int part = num % 100;
                      if (part != 0) {
                          String partInWords = "";
                          if (part >= 10 && part <= 19) {
                              partInWords += teensArr[part - 10] + " ";
                              part = 0;
                          } else {
                              partInWords += tensArr[part / 10] + " ";
                              part %= 10;
                          }
                          if (part > 0) {
                              partInWords += arr[part] + " ";
                          }

                          amountInWords = partInWords + thousandsArr[thousandsIndex] + " " + amountInWords;
                      }

                      thousandsIndex++;
                      num /= 100;
                  }
              }

              // Print the amount in words
              out.println("<br>Amount in words: " + amountInWords.trim() + " Only");
            }
            catch(Exception e){
                out.println("<br>Oops !!!! Transaction Failed.................., Cash not withdrawn ");
            }
        %>
    </body>
</html>
