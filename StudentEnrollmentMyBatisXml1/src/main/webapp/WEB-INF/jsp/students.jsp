<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Success</title>
<link href="assets/css/bootstrap-united.css" rel="stylesheet" />

</head>
<body>
	<h1>list of Students</h1>



	<table>

		<tr>
			<th>Student NO</th>

			<th>FirstName</th>
			<th>LastName</th>

		</tr>
		<c:forEach items="${students}" var="student">

			<tr>
				<td>${student.id}</td>
				<td>${student.userName}</td>
				<td>${student.firstName}</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>