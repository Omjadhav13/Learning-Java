<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import ="java.time.LocalDate,java.time.LocalTime" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1> Welcome to jsp tags</h1>
	
	
	<!-- 	INcluding  -->
	<%@ include file="Background.html" %>


	<!-- 	Declaring some variable and defining some method -->
	<%!
		int num=15;
		public String sayWelcome(String name){
			return "Welcome "+name;
		}
	%>
	
	
	<!--Accexxing the varibale and method -->
	<h2>Square of <%=num %> is <%=(num * num)%></h2>
	<h2>Reply from method <%=sayWelcome("om ") %></h2>
	
		
	<h2>
	<%
		for(int i=1;i<=5;i++){
	%>
	<h2>Hello</h2>
	<%} %>
	
	
	<!-- Displaying system date and time -->
	<%
		LocalDate today=LocalDate.now();
		LocalTime now=LocalTime.now();
		
	%>
	<h2>Today Date is : <%=today %></h2>
	<h2>Current Time is : <%=now %></h2>
	
	
	
	
	
	
	
	
</body>
</html>