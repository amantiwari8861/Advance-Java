<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>Login page</title>
<%@include file="all_component/allcss.jsp" %>
</head>
<body>
<%@include file="all_component/navbar.jsp"%>
	<div class="container-fluid div-color">
		<div class="row">
			<div class="col-md-4 offset-md-4">
				<div class="card mt-5">
					<div class="card-header text-center text-white bg-custom">
						<i class="fa fa-user fa-3x" aria-hidden="true"></i>
						<h3>Login</h3>
					</div>
					<div class="card-body">
						<form action="LoginServlet" method="post">
						<%
								if(request.getAttribute("err") != null)
								{
						%>
						<div class="form-group">
						<div class="alert alert-danger" role="alert">
 <%=request.getAttribute("err")%>
</div></div>
						<%}%>
							<div class="form-group">
							<label>Enter Email</label>
								<input type="email" class="form-control" id="exampleInputEmail1"
									aria-describedby="emailHelp">
							</div>
							<div class="form-group">
								<label for="exampleInputPassword1">Enter Password</label> <input
									type="password" class="form-control" id="exampleInputPassword1">
							</div>
							<button type="submit" class="btn btn-primary badge-pill btn-block">Login</button>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
	<%@include file="all_component/footer.jsp"%>
</body>
</html>