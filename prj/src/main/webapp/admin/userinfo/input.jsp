<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script type="text/javascript" src="<%=basePath%>js/jquery-1.4.4.min.js"></script>
<title>Insert title here</title>
<script type="text/javascript">
	$(function(){
		<c:forEach items="${info.roles }" var="inrole">
		$("input[name=rids][value=${inrole.rid}]").attr("checked",'checked');
		</c:forEach>
	})
</script>
</head>
<body>
<form method="post" action="${info==null?'save':'update' }">
<input type="hidden" name="uid" value="${info.uid }">
用户名	<input type="text" name="uname" value="${info.uname }"><br/>
密码	<input type="text" name="upass" value="${info.upass }"><br/>
修改	<input type="radio" name="islock" value="0" ${info==null||!info.islock?'checked':'' }>可用<input type="radio" name="islock" value="1" ${info.islock?'checked':'' }>禁用<br/>
用户角色：
	<c:forEach items="${roles }" var="role">
	<input type="checkbox" name="rids" value="${role.rid}">${role.rolename}
	</c:forEach>
	<br/>
<input type="submit" value="${info==null?'增加':'修改' }" />
</form>
</body>
</html>