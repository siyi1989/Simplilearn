<%@page import="com.bean.Product"%>
<%@page import="com.service.ProductService"%>
<%@page import="com.dao.ProductDao"%>
<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core" %>

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Insert title here</title>

        
<h2>View All Categories</h2>
</head>

<body>
 

<font color="red">  ${requestScope.msg}</font>


<table cellpadding="2" cellspacing="2" border="1">
<tr>

	<th>Id</th>
	<th>Category</th>
	<th>Option</th>
	</tr>
	
	<core:forEach items="${listOfCat}" var="catlist">
	<tr>
	<td><core:out value="${catlist.catid}"/></td>
	<td><core:out value="${catlist.catname}"/></td>
	<td><a href="${pageContext.request.contextPath }/ViewCategory?&action=remove&id=${catlist.catid }">Delete</td>
	</tr>
	
	</core:forEach>
	
</table>


<br/>
<a href="AdminHomePage.jsp">Return to homepage</a>
<br/>
<a href="Login.jsp">Logout</a>


</body>
</html>
