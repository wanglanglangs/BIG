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

import com.chinasoft.dao.impl.ProjectImpl;
import com.chinasoft.entity.Project;
@WebServlet("/Manager_ShowAllProduct")
public class Manager_ShowAllProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ProjectImpl pro = new ProjectImpl();
	List<Project> list = new ArrayList<Project>();

	/**
	 * Constructor of the object.
	 */
	public Manager_ShowAllProduct() {
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
		ProjectImpl pro = new ProjectImpl();
		String time = (String)request.getParameter("time");
		if(time==null || time.equals("all"))
		{
			 list =pro.getAll();	
		}else if(time.equals("other")){
			list=pro.queryProjectByOther();
		}else{
			list =pro.queryProjectByTime(time);
		}
		request.setAttribute("list", list);
		request.getRequestDispatcher("/client/manager_invest.jsp").forward(request, response);		
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
