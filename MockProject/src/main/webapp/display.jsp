<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="asd"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table >
	<tr>
	<th>id</th>
	<th>name</th>
	<th>email</th>
	<th>password</th>
	<th>edit</th>
	<th>delete</th>
	</tr>
	<asd:forEach var="e" items="${li}">
	<tr>
	<td>${li.getId()}</td>
	<td>${li.getName()}</td>
	<td>${li.getEmail()}</td>
	<td>${li.getPassword()}</td>
	<td><a href="editbyid?id=${e.getId()}">edit</a></td>
	<td><a href="editbyid?id=${e.getid()}">delete</a></td>
	</tr>
	</asd:forEach>
	</table>
</body>
</html>