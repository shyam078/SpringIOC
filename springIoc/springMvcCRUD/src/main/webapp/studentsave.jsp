<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form:form action="studentsave" modelAttribute="load">
NAME:<form:input path="name"/><br><br>
EMAIL:<form:input path="email"/><br><br>
<input type="submit">
</form:form>
</body>
</html>