<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Change Admin Password Page</h2>

<%
String admin=(String)session.getAttribute("admin");
if(admin==null){
	response.sendRedirect("index.jsp");
}
%>

<form action="AdminController" method="post"> 
	<input type="hidden" name="email" value="<%= session.getAttribute("admin") %>" />
	<label>Old Password</label>
	<input type="password" name="password"/>
	<br/>
	<label>New Password</label>
	<input type="password" name="newpassword1"/>
	<br/>
	<label>Re-enter New Password</label>
	<input type="password" name="newpassword2"/>
	<br/>	
	<input type="submit" value="change"/>
	<input type="reset" value="reset"/>	
	</form>
<br/>
<a href="index.jsp">Logout</a>
<br/>
<a href="adminHome.jsp">Return to Admin HomePage</a>


</body>
</html>