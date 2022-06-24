<%@page import="com.bean.Airlines"%>
<%@page import="com.bean.Airports"%>
<%@page import="com.bean.Countries"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.stream.Collectors"%>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset=ISO-8859-1">
<title>Store Flight Details</title>
<h1>Store Flight Details</h1>
</head>
<body>


<%--<form action="DropdownController" method="post" name="displayairport">
<input type="hidden" name="fsource1"/><br/>
<input type="hidden" name="fdestination1"/><br/>

</form> --%>

<form action="ProductController" method="post" name="storeflights">

<label>Flight</label>
<select name="fairline">
<%
Object obj=session.getAttribute("listOfAirline");

if(obj!=null){
	 List<Airlines> listOfAirline = (List<Airlines>)obj;
	Iterator<Airlines> li=listOfAirline.listIterator();
	while(li.hasNext()){
	Airlines air=li.next();
	%>

	<option value=<%=air.getLairline()%>><%=air.getLairline() %></option> 
	 
<%

	}
}
%>
</select>
<a href="storeAirlines.jsp">Add new airline</a>
<br/>



<label>Countries From</label>
<select name="fsource" id="fsource"> <%--onchange="submitdisplayform()"--%>

<%
Object obj1=session.getAttribute("listOfCountry");
if(obj1!=null){
	 List<Countries> listOfCountry = (List<Countries>)obj1;
	Iterator<Countries> li1=listOfCountry.listIterator();
	while(li1.hasNext()){
	Countries country=li1.next();
	%>
	<option value=<%=country.getCcountry()%>><%=country.getCcountry() %></option> 
	
	 
<%

	}
}
%>



</select>

<a href="storeCountries.jsp">Add new country</a>
<br/>




<%--String fsource1=(String)request.getAttribute("fsource1"); 

		String ccountryname= airport.getccountry();
	if(ccountryname.contains(fsource1)){
	--%>
	
<label>Airport From</label>
<select name="fsourceport" id="fsourceport">
<%

Object obj2=session.getAttribute("listOfAirport");
if(obj2!=null){
	 List<Airports> listOfFsourceport = (List<Airports>)obj2;
	Iterator<Airports> li2=listOfFsourceport.listIterator();
	while(li2.hasNext()){
	Airports airport=li2.next();
	%>
	<option value=<%=airport.getAirport()%>><%=airport.getAirport()%></option>	
	 
<%
	}
	}
%>

</select>


<a href="storeAirports.jsp">Add new airport</a>
<br/>

<label>Countries To</label>
<select name="fdestination" id="fdestination">

<%
Object obj3=session.getAttribute("listOfCountry");
if(obj3!=null){
	 List<Countries> listOfCountry = (List<Countries>)obj3;
	Iterator<Countries> li3=listOfCountry.listIterator();
	while(li3.hasNext()){
	Countries country=li3.next();
	%>
	<option value=<%=country.getCcountry()%>><%=country.getCcountry() %></option> 
	
	 
<%

	}
}
%>



</select>
<a href="storeCountries.jsp">Add new country</a>
<br/>


<label>Airport To</label>
<select name="fdestport" id="fdestport" required>

<%
Object obj4=session.getAttribute("listOfAirport");
if(obj4!=null){
	 List<Airports> listOfFdestport = (List<Airports>)obj4;
	Iterator<Airports> li4=listOfFdestport.listIterator();
	while(li4.hasNext()){
	Airports airport=li4.next();

	%>
	<option value=<%=airport.getAirport()%>><%=airport.getAirport()%></option>	
	 
<%

	}
}
%>

</select>
<a href="storeAirports.jsp">Add new airport</a>
<br/>








<label>Flight Date</label>
<input type="text" name="fdate" id="flightdate" readonly='true' required/><br/>
<label>Price</label>
<input type="float" name="fprice" required/><br/>
<label>Total Slot</label>
<input type="number" name="fslot" required/><br/>
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

<%--
function submitdisplayform() {

    
    const select = document.getElementById('fsource');

    select.addEventListener('change', function handleChange(event) {
    	fsource=(select.options[select.selectedIndex].text); 
    });
    fsource=(select.options[select.selectedIndex].text); 
    
    return fsource;
    
    
    }
    	   	
    --%>	

$( function() {
    $("#flightdate").datepicker({ 
        numberOfMonths:2,
    });  
})


</script>
</body>
</html>