<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Home</title>
</head>
	<h1> Hello welcome to Spring MVC Web</h1>
	<form action="sayName" method="post">
	Enter Name <input type="text" name="fname"/>
	<input type="submit" value="click me"/>
	</form>
	
	<br/>
	<h2> Try logging in</h2>
	<form action="login" method="post">
		User Name<input type="text" name="username"/>
		Password<input type="text" name="password"/>
		<input type="submit" value="Login"/>
	</form>
	
	<span style="color:red">${errorMessage}</span><br/>
	<a href="register">Click here to register</a>
<body>

</body>
</html>