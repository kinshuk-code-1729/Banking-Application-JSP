<html>
    <body>
        <h2 align="center">Forget Password Page</h2>
        
 <h3>Reset your password here..........</h3>
 <form action="ForgetPasswordDBMS.jsp" method="post">
    <label for="loginid">Login ID:</label>
    <input type="text" name="loginid" required><br><br>

    <label for="secq">Security Question:</label>
    
    <select name="secq" required>
                    <option value="bplace">Birth Place</option>
                    <option value="FSchool">First School</option>
                    <option value="bff">Best Friend</option>
                </select>
    <br><br>
    <label for="seca">Security Answer:</label>
    <input type="text" name="seca" required><br><br>
    
    <input type="submit" name="b1" value="Validate">
</form>
    </body>
</html>