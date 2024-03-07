<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<body>
<form action="/register" method="post">
<div style="margin-left: 500px; margin-right: 500px; margin-top: 20px;">
	<label style="margin-bottom: 20px;  font-size: 20px; color: red">Provide your Details</label>
		<div class="mb-3">
		<label for="exampleFormControlInput1" class="form-label">Username</label> <input type="text" class="form-control"
			id="exampleFormControlInput1" placeholder="Enter Username" name="username">
	</div>
	<div class="mb-3">
		<label for="exampleFormControlInput1" class="form-label">Password</label> <input type="password" class="form-control"
			id="exampleFormControlInput1" placeholder="Enter Password" name="password">
	</div>
	<div class="mb-3">
		<label for="exampleFormControlInput1" class="form-label">Complete Name</label> <input type="text" class="form-control"
			id="exampleFormControlInput1" placeholder="Enter Complete Name" name="name">
	</div>
	<div class="mb-3">
		<label for="exampleFormControlInput1" class="form-label">Email Address</label> <input type="text" class="form-control"
			id="exampleFormControlInput1" placeholder="Enter Email Address" name="email">
	</div>
	<button type="submit" class="btn btn-primary" style="margin-left: 80px">Register</button><br><br>
	<a href="/">Back to Home Page <<</a>
	</div>
	</form>
</body>
</html>