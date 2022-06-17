<%@page import="java.util.Iterator"%>
<%@page import="com.bean.Airlines"%>
<%@page import="com.bean.Airports"%>
<%@page import="java.util.List"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Store Flight Details</title>
</head>
<body>
<form action="ProductController" method="post">


<%
Object obj=session.getAttribute("Airlines");
if(obj!=null){
	 List<Airlines> listOfAir = (List<Airlines>)obj;
	Iterator<Airlines> li=listOfAir.listIterator();
	while(li.hasNext()){
	Airlines air=li.next();
	%>
	<label>Flight</label>
	<option name="flight" value=<%=air.getLairline()%>><%=air.getLairline() %></option> 
	 
<%

	}
}
%>
<a href="storeAirlines.jsp">Add new airline</a>




<%
Object obj1=session.getAttribute("Airports");
if(obj!=null){
	 List<Airports> listOfAirport = (List<Airports>)obj1;
	Iterator<Airports> lip=listOfAirport.listIterator();
	while(lip.hasNext()){
	Airports airport=lip.next();
	%>
	<label>From Country</label>
	<option name="fsource" id="acountry" value=<%=airport.getAcountry()%>><%=airport.getAcountry() %></option> 
	<option name="fsourceport" value=<%=airport.getAirport()%>><%=airport.getAirport() %></option> <br/>
	
	<label>To Country</label>
	<option name="fdestination" value=<%=airport.getAcountry()%>><%=airport.getAcountry() %></option> 
	<option name="fdestport" value=<%=airport.getAirport()%>><%=airport.getAirport() %></option>
	 
<%

	}
}
%>

<a href="storeAirports.jsp">Add new airport</a>
<label>Flight Date</label>
<input type="text" name="fdate" id="flightdate" readonly='true'/><br/>
<label>Price</label>
<input type="float" name="fprice"/><br/>
<label>Total Slot</label>
<input type="number" name="fslot"/><br/>
<input type="submit" value="Store Product"/>
<input type="reset" value="reset"/>
</form>

<br/>
<a href="index.jsp">Logout</a>
<br/>
<a href="adminHome.jsp">Admin Home Page</a>


<link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
  <link rel="stylesheet" href="/resources/demos/style.css">
  <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
  <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>

<script>
$( function() {
    $("#flightdate").datepicker({ 
        numberOfMonths: 2,
    });  
   
});

</script>
</body>
</html>