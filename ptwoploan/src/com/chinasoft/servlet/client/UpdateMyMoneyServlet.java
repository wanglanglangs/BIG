package com.chinasoft.servlet.client;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chinasoft.service.impl.UserInfoServiceImpl;
@WebServlet("/updatemymoney")
public class UpdateMyMoneyServlet extends HttpServlet{

	
	public UpdateMyMoneyServlet() {
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
		int mon =Integer.parseInt(req.getParameter("chong"));
		int yu = Integer.parseInt(req.getParameter("yu"));
		UserInfoServiceImpl uis = new UserInfoServiceImpl();
		boolean flag = uis.updateMoney(account, mon+yu);
		if(flag){
			req.setAttribute("message", 4);
		}else{
			req.setAttribute("message", 5);
		}
		req.getRequestDispatcher("/client/myaccount/updateres.jsp").forward(req, resp);
	}
	
}
