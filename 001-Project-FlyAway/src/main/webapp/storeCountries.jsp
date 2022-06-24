<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="com.bean.Countries"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="CountriesController" method="post">
<label>New Country</label>
<input type="text" name="country" required/><br/>
<input type="submit" value="Store Country"/>
<input type="reset" value="reset"/>
</form>

<br/>
<br/>

<table border="1" name="List of Countries">
	<tr>
		<th>Countries</th>
		
		
	</tr>
		

<%
Object obj=session.getAttribute("listOfCountry");
	if(obj!=null){
		List<Countries> listOfCountry=(List<Countries>)obj;
		Iterator<Countries> li=listOfCountry.iterator();
		while (li.hasNext()){
			Countries ctry=li.next();
			
			%>
		<tr>
			<td><%=ctry.getCcountry() %></td>
	

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