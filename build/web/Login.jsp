<!DOCTYPE html>
<html>
<head>
    <title>Login Page</title>
    <style>
    h1 {
    border: 5px solid #333;
    border-radius: 15px;
    padding: 8px;
    background-color: turquoise;
    width: 375px;
    margin: auto;
    }
        #fpwd{
            border: 3px solid #333;
            border-radius: 10px;
            padding: 10px;
            background-color: violet;
        }
        body {
            background-color: burlywood;
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
        select, input[type="text"], input[type="password"] {
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
    <h1 align="center">Welcome to Login Page</h1>
    <form action="Check.jsp" method="post">
        <table border="0" align="center">
            <tr>
                <td>Select Role</td>
                <td>
                    <select name="role">
                        <option value="select">Select</option>
                        <option value="admin">ADMIN</option>
                        <option value="customer">CUSTOMER</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td>Login ID</td>
                <td><input type="text" name="loginid"></td>
            </tr>
            <tr>
                <td>Password</td>
                <td><input type="password" name="loginpwd"></td>
            </tr>
            <tr>
                <td><input type="submit" name="b1" value="Login"></td>
                <td><input type="reset" name="b2" value="Reset"></td>
            </tr>
            <tr>
                <td></td>
                <td><a href="ForgetPassword.jsp" id="fpwd">Forget Password</a></td>
            </tr>
        </table>
    </form>
    <div>
        <a href="https://www.google.com/search?client=firefox-b-d&q=bank+of+india&ved=2ahUKEwiHjsPIkayAAxU4TWwGHTs6CvkQ2IkIegQIDhAB&dlnr=1#">Global Bank</a>
    </div>
</body>
</html>
