package com.chinasoft.servlet.client;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chinasoft.dao.impl.MoneyImpl;
import com.chinasoft.entity.User;
import com.chinasoft.service.impl.UserInfoServiceImpl;

public class InvestOrUserInforServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public InvestOrUserInforServlet() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doPost(request, response);
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String account = (String) request.getSession().getAttribute("useraccount");
		User us = new User();
		UserInfoServiceImpl uis = new UserInfoServiceImpl();
		us = uis.queryUserInfo(account);
		MoneyImpl m = new MoneyImpl();
		int balance=m.showMoneyByAccount(account);
		System.out.println(balance);
		request.setAttribute("balance", balance);
		String uname = us.getName();
		if(uname==""||uname ==null)
		{
			response.sendRedirect("/ptwoploan/client/investuserinfor.jsp");
		}
		else{
			
			request.getRequestDispatcher("/client/investmoney.jsp").forward(request, response);
		}
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
