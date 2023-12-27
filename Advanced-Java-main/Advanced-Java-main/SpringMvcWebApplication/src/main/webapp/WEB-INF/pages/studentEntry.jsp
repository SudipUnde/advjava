<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body bgcolor="yellow">
	<h2>Enter Student Information:</h2>
		<form action="acceptStudent" method="post">
			<pre>
				Name: <input type="text" name="studentName"/>
				
				Physics: <input type="text" name="phy"/>
				
				Chemistry: <input type="text" name="chem"/>
				
				Maths: <input type="text" name="maths"/>
				
				<input type="submit" value="Submit"/>
			</pre>
		</form>
</body>
</html>
