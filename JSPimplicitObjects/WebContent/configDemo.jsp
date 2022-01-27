<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>the Driver used in Servlet  :
	<%		out.print(config.getServletName());	%>
	and init Parameter is <%	out.print(config.getInitParameter("DriverName"));
	out.print(config.getInitParameter("Username"));
	//h.w use getInitParameterNames();	%>
	
	</h1>
</body>
</html>