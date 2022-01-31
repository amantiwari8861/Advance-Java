<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  errorPage="errorPage.jsp" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
	int num1=Integer.parseInt(request.getParameter("num1"));//if num1=aman then NumberFormat Exception
	int num2=Integer.parseInt(request.getParameter("num2"));
	int c=num1/num2; //10/0 -> infinity (Arithematic Exception)
	out.print("the result is "+c);
	%>


</body>
</html>