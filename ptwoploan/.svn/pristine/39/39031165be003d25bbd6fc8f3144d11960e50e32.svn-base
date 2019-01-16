package com.chinasoft.servlet.client;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chinasoft.dao.impl.MoneyImpl;
import com.chinasoft.entity.User;
import com.chinasoft.service.impl.UserInfoServiceImpl;
@WebServlet ("/myaccount")
public class MyAccountServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public MyAccountServlet() {
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
		//获取存在session中的当前登录账户
		String account =(String) request.getSession().getAttribute("useraccount");
		//根据账户名查询当前用户信息,然后放入request中
		UserInfoServiceImpl uis = new UserInfoServiceImpl();
		User user = uis.queryUserInfo(account);
		request.setAttribute("user", user);
		//根据账户名查询当前用户余额,然后放入request中
		MoneyImpl mi = new MoneyImpl();
		int balance = mi.showMoneyByAccount(account);
		request.setAttribute("blance", balance);
		//请求转发到我的账户页面
		request.getRequestDispatcher("/client/myaccount/myaccount.jsp").forward(request, response);
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

		this.doGet(request, response);
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
