<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Admin Home Page</title>
<h2>Admin Home Page</h2>
</head>
<body>
<font color="red">  ${requestScope.msg}</font>

<a href="UpdateAdminPw.jsp">Change Admin Password</a>
<br/>
<a href="ViewProducts.jsp">View Product</a>
<br/>
<a href="ViewCategory.jsp">View Category</a>
<br/>
<a href="StoreNewCategory.jsp">Store Category</a>
<br/>
<a href="StoreNewProducts.jsp">Store Products</a>
<br/> 
<a href="ViewUsers.jsp">View Users</a>
<br/>
<a href="ViewPurchases.jsp">View Purchases</a>
<br/>


<a href="Login.jsp">Logout</a>

</body>
</html>