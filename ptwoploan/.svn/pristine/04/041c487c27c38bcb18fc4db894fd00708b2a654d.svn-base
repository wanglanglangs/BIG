package com.chinasoft.servlet.client;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chinasoft.dao.impl.MoneyImpl;
import com.chinasoft.service.impl.UserInfoServiceImpl;
@WebServlet("/updatetotal")
public class MyUpdateMoneyServlet extends HttpServlet {

	public MyUpdateMoneyServlet() {
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
		super.doGet(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// 获取存在session中的当前登录账户
		String account =req.getParameter("id");
		
		double totalmoney = Double.parseDouble(req.getParameter("totalmoney"));
		
		int money = Integer.parseInt(req.getParameter("money"));
		UserInfoServiceImpl uis = new UserInfoServiceImpl();
		if(uis.updateTotalMoney(account, totalmoney, money)){
			//获取存在session中的当前登录账户
			String account1 =(String) req.getSession().getAttribute("useraccount");
			int balance = Integer.parseInt(req.getParameter("balance"));
			uis.updateMoney(account1, (balance-money));
			req.setAttribute("message", 2);
		}else{
			req.setAttribute("message", 3);
		}
		req.getRequestDispatcher("/client/myaccount/updateres.jsp").forward(req, resp);
	
	}

}
