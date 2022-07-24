<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Login</title>


</head>

<h2>Welcome to Sporty Shoes</h2>

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

<body>
 


<font color="red">  ${requestScope.msg}</font>

<div>

<input type="radio"  name="Radio" value="User" checked/>User
<input type="radio" name="Radio" value="Admin"/>Admin
 </div>

<div class="User selectt" >
	<strong>Shopper Login</strong>
<form id="MyForm" action="checkUser" method="post">
	<label>User</label>
	<input type="text" name="uname"/><br/>
	<label>Password</label>
	<input type="password" name="upassword"/><br/>
	<input type="submit" value="submit"/>
	<input type="reset" value="reset"/>
</form>

<a href="SignUp.jsp">New Sign Up</a>
</div><br/><br/>


<br/><br/>
<div class="Admin selectt">
  	<strong>Admin Login</strong>
<form id="MyForm" action="checkAdmin" method="post">
	<label>Admin User</label>
	<input type="text" name="aname"/><br/>
	<label>Admin Password</label>
	<input type="password" name="apassword"/><br/>
	<input type="submit" value="submit"/>
	<input type="reset" value="reset"/>
</form>
</div>



</body>
</html>