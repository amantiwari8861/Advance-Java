<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!Doctype html>
<html>
    <head>
        <title>View Image</title>
    </head>
    
    <body>
    
        <b>View | <a href="index.jsp">Upload</a></b><br/><br/>
        
        <form action="ShowImage.jsp" method="post">
            <input type="text" name="id" required="required" placeholder="enter image id.."/><br/><br/>
            <input type="submit"/>
        </form>
    </body>
</html>