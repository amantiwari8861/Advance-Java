<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	jstl Demo
	
In addition to declaring the tag libraries, tutorial examples access the JSTL
 API and implementation. In the Application Server, the JSTL TLDs and 
 libraries are distributed in the archive as-install/lib/appserv-jstl.jar.
  This library is automatically loaded into the classpath of all web 
  applications running on the Application Server, so you don’t need to 
  add it to your web application.
  
  <h1>Download jstl 1.2 : 
  <a href="https://repo1.maven.org/maven2/javax/servlet/jstl/1.2/jstl-1.2.jar">here</a>
  </h1>
  
	 <sql:setDataSource var="db" driver="com.mysql.cj.jdbc.Driver"  
     url="jdbc:mysql://localhost:3306/servletcrud"  
     user="root"  password="1234"/>  
	
	<sql:query dataSource = "${db}" var = "result">
            SELECT * from userinfo;
         </sql:query>
	
	<table border = "1" width = "100%">
         <tr>
            <th>Emp ID</th>
            <th>First Name</th>
            <th>Password</th>
            <th>Country</th>
            <th>email</th>
         </tr>
         
         <c:forEach var = "row" items = "${result.rows}">
            <tr>
               <td><c:out value = "${row.id}"/></td>
               <td><c:out value = "${row.name}"/></td>
               <td><c:out value = "${row.password}"/></td>
               <td><c:out value = "${row.country}"/></td>
               <td><c:out value = "${row.email}"/></td>
            </tr>
         </c:forEach>
      </table>
</body>
</html>