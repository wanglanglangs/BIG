<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>



  <head>
  
  <style>
  span {
     color: blue; 
	 font-family: '楷体';
	 font-size: 20px
	
}
 body{
 background-color: beige;
   
	}

	.tdr{
	
	background-color: #D5D5D5;
	
	}
			

</style>
  <script type="text/javascript" src="/ptwoploan/js/jquery-1.11.0.js"></script>
  <script type="text/javascript">
  
  
  
  	//查询所有的信息
     function queryAll(url) {
    	 //AJAX查询所有的信息
    	 $.ajax({
    		 type:"post",
    		 url:url,
    		 datatype:"json",
    		 asyns:false,
    		 success:function(data){
    			 var dataJS = JSON.parse(data);
    			 var html="";
    			 for (var i = 0; i < dataJS.length; i++) {
    				 html+="<tr id="+i+">";
    				 $.each(dataJS[i],function(k,infor){
    					 html+="<td>"+infor+"</td>";
    					 if (k=="tid") {
    					html+="<td>&nbsp; &nbsp;<a href='javascript:void(0)' onclick= deleteInfor('/ptwoploan/DeleteInvestServlet?id=" +infor+"')>删除</a>&nbsp; &nbsp;|&nbsp; &nbsp;<a href='javascript:void(0)'>编辑</a>&nbsp; &nbsp;</td>";
						}
    				 });
    				 
    				 html+="</tr>";
				}
    			 $("#tr1").after(function(){
    				 return html;
    			 });
    		 }
    	 });
	}
  function deleteInfor(url) {
	 
	 
	  $.ajax({
		 type:"post",
 		 url:url,
 		 asyns:false,
 		 success:function(data){
 		 }
		  
	  });
	
	  queryAll("/ptwoploan/QueryAllInvestServlet"); 
}
  
  
  
  
  
  function selectPageSize(page){
	  
	 var pa= page.value;
	 
	 document.getElementById("pageSize").value=pa;
	  
	 form1.action="/ptwoploan/QueryAllInvestServlet";
	
	 form1.submit();
	  
	  
  }
  
  
  </script>
   
       
  </head>
  
  <body >
  
        <div align="center" >
         <h1>资&nbsp;&nbsp;金&nbsp;&nbsp;信&nbsp;&nbsp;息</h1><br><br><br>
             <div  id="div2" >
             <form  action="/ptwoploan/QueryAllInvestServlet"  method="post"  id="form1" >
             <input type="hidden" value="${pageSize}" name="pageSize" id="pageSize">
             <table border="1px" cellpadding="0px" cellspacing="0px" id="table1">
             <tr id="tr1">
               <th>  投资总金额&nbsp; &nbsp;</th>
               <th>  借款总金额&nbsp;&nbsp; </th>
             </tr>
               <tr class=${vs.index%2==0?'tdr':''}>
                 <td>${allLoan}</td>
                 <td>${allinvester}</td>
               </tr>
             </table>
            </form>
             </div>
        </div>
        <hr>
        <jsp:include page="/admin/ Echarts_money.jsp"/>
  </body>
</html>
