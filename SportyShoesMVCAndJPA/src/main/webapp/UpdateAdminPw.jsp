<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Update Admin Password</title>
<h2>Update Admin Password</h2>
</head>
<body>
<font color="red">  ${requestScope.msg}</font>
<form action="changeAdmin" method="post">
	<label>Admin User</label>
	<input type="text" name="aname" required/><br/>
	<label>Admin Password</label>
	<input type="password" name="apassword" required/><br/>
	<label>Admin New Password</label>
	<input type="password" name="anewpassword" required/><br/>
	<input type="submit" value="submit"/>
	<input type="reset" value="reset"/>
</form><br/>

<br/>
<a href="AdminHomePage.jsp">Return to Admin HomePage</a>
<br/>
<a href="Login.jsp">Logout</a>
</body>
</html>