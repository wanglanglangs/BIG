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
   	            height: 800px;
			   	margin: 0 auto;
			   	background-color: #FFFFFF;
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
        	
		</style>
	</head>
	    
	<body bgcolor="aliceblue">
		<div id ="p1">
		<div style="background-color: antiquewhite;">
        
        <h1 style="text-align: center; color: purple;" >投资项目列表</h1>
              <hr>
        </div>
      
    <table id="t1" rules="rows">
		<tr id="t2">
			<th >ID</th>
			<th>项目名</th>
			<th>年化利率</th>
			<th>投资金额(万元)</th>
			<th>投资时长(个月)</th>
			<th>操作</th>
		</tr>
		<c:forEach items="${list }" var="pro">
		<tr>
		<td>${pro.id }</td>
		<td>${pro.name }</td>
		<td>${pro.rate }</td>
		<td>${pro.money}</td>
		<td>${pro.time }</td>
		<td><a href="Show_Product_for_edit_Servlet?id=${pro.id}" class="a1" class="a1">修改</a>&nbsp;&nbsp;&nbsp;|<a href="DeleteProduct?id=${pro.id}" class="a1" class="a1">删除</a></td>
		</tr>
		</c:forEach>
	   </table>
	   <h3 style="color: green;">${message}</h3>
        </div>
	</body>
</html>
