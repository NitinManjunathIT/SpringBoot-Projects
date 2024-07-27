<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="jakarta.tags.core"	 prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Output</title>
</head>
<body>

	<!-- toString() gets called -->
	<h1>UserObject details :: ${obj}</h1>

	<hr>

	<!-- Getter methods will be called -->
	<p>ID is :: ${obj.userId}</p>
	<p>NAME is :: ${obj.userName}</p>
	<p>ROLE is :: ${obj.userRole}</p>

	<hr>
	<h1>Iterating the User objects</h1>
	<table border='1'>
	
		<tr>
			<th>UserID</th>
			<th>UserName</th>
			<th>UserRole</th>
		</tr>
		
		<c:forEach items="${objList}" var="obj">
			<tr>
				<td>${obj.userId }</td>
				<td>${obj.userName }</td>
				<td>${obj.userRole }</td>
			</tr>
		</c:forEach>
		
	</table>
</body>
</html>