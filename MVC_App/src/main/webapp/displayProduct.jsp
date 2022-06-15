<%@page import="java.util.Iterator"%>
<%@page import="com.bean.Product"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1">
	<tr>
		<th>PId</th>
		<th>PName</th>
		<th>Price</th>
	</tr>
		

<%
Object obj=session.getAttribute("products");
	if(obj!=null){
		List<Product> listOfProduct=(List<Product>)obj;
		Iterator<Product> li=listOfProduct.iterator();
		while (li.hasNext()){
			Product p=li.next();
			
			%>
			<tr>
				<td><%=p.getPid() %></td>
				<td><%=p.getPname() %></td>
				<td><%=p.getPrice() %></td>
			</tr>
			<%
			
			
		}
	}
%>

</table>
</body>
</html>