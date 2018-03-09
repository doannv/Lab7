<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>New</title>
</head>
<body>
	<h1>New Customer</h1>
	<form action="ControllerCustomer" method="post">
		Makh:<input type="text" name="txtMakh" value=""><br>
		Matkhau:<input type="password" name="txtMatkhau" value=""><br>
		Hovaten:<input type="text" name="txtHovaten" value=""><br>
		Email:<input type="text" name="txtEmail" value=""><br>
		Dienthoai:<input type="text" name="txtDienthoai" value=""><br>
		<input type="submit" name="action" value="Insert">
	</form>
</body>
</html>