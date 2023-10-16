<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> About-us </title>
</head>
<body>
	
	<%
		String myname =(String) session.getAttribute("name_key");
	%>

	<h1>Welcome : <%= myname %></h1>
	
	<h3>This is about us session</h3>
	
	<a href="profile.jsp" > Profile </a> &nbsp;&nbsp;
	<a href="home.jsp">Home</a> &nbsp;&nbsp;
	<a href="about-us.jsp" > About Us </a>&nbsp;&nbsp;
	
	
</body>
</html>