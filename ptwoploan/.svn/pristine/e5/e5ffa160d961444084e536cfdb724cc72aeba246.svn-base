<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@page import="com.chinasoft.dao.impl.ProjectImpl,com.chinasoft.entity.Project"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  <style>
  table{
				width: 900px;
				height: 80px;
			}
			#p1{
        		width: 900px;
   	            height: 1300px;
			   	margin: 0 auto;
			   	background-color: azure;
        	}
        	#t1{
        	width:800px;
        	text-align: center;
        	margin-left: 50px;
        	}
        	table tr td{
        		height: 50px;
        	}
        	#t2{
        		color: blue;
        		background-color: coral;
        	}  
        		table tr td a{
        		display: inline-block;
				  padding: 5px 15px;
				  color: #555;
				  font-size: 14px;
				  border-radius: 5px;
				  margin-left: 20px;
				  text-decoration: none;
				  cursor: pointer;
        	}
        	.a1 {
			  background-color: #14b2e2;
			  color: #fff;
               }	
                #d2{
               width: 100%;
   	            height: 1100px;
			   	margin: 0 auto;
     	background-image: url(img/body.jpg);
     	background-repeat: no-repeat;
			   	background-size: 100% 100%; 
 }
        	
		</style>
	</head>
	    
	<body bgcolor="aliceblue">
	<jsp:include page="head.jsp"></jsp:include>
	    <div id="d2">
		<div id ="p1">
		<div style="background-color: #FFD859;">
        <input type="button" value="< 返回"  onclick="javascript:history.back();"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="#">我要投资</a>><a href="/ptwoploan/ShowAll">投资列表</a>
        <h1 style="text-align: center;"><a>投资列表</a></h1>
       <font color="red" size="5"><b>投资方式</b></font>：<font color="red"><b>定期投资</b></font><br><br>
               <form action="ShowAll" method="post">
        <font color="red" size="5"><b>投资时长</b></font>：<select  name="time">
        	  <option value="all">全部</option>
        	  <option value="1">1个月</option>
        	  <option value="3">3个月</option>
        	  <option value="6">6个月</option>
        	  <option value="12">1年</option>
        	  <option value="other">其他</option>
            </select> 
            <input type="submit" >
            </form>
            <br>
              <img src="img/projects/laba1.jpg" width="50px" height="20px"/>
              <font color="#FF4500">温馨提示：项目预计发布时间 10:30、 15:30， 其它时间随机发布</font>
              <hr>
        </div>
      
    <table id="t1" rules="rows">
		<tr id="t2">
			<th >ID</th>
			<th>项目名</th>
			<th>年化利率</th>
			<th>投资金额</th>
			<th>投资时长(个月)</th>
			<th>操作</th>
		</tr>
		<c:forEach items="${list }" var="pro">
		<tr>
		<td>${pro.id }</td>
		<td>${pro.name }</td>
		<td>${pro.rate }</td>
		<td>${pro.money }</td>
		<td>${pro.time }</td>
		<td><a href="/ptwoploan/money?pro=${pro.id}" class="a1" >查看详情</a></td>
		</tr>
		</c:forEach>
	   </table>
        </div>
        </div>
        <jsp:include page="foot.jsp"></jsp:include>
	</body>
</html>
