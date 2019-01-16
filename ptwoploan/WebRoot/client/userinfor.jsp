<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
	<style type="text/css">
	
	#span11{
		font-size: xx-large;
		
		margin-left: 100px;
		font-family: 楷体;
		
	}
	#div1{
		align:center;
		width: 1000px;
		height:550px;
		margin:0 auto;
		border: 1px solid gray;
		background-color:gray; 
		background-image: url("../img/loan.jpg");
		background-repeat: no-repeat;
		background-size: cover;
		font-family: 楷体;
		padding-top: 100px;
	}
	#form1{
		margin-left: 100px;
		margin-top: 50px;
	}
	</style>
	<script type="text/javascript" src="js/jquery-1.11.0.js" charset="utf-8"></script>
	<script type="text/javascript">
		function isCardNo() 
			{ 
			  // 身份证号码为15位或者18位，15位时全为数字，18位前17位为数字，最后一位是校验位，可能为数字或字符X 
			  var idcard = document.getElementById("l_idcard").value;
			  var reg = /(^[1-9]\d{17}$)/; 
			  if(idcard == null || idcard=="") 
			  { 
			     idcardmsg.innerHTML="<font color ='red'>身份证号不能为空</font>";
			    return false;
			  } 
			   else if(reg.test(idcard)==false) 
			  { 
			 	idcardmsg.innerHTML="<font color ='red'>身份证号不合法</font>"; 
			 	
			  
			  }else
				  {
				  		idcardmsg.innerHTML="";
				  }
			  
			  
			}
			
			 function salary() 
			{ 
			  var sal = /^\d+((\.?\d+)|(\d*))$/;
			  var salary = document.getElementById("l_salary").value;
			  if(salary == null || salary=="") 
			  { 
			     salarymsg.innerHTML="<font color ='red'>工资不能为空</font>";
			    return false;
			  } else if(sal.test(salary)==false) 
			  { 
			 	salarymsg.innerHTML="<font color ='red'>工资输入有误</font>"; 
			  } 
			   else
			  {
			  		salarymsg.innerHTML="";
			  }
			}
			function lname() 
			{ 
			  
			  var name = document.getElementById("l_name").value;
			 if(name == null || name =="")
    		   {
    		   		
    		   		namemsg.innerHTML="<font color ='red'>真实姓名不能为空</font>";
    		   
    		   }
			  else
			  {
			  		namemsg.innerHTML="";
			  }
			}
			function address() 
			{ 
			  
			  var address = document.getElementById("l_address").value; 
			  if(address == null || address=="") 
			  { 
			     addressmsg.innerHTML="<font color ='red'>家庭住址不能为空</font>";
			    
			  } 
			   else
			  {
			  		addressmsg.innerHTML="";
			  }
			}
			function company() 
			{ 
			  
			  var company = document.getElementById("l_company").value;
			  if(company == null || company=="") 
			  { 
			     companymsg.innerHTML="<font color ='red'>公司不能为空</font>" ;
			     
			  } 
			   else
			  {
			  		companymsg.innerHTML="";
			  }
			}
	
	 
		 function updateUserInfor() {
		 var flag = 1;
		var name = document.getElementById("l_name").value;
		var address = document.getElementById("l_address").value;
		var idcard = document.getElementById("l_idcard").value;
		var company = document.getElementById("l_company").value;
		var salary = document.getElementById("l_salary").value;
		//var otherinfor = Document.getElementById("l_otherinfor").value;
		var namemsg = document.getElementById("namemsg");
		var addressmsg = document.getElementById("addressmsg");
		var idcardmsg = document.getElementById("idcardmsg");
		var companymsg = document.getElementById("companymsg");
		var salarymsg = document.getElementById("salarymsg");
		 if(name == null || name =="")
    		   {
    		   		flag = 0;
    		   		namemsg.innerHTML="<font color ='red'>真实名不能为空</font>";
    		   
    		   }
    	 if(address == null || address=="")
			   {
	    		   flag = 0;
	    		   addressmsg.innerHTML="<font color ='red'>家庭住址不能为空</font>";
			       
			   }
		 if(idcard == null || idcard=="")
			   {
	    		   flag = 0;
	    		   idcardmsg.innerHTML="<font color ='red'>身份证号不能为空</font>";
			       
			   }
		 if(company == null || company=="")
			   {
			   		flag = 0;
	    		   companymsg.innerHTML="<font color ='red'>公司不能为空</font>";
			       
			   }
		 if(salary == null || salary=="")
			   {
			  		 flag = 0;
	    		   salarymsg.innerHTML="<font color ='red'>工资不能为空</font>";
			       
			   }
    	 if(flag ==1)
    		   {
    		     form1.action="/ptwoploan/UpdateUserInfor";
    		     form1.submit();
    		   }
		
		}  
	</script>
</head>
<body> 
	
	
	<div id = "div1" >
		<span id= "span11">个 人 信 息 中 心</span>
		<form action="" id ="form1" method="post">
		
		真实姓名：<input type = "text" id= "l_name" name= "l_name" onblur="lname()"><span id="namemsg"></span><br><br>
		家庭住址：<input type = "text" id= "l_address" name= "l_address" onblur="address()"><span id="addressmsg"></span><br><br>
		身份证号：<input type = "text" id= "l_idcard" name= "l_idcard" onblur="isCardNo()" placeholder = "请输入18位身份证号"><span id="idcardmsg"></span><br><br>
		公&nbsp;&nbsp;&nbsp;&nbsp;司：<input type = "text" id= "l_company" name= "l_company" onblur="company()"><span id="companymsg"></span><br><br>
		工&nbsp;&nbsp;&nbsp;&nbsp;资：<input type = "text" id= "l_salary" name= "l_salary" onblur="salary()"><span id="salarymsg" ></span><br><br>
		详细资料：<textarea rows="1" cols="14" id = "l_otherinfor" name = "l_otherinfor"></textarea><br><br>
		<input type="button" value="提交资料" onclick="updateUserInfor()"><br>
		</form>
	</div>
	<jsp:include page="/client/foot.jsp"></jsp:include>
</body>
</html>