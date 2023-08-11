<!DOCTYPE html>
<html>
<head>
    <title>Change Password</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 20px;
            background-color: skyblue;
        }

        h2, h3 {
            text-align: center;
            color: #333;
        }

        form {
            width: 300px;
            margin: 0 auto;
        }

        label {
            display: block;
            font-weight: bold;
            margin-bottom: 8px;
        }

        input[type="password"] {
            width: 100%;
            padding: 8px;
            font-size: 16px;
            border: 1px solid #ccc;
            border-radius: 5px;
            margin-bottom: 15px;
        }

        input[type="submit"] {
            width: 100%;
            padding: 10px;
            font-size: 16px;
            border: none;
            border-radius: 5px;
            background-color: #4CAF50;
            color: white;
            cursor: pointer;
        }

        input[type="submit"]:hover {
            background-color: #45a049;
        }

        b {
            color: #0066cc;
        }
    </style>
</head>
<body>
<b>Welcome dear <%=session.getAttribute("login_id")%></b>
<h2>Change Your Password here...........</h2>
<h3>Enter the following details here..........</h3>
<form action="ChangePasswordDBMS.jsp" method="post">
    <label for="oldpwd">Your Current Password:</label>
    <input type="password" name="oldpwd" required><br>

    <label for="newpwd">Type New Password:</label>
    <input type="password" name="newpwd" required><br>

    <label for="cnewpwd">Re-Type New Password:</label>
    <input type="password" name="cnewpwd" required><br>

    <input type="submit" name="b1" value="Update">
</form>
</body>
</html>
