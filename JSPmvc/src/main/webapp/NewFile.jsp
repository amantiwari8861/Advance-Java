<%@page import="java.sql.ResultSet"%>
<%@page import="com.pack.ConnectionProvider"%>
<%@page import="java.sql.ResultSetMetaData"%>
<%@page import="java.sql.DatabaseMetaData"%>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>All Employees List</title>
<link rel="stylesheet" href="Datatable/bootstrap.min.css">
<link rel="stylesheet" href="Datatable/dataTables.bootstrap5.min.css">
</head>
<body>

  	https://datatables.net/examples/styling/bootstrap4

	 <sql:setDataSource var="db" driver="com.mysql.cj.jdbc.Driver"  
     url="jdbc:mysql://localhost:3306/servletcrud" user="root"  password="1234"/>  
	
	<sql:query dataSource = "${db}" var = "result">
            SELECT * from jdbc.userinfo;
         </sql:query>
	<div class="container">
	<br>
	<br>
	<br>
	<table border = "1" width = "100%" id="mytable" class="table table-warning">
         <!-- table-striped -->
         <thead>
         <tr>
            <th>Emp ID</th>
            <th>First Name</th>
            <th>Password</th>
            <th>authid</th>
         </tr>
         </thead>
         <tbody>
         <c:forEach var = "row" items = "${result.rows}">
            <tr>
               <td><c:out value = "${row.userid}"/></td>
               <td><c:out value = "${row.username}"/></td>
               <td><c:out value = "${row.password}"/></td>
               <td><c:out value = "${row.authid}"/></td>
            </tr>
         </c:forEach>
         </tbody>
         <tfoot>
            <tr>
            <th>Emp ID</th>
            <th>First Name</th>
            <th>Password</th>
            <th>authid</th>
         </tr>
         </tfoot>
      </table>
      </div>    
      <%
      		
      %>
        
</body>
	<script src="Datatable/jquery-3.5.1.js"></script>
	<script src="Datatable/jquery.dataTables.min.js"></script>
	<script src="Datatable/dataTables.bootstrap5.min.js"></script>
	<script>
		$(document).ready(function() {
			$('#mytable').DataTable();
		} );
	</script>
</html>



