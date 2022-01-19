<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <title>View Image</title>
    </head>
    
    <body>
    
        <b>View | <a href="index.jsp">Upload</a></b><br/><br/>
        
<%
String id = request.getParameter("id");
%>
<img src="getImage.jsp?id=<%=id%>" width="400px"/>
 
    </body>
</html>