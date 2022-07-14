<%@page import="sys.util.ConnectionProvider"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
<style type="text/css">
.back-img {
	background: url("img/bg-img.jpg");
	width: 100%;
	height: 83vh;
	background-position: center;
	background-repeat: no-repeat;
	background-size: cover;
	background-attachment: fixed;
/* 	filter: blur(1px); */
}
</style>
<%@include file="all_component/allcss.jsp"%>
</head>
<body>
	<%@include file="all_component/navbar.jsp"%>
	<div class="container-fluid back-img">
	<div class="text-center">
	<h1 class="text-white"><i class="fa fa-book" aria-hidden="true"></i> Student Grevience System</h1>
	<a href="login.jsp" class="btn btn-light"><i class="fa fa-sign-in" aria-hidden="true"></i> Login</a>
	</div>
	</div>
	<%@include file="all_component/footer.jsp" %>
</body>
</html>