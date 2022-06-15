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

<%
String user=(String)session.getAttribute("User");
if(user==null){
	response.sendRedirect("index.jsp");
}
%>


			
<h2>Search Page</h2>
<form action="SearchController" method="get"> 
	<input type="hidden" name="email" value="<%=session.getAttribute("User") %>" />
	<label>Fly From&nbsp;</label>
	<input type="dropdown" name="fsource";/>
	<label>To</label>
	<input type="dropdown" name="fdestination";><br/>
	<br/>
	<label>Search within date range</label><br/>
	<label>Date From</label>
	<input type="text" name="tripStart" id="ffromdate" readonly='true'>
	<label>To</label>
	<input type="text" name="tripEnd" id="ftodate" readonly='true'><br/>
	<br/>
	<label>Number of passenger</label>
	<select type="dropdown" name = "fslot">
		<option value = "1" selected>1</option>
		<option value = "2" selected>2</option>
		<option value = "3" selected>3</option>
		<option value = "4" selected>4</option>
		<option value = "5" selected>5</option>
		<option value = "6" selected>6</option>
		<option value = "7" selected>7</option>
		<option value = "8" selected>8</option>
		<option value = "9" selected>9</option>
		<option value = "10" selected>10</option>
		</select>
	<label>Please contact customer service for booking for more than 10 pax.</label>
	
	
	<br/>
	
	<input type="submit" value="Signin"/>
	<input type="reset" value="reset"/>	



	
	</form>

<link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
  <link rel="stylesheet" href="/resources/demos/style.css">
  <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
  <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>

<script>
$( function() {
	$("#ffromdate").datepicker({
        numberOfMonths: 2,
        minDate:0,
        maxDate:'+1y',
        onSelect: function(selected) {
          $("#ftodate").datepicker("option","minDate", selected);
       $("#ftodate").datepicker("setDate", '+0d');
        }
    });
    $("#ftodate").datepicker({ 
        numberOfMonths: 2,
        maxDate:'0d'+'+1y',
        onSelect: function(selected) {
        }
    });  
   
});
</script>

	
	
</body>
<br/>
<a href="userHome.jsp">Return to homepage</a>
</html>