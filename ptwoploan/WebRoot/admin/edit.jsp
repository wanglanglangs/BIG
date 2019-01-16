<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
 <style type="text/css">
  .div1{
   background-image: url("./img/456.jpg") ;
   height: 800px;
  
  }
 
 
 
 
 </style>
  
  </head>
  
  
  
  <body>
  
  <div align="center"  class="div1">
  <h2 style="color:gray;">信&nbsp;&nbsp;&nbsp;息&nbsp;&nbsp;&nbsp;填&nbsp;&nbsp;&nbsp;写</h2>
  <br><br><br><br>
       <form action="Loan?cmd=add" method="post" >
       <input type="hidden" name="id" value="${loan.b_contractid}">
       
      <table>
       <tr>合同编号:&nbsp;&nbsp;<input type="text" readonly = "readonly" name="b_contractid"  value="${loan.b_contractid}" > </tr><br><br>
      <tr>借款人信息:&nbsp;&nbsp;<input type="text" readonly = "readonly" name="b_account"  value="${loan.b_account}" > </tr><br><br>
      <tr>合同开始时间:&nbsp;&nbsp; <input type="date" readonly = "readonly" name="b_starttime" value="${loan.b_starttime}"> </tr><br><br>
      <tr>合同结束时间:&nbsp;&nbsp;<input type="date" readonly = "readonly" name="b_endtime" value="${loan.b_endtime}"></tr><br><br>
      <tr>所还金额: &nbsp;&nbsp;<input type="number" readonly = "readonly" name="b_totalmoney"  value="${loan.b_totalmoney}"></tr><br><br>
      <tr>项目利率:&nbsp;&nbsp;<input type="text" readonly = "readonly" name="b_rate"  value="${loan.b_rate}"></tr><br><br>
      <tr>借款类型:&nbsp;&nbsp;<input type="text" readonly = "readonly" name="b_type"  value="${loan.b_type}"> </tr><br><br>
      <tr>目前项目状态:&nbsp;&nbsp;<input type="text" name="b_status"  value="${loan.b_status}"></tr><br><br>
      <tr>项目不通过原因:&nbsp;&nbsp;<input type="text" name="b_reason"  value="${loan.b_reason}"></tr><br><br>
      <tr>借款金额:&nbsp;&nbsp;<input type="number" readonly = "readonly" min="0" name="b_money" value="${loan.b_money}"></tr><br><br>
      
      </table>
       <input type="submit" value="Submit" height="50px" style="color:blue;">
       </form>
       
       </div>
       
  </body>
</html>
