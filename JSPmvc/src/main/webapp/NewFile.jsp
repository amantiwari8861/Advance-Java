<%@page import="java.sql.ResultSetMetaData"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="com.pack.ConnectionProvider"%>
<%@page import="java.sql.DatabaseMetaData"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
//DatabaseMetaData databaseMetaData = ConnectionProvider.getConnection().getMetaData();
// ResultSet columns = databaseMetaData.getColumns(null,null, "userinfo", null);
// while(columns.next()) {
//     String columnName = columns.getString("COLUMN_NAME");
// }

ResultSetMetaData rsmd = rs.getMetaData();
//getting the column type
int column_count = rsmd.getColumnCount();
System.out.println("Number of columns in the table : "+column_count);


%>





</body>
</html>