<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show Page</title>
</head>
<body>
	<ul>
		<li><a href="showPage">Show</a>
		<li><a href="viewPage">View</a>
	</ul>
	<table border="1">
	<tr>
		<th>ID</th>
		<th>Code</th>
		<th>Name</th>
		<th>Type</th>
		<th>Update</th>
		<th>Delete</th>
	</tr>
	<c:forEach items="${locations}" var="locations">
		<tr>
			<td>${locations.id}</td>
			<td>${locations.code}</td>
			<td>${locations.name}</td>
			<td>${locations.type}</td>
	
		<td><a href="update?id=${locations.id}">Update</a></td>
		<td><a href="delete?Id=${locations.id}">Delete</a></td>
		</tr>
	</c:forEach>
	</table>
</body>
</html>