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
	<td>用户编号</td>
	<td>用户姓名</td>
	<td>用户角色</td>
	<td>是否可用</td>
	<td>操作</td>
</tr>
<c:forEach items="${list }" var="info">
<tr>
	<td>${info.uid }</td>
	<td>${info.uname }</td>
	<td>${info.roles }</td>
	<td>${info.islock==null||info.islock?'禁用':'可用' }</td>
	<td><a href="findById?uid=${info.uid }">修改</a></td>
</tr>
</c:forEach>
</table>
<a href="goInput">增加</a>
</body>
</html>