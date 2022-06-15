<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome to HTML Web Page</h1>
<%! int a,b,sum; %>
<%
/* int a=10;
int b=20;
int sum=a+b; */
int c=30;
sum=a+b;
System.out.println("Welcome to JSP on console");
out.println("Welcome to JSP on browser");
out.println("<br/>Sum of two number is "+sum);
%>

<p>Sum of two number is <%=10+40 %></p>
<p>Sum of two number is <%=sum %></p>
<font color=red> The sum of <%=a %> and <%=b %> is <%=sum %></font>
</body>
</html>