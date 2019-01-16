package com.chinasoft.servlet.client;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chinasoft.dao.impl.MoneyImpl;
@WebServlet("/recharge")
public class RechargeServlet extends HttpServlet{
	
	public RechargeServlet() {
	}
	
	@Override
	public void init() throws ServletException {
		super.init();
	}
	
	@Override
	public void destroy() {
		super.destroy();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		this.doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//获取存在session中的当前登录账户
		String account =(String) req.getSession().getAttribute("useraccount");
		//根据账户名查询当前用户余额,然后放入request中
		MoneyImpl mi = new MoneyImpl();
		int balance = mi.showMoneyByAccount(account);
		req.setAttribute("blance", balance);
		//请求转发到我的账户页面
		req.getRequestDispatcher("/client/myaccount/recharge.jsp").forward(req, resp);
	}
	
	
}
