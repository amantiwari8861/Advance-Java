<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<c:out value="Hello"/>  
<c:import var="data" url="abc.txt"/>  
<c:out value="${data}"/>  	

<c:set  var="admin" value="sujata" scope="session" />
<c:out value="${admin}"/>
<c:set var="num" value="50" scope="request"/>

<c:if test="${num>30}" var="check1">
<p>greater than 50</p>
</c:if>

<c:remove var="admin"/>  
<c:out value="${admin}"/>


<c:catch var ="catchtheAriException">  
   <% int num = 5/0;%>  
</c:catch>  
  
<c:if test = "${catchtheAriException != null}">  
   <p>The type of exception is : ${catchtheAriException} <br />  
   here is the message of exception: ${catchtheAriException.message}</p>  
</c:if>
  
<c:set var="age" value="10"/>
<c:choose>
<c:when test="${age>18}">
<p>ready to vote!</p>
</c:when>
<c:when test="${age>14}">
<p>teenagers not allowed</p>
</c:when>
<c:otherwise>
<p>not ready to vote!</p>
</c:otherwise>
</c:choose>

<%-- <c:forEach var="j" begin="1" end="3">   --%>
<%--    Item <c:out value="${j}"/><p>   --%>
<%-- </c:forEach> --%>


</body>
</html>