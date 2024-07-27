<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Records</title>
</head>
<body>
	<!-- toString() gets called -->
	<h1>UserObject details :: ${obj}</h1>

	<hr>

	<!-- Getter methods will be called -->
	<p>ID     is :: ${obj.empId}</p>
	<p>NAME   is :: ${obj.empName}</p>
	<p>SALARY is :: ${obj.empSal}</p>
</body>
</html>