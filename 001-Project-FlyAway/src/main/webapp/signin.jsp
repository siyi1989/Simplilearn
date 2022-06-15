<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Login Page</h2>
<form action="LoginController" method="get"> 
	<label>Email</label>
	<input type="email" name="email"/><br/>
	<label>Password</label>
	<input type="password" name="password"/>
	
	<label>TypeOfUser</label>
	<input type="radio" name="typeOfUser" value="Admin">Admin
	<input type="radio" name="typeOfUser" value="User" checked>User
	<br/>
	
	<input type="submit" value="Signin"/>
	<input type="reset" value="reset"/>	
	</form>
</body>
<br/>
<a href="signup.jsp">SignUp!</a>
</html>