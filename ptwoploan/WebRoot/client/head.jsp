<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    
<div style="float: right; font-family: 楷体" >
 <a href="/ptwoploan/admin/managerlogin.jsp">管理员登录</a>
</div>
		<div align="center" style="background-color:beige ;">
		
		<table border="0px" cellspacing="0px" cellpadding="0px" class="table1"  style="width: 900px;height: 80px;">
			<tr >
				<th><a href="/ptwoploan/ToMainPageServlet">首页</a></th>
				<th><a href="/ptwoploan/LoanOrUserInforServlet"> 我要借款 </a></th>
				<th><a href="/ptwoploan/ShowAll">我要投资</a></th>
				<th><a href="/ptwoploan/myaccount">我的账户</a></th>
				<th><a href="#">关于我们</a></th>
			</tr>
		</table>
		
		<span style="float:right; color: blue; font-family: 楷体">欢迎${useraccount}登录&nbsp;|&nbsp;|&nbsp;<a href="/ptwoploan/Can_LoginServlet">注销登录</a></span>
</div>
<hr />