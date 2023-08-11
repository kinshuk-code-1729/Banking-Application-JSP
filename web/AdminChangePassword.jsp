<!DOCTYPE html>
<html>
<head>
    <title>Change Password</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 20px;
            background-color: turquoise;
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

        input[type="password"],
        input[type="text"]
        {
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
<h2>Change the Password of a user here...........</h2>
<h3>Enter the following details here..........</h3>
<form action="AdminChangePasswordDBMS.jsp" method="post">
    <label for="username">Name of the user :</label>
    <input type="text" name="uname" required><br>

    <label for="newpwd">New Password:</label>
    <input type="password" name="newpwd" required><br>

    <input type="submit" name="b1" value="Update">
</form>
</body>
</html>
