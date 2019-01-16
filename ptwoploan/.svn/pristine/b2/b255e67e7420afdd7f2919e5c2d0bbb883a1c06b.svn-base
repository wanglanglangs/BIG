<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'repayment.jsp' starting page</title>
    
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
		<script type="text/javascript">
			function checkDate(){
				var money = document.getElementById("money").value;
				var myreg = /^[0-9]+(.[0-9]{2})?$/;
				if(!myreg.test(money)){
					alert("请输入正确的金额!");
					return false;
				}else{
					if(money>${blance}){
						alert("您的账户余额不足,请先充值");
						return false;
					}
				}
				return confirm("您确认要还款吗？");
			}
		
		</script>
  </head>
  
  <body>
    <jsp:include page="/client/head.jsp"></jsp:include>
	<strong class="conT"><a href="/ptwoploan/myaccount">个人信息</a> | <a href="/ptwoploan/myloan">我的借款</a> | <a href="/ptwoploan/myinvest">我的投资</a></strong>
	<br>
	<br>
	<form action="updatetotal?id=${loan.b_contractid}&totalmoney=${loan.b_totalmoney }&balance=${blance}&" method="post" name="form" onsubmit="return checkDate()">
		<table class="ptable" cellspacing="0px" rules="rows">
			<tr>
				<th>借款号</th>
				<td>${loan.b_contractid}</td>
			</tr>
			<tr>
				<th>借款金额</th>
				<td>${loan.b_money }</td>
			</tr>
			<tr>
				<th>需归还金额</th>
				<td>${loan.b_totalmoney }</td>
			</tr>
			<tr>
				<th>利率</th>
				<td>${loan.b_rate }</td>
			</tr>
			<tr>
				<th>起始时间</th>
				<td>${loan.b_starttime }</td>
			</tr>
			<tr>
				<th>结束时间</th>
				<td>${loan.b_endtime }</td>
			</tr>
			<tr>
				<th>借款类型</th>
				<td>${loan.b_type }</td>
			</tr>
			<tr>
				<th>账户余额(¥)</th>
				<td>${blance}</td>
			</tr>
			<tr>
				<th>请输入还款金额</th>
				<td><input type="text" id="money" name="money"></td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="确认还款"/>
					<input type="reset" value="重新填写">
					<input type="button" value="返回" onclick="javascript:history.back();" />
				</td>
			</tr>
		</table>
	</form>
	<br>
	<jsp:include page="/client/foot.jsp"></jsp:include>
  </body>
</html>
