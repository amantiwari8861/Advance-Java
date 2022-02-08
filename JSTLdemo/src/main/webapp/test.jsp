<%@page import="java.util.Arrays"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%-- 	<c:forEach var="i" items="1,4,5,6,7,8,9"> --%>
<%--     Item <c:out value="No. ${i}" /> --%>
<!--     	<br> -->
<%-- 	</c:forEach> 
	

	<%
// 		String[] windows = new String[]{"Windows XP", "Windows 7", "Windows 8", "Windows mobile"};
//         pageContext.setAttribute("windows", windows);
    %>   
	<c:forEach var="window" items="${pageScope.windows}">
		<c:out value="${window}" />
	</c:forEach>

	
	<% 
		Integer[] arr={10,20,30}; 
// 		ArrayList<Integer> al=new ArrayList<Integer>(Arrays.asList(arr));
		session.setAttribute("al", arr);
	%>
	<br>
	<c:forEach var="array2" items='<%=session.getAttribute("al")%>'>
		<c:out value="element ${array2}" />
		<br>
	</c:forEach>
		--%>
	<h1>this is used to format the url like urlrewriting</h1>
	<br>
	<c:url value = "/test" var = "myURL">
    <c:param name = "parameter_1" value = "1234"/>
    <c:param name = "parameter_2" value = "abcd"/>
</c:url>
<c:out value="${myURL}"/>
 <c:redirect url="/index.jsp"/>
 
</body>
</html>