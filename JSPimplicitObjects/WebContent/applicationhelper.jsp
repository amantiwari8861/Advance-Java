<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Admin details in another page : <%= application.getAttribute("Admin") %></h1>

<h2> the database used in the application is <%= application.getInitParameter("Database") %></h2>


<% 

application.removeAttribute("Admin");
out.print("Admin details :"+application.getAttribute("Admin")+"</br>");
out.print(
		application.getServerInfo()
		); %>

</body>
</html>