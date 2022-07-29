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

        
<h2>Search Products</h2>
</head>

<body>
 

<font color="red">  ${requestScope.msg}</font>



<Strong>Search Scope</Strong> 

<form id="MyForm" action="SearchProd" method="post">
	<label>Product Category Id</label>

<select name="catid">
    <c:forEach items="${mapCats}" var="cat">
        <option value="${cat.key}">${cat.value}</option>
    </c:forEach>
</select>

	<input type="submit" value="submit"/>
	<input type="reset" value="reset"/>
</form>



<table cellpadding="2" cellspacing="2" border="1">
<tr>

	<th>Id</th>
	<th>Description</th>
	<th>Price</th>
	<th>Stock Available</th>
	<th>Category</th>
	<th>Option</th>
	</tr>
	
	<core:forEach items="${listOfProd}" var="prodlist">
	<tr>
	<td><core:out value="${prodlist.prodid}"/></td>
	<td><core:out value="${prodlist.proddesc}"/></td>
	<td><core:out value="${prodlist.prodprice}"/></td>
	<td><core:out name="reqstk" value="${prodlist.prodqty}"/></td>
	<td><core:out value="${prodlist.prodcatid}"/></td>
	<td><a href="${pageContext.request.contextPath }/ViewProductsUser?&action=Buy&id=${prodlist.prodid }">Buy</td>
	</tr>
	
	</core:forEach>
	
</table>


<br/>
<a href="AdminHomePage.jsp">Return to homepage</a>
<br/>
<a href="Login.jsp">Logout</a>


</body>
</html>
