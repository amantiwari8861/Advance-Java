<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
hiiiii
	<%
		int num[]={10,20,30};
// 		out.print(num[3]);   //AOB exception

// 	try
// 	{
// 		out.print(num[3]);	
// 	}catch(ArrayIndexOutOfBoundsException ae)
// 	{
// 		out.print("exception occured");
// // 		ae.printStackTrace();  shows on console 
// 		out.print(ae.toString());
// 	}
out.print(num[3]);
	%>
		<%=exception%>
		
		h2 hello
		
</body>
</html>