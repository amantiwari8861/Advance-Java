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
		out.print(pageContext.getAttribute("name"));
	%> <span style="color:red">   Hence Proved!</span>
	
	
	<h1>the institute is in session = <%=session.getAttribute("institute") %></h1>
	
	<%
		session.invalidate();
	
	%>
	<h1>after Session Destroyed institute = <%
	
	try{
	session.getAttribute("institute");
	}
	catch(Exception e)
	{
		out.print("session already Deleted");
	}%></h1>
	
</body>
</html>