<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'myaccount.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript">
	//验证真实姓名
	function isName(name){
		var myreg =  /^(([a-zA-Z+\.?\·?a-zA-Z+]{2,30}$)|([\u4e00-\u9fa5+\·?\u4e00-\u9fa5+]{2,30}$))/;
		if(!myreg.test(name)){
			document.getElementById("name1").innerHTML="*请输入您的真实姓名!";
			return false;
		}else{
			document.getElementById("name1").innerHTML="";
		}
	}
	//验证手机号码正确性
	function isPhone(tel){
		// 手机号以1开头第二位是3,4,5,7,8,9,后面是9位数字
		var myreg = /^[1][3,4,5,7,8,9][0-9]{9}$/;
		if(!myreg.test(tel)){
			document.getElementById("tel1").innerHTML="*你输入的手机号码不正确!";
			return false;
		}else{
			document.getElementById("tel1").innerHTML="";
		}
	}
	//验证身份证号码
	function isCardNo(card)  
	{  
	   // 身份证号码为15位或者18位，15位时全为数字，18位前17位为数字，最后一位是校验位，可能为数字或字符X  
	   var myreg = /(^\d{15}$)|(^\d{18}$)|(^\d{17}(\d|X|x)$)/;  
	   if(!myreg.test(card))  
	   {  
		   document.getElementById("idcart1").innerHTML= "*您输入的身份证号码不正确!";
	       return  false;  
	   }else{
			document.getElementById("idcart1").innerHTML="";
		}
	}  
	//提交时验证页面有没有警告信息
	function checkDate(){
		var name= document.getElementById("name").value;
		var tel= document.getElementById("tel").value;
		var idcart= document.getElementById("idcart").value;
		
		var name1= document.getElementById("name1").innerHTML;
		var tel1= document.getElementById("tel1").innerHTML;
		var idcart1= document.getElementById("idcart1").innerHTML;
		if(name1!="" || tel1!="" || idcart1!=""){
			alert("您输入的信息有误或必填项未填写,请检查后再确认修改");
			return false;
		}else{
			return confirm("您确认要提交修改吗？");
		}
		
		/* if(name=="" || tel=="" || idcart==""){
			alert("您还有必填项未填写,请检查后再确认修改");
			return false;
		} */
		return true;
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
			text-align: left;
			padding-left: 20px
		}
		span{
			font-size: 10px;
			color: red;
		
		}
		
</style>
</head>
	<body>
		<jsp:include page="/client/head.jsp"></jsp:include>
		<strong class="conT">修改资料</strong>
		<form action="updatemyinfo" method="post" name="form" onsubmit="return checkDate()">
			<table class="ptable" cellspacing="0px" rules="rows">
				<tr>
					<td width="130px" style="text-align: center;">账户</td>
					<td>${useraccount}</td>
				</tr>
				<tr>
					<td style="text-align: center;">真实姓名</td>
					<td><input type="text" name="name" id="name" onblur="isName(this.value)"><span id="name1">*</span></td>
				</tr>
				<tr>
					<td style="text-align: center;">手机号码</td>
					<td><input type="text" name="tel" id="tel" onblur="isPhone(this.value);"><span id="tel1">*</span></td>
				</tr>
				<tr>
					<td style="text-align: center;">联系地址</td>
					<td><input type="text" name="address"></td>
				</tr>
				<tr>
					<td style="text-align: center;">身份证号</td>
					<td><input type="text" name="idcart" id="idcart" onblur="isCardNo(this.value);"><span id="idcart1">*</span></td>
				</tr>
				<tr>
					<td style="text-align: center;">公司</td>
					<td><input type="text" name="company"></td>
				</tr>
				<tr>
					<td style="text-align: center;">工资</td>
					<td><input type="text" name="salary"></td>
				</tr>
				<tr>
					<td style="text-align: center;">详细信息</td>
					<td><textarea rows="5" cols="50" name="otherinfor"></textarea></td>
				</tr>
				<tr>
					<td colspan="2" style="text-align: center;">
						<input type="submit" value="确认修改"/>
						<input type="reset" value="重新填写">
						<input type="button" value="返回" onclick="javascript:history.back();" />
					</td>
				</tr>
			</table>
			</form>
		<jsp:include page="/client/foot.jsp"></jsp:include>
	</body>
</html>
