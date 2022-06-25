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
Integer reqslot=(Integer)session.getAttribute("reqslot");
	if(obj!=null){
		List<Product> listOfSelectedProduct=(List<Product>)obj;
		Iterator<Product> li=listOfSelectedProduct.iterator();
		while (li.hasNext()){
			Product p=li.next();
			
			%>
			<form action="SearchController" method="post"> 
			<tr name=searchid value=<%=p.getFid()%>>
				<td name=fdate value=<%=p.getFdate()%>>
				<td name=fsource value=<%=p.getFsource() %>>
				<td name=fsourceport value=<%=p.getFsourceport() %>>
				<td name=fdestination value=<%=p.getFdestination() %>>
				<td name=fdestport value=<%=p.getFdestport() %>>
				<td name=fairline value=<%=p.getFairline() %>>
				<td name=fprice value=<%=p.getFprice() %>>
				
				<td value=<%=if(reqslot>p.getFslot()){out.println("Limited "+p.getFslot()+" Slots");}%>>
				
	<td><input type="Submit" value="Book"/></td>
	<td><input type="Reset" value="Reset"/></td>

			</tr>
		</table>
		</form>	
		<%
		}
	}
	
	%>
	

<%-- 
        <script>
            function show() {
                var rowId = event.target.parentNode.parentNode.id;
                //alert(rowId);
               document.getElementById("flightID").value=rowId;
               document.form[0].submit();
            }
            
        </script>  
--%>

</body>
</html>