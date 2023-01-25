<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
	<form action="savePage" method="post">
		<h2>Welcome to Web Location</h2>
		<p>Enter Details Below</p>
		
		ID <input type="text" name="id">
		Code <input type="text" name="code">
		Name <input type="text" name="name">
		Type:
		Urban <input type="radio" name="type" value="Urban">
		Rural <input type="radio" name="type" value="Rural">
		<input type="submit" value="Save">
			
	</form>
	<hr>
	<p>${msg}</p>
</body>
</html>