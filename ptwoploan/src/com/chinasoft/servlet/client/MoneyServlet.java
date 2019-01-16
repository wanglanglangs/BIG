package com.chinasoft.servlet.client;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chinasoft.dao.impl.MoneyImpl;
import com.chinasoft.dao.impl.ProjectImpl;
import com.chinasoft.entity.Money;
import com.chinasoft.entity.Project;
@WebServlet("/money")
public class MoneyServlet extends HttpServlet {
	ProjectImpl pro = new ProjectImpl();
    Project p = new Project();
	/**
	 * Constructor of the object.
	 */
	public MoneyServlet() {
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

		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		
		int id=Integer.parseInt(request.getParameter("pro"));
		p=pro.queryProjectById(id);
		String acc =(String) request.getSession().getAttribute("useraccount");
		
		int balance=-1;
		MoneyImpl mon= new MoneyImpl();
		balance=mon.showMoneyByAccount(acc);
		request.getSession().setAttribute("p", p);
		request.setAttribute("balance",balance);
		request.getRequestDispatcher("client/Proinfor.jsp").forward(request, response);	
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
