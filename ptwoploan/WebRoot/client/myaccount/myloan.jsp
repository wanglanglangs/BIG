<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="com.chinasoft.entity.Loan" %>
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
			margin-bottom: 10px;
		}
		.ptable{
			margin: 0px auto;
			width:800px;
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
			<th>借款号</th>
			<th>借款金额</th>
			<th>需归还金额</th>
			<th>利率</th>
			<th>起始时间</th>
			<th>结束时间</th>
			<th>借款类型</th>
			<th>借款状态</th>
			<th>是否还款</th>
		</tr>
		<c:forEach items="${requestScope.myloan}" var="loan">
		<tr style="text-align: center">
			<td>${loan.b_contractid}</td>
			<td>${loan.b_money }</td>
			<td>${loan.b_totalmoney }</td>
			<td>${loan.b_rate }</td>
			<td>${loan.b_starttime }</td>
			<td>${loan.b_endtime }</td>
			<td>${loan.b_type }</td>
			<td><!--0表示审核中,1表示审核通过  -->
				<c:if test="${loan.b_status==1 }">
					已通过审核
				</c:if>
				<c:if test="${loan.b_status==0 }">
					正在审核中
				</c:if>
				<c:if test="${loan.b_status==2 }">
					已还清
				</c:if>
			</td>
			<td>
				<c:if test="${loan.b_status==0}">
					<font color="">审核中</font>
				</c:if>
				<c:if test="${loan.b_status==1}">
					<a href="myrepayment?id=${loan.b_contractid}">立即还款</a>
				</c:if>
				<c:if test="${loan.b_status==2}">
					<font color="">已还清</font>
				</c:if>
			</td>
		</tr>
		</c:forEach>
		<tr>
    		<td colspan="9">
    			<c:if test="${page==1}">
    				<a>首页</a>
    				<a>上一页</a>
    			</c:if>
    			<c:if test="${page!=1}">
    				<a href="myloan?page=1">首页</a>
    				<a href="myloan?page=${requestScope.page-1}">上一页</a>
    			</c:if>
    			<c:forEach var="everyPage" begin="1" end="${requestScope.pageCount}">
    				<a href="myloan?page=${everyPage}">${everyPage}</a>
    			</c:forEach>
    			<c:if test="${page==pageCount}">
    				<a>下一页</a>
    				<a>尾页</a>
    			</c:if>
    			<c:if test="${page!=pageCount}">
    				<a href="myloan?page=${page+1}">下一页</a>
    				<a href="myloan?page=${pageCount}">尾页</a>
    			</c:if>
    		</td>
    	</tr>
	</table>
	<br>
	<jsp:include page="/client/foot.jsp"></jsp:include>
</body>
</html>