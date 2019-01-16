package com.chinasoft.servlet.client;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chinasoft.entity.User;
import com.chinasoft.service.impl.UserInfoServiceImpl;


@WebServlet("/RetrievePasswordServlet")
public class RetrievePasswordServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public RetrievePasswordServlet() {
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

		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		String account = request.getParameter("l_account");
		
		System.out.println(account);
		
		String tel = request.getParameter("l_tel");
		
		User  userinfor = new UserInfoServiceImpl().queryUserInfo(account);
		
		System.out.println(userinfor.getAccount());
		System.out.println(userinfor.getTel());
		System.out.println(userinfor.getPass());
		
		if(userinfor.getTel().equals(tel))
		{	
			request.setAttribute("account", userinfor.getAccount());
			request.setAttribute("tel", userinfor.getTel());
			request.setAttribute("pass", userinfor.getPass());
			request.getRequestDispatcher("/client/RetrievePassword.jsp").forward(request, response);
		}
		else{
			out.print("账号或手机号有误");
			response.sendRedirect("/ptwoploan/client/RetrievePassword.jsp");
		}
		
		
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
