<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		pageContext.setAttribute("name", "Aman Tiwari");
	%>
	<a href="check.jsp">check</a>
	<h1> the name is <%= pageContext.getAttribute("name") %></h1>
	
	
	
	
</body>
</html>