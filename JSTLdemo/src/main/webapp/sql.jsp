<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>

<sql:setDataSource var="db" driver="com.mysql.cj.jdbc.Driver"
  url="jdbc:mysql://localhost:3306/servletcrud" user="root" password="1234"/>
<%-- 
<sql:update dataSource="${db}" var="count">
    INSERT INTO userinfo(id,name,password) VALUES
      (110, 'monika', 'password');
</sql:update>
<c:out value="${count} Row Affected!"/>


<sql:update dataSource = "${db}" var = "count2">
    DELETE FROM userinfo WHERE id = ?
    <sql:param value = "110" />
</sql:update>
<c:out value="${count2}"/>
--%>
if one of the statement got error all other queries of transaction
get rollback means there will be no effect on database
<sql:transaction dataSource = "${db}">
    <sql:update var = "count">
        UPDATE userinfo SET name = 'tiwari' WHERE
          id='109'
    </sql:update>
    <sql:update var = "count">
        UPDATE Userinfo SET country = 'india' WHERE 
          id ='109'
    </sql:update>
    <sql:update var = "count">
        INSERT INTO Userinfo(id, name, email) 
          VALUES (112, 'aman2', 'aman@gmail.com');
    </sql:update>
</sql:transaction>

<c:out value="${count}"/>

</body>
</html>