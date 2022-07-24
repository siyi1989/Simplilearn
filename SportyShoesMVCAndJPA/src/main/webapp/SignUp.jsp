<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Insert title here</title>
<h2>Sign up for new account</h2>
</head>
<body>
<font color="red">  ${requestScope.msg}</font>
<form action="createNewUser" method="post">
	<label>Set Username</label>
	<input type="text" name="uname"/><br/>
	<label>Set Password</label>
	<input type="password" name="upassword"/><br/>
	<label>First Name</label>
	<input type="text" name="ufname"/><br/>
	<label>Last Name</label>
	<input type="text" name="ulname"/><br/>
	<label>Address</label>
	<input type="text" name="uadd"/><br/>
	<label>Email</label>
	<input type="email" name="umail"/><br/>
	<input type="submit" value="submit"/>
	<input type="reset" value="reset"/>
</form>

<br/>
<a href="Login.jsp">Return to previous page</a>

</body>
</html>