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
String admin=(String)session.getAttribute("Admin");
if(admin==null){
	response.sendRedirect("index.jsp");
}else{
out.println("Welcome to Admin Home Page "+admin);
}

%>
<br/>
<a href="ProductController">View All Product</a>
<br/>
<a href="DropdownController">Store Product</a>

<br/>
<a href="adminChangePW.jsp">Change Admin Password</a>
<br/>
<a href="index.jsp">Logout</a>

</body>
</html>