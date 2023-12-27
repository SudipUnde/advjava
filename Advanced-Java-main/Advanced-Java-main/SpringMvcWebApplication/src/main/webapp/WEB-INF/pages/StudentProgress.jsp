<%@page import="day10.model.StudentProgress"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<body>
		<%
			Object msg = request.getAttribute("message");
			Object progressObject = session.getAttribute("progressReport");
			StudentProgress progress = (StudentProgress)progressObject;
		%>
		<h2><%=msg %>, Here is your progress !!</h2>
		<h2>Your Name: <%= progress.getName()%></h2>
		<h2>Your Total Marks: <%= progress.getTotalMarks()%></h2>
	</body>
</html>