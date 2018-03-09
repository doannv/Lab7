<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/bootstrap-theme.min.css" rel="stylesheet">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Update</title>
</head>
<body>
	<form action="ControllerCustomer" method="post">
		Mật khẩu:<input type="password" name="txtMatkhau" value=""><br>
		Họ Tên:<input type="text" name="txtHovaten" value=""><br>
		Email:<input type="text" name="txtEmail" value=""><br>
		Điện thoại:<input type="text" name="txtDienthoai" value=""><br>
		<input type="hidden" name="action" value="Update">
		<input type="hidden" name="txtMakh" value="<%=request.getParameter("txtMakh")%>">
		<button type="submit" class="btn btn-success">Update</button>
	</form>
</body>
</html>