<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 



    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
	<style type="text/css">
	select,input{
		width:200px;
		margin-top: 15px;
		
	}
	#div0{
	width: 1000px;
	height: 520px;
	background-color: gray;
	margin: auto;
	padding-top: 50px;
	background-image: url("../img/timg5.jpg");
	background-repeat: no-repeat;
		background-size: cover;
	
	
	/* text-align: center; */
	}
	#form1{
		margin-left: 100px;
	}
	#span1{
		font-size: xx-large;
		padding-top: 100px;
		margin-left: 100px;
		font-family: 楷体;
	}
	</style>
	<script type="text/javascript">
		
	
		function totmoney() {
			 var sum = document.getElementById("sum").value;
			 var starttime = document.getElementById("b_start").value;
			var endtime = document.getElementById("b_end").value;
			
				if( sum == null || sum =="") 
			  { 
			     summsg.innerHTML="<font color ='red'>借款金额不能为空</font>";
			    
			  } else
			  { if(starttime == null || starttime =="" && endtime == null || endtime =="")
				  {	
				  	summsg.innerHTML ="";
				  	repayment.value =sum;
				  }else{
				  	summsg.innerhtml ="";
				  }
			  }
			//calm();
		}
		
		function startt() {
			var starttime = document.getElementById("b_start").value;
			var endtime = document.getElementById("b_end").value;
			var nowdate = new Date();
			var start1 = new Date(starttime);
			var interval = start1.getTime()-nowdate.getTime();
			//var rate = document.getElementById("rate").value ;
			
			if( starttime == null || starttime =="")
				{
					startmsg.innerHTML="<font color ='red'>起始时间日期不能为空</font>";
				}else
					{	
						if(interval<0)
						{
							startmsg.innerHTML="<font color ='red'>起始时间不合法</font>";
						}else
						{
							startmsg.innerHTML="";
						}
						
					}
			if(endtime != null && endtime !="")
			{
				
				calm();
			}
			
		}
		
		function endt() {
			
			var starttime = document.getElementById("b_start").value;
			var endtime = document.getElementById("b_end").value;
			var start1 = new Date(starttime);
			var end1 = new Date(endtime);
			var days = end1.getTime()-start1.getTime();
			
			if( endtime == null || endtime =="")
				{
					endmsg.innerHTML="<font color ='red'>截止日期不能为空</font>";
				}else
					{
						if(days<0)
						{
							endmsg.innerHTML="<font color ='red'>截止日期不合法</font>";
						}else
						{
							endmsg.innerHTML="";
						}
					}
			if(starttime != null && starttime !="")
			{
				calm();
			}
			
			 
			
		}
		
		function ratechange() {
				calm();
		}
		
		function calm() {
			var sum = document.getElementById("sum").value;
			var rate = document.getElementById("rate").value ;
			var starttime = document.getElementById("b_start").value;
			var endtime = document.getElementById("b_end").value;
			var start1 = new Date(starttime);
			var end1 = new Date(endtime);
			var days = end1.getTime()-start1.getTime();
			var day = parseInt(days / (1000 * 60 * 60 * 24));
			repayment.value =eval(sum )+ eval(sum*rate)*(day+1);
			
		}
		
		 function updateloanInfor() {
			 var flag = 1;
			
				var sum = document.getElementById("sum").value;
				var starttime = document.getElementById("b_start").value;
				var endtime = document.getElementById("b_end").value;
				var startmsgss = document.getElementById("startmsg").innerHTML;
				var endmsgee = document.getElementById("endmsg").innerHTML;
			 if(sum == null || sum =="")
	    		   {
	    		   		flag = 0;
	    		   		summsg.innerHTML="<font color ='red'>借款金额不能为空</font>";
	    		   
	    		   }
	    	 if(starttime == null || starttime=="")
				   {
		    		   flag = 0;
		    		   startmsg.innerHTML="<font color ='red'>起始日期不能为空</font>";
				       
				   }
			 if(endtime == null || endtime=="")
				   {
		    		   flag = 0;
		    		   endmsg.innerHTML="<font color ='red'>截止日期不能为空</font>";
				       
				   }
			if(endmsgee != null && endmsgee!="")
				   {
				   
		    		   flag = 0;
		    		    
				   }
			if(startmsgss != null && startmsgss!="")
				   {
				  
		    		   flag = 0;
		    		}
			if(flag ==1)
	    		   {
	    		   alert("申请成功，等候管理员审批！");
	    		   form1.action="/ptwoploan/UpDateLoanServlet";
	    		     form1.submit();
	    		   }
			
			} 
	</script>
</head>
<body>
	<jsp:include page="/client/head.jsp"></jsp:include>
	<div id = "div0">
	<span id= "span1">申请借款中心</span>
	<form action=""  id = "form1" method="post">
	借款金额：<input type="number" min = 0 id = "sum" name = "summoney" onblur="totmoney()"><span id="summsg"></span><br>
	借款类型：<select id = "type" name = "typeselect">
		<option>教育</option>
		<option>房产</option>
		<option>企业融资</option>
	</select><br>
	起始时间：<input type="date" id = "b_start" name = "start" onchange="startt()"><span id="startmsg"></span><br>
	结束时间：<input type="date"  id = "b_end" name = "end" onchange="endt()"><span id="endmsg"></span><br>
	
	利&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;率：<select  id = "rate" name = "rateselect" onchange="ratechange()">
		<option value = "0.0010">0.0010</option>
		<option value = "0.0015">0.0015</option>
		<option value = "0.0020">0.0020</option>
		
	</select><br>
	还款金额：<input type="text" readonly = "readonly" value =  "" id = "repayment" name = "repayment"><br>
	<input type="hidden" value="0" name ="status">
	<input type="button" value ="保存" style="width: 50px" onclick="updateloanInfor()">
	<a href="/ptwoploan/client/main.jsp">&gt;&gt;返回首页</a>
	</form>
	</div>
	<jsp:include page="/client/foot.jsp"></jsp:include>
</body>
</html>