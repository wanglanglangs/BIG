package com.chinasoft.servlet.client;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chinasoft.dao.impl.MoneyImpl;
import com.chinasoft.entity.Loan;
import com.chinasoft.service.impl.UserInfoServiceImpl;
@WebServlet ("/myrepayment")
public class MyRepaymentServlet extends HttpServlet{
	
	public MyRepaymentServlet() {
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
		//获取要查询的借款信息id
		long id = Integer.parseInt(req.getParameter("id"));
		//查询借款详细信息
		UserInfoServiceImpl uis = new UserInfoServiceImpl();
		Loan loan = uis.queryLoanById(id);
		req.setAttribute("loan", loan);
		//根据账户名查询当前用户余额,然后放入request中
		MoneyImpl mi = new MoneyImpl();
		int balance = mi.showMoneyByAccount(account);
		req.setAttribute("blance", balance);
		req.getRequestDispatcher("/client/myaccount/repayment.jsp").forward(req, resp);
	}
	
	
}
