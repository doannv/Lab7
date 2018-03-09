<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
	<h1>Login</h1>
	<form action="ControllerCustomer" method="post">
		User:<input type="text" name="txtUser" value = ""><br>
		Pass:<input type="password" name="txtPass" value=""><br><br>
		<input type="submit" name="action" value="Login">
		<input type="reset" name="action" value="Reset">
		
	</form>
</body>
</html>