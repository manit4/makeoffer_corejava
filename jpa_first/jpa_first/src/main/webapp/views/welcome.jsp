<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*"%>
<%@ page import="com.exadata.entity.*"%>
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

	<%
	List<User> users = (List<User>) request.getAttribute("users");
	//String sessionMsg = (String)session.getAttribute("sessionData");
	User user = (User) session.getAttribute("user");
	%>

	<%
	if (users.size() > 0) {
	%>

	<%-- The session data is <%=sessionMsg %> --%>
	<table class="table">
		<thead>
			<tr>
				<th scope="col">#</th>
				<th scope="col">Username</th>
				<th scope="col">Complete Name</th>
				<th scope="col">Email Address</th>
				<th scope="col">Action</th>
			</tr>
		</thead>
		<tbody>
			<%
			if(user.getRole().equals("Admin")) {
				for (int i = 0; i < users.size(); i++) {
			%>
			<tr>
				<th scope="row"><%=i + 1%></th>
				<td><%=users.get(i).getUsername()%></td>
				<td><%=users.get(i).getName()%></td>
				<td><%=users.get(i).getEmail()%></td>
				<td><a href="/updatePage/<%=users.get(i).getUsername()%>">Update</a>&nbsp&nbsp<a
					href="/delete/<%=users.get(i).getUsername()%>">Delete</a></td>
			</tr>
			<%
			}}
			else {
			%>
			<tr>
				<th scope="row"><%=1%></th>
				<td><%=user.getUsername()%></td>
				<td><%=user.getName()%></td>
				<td><%=user.getEmail()%></td>
				<td><a href="/updatePage/<%=user.getUsername()%>">Update</a>&nbsp&nbsp</td>
			</tr>
			<%} %>
		</tbody>

	</table>
	<%
	}
	else {
	%>
	<h3>No Records Found</h3>
	<%} %>

</body>
</html>