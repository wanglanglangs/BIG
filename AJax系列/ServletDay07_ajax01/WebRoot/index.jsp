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
		<script type="text/javascript" src="js/jquery-1.11.0.js" charset="utf-8"></script>
		<script type="text/javascript">
		   //var  xmlHttpRequest;
		   function validatePhoneNum()
		   {
			   var pNum = document.getElementById("phoneId").value;
			   //调用ajax
			   //1.创建核心对象XMLH	ttpRequest
			   xmlHttpRequest  = new XMLHttpRequest();
			   //2.指定回调函数（用来处理服务器返回的数据）
			   xmlHttpRequest.onreadystatechange =  callBack;
			   //3.准备发送请求
			   xmlHttpRequest.open("post", "ValidateNumberServlet", true);
			   //4.设置请求头 application/x-www-form-urlencoded
			   xmlHttpRequest.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
			   //5.发送请求
			   var data = "pNum="+pNum;
			   xmlHttpRequest.send(data);
		   }
		
		function callBack()
		{
			if(xmlHttpRequest.readyState == 4 && xmlHttpRequest.status == 200 )
				{
				   var result = xmlHttpRequest.responseText;
				   if(result =="true")
				   {
				     $("#ajax_error_id").css("display","inline");
				     $("#ajax_ok_id").css("display","none");
					   
				   }else
				   {
					   $("#ajax_error_id").css("display","none");
					     $("#ajax_ok_id").css("display","inline");
				   }
				}
		}
		
		function validatePhoneNum_JAjax()
		{
			var pNum = $("#phoneIdAjax").val();
			$.ajax({
				url:"ValidateNumberServlet",
				data:"pNum="+pNum,
				type:"get",
				dataType:"text",
				success:function(result){
					if(result =="true")
						{
						alert("此号码已被绑定，请更换.....");
						}
					else
						{
						alert("此号码可以使用，用户绑定成功.....");
						}
				},
				error:function(){
					alert("ajax请求失败");
				}
			});
		}
		
		function validatePhoneNum_get()
		{
			var pNum = $("#phoneIdGet").val();
			$.get(
			    "ValidateNumberServlet"	,
			    "pNum="+pNum,
			    function(result){
			    	if(result =="true")
					{
					alert("此号码已被绑定，请更换.....");
					}
				else
					{
					alert("此号码可以使用，用户绑定成功.....");
					}
			    },
			    "text"
			);
		}
		
		function validatePhoneNum_post()
		{
			var pNum = $("#phoneIdPost").val();
			$.post(
			    "ValidateNumberServlet"	,
			    "pNum="+pNum,
			  
			    function(result){
			    	if(result =="true")
					{
					alert("此号码已被绑定，请更换.....");
					}
				else
					{
					alert("此号码可以使用，用户绑定成功.....");
					}
			    },
			    "text"
			);
			
		}
		
		function validatePhoneNum_load()
		{
			var pNum = $("#phoneIdLoad").val();
			$("#ajax_ok_error_id").load(
			    "ValidatePhoneLoadServlet",
			    "pNum="+pNum
			);
		}
		
		function validatePhoneNum_Json()
		{
			var jText  = $("#jsonTest").val();
			$.ajax({
				url:"ValidatePhoneJsonServlet",
				data:{"jText":jText},
				dataType:"json",
				success:function(result){
					var s = eval(result.stu1);
					document.getElementById("div1").innerHTML=s.name;
					alert(s.name+","+s.age);
				},
				error:function(){
					alert("ajax请求失败");
				}
			});
		}
		</script>
  </head>
  
  <body>
    <h1>传统方式的ajax</h1>
    请输入要绑定的电话号码
     <input type="text" id="phoneId" onblur="validatePhoneNum()">
     <font id="ajax_ok_id" style="display:none" color="red">号码可用，成功绑定！！！</font>
     <font id="ajax_error_id" style="display:none" color="green">号码已绑定，请重新更换！！！</font>
    <br>
    JQUERY_AJAX:<Br>
      请输入要绑定的电话号码:   <input type="text" id="phoneIdAjax" onblur="validatePhoneNum_JAjax()"><br>
  JQUERY_get:<Br>
      请输入要绑定的电话号码:   <input type="text" id="phoneIdGet" onblur="validatePhoneNum_get()"><br>
JQUERY_post:<Br>
      请输入要绑定的电话号码:   <input type="text" id="phoneIdPost" onblur="validatePhoneNum_post()"><br>
  JQUERY_load:<Br>
      请输入要绑定的电话号码:   <input type="text" id="phoneIdLoad" onblur="validatePhoneNum_load()">
         <font id="ajax_ok_error_id"></font>
      <br>
        测试返回JSON:<Br>
      <input type="text" id="jsonTest" onblur="validatePhoneNum_Json()">
      <div id="div1"></div>
  </body>
</html>
