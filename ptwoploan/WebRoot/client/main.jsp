<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>

<style type="text/css">
			.*{
				margin: 0px;
				padding: 0px;
			}
			table{
				width: 900px;
				height: 80px;
			}
</style>

<script type="text/javascript">
	function changeYZ() {
		
	document.getElementById("captcha").src="/ptwoploan/CaptchaServlet?id="+new Date().getTime(); 
		
	}

</script>

</head>
	<body >
	
		<jsp:include page="/client/head.jsp"></jsp:include>
		
	
		
		<div align="center">
			<table border="0px" cellspacing="0px" cellpadding="0px">
				<tr>
					<td><img src="../img/11.png" style="width: 630px; height: 270px;"/></td>
					<td style="width: 250px;">
						<div align="center" >
							<form action="/ptwoploan/LoginServlet" name="myfrom" style="float: right;" method="post">
								<fieldset id="">
									<legend >登录</legend>
										<span style="color: red">${message}</span><br>
									用户名<br><input type="text" name="account" value="" onblur="chackData()"><br>
						   		
						   		密&nbsp;&nbsp;&nbsp;码<br><input type="password" name="pass" value=""><br><br>
						   		
						   		<input type="text" name="register"  placeHolder="请输入验证码">
						   		
						   		<img alt="验证码" src="/ptwoploan/CaptchaServlet" id="captcha" name="captcha">
						   		
						   		&nbsp;&nbsp;
						   		
						   		<a href="#" onclick="changeYZ()">看不清</a><br><br>
						   		
						   		
						   		<input type="submit" value="登录">
						   		&nbsp;&nbsp;
						   		
						   		<input type="reset" value="重置">&nbsp;<a href="RetrievePassword.jsp">找回密码</a><br><br>
						   		<a href="register.jsp">没有账号，我要注册</a>
   							
								</fieldset>
						   		
							</form>
						</div>						
					</td>
				</tr>				
			</table>			
		</div>
		<hr />
		<div align="center">
		<table width="1000" >
			<h3>最新资讯:</h3>
			<tr align="center">
				<td><a href="https://www.36kr.com/p/5170827"><img src="../img/p1.jpg" width="150px" height="90px"></a></td>				
				<td>
					<ul style="list-style: none;">
					<li style="font-size: 20px; font-weight: bold;float: left;"><a href="https://www.36kr.com/p/5170827">熊猫车服获巨人金服战略投资，加快布局汽服生态建设.</a></li>
					<li style="float: left;">定位于一站式汽车生活服务平台「熊猫车服」，近日与纳斯达克上市公司巨人金服签订了战略投资协议，双方将加快布局汽车全生命周期服务...</li>
				</ul>
				</td>
			</tr>
			<tr align="center">
				<td><a href="https://www.36kr.com/p/5170717"><img src="../img/p2.jpg" width="150px" height="90px"></a></td>				
				<td>
					<ul style="list-style: none;">
					<li style="font-size: 20px; font-weight: bold;float: left;"><a href="https://www.36kr.com/p/5170717">没有一个经济数据，一文看懂中国经济周期的真相.</a></li>
					<li style="float: left;">资产投资。但固定资产不可能年年投资，此时就要提前预测未来三五年的产能，假如需求每年增长8%，那这次投资的产能扩张可能要放大到...</li>
				</ul>
				</td>
			</tr>
			<tr align="center">
				<td><a href="https://www.36kr.com/p/5170857"><img src="../img/p3.jpg" width="150px" height="90px"></a></td>				
				<td>
					<ul style="list-style: none;">
					<li style="font-size: 20px; font-weight: bold;float: left;"><a href="https://www.36kr.com/p/5170857">虎牙直播CEO董荣杰：虎牙月活突破1亿，将筹建电竞公司.</a></li>
					<li style="float: left;">董荣杰曾在财报会议上，多次表示要加大对电竞的投入。他曾表示，将尝试通过股权投资的方式进入电子竞技的上下游领域。到了Q3，他更是明确表示，希望能够深度参与电竞生态...</li>
				</ul>
				</td>
			</tr>
			<tr align="center">
				<td><a href="https://www.36kr.com/p/5170677"><img src="../img/p4.jpg" width="150px" height="90px"></a></td>				
				<td>
					<ul style="list-style: none;">
					<li style="font-size: 20px; font-weight: bold;float: left;"><a href="https://www.36kr.com/p/5170677">华东注册的P2P退出，用户却要到成都讨债？.</a></li>
					<li style="float: left;">12月29日，华东一家P2P平台宜贷网（原名易贷网）发布了良性退出公告，公告发出后，不少出借人启程前往成都，了解资金兑付事宜...</li>
				</ul>
				</td>
			</tr>
				<tr align="center">
				<td><a href="https://www.36kr.com/p/5169634"><img src="../img/p5.jpg" width="150px" height="90px"></a></td>				
				<td>
					<ul style="list-style: none;">
					<li style="font-size: 20px; font-weight: bold;float: left;"><a href="https://www.36kr.com/p/5169634">P2P资产部分回暖，从业者：终于不怕被裁了.</a></li>
					<li style="float: left;">在经过近半年的煎熬之后，一部分P2P从业者感觉终于看到了曙光，资产端恢复放款，业务量开始稳定增长，或许难以指望今年的年终奖，但对于安全渡过今年多少有了底，对于明年也有了盼望...</li>
				</ul>
				</td>
			</tr>
			<tr align="center">
				<td><a href="https://www.36kr.com/p/5168878"><img src="../img/p6.jpg" width="150px" height="90px"></a></td>				
				<td>
					<ul style="list-style: none;">
					<li style="font-size: 20px; font-weight: bold;float: left;"><a href="https://www.36kr.com/p/5168878">京东“和丰网贷”上线，业内：互联网巨头仍看好P2P.</a></li>
					<li style="float: left;">网贷之家高级研究员张叶霞对《每日经济新闻》记者表示：“和丰网贷上线可能表示互联网巨头仍然看好P2P网贷行业未来发展，有助于提振行业信心...</li>
				</ul>
				</td>
			</tr>
			</table>
			</div>
			<hr />
		<jsp:include page="/client/foot.jsp"></jsp:include>
	</body>

</html>