<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="com.bean.Airports"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="AirportController" method="post">
<label>New Airport Name</label>
<input type="text" name="airport" required/><br/>
<label>Country</label>
<input type="text" name="country" required/><br/>
<input type="submit" value="Store Airport" required/>
<input type="reset" value="reset"/>
</form>

<br/>
<br/>

<table border="1" name="List of Airports">
	<tr>
		<th>Airports</th>
		<th>Countries</th>
		
	</tr>
		

<%
Object obj=session.getAttribute("listOfAirport");
	if(obj!=null){
		List<Airports> listOfAirport=(List<Airports>)obj;
		Iterator<Airports> li=listOfAirport.iterator();
		while (li.hasNext()){
			Airports ports=li.next();
			
			%>
		<tr>
			<td><%=ports.getAirport() %></td>
			<td><%=ports.getccountry()%></td>

			</tr>
			
		<%
		}
	}
	
	%>
	
</table>

<br/>
<a href="storeProduct.jsp">Store Flight page</a>
<br/>
<a href="adminHome.jsp">Admin Home Page</a>

</body>
</html>