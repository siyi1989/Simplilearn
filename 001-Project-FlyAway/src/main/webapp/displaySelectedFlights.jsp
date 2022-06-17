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
				
	</tr>
		

<%
Object obj=session.getAttribute("selproducts");
	if(obj!=null){
		List<Product> listOfSelectedProduct=(List<Product>)obj;
		Iterator<Product> li=listOfSelectedProduct.iterator();
		while (li.hasNext()){
			Product p=li.next();
			
			%>
			<form action="SearchController" method="get"> 
			<tr id=<%=p.getFid()%>>
				<td><%=p.getFdate() %></td>
				<td><%=p.getFsource() %></td>
				<td><%=p.getFsourceport() %></td>
				<td><%=p.getFdestination() %></td>
				<td><%=p.getFdestport() %></td>
				<td><%=p.getFairline() %></td>
				<td><%=p.getFprice() %></td>
				<td><%if(p.getFslot()<10)
				{%>out.println(p.getFslot()+" number of seats left");<%}%></td>
				
	<td><input type="hidden" name="flightName" id="flightID" /></td>
	<td><input type="Submit" value="Book" onclick="show()"/></td>
	

			</tr>
		</table>
		</form>	
		<%
		}
	}
	
	%>
	


        <script>
            function show() {
                var rowId = event.target.parentNode.parentNode.id;
                //alert(rowId);
               document.getElementById("flightID").value=rowId;
               document.form[0].submit();
            }
            
        </script>  

</body>
</html>