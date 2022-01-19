<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Upload Image</title>
    </head>
    
    <body>
    
        <b>Upload | <a href="View.jsp">View</a></b><br/><br/>
        
        <form action="uploadImage" method="post" enctype="multipart/form-data">
            <input type="file" name="image" required="required"/><br/><br/>
            <input type="submit"/>
        </form>
    </body>
</html>