<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'recharge.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript">
			function checkDate(){
				var money = document.getElementById("chong").value;
				var myreg = /^[0-9]+(.[0-9]{2})?$/;
				if(!myreg.test(money)){
					alert("请输入正确的金额!");
					return false;
				}
				return confirm("您确认要充值吗？");
			}
		
		</script>
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
     <body>
  	<jsp:include page="/client/head.jsp"></jsp:include>
  	<strong class="conT"><a href="/ptwoploan/myaccount">个人信息</a> | <a href="/ptwoploan/myloan">我的借款</a> | <a href="/ptwoploan/myinvest">我的投资</a> | <a href="/ptwoploan/recharge">充值</a></strong>
		<form action="updatemymoney?yu=${requestScope.blance}" method="post" name="form" onsubmit="return checkDate()">
			<table class="ptable" cellspacing="0px" rules="rows">
				<tr>
					<td width="130px" style="text-align: center;">账户</td>
					<td>${useraccount}</td>
				</tr>
				<tr>
					<td style="text-align: center;">账户余额</td>
					<td>${requestScope.blance}</td>
				</tr>
				<tr>
					<td style="text-align: center;">充值金额</td>
					<td><input type="text" name="chong" id="chong"></td>
				</tr>
				
				
				<tr>
					<td colspan="2" style="text-align: center;">
						<input type="submit" value="确认充值"/>
						<input type="reset" value="重新填写">
						<input type="button" value="返回" onclick="javascript:history.back();" />
					</td>
				</tr>
			</table>
			</form>
   	<jsp:include page="/client/foot.jsp"></jsp:include>
  </body>
  </body>
</html>
