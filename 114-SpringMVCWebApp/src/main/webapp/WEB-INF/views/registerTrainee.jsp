<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="sform" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
	<h2>Save Trainee Details</h2>
	<sform:form method="post" action="addTrainee" modelAttribute="traineeCommand">
	<table border="1px">
	<tr>
		<td><sform:label path="traineeName">Trainee Name</sform:label></td>
		<td><sform:input path="traineeName"/></td>
	</tr>
	<tr>
		<td><sform:label path="marksScored">Marks Scored</sform:label></td>
		<td><sform:input path="marksScored"/></td>
	</tr>
	<tr>
		<td><sform:label path="contactNumber">Contact Number</sform:label></td>
		<td><sform:input path="contactNumber"/></td>
	</tr>
	<tr>
	<td><input type="submit"/></td>
	</tr>
	</table>
	</sform:form>
	</div>
</body>
</html>