<%@page import="java.util.Iterator"%>
<%@page import="com.bean.Employee"%>
<%@page import="java.util.List"%>
<%@page import= %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core" %> <!--ctrl+space to view import-->
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
Object obj=session.getAttribute("listOfEmp");
if(obj!=null){
	 List<Employee> listOfEmp = (List<Employee>)obj;
	Iterator<Employee> li=listOfEmp.listIterator();
	while(li.hasNext()){
	Employee emp=li.next();
	%>
	
	<!-- for dropdown option
	<option><%=emp.getId()+" "+emp.getName()+ " "+emp.getSalary() %>
	 -->

	<option value=<%=emp.getName()%>><%=emp.getName() %> </option> 
	 
<%

	}
}
%>
</select>
<br/>
<table border="1">
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Salary</th>
    </tr>
    
    <%
Object obj1  = session.getAttribute("listOfEmp");
if(obj1!=null){
    List<Employee> listOfEmp1 = (List<Employee>)obj1;
    out.println(listOfEmp1.size());
    Iterator<Employee> li1 = listOfEmp1.listIterator();
    while(li1.hasNext()){
        Employee emp = li1.next();
        %>
            <tr>
                <td><%=emp.getId() %></td>
                <td><%=emp.getName() %></td>
                <td><%=emp.getSalary() %></td>
            </tr>        
        <%
    }
}
%>
</table>
<h2>Employee Details using jstl tag</h2>
<table border="1">
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Salary</th>
    </tr>
    <core:forEach items="${sessionScope.listOfEmp}" var="emp">
		<tr>
			<td><core:out value="${emp.id}"></core:out></td>
			<td><core:out value="${emp.name}"></core:out></td>
			<td><core:out value="${emp.salary}"></core:out></td>
</tr>
</core:forEach>
</table>
</body>
</html>