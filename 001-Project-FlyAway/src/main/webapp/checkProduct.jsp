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

<form action="SearchController" method="get"> 
		

<%
Object obj=session.getAttribute("confirmproduct");
	if(obj!=null){
		List<Product> listOfConfirmProduct=(List<Product>)obj;
		Iterator<Product> li=listOfConfirmProduct.iterator();
		while (li.hasNext()){
			Product p=li.next();
			
			%>

<label>Flight</label>
<input type="hidden" name="searchid" readonly value=<%=p.getFid()%>>
<input type="text" name="fairline" readonly value=<%=p.getFairline()%>>
<br/>
<label>Flight Date</label>
<input type="text" name="fdate" readonly value=<%=p.getFdate()%>>
<br/>
<label>Fly From</label>
<input type="text" name="fsource" readonly value=<%=p.getFsource()%>>
<br/>
<label>Airport From</label>
<input type="text" name="fsourceport" readonly value=<%=p.getFsourceport()%>>
<br/>
<label>Fly To</label>
<input type="text" name="fdestination" readonly value=<%=p.getFdestination()%>>
<br/>
<label>Airport To</label>
<input type="text" name="fdestport" readonly value=<%=p.getFdestport()%>>
<br/>
<label>Price per pax</label>
<input type="text" name="fprice" readonly value=<%=p.getFprice()%>>
<br/>
<label>Available Slots</label>
<input type="text" name="fprice" readonly value=<%=p.getFprice()%>>
<br/>

				
	<td><input type="Submit" value="Book"/></td>
	<td><input type="Reset" value="Reset"/></td>

			</tr>
		</table>
		</form>	
		<%
		}
	}
	
	%>
	


</body>
</html>                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     