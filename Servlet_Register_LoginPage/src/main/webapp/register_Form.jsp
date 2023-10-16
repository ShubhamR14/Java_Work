<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="regform" method="Post">
			Name : <input type="text" name="name1" placeholder="Name" /> <br/> <br/>
			Email : <input type="text" name="email1" placeholder="email" /> <br/> <br/>
			Password : <input type="password" name= "pass" placeholder="password" /><br/> <br/>
			Gender : <input type="radio" name= "gender"  value="Male" /> Male <input type="radio" name= "gender" value="Female" >Female <br></br>
			City : <select name="city">
			<option> Select City </option>
			<option> Palghar </option>
			<option> Vasai </option>
			<option> Pune </option>
			<option> Kopar </option>
			<option> Mulund </option>
			</select>
			<br></br>
			<input type="submit" value="register" />
		</form>
</body>
</html>