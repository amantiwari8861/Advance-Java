<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1> The name of user is 
	<%  String name=request.getParameter("fname");
	    out.print("<mark>"+name+"</mark>");	
	    
	    request.setAttribute("clg","Mega");
	    %>
	</h1>
	<h1>the id was <% response.getWriter().append(request.getParameter("id")); %></h1>
<%-- 	<h1>the id is <% response.setContentType("text/html"); response.getWriter().append(request.getParameter("id")); %></h1> --%>
	
	<h1> the clg is <% out.print(request.getAttribute("clg")); %></h1>
	<h1> the clg is ${clg}  <%=request.getAttribute("clg")%> hi</h1>
<%-- 	<h1> the name is ${naam} <%=request.getAttribute("naam")%> hi</h1>  naam is null--%>
	
	
</body>
</html>