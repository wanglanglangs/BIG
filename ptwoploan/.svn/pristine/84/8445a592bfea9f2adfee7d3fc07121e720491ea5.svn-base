<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
 <style type="text/css">
  .div1{
   background-image: url("../img/456.jpg") ;
   height: 800px;
  
  }
 </style>
  
  </head>
  
  <body>
  
  <div align="center"  class="div1">
  <h2 style="color:gray;">修&nbsp;&nbsp;&nbsp;改&nbsp;&nbsp;&nbsp;投&nbsp;&nbsp;&nbsp;资&nbsp;&nbsp;&nbsp;信&nbsp;&nbsp;&nbsp;息</h2>
  <br><br>
       <form action="/ptwoploan/UpdateProduct" method="post" >
       <input type="hidden" name="id" value="${p.id}">
      <table>
      <tr><td>项目名称:<br><input type="text" name="p_name"  value="${p.name}" ></td> </tr>
      <tr><td>投资利率:&nbsp;&nbsp;<br> <input type="text" name="p_rate" value="${p.rate}"> </td></tr>
      <tr><td>投资金额:&nbsp;&nbsp;<br><input type="text" name="p_money" value="${p.money}"></td></tr>
      <tr><td>投资时间（月）: &nbsp;&nbsp;<br><input type="text" name="p_time"  value="${p.time}"></td></tr>
      </table>
       <input type="submit" value="修改" height="50px" style="color:blue;">
       </form>
       
       </div>
       
  </body>
</html>
