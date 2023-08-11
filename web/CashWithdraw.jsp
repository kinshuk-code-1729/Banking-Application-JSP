<%@page import="java.util.Random"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@include file="DBCON.jsp"%>
<!DOCTYPE html>
<html>
<head>
    <title>Transaction for Customer</title>
    <style>
        .holder{
            padding: 10px;
            border: 1px solid #ccc;        
        }
        body {
            background-color: violet;
            font-family: Arial, sans-serif;
            text-align: center;
        }
        table {
            border: 5px solid #333;
            margin: 50px auto;
            padding: 20px;
            background-color: #f9f9f9;
            border-radius: 10px;
        }
        td {
            padding: 10px;
        }
        select, input[type="text"], input[type="password"],input[type="date"]{
            width: 200px;
            padding: 5px;
            border: 1px solid #ccc;
            border-radius: 5px;
            font-size: 16px;
        }
        input[type="submit"], input[type="reset"] {
            padding: 10px 20px;
            background-color: #333;
            color: #fff;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            font-size: 16px;
        }
        input[type="submit"]:hover, input[type="reset"]:hover {
            background-color: #555;
        }
        a {
            color: #333;
            text-decoration: none;
        }
        a:hover {
            color: #555;
        }
    </style>
</head>
<body>
<%! Random r2;%>
<%
    r2 = new Random();
%>
<h1 align="center">Transaction for customer</h1>
       <table style="border-collapse: collapse; margin: 20px auto;">
        <thead>
            <tr>
                <th class="holder">Account Holder Name</th>
            </tr>
        </thead>
        <tbody>
            <%
            try {
                String AccHNQ = "select * from account where accountno='"+session.getAttribute("login_id")+"'";
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(AccHNQ);

                while(rs.next()){
                    %>
                    <tr>
                        <td class="holder"><%= rs.getString(2) %></td>
                    </tr>
                    <%
                }
            }
            catch(Exception e){
                out.println("Some error occurred ....<br>"+e);
            }
            %>
        </tbody>
    </table>
<h2>Withdraw your amount here.........</h2>
<h3>
    <form action="CashWithdrawDBMS.jsp" method="post">
        <table>
            <tr>
                <td>Account Number</td>
                <td><input type="text" name="accno"></td>
            </tr>
            <tr>
                <td>Reference</td>
                <td><input type="text" name="refname"></td>
            </tr>
            <tr>
                <td>Date of Transaction</td>
                <td><input type="date" name="dot" value="<%= new SimpleDateFormat("yyyy-MM-dd").format(new Date()) %>"></td>
            </tr>
            <tr>
                <td>Transaction ID</td>
                <td><input type="text" name="tid" value="TRX<%=r2.nextInt()%>"></td>
            </tr>
            <tr>
                <td>Withdraw Amount</td>
                <td><input type="text" name="wdamt"></td>
            </tr>
            <tr>
                <td><input type="submit" name="b1" value="Withdraw"></td>
                <td><input type="reset" name="b2" value="Reset"></td>
            </tr>
        </table>
    </form>
</h3>
</body>
</html>
