<%@page import="java.util.Date,java.io.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%-- 	<% request.setAttribute("naam", "kamal"); %> --%>
<%-- 	<%=request.getAttribute("naam")%> --%>
<!-- 	<h1>Welcome in Our Website </h1> -->
	<!-- in jsp there are 9 implicit objects -->
	<%
	// import java.time.LocalDate; we can't do this 
// 	System.out.print("java code ran");
// 	out.print("hello java at  :");
	//Out.print("hello"); //error
// 	Date ld=new Date();
// 	out.print(ld);
	%>
	
	<form action="ExceptionDemo.jsp" method="post">
	<!--<form action="NewFile.jsp" method="get">-->
	Name : <input type="text" name="fname"> 
	Id : <input type="text" name="id">
	num1 : <input type="text" name="num1"> 
	num2 : <input type="text" name="num2">
	<input type="submit">
	</form>

</body>
</html>