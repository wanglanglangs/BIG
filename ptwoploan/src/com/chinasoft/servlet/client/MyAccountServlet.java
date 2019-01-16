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
		//��ȡ����session�еĵ�ǰ��¼�˻�
		String account =(String) request.getSession().getAttribute("useraccount");
		//�����˻�����ѯ��ǰ�û���Ϣ,Ȼ�����request��
		UserInfoServiceImpl uis = new UserInfoServiceImpl();
		User user = uis.queryUserInfo(account);
		request.setAttribute("user", user);
		//�����˻�����ѯ��ǰ�û����,Ȼ�����request��
		MoneyImpl mi = new MoneyImpl();
		int balance = mi.showMoneyByAccount(account);
		request.setAttribute("blance", balance);
		//����ת�����ҵ��˻�ҳ��
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
