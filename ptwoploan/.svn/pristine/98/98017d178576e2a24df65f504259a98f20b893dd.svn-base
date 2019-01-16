<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
	<style type="text/css">
	#div11{
	margin: auto;
		width:800px;
		height:600px;
		padding-top: 100px;
		padding-left:100px;
		background-image: url("../img/8210.jpg");
		background-repeat: no-repeat;
		background-size: cover;
	}
	
	</style>
	<script type="text/javascript">
		function RetrievePassword() {
			var flag = 1;
			var account = document.getElementById("l_account");
			var tel = document.getElementById("l_tel");
		
		
			 RetPass.action="/ptwoploan/RetrievePasswordServlet";
	    	 RetPass.submit();
		}
	
	</script>
</head>
<body>
	<div id= "div11">
		<span>找回密码</span>
		<form action="" method="post" id = "RetPass">
			账&nbsp;&nbsp;&nbsp;&nbsp;号：<input type="text" name = "l_account" value="${account}" placeholder = "请输入您的账号"><br>
			手机号：<input type="text" name = "l_tel" value="${tel}" placeholder = "请输入您的预留电话"><br>
			 原密码：  <span >${pass}</span><br>
			<input type="button" value = "确认提交" onclick="RetrievePassword()"><a href = "/ptwoploan/client/main.jsp">返回首页</a>
		</form>
	</div>
</body>
</html>