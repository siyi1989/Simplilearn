<%@page import="com.bean.Category"%>
<%@page import="com.service.ProductService"%>
<%@page import="com.dao.ProductDao"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Iterator"%>
<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Insert title here</title>
<h2>Store New Products</h2>
</head>
<body>

<font color="red">  ${requestScope.msg}</font>

<form id="MyForm" action="InsertProd" method="post">
	<label>New Product Name</label>
	<input type="text" name="desc"/><br/>
	<label>Price</label>
	<input type="text" name="price"/><br/>
	<label>Qty</label>
	<input type="text" name="qty"/><br/>
	<label>Category</label>
<select name="category" required>
	<%
Object obj=session.getAttribute("listOfCategory");
	if(obj!=null){
		List<Category> listOfCat=(List<Category>)obj;
		Iterator<Category> li=listOfCat.iterator();
		while (li.hasNext()){
			Category cat=li.next();
			
			%>
			
				<option value=<%=cat.getCatname()%>><%=cat.getCatname() %></option> 

			
		<%
		}
	}
	
	%>
	</select>

	<input type="submit" value="submit"/>
	<input type="reset" value="reset"/>
</form>

<br/>
<a href="AdminHomePage.jsp">Return to Admin HomePage</a>
<br/>
<a href="Login.jsp">Logout</a>
</body>
</html>