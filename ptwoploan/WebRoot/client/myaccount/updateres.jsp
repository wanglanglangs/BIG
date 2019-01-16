<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'updateres.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  <body>
  	<jsp:include page="/client/head.jsp"></jsp:include>
  	<c:if test="${message == 1}">
  		<br>
  		<br>
  		<h3 align="center">个人信息修改成功</h3>
  		<div align="center"><input type="button" value="返回个人信息" onclick="javascrtpt:window.location.href='/ptwoploan/myaccount'"></div>
  		<br>
  		<br>
  		<br>
  		<br>
  	</c:if>
  	<c:if test="${message == 0}">
  		<h3 align="center">个人信息修改失败</h3>
  		<div align="center"><input type="button" value="返回继续修改信息" onclick="javascript:history.back();"></div>
  	</c:if>
  	<c:if test="${message == 2}">
  		<br>
  		<br>
  		<h3 align="center">还款成功</h3>
  		<div align="center"><input type="button" value="返回个人信息" onclick="javascrtpt:window.location.href='/ptwoploan/myaccount'"></div>
  		<br>
  		<br>
  		<br>
  		<br>
  	</c:if>
  	<c:if test="${message == 3}">
  		<h3 align="center">还款失败</h3>
  		<div align="center"><input type="button" value="返回继续还款" onclick="javascript:history.back();"></div>
  	</c:if>
  	<c:if test="${message == 4}">
  		<br>
  		<br>
  		<h3 align="center">充值成功</h3>
  		<div align="center"><input type="button" value="返回个人信息" onclick="javascrtpt:window.location.href='/ptwoploan/myaccount'"></div>
  		<br>
  		<br>
  		<br>
  		<br>
  	</c:if>
  	<c:if test="${message == 5}">
  		<h3 align="center">充值失败</h3>
  		<div align="center"><input type="button" value="返回继续充值" onclick="javascript:history.back();"></div>
  	</c:if>
   	<jsp:include page="/client/foot.jsp"></jsp:include>
  </body>
</html>
