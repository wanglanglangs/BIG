<%@page import="com.chinasoft.entity.Project"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.*"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'investmoney.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<script type="text/javascript">
function money(){
  var money = document.getElementById("mon").value;
  total.value=eval(money)+eval(${p.rate}*money*${p.time}/12);
}

function tz1() {
	var money = document.getElementById("mon").value;
	var balance=${balance};
	if(money=null || money==0 || money>balance)
		{
		  alert("余额不足或输入的金额有误，请重新输入或充值！");
		}else{
    		form1.action="/ptwoploan/AddInvestServlet";
    		form1.submit();
    	}
}
</script>
<style>
 #d1{
       width: 860px;
   	            height: 800px;
			   	margin: 0 auto;
			  /*  	background-color: azure;
			   	background-image: url(img/invest.jpg); 
			   	background-repeat: no-repeat;
			   	background-size: 100% 100%; */
 }
 #d2{
               width: 100%;
   	            height: 900px;
			   	margin: 0 auto;
     	background-image: url(img/body.jpg);
     	background-repeat: no-repeat;
			   	background-size: 100% 100%; 
 }
 
#ta{
       background-color: beige ; 
       text-align: center;
       font-family: "微软雅黑";
       font-weight: bold;
       
 }
 table tr td{
           width: 300px;
           height: 50px; 	
           margin-top:200px; 
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
</style>

  </head>
  
  <body>
  <jsp:include page="head.jsp"></jsp:include>
  <div id="d2">
  <div id="d1">
  <br> <br> <br>
 <h1 style="text-align: center; color:red;">投资详情</h1>
 <form action="" method="post" id="form1" name="form1">
  <table align="center"  bgcolor="orange" id="ta" rules="rows">
   <tr>
  <td >投资账号：</td>
  <td >${useraccount}</td>
  </tr>
   <tr>
  <td >账户余额：</td>
  <td id="bal">${balance} <a href="/ptwoploan/recharge" id="a2">充值</a></td>
  </tr>
  <tr>
  <td>项目编号：</td>
  <td >${p.id}</td>
  </tr>
  <tr>
  <td > 项目名称：</td>
  <td > ${p.name}</td>
  </tr>
 <tr>
  <td> 投资金额：</td>
  <td > <input type="text" id="mon" name="mon" onchange="money()"></td>
  </tr>
   <tr>
  <td> 投资年化利率：</td>
  <td >   ${p.rate }</td>
  </tr>
  <%
		Date d = new Date();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String now = df.format(d);
		Project p =(Project) request.getSession().getAttribute("p");
		int t = Integer.parseInt(p.getTime());
	%>
	  <tr>
  <td> 投资起始时间：</td>
  <td >  <%=now %></td>
  </tr>
   <%d.setMonth(d.getMonth()+t); %>
  <tr>
  <td>  投资结束时间：</td>
  <td >  <%=df.format(d) %></td>
  
  </tr>
   <tr>
  <td>  到期后预计收益：</td>
  <td >   <input type="text" value="" id="total" name="total"></td>
  </tr>
  <tr><td colspan="2"><input type="button" onclick="tz1()" value="投资"></td></tr>
  </table>
  </form>
  </div>
  </div>
  <jsp:include page="foot.jsp"></jsp:include>
  </body>
</html>
