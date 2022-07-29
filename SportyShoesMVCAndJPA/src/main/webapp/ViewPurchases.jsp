<%@page import="com.bean.Purchase"%>
<%@page import="com.service.PurchaseService"%>
<%@page import="com.dao.PurchaseDao"%>
<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core" %>

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Insert title here</title>

        
<h2>Search Purchases</h2>
</head>

<body>
 
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
        

<font color="red">  ${requestScope.msg}</font>



<Strong>Search Scope</Strong> 



<input type="radio"  name="Radio" value="UserId" checked/>Search By UserId
<input type="radio" name="Radio" value="Date"/>Search By Date Purchased

<div class="UserId selectt" >
	<strong>Input UserId</strong>
<form id="MyForm" action="ViewPurchasesByUserId" method="post">
	<label>UserId</label>
	<input type="Number" name="seluid"/><br/>
	<input type="submit" value="submit"/>
	<input type="reset" value="reset"/>
</form>

</div><br/><br/>


<br/><br/>
<div class="Date selectt">
  	<strong>Input Date Range</strong>
<form id="MyForm" action="ViewPurchasesByDate" method="post">
	<label>From</label>
	<input type="text" name="Start" id="startdate" readonly="readonly" required>
	<label>To</label>
	<input type="text" name="End" id="enddate" readonly="readonly" required/>
	<input type="submit" value="submit"/>
	<input type="reset" value="reset"/>
</form>
</div>
<br/><br/>



<table cellpadding="2" cellspacing="2" border="1">
<tr>

	<th>Id</th>
	<th>UserId</th>
	<th>ProdId</th>
	<th>Purchase Date</th>
	<th>Price</th>
	<th>Qty</th>
	<th>Total Amount</th>
	<th>Status</th>
	</tr>
	
	<core:forEach items="${listOfPurchase}" var="purlist">
	<tr>
	<td><core:out value="${purlist.purid}"/></td>
	<td><core:out value="${purlist.puruserid}"/></td>
	<td><core:out value="${purlist.purprodid}"/></td>
	<td><core:out value="${purlist.purdate}"/></td>
	<td><core:out value="${purlist.purprice}"/></td>
	<td><core:out value="${purlist.purqty}"/></td>
	<td><core:out value="${purlist.purtotal}"/></td>
	<td><core:out value="${purlist.cart}"/></td>
	</tr>
	
	</core:forEach>
	
</table>


<br/>
<a href="AdminHomePage.jsp">Return to homepage</a>
<br/>
<a href="Login.jsp">Logout</a>


</body>
</html>
