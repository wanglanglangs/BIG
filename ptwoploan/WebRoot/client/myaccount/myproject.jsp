<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="com.chinasoft.entity.*" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'myproject.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<style type="text/css">
		.ptable{
			margin: 0px auto;
			width:600px;
			border: 1px solid #9A9A9A;
			background-color: #F0F8FF;
		}
		.ptable tr{
			line-height: 30px;
			
		}
		.ptable tr td{
			height:30px;
			text-align: center;
		}
	</style>

  </head>
  
  <body>
    <jsp:include page="/client/head.jsp"></jsp:include>
    <div class="pcenter">
    	<h3 align="center">项目信息</h3>
    	<table class="ptable" cellspacing="0px" rules="rows">
    		<tr>
    			<th>项目编号</th>
    			<td>${requestScope.pro.id}</td>
    		</tr>
    		<tr>
    			<th>项目名称</th>
    			<td>${requestScope.pro.name}</td>
    		</tr>
    		<tr>
    			<th>年化利率</th>
    			<td>${requestScope.pro.rate}</td>
    		</tr>
    		<tr>
    			<th>投资金额</th>
    			<td>${requestScope.pro.money} 万元</td>
    		</tr>
    		<tr>
    			<th>投资周期</th>
    			<td>${requestScope.pro.time} 个月</td>
    		</tr>
    		<tr>
    			<td colspan="2" align="center"><input type="button" value="返回" onclick="javascript:history.back();" /></td>
    		</tr>
    	</table>
    </div>
    <jsp:include page="/client/foot.jsp"></jsp:include>
  </body>
</html>
