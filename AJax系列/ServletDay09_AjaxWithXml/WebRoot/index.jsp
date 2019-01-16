<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8" %>
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
	<script type="text/javascript">
	    var xmlhttp;//声明浏览器初始化对象变量
	    function getXmlData()
	    {
	        //创建xmlhttprequest对象;
			if (window.XMLHttpRequest) {
				xmlhttp = new XMLHttpRequest(); //IE 7以上版本，或者Firefox, Chrome, Opera, Safari
			} else {
				xmlhttp = new ActiveXObject("Microsoft.XMLHTTP"); //IE 6以下版本
			}
			//判断XMLHttpRequest对象是否成功创建
			if (!xmlhttp) {
				alert("不能创建XMLHttpRequest对象实例");
				return false;
			}
			//创建请求结果处理程序
			 
	        xmlhttp.onreadystatechange=processReuqest;
			xmlhttp.open("Get","servlet/GetXmlDataServlet",true);
			xmlhttp.setRequestHeader("Content-type","application/x-www-form-urlencoded");
			xmlhttp.setRequestHeader("Content-type","text/html;charset=utf-8");
			xmlhttp.send(null);
	    }
	    
	    //回调函数
		function processReuqest() {
			if (xmlhttp.readyState == 4) 
			{
				    if (xmlhttp.status == 200) 
				    {
					   var xml = xmlhttp.responseXML;
					   //alert(xml);
					   var users = xml.getElementsByTagName("user");
					   if(users.length>0)
					   {
				          clearTable(); //清空表格;
					      var tNode = document.getElementById("mytable");
		                  tNode.innerHTML +="<tr><th>用户编号</th><th>用户名</th><th>密码</th></tr>"
					      for(var i=0;i<users.length;i++)
					      {
					         var uid = users[i].getElementsByTagName("id")[0].firstChild.data;
					         var username = users[i].getElementsByTagName("username")[0].firstChild.data;
					         var password = users[i].getElementsByTagName("password")[0].firstChild.data;
					         
						     tNode.innerHTML +="<tr><td>"+uid+"</td><td>"+username+"</td><td>"+password+"</td></tr>"
					      }
					   }
					   else 
					   {
						  alert("没有数据");
					   }
					} 
					
			}
		}
		
		function clearTable()
		{
		   
		    var tNode = document.getElementById("mytable");
		    var childNodes =tNode.childNodes;
		    for(var i=childNodes.length-1;i>=0;i--)
		    {
		        //alert("开始清除表格");
		        tNode.removeChild(childNodes[i]);
		    }
		}
	    
	</script>
  </head>
  
  <body>
    <h1>Ajax获取xml数据</h1>
    <hr>
    <table width="400" border="1" id="mytable" cellpadding="0" cellspacing="0">
       <tr>
         <th>用户编号</th>
         <th>用户名</th>
         <th>密码</th>
       </tr>
       
    </table>
    
    <br>
    <br>
    <input type="button" onclick="getXmlData();" value="获取Xml数据"/><br>
  </body>
</html>
