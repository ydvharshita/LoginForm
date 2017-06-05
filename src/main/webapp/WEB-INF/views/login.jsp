<html>
   <head>
        <title>** LOGIN PAGE **</title>
    </head>
    <body>
        <form method="post" action="/login">
            <center>
            <table border="1" width="30%" cellpadding="3">
                <thead>
                    <tr>
                        <th colspan="2" style = "color:red">Login Here</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td style = "color:blue">User Id : </td>
                        <td><input type="text" name="userid" /></td>
                    </tr>
                    <tr>
                        <td style = "color:blue">Password : </td>
                        <td><input type="password" name="pwd" /></td>
                    </tr>
                    
                    <tr>
                        <td style = "color:blue">First-Name : </td>
                        <td><input type="text" name="str_fname" /></td>
                    </tr>
                    
                    <tr>
                        <td style = "color:blue">Last-Name : </td>
                        <td><input type="text" name="str_lname" /></td>
                    </tr>
                    
                    <tr>
                        <td style = "color:blue">Country : </td>
                        <td>
                        <select name="cntry">
                        	<option value="1">INDIA</option>
                        	<option value="2">CHINA</option>
                        	<option value="3">JAPAN</option>
                        	<option value="4">RUSSIA</option>
						</select>
							                        
                        </td>
                    </tr>
                    
                    <tr>
                        <td style = "color:blue">Gender : </td>
                        <td><input type="radio" name="gender" value="male" >MALE<br>
                        	<input type="radio" name="gender" value="female">FEMALE
                        </td>
                    </tr>
                    
                    <tr>
                        <td style = "color:blue">Education : </td>
                        <td><input type="checkbox" name="edu" value="Graduate">GRADUATE<br>
                        	<input type="checkbox" name="edu" value="Post-Graduate">POST-GRADUATE
                        </td>
                    </tr>
                    
                  
                    <tr>
                        <td><input type="submit" value="SUBMIT" style = "color:red" /></td>
                    </tr>
                    </tbody>
            </table>
            </center>
        </form>
    </body>
</html>