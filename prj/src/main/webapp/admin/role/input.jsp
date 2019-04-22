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
<meta http-equiv="content-type" content="text/html; charset=UTF-8">
<base href="<%=basePath%>admin/">
<link rel="stylesheet" href="<%=basePath%>css/demo.css" type="text/css">
<link rel="stylesheet" href="<%=basePath%>css/zTreeStyle/zTreeStyle.css" type="text/css">
<script type="text/javascript" src="<%=basePath%>js/jquery.ztree.core-3.5.js"></script>
<script type="text/javascript" src="<%=basePath%>js/jquery.ztree.excheck-3.5.js"></script>
<title>Insert title here</title>

<SCRIPT type="text/javascript">
		<!--
		var setting = {
			check: {
				enable: true
			},
			data: {
				simpleData: {
					enable: true,
					idKey: "tid",
					pIdKey: "pid"
				}
			}
		};

		var zNodes =${alltree};
		
		var code;
		
		function setCheck() {
			var zTree = $.fn.zTree.getZTreeObj("treeDemo"),
			type = { "Y" : "ps", "N" : "ps" };
			
			zTree.setting.check.chkboxType = { "Y" : "ps", "N" : "ps" };
			
		}
		function showCode(str) {
			if (!code) code = $("#code");
			code.empty();
			code.append("<li>"+str+"</li>");
		}
		
		$(document).ready(function(){
			$.fn.zTree.init($("#treeDemo"), setting, zNodes);
			setCheck();
			
			var zTree = $.fn.zTree.getZTreeObj("treeDemo");
			
			<c:forEach items="${role.trees}" var="tree">
			var node = zTree.getNodeByParam("tid",${tree.tid});
			zTree.checkNode(node, true, false);
			</c:forEach>
		});
		
		function dosubmit(){
			var treeObj=$.fn.zTree.getZTreeObj("treeDemo");
            var nodes=treeObj.getCheckedNodes(true);
            var v="";
            for(var i=0;i<nodes.length;i++){
            v+=nodes[i].tid;
            	if(i<nodes.length-1){
            		v+=",";
            	}
            }
        	$("input[name=tids]").val(v);
        	document.forms[0].submit();
		}
		//-->
</SCRIPT>
</head>
<body>
<form method="post" action="role/${role==null?'save':'update' }">
<input type="hidden" name="rid" value="${role.rid }">
<input type="hidden" name="tids" />
角色名称	<input type="text" name="rolename" value="${role.rolename }"><br/>
请选择权限：
<div class="content_wrap">
	<div class="zTreeDemoBackground left">
		<ul id="treeDemo" class="ztree"></ul>
	</div>
</div>
<input type="button" onclick="dosubmit()" value="${role==null?'增加':'修改' }" />

</form>
</body>
</html>