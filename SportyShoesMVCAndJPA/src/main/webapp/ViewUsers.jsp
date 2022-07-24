<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Insert title here</title>
<script src=
	"https://code.jquery.com/jquery-1.12.4.min.js">
	    </script>
        <script type="text/javascript">
            $(document).ready(function() {
                $('input[type="radio"]').click(function() {
                    var inputValue = $(this).attr("value");
                    var targetBox = $("." + inputValue);
                    $(".selectt").not(targetBox).hide();
                    $(targetBox).show();
                });
            });
        </script>
        
<h2>Search Users</h2>
</head>

<body>
 




<font color="red">  ${requestScope.msg}</font>



<Strong>Search Scope</Strong> 


<input type="radio"  name="Radio" value="UserName" checked/>Search By UserName
<input type="radio" name="Radio" value="Date"/>Search By Date Join

<div class="Username selectt" >
	<strong>Input UserName</strong>
<form id="MyForm" action="ViewUsersByUserName" method="post">
	<label>Username</label>
	<input type="text" name="seluname"/><br/>
	<input type="submit" value="submit"/>
	<input type="reset" value="reset"/>
</form>

<a href="SignUp.jsp">New Sign Up</a>
</div><br/><br/>


<br/><br/>
<div class="Date selectt">
  	<strong>Input Date Range</strong>
<form id="MyForm" action="ViewUsersByUserDate" method="post">
	<label>From</label>
	<input type="text" name="Start" id="startdate" readonly='true' required/>
	<label>To</label>
	<input type="text" name="End" id="enddate" readonly='true' required/>
	<input type="submit" value="submit"/>
	<input type="reset" value="reset"/>
</form>
</div>








<table>
<tr>

	<th>Id</th>
	<th>UserName</th>
	<th>UserPassword</th>
	<th>First Name</th>
	<th>Last Name</th>
	<th>Address</th>
	<th>Email</th>
	<th>Date Join</th>
	</tr>
	
	<core:forEach items=${RequestScope.listOfUser} var="usr">
	<tr>
	<td><core:out> value=${usr.userid}</core:out></td>
	<td><core:out> value=${usr.username}</core:out></td>
	<td><core:out> value=${usr.userpwd}</core:out></td>
	<td><core:out> value=${usr.ufirstname}</core:out></td>
	<td><core:out> value=${usr.ulastname}</core:out></td>
	<td><core:out> value=${usr.uaddress}</core:out></td>
	<td><core:out> value=${usr.uemail}</core:out></td>
	<td><core:out> value=${usr.udate}</core:out></td>
	</tr>
	
	</core:forEach>
	
</table>


<script>
$( function() {
	$("#enddate").datepicker({
        numberOfMonths: 2,
        maxDate:0,
    });
    $("#startdate").datepicker({ 
        numberOfMonths: 2,
        maxDate:0,
        onSelect: function(selected) {
        }
    });  
   
});

</script>
</body>
</html>
