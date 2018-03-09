<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Search Book HQL</title>
</head>
<body>
	<h1>Search</h1>
	<form action="ControllerBook" method="post">
		Tên sách :<input type="text" name="txtTensach" value=""><br>
		<input type="submit" name="action" value="Search">
	</form>
	<table border="1">
		<tr>
			<td>Mã sách</td>
			<td>Tên sách</td>
			<td>Giá</td>
			<td>Số lượng</td>
		</tr>
		<c:forEach var="rows" items="${listBook}">
			<tr>
				<td>${rows.getMaSach()}</td>
				<td>${rows.getTenSach()}</td>
				<td>${rows.getGia()}</td>
				<td>${rows.getSoLuong()}</td>
				
			</tr>
		</c:forEach>
	</table>
</body>
</html>