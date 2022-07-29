<%@page import="com.bean.User"%>
<%@page import="com.service.UserService"%>
<%@page import="com.dao.UserDao"%>
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

</div><br/><br/>


<br/><br/>
<div class="Date selectt">
  	<strong>Input Date Range</strong>
<form id="MyForm" action="ViewUsersByUserDate" method="post">
	<label>From</label>
	<input type="text" name="Start" id="startdate" readonly="readonly" required>
	<label>To</label>
	<input type="text" name="End" id="enddate" readonly="readonly" required/>
	<input type="submit" value="submit"/>
	<input type="reset" value="reset"/>
</form>
</div>








<table cellpadding="2" cellspacing="2" border="1">
<tr>

	<th>Id</th>
	<th>UserName</th>
	<th>UserPassword</th>
	<th>FirstName</th>
	<th>LastName</th>
	<th>Address</th>
	<th>Email</th>
	<th>DateJoin</th>
	</tr>
	
	<core:forEach items="${RequestScope.listOfUser}" var="usr">
	<tr>
	<td><core:out value="${usr.userid}"/></td>
	<td><core:out value="${usr.username}"/></td>
	<td><core:out value="${usr.userpwd}"/></td>
	<td><core:out value="${usr.ufirstname}"/></td>
	<td><core:out value="${usr.ulastname}"/></td>
	<td><core:out value="${usr.uaddress}"/></td>
	<td><core:out value="${usr.uemail}"/></td>
	<td><core:out value="${usr.udate}"/></td>
	</tr>
	
	</core:forEach>
	
</table>

<link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
  <link rel="stylesheet" href="/resources/demos/style.css">
  <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
  <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
  
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

<br/>
<a href="AdminHomePage.jsp">Return to homepage</a>
<br/>
<a href="Login.jsp">Logout</a>


</body>
</html>
