<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
    <title>New Account Registration</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #34ebe5;
            margin: 20px;
        }

        h1 {
            text-align: center;
            color: #333;
        }

        form {
            width: 400px;
            margin: 0 auto;
        }

        table {
            border: 5px solid #333;
            margin: 50px auto;
            padding: 20px;
            background-color: #f9f9f9;
            border-radius: 10px;
            /*border-collapse: collapse;*/
            width: 150%;
        }

        td {
            padding: 10px;
        }

        input[type="text"],
        input[type="date"],
        input[type="password"],
        input[type="submit"],
        input[type="reset"],
        select {
            width: 100%;
            padding: 8px;
            font-size: 16px;
            border: 1px solid #ccc;
            border-radius: 5px;
            margin-bottom: 15px;
        }

        input[type="radio"] {
            margin-right: 5px;
        }

        input[type="submit"],
        input[type="reset"] {
            border: none;
            border-radius: 5px;
            background-color: #4CAF50;
            color: white;
            cursor: pointer;
        }

        input[type="submit"]:hover,
        input[type="reset"]:hover {
            background-color: #45a049;
        }

        select {
            height: 38px;
        }

        td:first-child {
            font-weight: bold;
        }
    </style>
</head>
<body>
<h1>New Account Registration</h1>
<form action="NewAccountDBMS.jsp" method="post">
    <table>
        <tr>
            <td>Account Number</td>
            <td><input type="text" name="accno"></td>
        </tr>
        <tr>
            <td>Customer Name</td>
            <td><input type="text" name="cname"></td>
        </tr>
        <tr>
            <td>Father Name</td>
            <td><input type="text" name="fname"></td>
        </tr>
        <tr>
            <td>DOB</td>
            <td><input type="date" name="dob"></td>
        </tr>
        <tr>
            <td>Gender</td>
            <td>
                Male <input type="radio" name="gender" value="Male">
                Female <input type="radio" name="gender" value="Female">
            </td>
        </tr>
        <tr>
            <td>Account Opening Date</td>
            <td><input type="date" name="opdate"></td>
        </tr>
        <tr>
            <td>Address</td>
            <td><input type="text" name="address"></td>
        </tr>
        <tr>
            <td>Contact Number</td>
            <td><input type="text" name="cno"></td>
        </tr>
        <tr>
            <td>Select Your Role</td>
            <td>
                <select name="role">
                    <option value="Admin">ADMIN</option>
                    <option value="Customer">CUSTOMER</option>
                </select>
            </td>
        </tr>
        <tr>
            <td>Password</td>
            <td><input type="password" name="password"></td>
        </tr>
        <tr>
            <td>Security Question</td>
            <td>
                <select name="SecQ">
                    <option value="bplace">Birth Place</option>
                    <option value="FSchool">First School</option>
                    <option value="bff">Best Friend</option>
                </select>
            </td>
        </tr>
        <tr>
            <td>Security Answer</td>
            <td><input type="text" name="SecA"></td>
        </tr>
        <tr>
            <td><input type="submit" name="b1" value="Save"></td>
            <td><input type="reset" name="b2" value="RESET"></td>
        </tr>
    </table>
</form>
</body>
</html>
