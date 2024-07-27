<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Page</title>
</head>
<body>
	<h1>Welcome to Employee Registration page</h1>

	<form method="post" action="/employee/save">
		<table>
			<tr>
				<th>EMPID </th>
				<td>
					<input type="text" name="empId">
				</td>
			</tr>
			<tr>
				<th>EMPNAME </th>
				<td>
					<input type="text" name="empName">
				</td>
			</tr>
			<tr>
				<th>EMPSAL </th>
				<td>
					<input type="text" name="empSal">
				</td>
			</tr>
			<tr>
				<th>EMPPWD</th>
				<td>
					<input type="password" name="empPwd">
				</td>
			</tr>
			<tr>
				<th>EMPDEPT </th>
				<td>
					<input type="text" name="empDept">
				</td>
			</tr>
			<tr>
				<th>EMPADDR </th>
				<td>
					<input type="text" name="empAddr">
				</td>
			</tr>
			<tr>
				<th></th>
				<td>
					<input type='submit' value='save'>
				</td>
			</tr>
		</table>
		
	</form>


</body>
</html>