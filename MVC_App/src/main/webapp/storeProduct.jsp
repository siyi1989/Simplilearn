<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="ProductController" method="post">
<label>PId</label>
<input type="number" name="pid"/><br/>
<label>PName</label>
<input type="text" name="pname"/><br/>
<label>Price</label>
<input type="number" name="price"/><br/>
<input type="submit" value="Store Product"/>
<input type="reset" value="reset"/>
</form>
</body>
</html>