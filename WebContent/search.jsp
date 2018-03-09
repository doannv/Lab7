<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/bootstrap-theme.min.css" rel="stylesheet">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Search</title>
</head>
<body>
	Welcome ${sessionScope.User}
	<h1>Search</h1>
	<form action="ControllerCustomer" method="post">
		Họ tên :<input type="text" name="txtTensach" value=""><br>
		<input type="submit" name="action" value="Search">
	</form>
	<br>
	<form action="ControllerCustomer" method="post">
		<input type="submit" name="action" value="New">
	</form>
	<table border="1">
		<tr>
			<td>Mã KH</td>
			<td>Mật khẩu</td>
			<td>Họ tên</td>
			<td>Email</td>
			<td>Điện thoại</td>
			<td>Delete</td>
			<td>Edit</td>
			<td>Update</td>
		</tr>
		<c:forEach var="rows" items="${listKH}">
			<form action="ControllerCustomer" method="post">
			<tr>
				<td>${rows.getMakh()}</td>
				<td>${rows.getMatkhau()}</td>
				<td>${rows.getHovaten()}</td>
				<td>${rows.getEmail()}</td>
				<td>${rows.getDienthoai()}</td>
				<td><input type="hidden" name="txtMakh"
					value="${rows.getMakh()}"> <input class="btn btn-primary"
					type="submit" name="action" value="Delete"></td>
				<td><input type="hidden" name="txtMakh"
					value="${rows.getMakh()}"> <input class="btn btn-primary"
					type="submit" name="action" value="Edit"></td>
				<td class="center" style="text-align: center;"><a
					href="update.jsp?action=Update&txtMakh=${rows.getMakh()}"
					class="btn btn-primary">Update</a></td>
			</tr>
			</form>
		</c:forEach>
	</table>
</body>
</html>