<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form:form action="updateemp" modelAttribute="update">
<form:input path="id"/><br><br>	
<form:input path="name"/><br><br>
<form:input path="email"/><br><br>
<form:input path="password"/><br><br>
<input type="submit">
</form:form>
</body>
</html>