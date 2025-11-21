<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 	Instantiating a java bean : person from package:example.bean and putting it into? SESSION scope -->
	<jsp:useBean id="currentPerson" class="example.bean.Person" scope="session"/>
	
	
<!-- 	Assigning values to the properties of the bean -->
	<jsp:setProperty property="*" name="currentPerson"/>
	
	<h2>Added a new person.
	PLease<a href="show_person.jsp"> Click here</a>  to view the details</h2>
</body>
</html>