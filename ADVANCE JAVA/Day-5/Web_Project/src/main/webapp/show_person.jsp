<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<jsp:useBean id="currentPerson" class="example.bean.Person" scope="session"/>
	
	
<!-- 	Rritriveing -->
	<h2>Name : <jsp:getProperty name="currentPerson" property="name"/></h2>
	<h2>Age : <jsp:getProperty name="currentPerson" property="age"/></h2>
	<h2>Weight : <jsp:getProperty name="currentPerson" property="weight"/></h2>
</body>
</html>