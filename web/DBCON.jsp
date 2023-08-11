<%@page import="java.sql.*"%>
<html>
    <body>
        <%!Connection con=null;%>
        <%
            try {
            Class.forName("com.mysql.jdbc.Driver");
            String connectionURL = "jdbc:mysql://localhost:3306/GlobalBankingDB";
            
            String dbuser="root";
            String dbpass="root";
            con = DriverManager.getConnection(connectionURL,dbuser, dbpass);

            out.println("Successfully Connected .....");
            }
            catch (Exception e) {
            out.println("Connection failed ....." + e);
            }
        %>
    </body>
</html>