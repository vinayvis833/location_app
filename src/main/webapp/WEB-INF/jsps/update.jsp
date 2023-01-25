<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Page</title>
</head>
<body>
	<ul>
		<li><a href="showPage">Show</a>
		<li><a href="viewPage">View</a>
	</ul>
	<form action="saveUpdate" method="post">
		<h2>Welcome To Web Location</h2>
		<p>Update details below</p>
		
		ID <input type="text" name="id" value="${locations.id}" readonly>
		Code <input type="text" name="code" value="${locations.code}">
		Name <input type="text" name="name" value="${locations.name}">
		Type:
		Urban <input type="radio" name="type" value="Urban">
		Rural <input type="radio" name="type" value="Rural">
		<input type="submit" value="Update">
		<hr>
		<p>${msg}</p>
	</form>
</body>
</html>