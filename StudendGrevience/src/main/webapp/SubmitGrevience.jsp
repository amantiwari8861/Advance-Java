<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>  
	    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Submit Grevience</title>
<%@include file="all_component/allcss.jsp" %>

<style>
body {
	color: #fff;
	background: #63738a;
	font-family: 'Roboto', sans-serif;
}
.form-control {
	height: 40px;
	box-shadow: none;
	color: #969fa4;
}
.form-control:focus {
	border-color: #5cb85c;
}
.form-control, .btn {        
	border-radius: 3px;
}
.signup-form {
	width: 450px;
	margin: 0 auto;
	padding: 30px 0;
  	font-size: 15px;
}
.signup-form h2 {
	color: #636363;
	margin: 0 0 15px;
	position: relative;
	text-align: center;
}
.signup-form h2:before, .signup-form h2:after {
	content: "";
	height: 2px;
	width: 15%;
	background: #d4d4d4;
	position: absolute;
	top: 50%;
	z-index: 2;
}	
.signup-form h2:before {
	left: 0;
}
.signup-form h2:after {
	right: 0;
}
.signup-form .hint-text {
	color: #999;
	margin-bottom: 30px;
	text-align: center;
}
.signup-form form {
	color: #999;
	border-radius: 3px;
	margin-bottom: 15px;
	background: #f2f3f7;
	box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
	padding: 30px;
}
.signup-form .form-group {
	margin-bottom: 20px;
}
.signup-form input[type="checkbox"] {
	margin-top: 3px;
}
.signup-form .btn {        
	font-size: 16px;
	font-weight: bold;		
	min-width: 140px;
	outline: none !important;
}
.signup-form .row div:first-child {
	padding-right: 10px;
}
.signup-form .row div:last-child {
	padding-left: 10px;
}    	
.signup-form a {
	color: #fff;
	text-decoration: underline;
}
.signup-form a:hover {
	text-decoration: none;
}
.signup-form form a {
	color: #5cb85c;
	text-decoration: none;
}	
.signup-form form a:hover {
	text-decoration: underline;
}  
</style>
</head>
<body>
<div class="signup-form">

<sql:setDataSource var="db" driver="com.mysql.cj.jdbc.Driver"  
     url="jdbc:mysql://localhost:3306/stugre" user="root"  password="1234"/>  
	
	<sql:query dataSource = "${db}" var = "sub">SELECT * from Subjects;</sql:query>
	<sql:query dataSource = "${db}" var = "dept">SELECT * from Departments;</sql:query>
         

    <form action="" method="post">
        <br>
		<h2>Student Grevience</h2>
		<p class="hint-text">Fill and submit ur Grevience.</p>
        <div class="form-group">
			<div class="row">
				<div class="col"><input type="text" class="form-control" name="first_name" placeholder="First Name" required="required"></div>
				<div class="col"><input type="text" class="form-control" name="last_name" placeholder="Last Name" required="required"></div>
			</div>        	
        </div>
        <div class="form-group">
        	<input type="email" class="form-control" name="email" placeholder="Email" required="required">
        </div>
		<div class="form-group">
            <select  class="form-control" required>
              <option selected>Choose Department</option>
			<c:forEach var = "row" items = "${dept.rows}">
			<option value="${dept.deptName}">${dept.deptName}</option>
			</c:forEach>
			</select>         
        </div>
		<div class="form-group">
            <select  class="form-control" required>
                <option selected>Choose Subject</option>
                <c:forEach var = "row" items = "${sub.rows}">
			<option value="${sub.subject}">${sub.subject}</option>
			</c:forEach>
              </select></div>
        <div class="form-group">
            <textarea class="form-control" name="query" placeholder="Enter Grevience" rows="4"></textarea>
          </div>
		<div class="form-group">
            <button type="submit" class="btn btn-success btn-lg btn-block">Submit Grevience</button>
        </div>
    </form>
	<!-- <div class="text-center">Already have an account? <a href="#">Sign in</a></div> -->
</div>
</body>
</html>