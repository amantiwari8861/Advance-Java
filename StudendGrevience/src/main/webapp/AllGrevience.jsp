<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
	<!DOCTYPE html>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>  
	    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
<!--     <link rel="stylesheet" type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.6.0/css/bootstrap.min.css"/> -->
    <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/v/bs4-4.6.0/dt-1.12.1/datatables.min.css"/>
    
</head>
<body>
    <div class="container">
        <br>
        <br>
    <table id="mytable" class="table table-striped" style="width:100%">
    
    <sql:setDataSource var="db" driver="com.mysql.cj.jdbc.Driver"  
     url="jdbc:mysql://localhost:3306/stugre" user="root"  password="1234"/>  
	
	<sql:query dataSource = "${db}" var = "result">SELECT * from Greviences;</sql:query>
         <thead>
         <tr>
            <th>Grevience Id</th>
            <th>Subject</th>
            <th>Department</th>
            <th>Query</th>
            <th>Status</th>
            <th>Date Submitted</th>
            
         </tr>
         </thead>
         <tbody>
         <c:forEach var = "row" items = "${result.rows}">
            <tr>
               <td><c:out value = "${row.gId}"/></td>
               <td><c:out value = "${row.sub}"/></td>
               <td><c:out value = "${row.dept}"/></td>
               <td><c:out value = "${row.query}"/></td>
               <td><c:out value = "${row.status}"/></td>
               <td><c:out value = "${row.dos}"/></td>
            </tr>
         </c:forEach>
         </tbody>
         <tfoot>
            <tr>
             <th>Grevience Id</th>
            <th>Subject</th>
            <th>Department</th>
            <th>Query</th>
            <th>Status</th>
            <th>Date Submitted</th>
            
         </tr>
         </tfoot>
    </table>
    </div>
    </body>
    
<script src="https://code.jquery.com/jquery-3.6.0.min.js" integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=" crossorigin="anonymous"></script>
<script type="text/javascript" src="https://cdn.datatables.net/v/bs4-4.6.0/dt-1.12.1/datatables.min.js"></script>
<!-- <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.6.0/js/bootstrap.min.js"></script> -->
<script>
    $(document).ready(function() {
        $('#mytable').DataTable();
    } );
</script>
    </html>