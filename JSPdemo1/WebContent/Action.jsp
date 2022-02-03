<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="stu" class="com.pack1.Student" />
<%-- <jsp:useBean id="stu2" class="com.pack1.Student2" /> --%>
<jsp:setProperty property="sid" name="stu"  value="101"/>
<h1>The Student name is <jsp:getProperty property="sid" name="stu"/></h1>
<jsp:include page="index.jsp"/>
<jsp:include page="Hello.html"/>
<% request.setAttribute("name1", "Aman");
	request.setAttribute("id",10);
%>
<%-- <jsp:forward page="error.jsp"/> --%>

<%-- <jsp:forward page="error.jsp"> --%>
<%-- <jsp:param value="NIIT" name="institute"/> --%>
<%-- </jsp:forward> --%>
<%
	//response.sendRedirect("error.jsp"); //sending new Request
%>
</body>
</html>