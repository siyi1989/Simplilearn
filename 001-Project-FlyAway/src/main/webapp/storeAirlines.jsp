<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="com.bean.Airlines"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="AirlineController" method="post">
<label>New Airline Name</label>
<input type="text" name="airline" required/><br/>
<input type="submit" value="Store Airline"/>
<input type="reset" value="reset"/>
</form>

<br/>
<br/>

<table border="1" name="List of Airlines">
	<tr>
		<th>Airlines</th>
		
		
	</tr>
		

<%
Object obj=session.getAttribute("listOfAirline");
	if(obj!=null){
		List<Airlines> listOfAirline=(List<Airlines>)obj;
		Iterator<Airlines> li=listOfAirline.iterator();
		while (li.hasNext()){
			Airlines air=li.next();
			
			%>
		<tr>
			<td><%=air.getLairline() %></td>
	

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