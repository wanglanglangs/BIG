<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  <script type="text/javascript" src="js/jquery-1.11.0.js"></script>
   <style type="text/css">
  .divs{
   
       background-image: url("./img/456.jpg") ;
       height: 800px;
   
   }
   </style>
 
 
 
  </head>
  
  <body>
        <div align="center" class="divs">
             <div  id="div1" name="div1">
               <h1>借&nbsp;&nbsp;款&nbsp;&nbsp;信&nbsp;&nbsp;息</h1><br><br><br>
               <a href="Loan?cmd=edit" style="color: gray;">添加客户</a><br><br>
             <table border="2px" cellpadding="0px" cellspacing="0px">
             <tr style="color: peru;">
               <th>  合同编号&nbsp; &nbsp;</th>
               <th>  借款人信息&nbsp;&nbsp; </th>
               <th>  合同开始时间 &nbsp;&nbsp;</th>
               <th>  合同结束时间 &nbsp;&nbsp;</th>
               <th>  所还金额 &nbsp;&nbsp;</th>
               <th>  项目利率&nbsp;&nbsp; </th>
               <th>  借款类型&nbsp;&nbsp; </th>
               <th>  目前项目状态&nbsp;&nbsp; </th>
               <th>  项目不通过原因&nbsp;&nbsp;</th>
               <th>  借款金额&nbsp;&nbsp;</th>
               <th> 操&nbsp;&nbsp;作</th>
             </tr>
             <c:forEach items="${loan}" var="l" varStatus="vs">
               <tr >
                 <td>${l.b_contractid}</td>
                 <td>${l.b_account}</td>
                 <td>${l.b_starttime}</td>
                 <td>${l.b_endtime}</td>
                 <td>${l.b_totalmoney}</td>
                 <td>${l.b_rate}</td>
                 <td>${l.b_type}</td>
                 <td>${l.b_status}</td>
                 <td>${l.b_reason}</td>
                 <td>${l.b_money}</td>
                 <td> <a href="Loan?cmd=edit&id=${l.b_contractid}">修改客户</a>---<a href="Loan?cmd=del&id=${l.b_contractid}">删除客户</a></td>
               </tr>
             </c:forEach>
             
             <tr>
                <td colspan="11" align="center">
                
                  <c:if test="${page==1}">
                  <a>首頁</a>
                  <a>上一頁</a>
                  </c:if>
                  
                  <c:if test="${page!=1}">
                  <a href="Loan?page=1">首頁</a>
                  <a href="Loan?page=${requestScope.page-1}">上一頁</a>
                  </c:if>
                  
                  <c:forEach var="everypage" begin="1" end="${requestScope.pagecount}">
                  <a href="Loan?page=${everypage}">${everypage}</a>
                  </c:forEach>
                  
                  <c:if test="${page==pagecount}">
                  <a>下一頁</a>
                  <a>最後一頁</a>
                  </c:if>
                  
                  <c:if test="${page!=pagecount}">
                  <a href="Loan?page=${requestScope.page+1}">下一頁</a>
                  <a href="Loan?page=${requestScope.pagecount}">最後一頁</a>
                  </c:if>
                  
                
                
                </td>
             
             </tr>
             </table>
             
             </div>
              
        </div>
  </body>
</html>
