<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'InvestSuccess.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<style type="text/css">

		#d1{
		width:800px;
		higth:400px;
		margin: 0 auto;
		text-align:center;
		}
		 #a1{
        		display: inline-block;
				  padding: 5px 15px;
				  color: #555;
				  font-size: 14px;
				  border-radius: 5px;
				  margin-left: 20px;
				  text-decoration: none;
				  cursor: pointer;
				   background-color: orange;
			       color: #fff;
        	}
        	#d2{
               width: 100%;
   	            height: 400px;
			   	margin: 0 auto;
     	background-image: url(img/body.jpg);
     	background-repeat: no-repeat;
			   	background-size: 100% 100%; 
 }
</style>
  </head>
  
  <body>
  	<jsp:include page="head.jsp"></jsp:include>
  	<div id="d2">
   <div id="d1">
   <!-- <img  src="img/success.jpg" width="800px" height="150px"> -->
   <br><br><br><br><br><br><br><br>
   <h1 style="text-align: center; color:red;">投资成功！感谢您选择我们！</h1>
   <a id="a1" href="/ptwoploan/ShowAll" >返回投资界面</a>
   </div>
   </div>
    <jsp:include page="foot.jsp"></jsp:include>
  </body>
</html>
