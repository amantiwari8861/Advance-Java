<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<% request.setAttribute("naam", "kamal"); %>
<%=request.getAttribute("naam")%>
	<h1>Welcome in Our Website </h1>
	<!-- in jsp there are 9 implicit objects -->
	<%
	System.out.print("java code ran");
	out.print("hello java");
	//Out.print("hello"); //error
	%>
	
	<form action="NewFile.jsp" method="post">
<!-- 	<form action="NewFile.jsp" method="get"> -->
	Name : <input type="text" name="fname"> 
	Id : <input type="text" name="id">
	<input type="submit">
	
	</form>
	
	
	

</body>
</html>