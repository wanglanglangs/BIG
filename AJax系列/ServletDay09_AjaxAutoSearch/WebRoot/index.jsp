<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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
	<style type="text/css">
	  body{
	     font:11px arial;
	  }
	  .suggest_link{
	      background-color:#ffffff;
	      padding:2px 6px 2px 6px;
	  }
	.suggest_link_over{
	      background-color:#E8F2FE;
	      padding:2px 6px 2px 6px;
	}
	#suggest{
	position:absolute;
	background-color:#ffffff;
	text-align:left;
	border:1px solid #000000;
	display:none;
	}
	</style>
	<script language="javascript">
	var xmlhttp;//声明浏览器初始化对象变量
	function searchSuggest() {
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
		var str = document.getElementById("txtSearch").value;
		xmlhttp.open("Get","SearchSuggestServlet?search="+str,true);
		xmlhttp.setRequestHeader("Content-type","application/x-www-form-urlencoded");
		xmlhttp.setRequestHeader("Content-type","text/html;charset=utf-8");
		xmlhttp.send(null);
        
	}

	//回调函数
	function processReuqest() {
		if (xmlhttp.readyState == 4) {
			if (xmlhttp.status == 200) {
				var sobj = document.getElementById("suggest");
				sobj.innerHTML = "";
				var str = xmlhttp.responseText.split("-");
				var suggest = "";
				if (str.length > 0 && str[0].length > 0) {
					for (i = 0; i < str.length; i++) {
						suggest += "<div onmouseover='javascript:suggestOver(this);'";
						suggest += " onmouseout='javascript:suggestOut(this);'";
						suggest += " onclick='javascript:setSearch(this.innerHTML);'";
						suggest += " class='suggest_link'>" + str[i] + "</div>";
					}
					sobj.innerHTML = suggest;
					document.getElementById("suggest").style.display = "block";
				} else {
					document.getElementById("suggest").style.display = "none";
				}
			}
		}
	}

	//鼠标进入搜索框时的显示风格
	function suggestOver(obj) {
		obj.className = "suggest_link_over";
	}

	//鼠标离开搜索框时的显示风格
	function suggestOut(obj) {
		obj.className = "suggest_link";
	}
</script>
</head>

<body>
	<h1>Ajax实现搜索提示</h1>
	<div style="width:500px">
		<form action="" id="formSearch">
			<input type="text" id="txtSearch" name="txtSearch"
				onkeyup="searchSuggest()" autocomplete="off" /> <input
				type="submit" id="cmdSearch" name="cmdSearch" value="搜索" /> </br>
			<div id="suggest" style="width:200px"></div>
		</form>
	</div>
</body>
</html>
	