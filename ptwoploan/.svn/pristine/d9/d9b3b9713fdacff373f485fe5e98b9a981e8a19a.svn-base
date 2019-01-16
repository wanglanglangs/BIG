<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="com.chinasoft.entity.Invest" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'myinvest.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<style type="text/css">
		table {
			width: 800px;
			height: 80px;
		}
		.ptable{
			margin: 0px auto;
			width:600px;
			border: 1px solid #9A9A9A;
			background-color: #F0F8FF;
		}
		.ptable tr{
			line-height: 30px;
			
		}
		.ptable tr th{
			background-color: #DCDCDC;
		}
		.ptable tr td{
		height:30px;
			text-align: center;
		}
</style>
</head>
<body>
	<jsp:include page="/client/head.jsp"></jsp:include>
	<strong class="conT"><a href="/ptwoploan/myaccount">个人信息</a> | <a href="/ptwoploan/myloan">我的借款</a> | <a href="/ptwoploan/myinvest">我的投资</a> | <a href="/ptwoploan/recharge">充值</a></strong>
	<br>
	<br>
	<table class="ptable" cellspacing="0px" rules="rows">
		<tr>
			<th>项目名</th>
			<th>投资金额</th>
			<th>总收益</th>
			<th>开始日期</th>
			<th>结束日期</th>
			<th>利率</th>
		</tr>
		<c:forEach items="${requestScope.myinvest}" var="invest">
		<tr style="text-align: center">
			<td><a href="myproject?id=${invest.titem}">${invest.titem }</a></td>
			<td>${invest.tmoney }</td>
			<td>${invest.ttotla }</td>
			<td>${invest.tstart }</td>
			<td>${invest.tend }</td>
			<td>${invest.trate }</td>
		</tr>
		</c:forEach>
		<tr>
    		<td colspan="6">
    			<c:if test="${page==1}">
    				<a>首页</a>
    				<a>上一页</a>
    			</c:if>
    			<c:if test="${page!=1}">
    				<a href="myinvest?page=1">首页</a>
    				<a href="myinvest?page=${requestScope.page-1}">上一页</a>
    			</c:if>
    			<c:forEach var="everyPage" begin="1" end="${requestScope.pageCount}">
    				<a href="myinvest?page=${everyPage}">${everyPage}</a>
    			</c:forEach>
    			<c:if test="${page==pageCount}">
    				<a>下一页</a>
    				<a>尾页</a>
    			</c:if>
    			<c:if test="${page!=pageCount}">
    				<a href="myinvest?page=${page+1}">下一页</a>
    				<a href="myinvest?page=${pageCount}">尾页</a>
    			</c:if>
    		</td>
    		
    	</tr>
	</table>
	<br>
	<jsp:include page="/client/foot.jsp"></jsp:include>
</body>
</html>