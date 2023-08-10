<%@include file="DBCON.jsp" %>
<html>
<head>
    <title>Admin Login Page</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f0f0f0;
            text-align: center;
            margin: 50px;
        }
        h1 {
            color: #333;
        }
        h2 {
            color: #666;
        }
        h3 {
            color: #333;
            margin-top: 30px;
        }
        h4 {
            color: #999;
        }
        table {
            border-collapse: collapse;
            margin: 20px auto;
        }
        th, td {
            padding: 10px;
            border: 1px solid #ccc;
        }
        a {
            display: block;
            padding: 10px;
            margin-bottom: 5px;
            background-color: #007bff;
            color: #fff;
            text-decoration: none;
            border-radius: 5px;
            width: 150px;
            margin: 5px auto;
        }
        a:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
    <h1>Hello <%=session.getAttribute("login_id")%></h1>
    <h2>Welcome to the admin login page..........</h2>
    <h4>Last Login at <%=session.getAttribute("login_time") %></h4>

    <table>
        <thead>
            <tr>
                <th>Account Holder Name</th>
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
                        <td><%= rs.getString(2) %></td>
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

    <h3>
        <a href="NewAccount.jsp">New Account</a>
        <a href="ViewCustomer.jsp">View Customer</a>
        <a href="DeleteCustomer.jsp">Delete Customer</a>
        <a href="UpdateCustomer.jsp">Update Customer</a>
        <a href="ViewStatement.jsp">View Statement</a>
        <a href="UpdateStatement.jsp">Update Statement</a>
        <a href="CancelStatement.jsp">Cancel Statement</a>
        <a href="FundTransfer.jsp">Fund Transfer</a>
        <a href="CashWithdraw.jsp">Cash Withdraw</a>
        <a href="CashDeposit.jsp">Cash Deposit</a>
        <a href="AdminChangePassword.jsp">Admin Change Password</a>
        <a href="ChangePassword.jsp">Change Password</a>
        <a href="Logout.jsp">Logout</a>
    </h3>
</body>
</html>
