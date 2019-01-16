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
  
  	<a href="/ptwoploan/admin/Echarts_Invest.jsp">数据报表</a>
        <div align="center" >
        
         <h1>投&nbsp;&nbsp;资&nbsp;&nbsp;信&nbsp;&nbsp;息</h1><br><br><br>
        
         <h2 style="font-family: '楷体';color: blue;">查询信息</h2>
         
         
             <form action="/ptwoploan/QueryAllInvestServlet?pageSize=${pageSize}" method="post" >
             	<span >合同编号:</span><input type="text" name="h_id" style="width: 80px" value="${h_id>0?h_id:''}">
             	<span >投资人信息:</span><input type="text" name="h_userInfor" style="width: 80px" value="${h_userInfor}">
             	
             	<span >投资金额:</span><input type="text" name="h_StartMoney" style="width: 50px"value="${h_StartMoney>0?h_StartMoney:''}">
             	~
             	<input type="text" name="h_endMoney" style="width: 50px"value="${h_endMoney>0?h_endMoney:''}">
             	
             	
             	<input type="submit" value="查询">
             </form>
             
        
             <div  id="div2" >
             
             <form  action="/ptwoploan/QueryAllInvestServlet"  method="post"  id="form1" >
             
             <input type="hidden" value="${pageSize}" name="pageSize" id="pageSize">
             
              
               
             <table border="1px" cellpadding="0px" cellspacing="0px" id="table1">
            
             <tr id="tr1">
             
               <th>  合同编号&nbsp; &nbsp;</th>
               <th>  投资人信息&nbsp;&nbsp; </th>
               <th>  项目信息 &nbsp;&nbsp;</th>
               <th>  投资金额 &nbsp;&nbsp;</th>
               <th>  预计总收入 &nbsp;&nbsp;</th>
               <th>  项目起始时间&nbsp;&nbsp; </th>
               <th>  项目结束时间&nbsp;&nbsp; </th>
               <th>  项目利率&nbsp;&nbsp; </th>
               
               <th>   &nbsp;&nbsp;操&nbsp;&nbsp;作&nbsp;&nbsp;</th>
             </tr>
         
             
        
           <c:forEach items="${list}" var="l"  varStatus="vs">
    
               <tr class=${vs.index%2==0?'tdr':''}>
                 <td>${l.tid}</td>
                 <td>${l.taccount}</td>
                 <td>${l.titem}</td>
                 <td>${l.tmoney}</td>
                 <td>${l.ttotla}</td>
                 <td>${l.tstart}</td>
                 <td>${l.tend}</td>
                 <td>${l.trate}</td>
                 
                 <td><a href="/ptwoploan/DeleteInvestServlet?id=${l.tid}&pageSize=${pageSize}&h_userInfor=${h_userInfor}&h_id=${h_id}&h_StartMoney=${h_StartMoney}&h_endMoney=${h_endMoney}">删除客户</a></td>
               </tr>
             </c:forEach>
             
             
             <tr align="center">
             
	             <td colspan="9">
	             
	             	<a href="/ptwoploan/QueryAllInvestServlet?page=1&pageSize=${pageSize}&h_userInfor=${h_userInfor}&h_id=${h_id}&h_StartMoney=${h_StartMoney}&h_endMoney=${h_endMoney}">首页</a>
	             	<a href="/ptwoploan/QueryAllInvestServlet?page=${page-1>0?page-1:1}&pageSize=${pageSize}&h_userInfor=${h_userInfor}&h_id=${h_id}&h_StartMoney=${h_StartMoney}&h_endMoney=${h_endMoney}">上一页</a>
	             	
	             	
	             	 <c:forEach var="page" begin="1" end="${totalPage}">
                    <a href="/ptwoploan/QueryAllInvestServlet?page=${page}&pageSize=${pageSize}&h_userInfor=${h_userInfor}&h_id=${h_id}&h_StartMoney=${h_StartMoney}&h_endMoney=${h_endMoney}">${page}</a>
                    </c:forEach>
	             	
	             	<a href="/ptwoploan/QueryAllInvestServlet?page=${page+1>totalPage?totalPage:page+1}&pageSize=${pageSize}&h_userInfor=${h_userInfor}&h_id=${h_id}&h_StartMoney=${h_StartMoney}&h_endMoney=${h_endMoney}">下一页</a>
	             	<a href="/ptwoploan/QueryAllInvestServlet?page=${totalPage}&pageSize=${pageSize}&h_userInfor=${h_userInfor}&h_id=${h_id}&h_StartMoney=${h_StartMoney}&h_endMoney=${h_endMoney}">末页</a>
	             	当前页：${page}/${totalPage}
	             	
	             	页面显示<select  onchange="selectPageSize(this)" id="pagesize1" >
	             		
	             		<option value="3" ${pageSize==3?"selected":""}>3</option>
	             		<option value="5" ${pageSize==5?"selected":""}>5</option>
	             		<option value="8" ${pageSize==8?"selected":""}>8</option>
	             	</select>条数据
	             </td>
             </tr>
             </table>
            </form>
             </div>
        </div>
        <span>${message}</span>
  </body>
</html>
