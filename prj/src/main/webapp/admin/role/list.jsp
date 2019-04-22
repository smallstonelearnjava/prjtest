<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1" width="100%">
<tr>
	<td>角色编号</td>
	<td>角色名称</td>
	<td>操作</td>
</tr>
<c:forEach items="${list }" var="role">
<tr>
	<td>${role.rid }</td>
	<td>${role.rolename }</td>
	<td><a href="findById?rid=${role.rid }">修改</a></td>
</tr>
</c:forEach>
</table>
<a href="goInput">增加</a>
</body>
</html>