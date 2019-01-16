<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@page import="com.chinasoft.dao.impl.MoneyImpl,com.chinasoft.entity.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'infor.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<style type="text/css">
	table{
				width: 900px;
				height: 80px;
			}
			#p1{
        		width: 900px;
   	            height: 1400px;
			   	margin:auto;
			   	 background-color: azure; 
        	}
        	#t1{
        		width: 900px;
        	}
        	table th{
        		
        		color: orangered;
        	}
        	#a2{
        		display: inline-block;
				  padding: 5px 15px;
				  color: #555;
				  font-size: 14px;
				  border-radius: 5px;
				  margin-left: 20px;
				  text-decoration: none;
				  cursor: pointer;
				   background-color: #14b2e2;
			       color: #fff;
        	}
        	 #d2{
               width: 100%;
   	            height: 1400px;
			   	margin: 0 auto;
     	background-image: url(img/body.jpg);
     	background-repeat: no-repeat;
			   	background-size: 100% 100%; 
 }
		</style>
		<script type="text/javascript">
		/* function tz(){
			var bal=parseInt(${balance});
			var money=parseInt(${p.money});
			if(bal<money)
				{
				alert("余额不足！请充值后再进行操作！");
				}
		} */
		</script>
	</head>
	<body>
	<jsp:include page="head.jsp"></jsp:include>
	<div id="d2">
		<div id="p1">
		<a href="ShowAll"><input type="button" value="返回" /></a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="#">我要投资</a>><a href="ShowAll">投资列表</a>><a href="infor.jsp">项目详情</a><br /><br />
		<table  id="t1" cellpadding="10px" >
			<tr>
				<th colspan="6">教育投资DIB201901020004</th>
			
			</tr>
			<tr>
				<td>借款总额(万元)</td>
				<td>历史年化收益率</td>
				<td>期限（个月）</td>
				<td>我的余额</td>
				<td>${balance}</td>
				<td></td>	
			</tr>
			<tr>
				<td>${p.money} </td>
				<td>${p.rate}</td>
				<td>${p.time}</td>
				<td>项目可投</td>
				<td colspan="2">${p.money}</td>	
			</tr>
			<tr>
				<td colspan="3">还款方式：一次性还款</td>
				<td>历史收益</td>
				<td colspan="2"></td>	
			</tr>
			<tr>
				<td colspan="3">投标起止时间：2019-01-02 17:59:36 至 2019-01-09 17:59:36</td>
				<td colspan="3"><a href="/ptwoploan/InvestOrUserInforServlet" id="a2">立即投资</a></td>
			</tr>
		</table >
		<font style=" color: red; " ><b>XX金融平台提醒：投资有风险，参与需谨慎。</b></font>
		<hr />
		<table cellpadding="30px" rules="rows">
			<tr>
				<td colspan="2" style="text-align: center;"><h2>投资项目详情</h2></td>
			</tr>
			<tr>
				<td><img src="img/projects/p1.png"></td>
				<td>此项目为企业过桥借款 ，借款公司为深圳市某教育公司，公司成立于2013年，为自然人投资或控股有限公司，注册资金1000万人民币，公司经营范围:教师培养;教育咨询；信息咨询(不含人才中介服务、证券及限制项目);国内贸易,从事货物及技术的进出口业务(法律、行政法规、国务院决定规定在登记前须经批准的项目除外)。经公司风控核实因公司发展需要融资支持，融资金额为人民币贰仟贰佰陆拾万元整，共计23期，第21期为100万元。</td>
			</tr>
			<tr>
				<td><img src="img/projects/p5.png"></td>
				<td>企业成立时间：2013-11-11<br><br />
				       注册资金：1000.00 万元<br /><br />
				    资产净值：5000.00 万元<br /><br />
				    行业：教育投资<br /><br />
				   经营项目：计算机软硬件及网络产品的技术开发<br /><br />
				   经营范围：<br>
				   计算机软硬件及网络产品的技术开发与销售;信息咨询(不含人才中介服务、证券及限制项目);国内贸易,从事货物及技术的进出口业务(法律、行政法规、国务院决定规定在登记前须经批准的项目除外)。<br /><br />
				   涉诉情况：<br />
				   该项目借款企业经专业的风控人员上门考察，企业和借款人无司法纠纷，综合信用良好，企业运营正常，回款有保障，项目风险较低，融资人发生违约事项的可能性较小，予以通过。<br />
				</td>
			</tr>
			<tr>
				<td><img src="img/projects/p3.png"></td>
				<td><img src="img/projects/hehuitouzi.jpg"><br />
				    深圳和汇投资管理有限公司
				</td>
			</tr>
			<tr>
				<td><img src="img/projects/p4.png"/></td>
				<td></td>
			</tr>
		</table>
		</div>
		</div>
		<jsp:include page="foot.jsp"></jsp:include>
	</body>
</html>
