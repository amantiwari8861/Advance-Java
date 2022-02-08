<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "fn" uri = "http://java.sun.com/jsp/jstl/functions" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<c:set var = "string1" value = "This is first string"/>
<c:if test = "${fn:contains(string1, 'first')}">
    <p>Found 'first' in string<p>
</c:if>
<c:if test = "${fn:containsIgnoreCase(string1, 'first')}">
    <p>Found 'first' string<p>
</c:if>
<c:if test = "${fn:containsIgnoreCase(string1, 'FIRST')}">
    <p>Found 'FIRST' string<p>
</c:if>
<c:if test = "${fn:endsWith(string1, 'string')}">
    <p>String ends with 'string'<p>
</c:if>
<c:set var = "string3" value = "${fn:split(string1, ' ')}" />
<c:set var = "string4" value = "${fn:join(string3, '-')}" />

<c:forEach var="s" items="${string3}" varStatus="index">
<c:out value="${s}"/>
</br>
</c:forEach>


<c:out value="${string4}"/>


<c:set var="now" value="<%= new java.util.Date()%>"/>
<fmt:formatDate type="time" value="${now}"/>

<c:set var="today" value="22-04-1999"/>
<fmt:parseDate value="${today}" var="parsedDate" pattern="dd-MM-yyyy"/>
<c:out value="${parsedDate}"/>

<c:set var="fee" value="555.67"/>
<fmt:formatNumber value="${fee}" type="currency"/>

</body>
</html>