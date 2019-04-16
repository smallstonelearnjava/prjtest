<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>    
    
<!DOCTYPE html>
<HTML>
<HEAD>
	<TITLE> ZTREE DEMO - Custom Icon </TITLE>
	<meta http-equiv="content-type" content="text/html; charset=UTF-8">
	<link rel="stylesheet" href="<%=basePath%>css/demo.css" type="text/css">
	<link rel="stylesheet" href="<%=basePath%>css/zTreeStyle/zTreeStyle.css" type="text/css">
	<script type="text/javascript" src="<%=basePath%>js/jquery-1.4.4.min.js"></script>
	<script type="text/javascript" src="<%=basePath%>js/jquery.ztree.core-3.5.js"></script>
	<!--  <script type="text/javascript" src="../../../js/jquery.ztree.excheck-3.5.js"></script>
	  <script type="text/javascript" src="../../../js/jquery.ztree.exedit-3.5.js"></script>-->
	<SCRIPT type="text/javascript">
		<!--
		var setting = {
			data: {
				simpleData: {
					enable: true,
					idKey: "tid",
					pIdKey: "pid",
					rootPId: ""
				}
			}
		};

		var zNodes =${json};

		$(document).ready(function(){
			$.fn.zTree.init($("#treeDemo"), setting, zNodes);
		});
		//-->
	</SCRIPT>
</HEAD>

<BODY>
<h1>自定义图标 -- icon 属性</h1>
<h6>[ 文件路径: core/custom_icon.html ]</h6>
<div class="content_wrap">
	<div class="zTreeDemoBackground left">
		<ul id="treeDemo" class="ztree"></ul>
	</div>
	<div class="right">
		<ul class="info">
			<li class="title"><h2>1、setting 配置信息说明</h2>
				<ul class="list">
				<li>自定义图标不需要对 setting 进行特殊配置</li>
				</ul>
			</li>
			<li class="title"><h2>2、treeNode 节点数据说明</h2>
				<ul class="list">
				<li>利用 节点数据的 icon / iconOpen / iconClose 属性实现自定义图标</li>
				<li class="highlight_red">详细请参见 API 文档中的相关内容</li>
				</ul>
			</li>
			<li class="title"><h2>3、其他说明</h2>
				<ul class="list">
				<li class="highlight_red">由于时间关系，例子直接采用 png 图片，如果需要解决 ie6 下 png 图片的透明问题，请针对 ie6 制作特殊的 gif 图片或者利用 css filter 解决</li>
				</ul>
			</li>
		</ul>
	</div>
</div>
</BODY>
</HTML>