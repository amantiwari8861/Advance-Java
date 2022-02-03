<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<h1 style="color:Red;">Error Occured! <%Integer id=(Integer)request.getAttribute("id");
		out.print(id);%>
		 <%= request.getAttribute("name1") %> </h1>
	<h2>hii : <%=request.getParameter("institute")%> </h2>

<h1>Welcome ${name1} in ${param.institute} </h1>
<h1>regards ${institute}</h1>

${name1}
getParameter() returns http request parameters. Those passed from the client to the server. For example http://example.com/servlet?parameter=1. Can only return String
getAttribute() is for server-side usage only - you fill the request with attributes that you can use within the same request. For example - you set an attribute in a servlet, and read it from a JSP. Can be used for any object, not just string.
</body>
</html>