<!DOCTYPE html>
<html>
<head>
    <title>Home Global Bank</title>
    <style>
        .mynav{
            margin-right:5;
            padding-right: 10px;
        }
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f7f7f7;
        }

        header {
            background-color: #004e98;
            color: #fff;
            text-align: center;
            padding: 20px;
        }

        h1 {
            margin: 0;
        }

        .container {
            max-width: 1200px;
            margin: 0 auto;
            padding: 20px;
        }

        .cta-container {
            text-align: center;
            margin-top: 50px;
        }

        .cta-button {
            background-color: #004e98;
            color: #fff;
            font-size: 18px;
            padding: 10px 30px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            text-decoration: none;
        }

        .cta-button:hover {
            background-color: #003e78;
        }

        .feature {
            display: flex;
            justify-content: space-between;
            margin-top: 30px;
        }

        .feature-icon {
            font-size: 30px;
            color: #004e98;
        }

        .feature-text {
            flex: 1;
            margin-left: 15px;
        }

        footer {
            background-color: #004e98;
            color: #fff;
            text-align: center;
            padding: 10px;
        }

        a {
            color: #004e98;
            text-decoration: none;
        }

        a:hover {
            text-decoration: underline;
        }
        ul {
  list-style-type: none;
  margin: 0;
  padding: 0;
  overflow: hidden;
}

li {
  float: left;
  
}

li a {
  display: block;
  padding: 8px;
  background-color: #dddddd;
  margin-right:5;
}
    </style>
</head>
<body>
    <header>
        <h1 style="display: block;">Welcome to the Global Bank</h1>
        <nav >
            <div class="mynav">
                <ul>
                    <li><a href="Home.jsp">Home</a></li>
                    <li><a>Contact</a></li>
                    <li><a>About Us</a></li>
                    <li><a>News</a></li>
                </ul>
            </div>
        </nav>
    </header>
    <div class="container">
        <div class="cta-container">
            <a href="Login.jsp" class="cta-button">Login</a>
            <a href="NewAccount.jsp" class="cta-button">Register</a>
        </div>
        <div class="feature">
            <div class="feature-icon">&#128197;</div>
            <div class="feature-text">
                <h2>Safe and Secure Banking</h2>
                <p>At Global Bank, we prioritize the security of your financial transactions.</p>
            </div>
        </div>
        <div class="feature">
            <div class="feature-icon">&#128179;</div>
            <div class="feature-text">
                <h2>Easy Online Banking</h2>
                <p>Access your accounts, make payments, and manage your finances online with ease.</p>
            </div>
        </div>
        <div class="feature">
            <div class="feature-icon">&#127970;</div>
            <div class="feature-text">
                <h2>24/7 Customer Support</h2>
                <p>Our dedicated support team is available around the clock to assist you with any inquiries.</p>
            </div>
        </div>
    </div>
    <footer>
        &copy; 2023 Global Bank. All rights reserved.
    </footer>
</body>
</html>
