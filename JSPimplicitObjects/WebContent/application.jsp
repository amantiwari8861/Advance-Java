<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>Application object demo </h1>
	<%
		application.setAttribute("Admin","Aman is Admin");
	%>
	<h1>Admin details : <%= application.getAttribute("Admin") %></h1>
	
		<a href="applicationhelper.jsp">go on application helper</a>
	
	
</body>
</html>