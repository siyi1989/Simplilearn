<%@page import="java.util.Iterator"%>
<%@page import="com.bean.Product"%>
<%@page import="com.service.ProductService"%>
<%@page import="com.dao.ProductDao"%>
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
		<th>Flight Date</th>
		<th>From</th>
		<th>From airport</th>
		<th>To</th>
		<th>To airport</th>
		<th>Airline</th>
		<th>Price per pax</th>
		<th>Slot available</th>
				
	</tr>
		

<%
Object obj=session.getAttribute("listOfProduct");
	if(obj!=null){
		List<Product> listOfProduct=(List<Product>)obj;
		Iterator<Product> li=listOfProduct.iterator();
		while (li.hasNext()){
			Product p=li.next();
			
			%>
			<tr id=<%=p.getFid()%>>
				<td><%=p.getFdate() %></td>
				<td><%=p.getFsource() %></td>
				<td><%=p.getFsourceport() %></td>
				<td><%=p.getFdestination() %></td>
				<td><%=p.getFdestport() %></td>
				<td><%=p.getFairline() %></td>
				<td><%=p.getFprice() %></td>
				<td><%=p.getFslot()%></td>
				

			</tr>

		<%
		}
	}
	
	%>
	
		</table>
		
<br/>
<a href="index.jsp">Logout</a>
<br/>
<a href="adminHome.jsp">Return to Admin HomePage</a>
</body>


</html>