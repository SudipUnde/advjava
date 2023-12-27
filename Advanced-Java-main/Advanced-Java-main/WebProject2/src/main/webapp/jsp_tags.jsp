<%@ page language="java" contentType="text/html; charset=ISO-8859-1" import = "java.time.LocalDate , java.time.LocalTime"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Demonstrating JSP Tags</h1>
		<%-- 	Including the resource: greeting.html	 --%>
		<%@include file = "greeting.html" %>
		<%-- Adding some declarations --%>
		<%!
			int number = 5;
			public String sayWelcome(String name){
				return "Welcome " + name;
			}
		%>
		<%-- Printing HELLO 5 times using <h2> Headining --%>
		<%
			for(int a = 1; a <= 5; a++){
		%>
				<h2>HELLO</h2>
		<%
			}
			LocalDate sysDate = LocalDate.now();
			LocalTime sysTime = LocalTime.now();
		%>
		<h2>number is <%=number %></h2>
		<h2>square is <%=number %> is <%=(number * number) %></h2>
		
		<h2>Reply from method is <%=sayWelcome("Micky") %></h2>
		<h2>Current Date: <%=sysDate %></h2>
		<h2>Current Time: <%=sysTime %></h2>
</body>
</html>