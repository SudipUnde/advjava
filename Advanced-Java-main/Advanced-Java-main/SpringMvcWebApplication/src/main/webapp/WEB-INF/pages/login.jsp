<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body bgcolor="yellow">
	<h2>Login Page</h2>
		<form action="doValidate" method="post">
			<pre>
				Username: <input type="text" name="uid"/>
				
				Password: <input type="password" name="pwd"/>
				
				<input type="submit" value="Sign In"/>
			</pre>
		</form>
</body>
</html>