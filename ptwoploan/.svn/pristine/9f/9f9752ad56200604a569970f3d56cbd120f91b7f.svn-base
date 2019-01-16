package com.chinasoft.servlet.client;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chinasoft.entity.Invest;
import com.chinasoft.entity.Loan;
import com.chinasoft.service.impl.UserInfoServiceImpl;
@WebServlet ("/myloan")
public class MyLoanServlet extends HttpServlet{

	/**
	 * Constructor of the object.
	 */
	public MyLoanServlet() {
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
		UserInfoServiceImpl uis = new UserInfoServiceImpl();
		//设置页面大小
		int every = 2;
		//
		String everyPage = request.getParameter("everyPage");
		if(everyPage != null){
			every = Integer.parseInt(everyPage);
		}
		//数据总行数
		int count = uis.queryCountMyLoan(account);
		//求总页数
		int pageCount = count/every;
		if(count%every > 0){
			pageCount +=1;
		}
		//获取当前页数
		String page1 = request.getParameter("page");
		if(page1 == null || page1.equals("")){
			page1 = "1";
		}
		int page =Integer.parseInt(page1) ;
		//查询分页后的用户借款信息放入request中
		List<Loan> list = null;
		list = uis.queryMyLoan(account,(page-1)*every,every);
		request.setAttribute("page", page);
		request.setAttribute("myloan", list);
		request.setAttribute("pageCount", pageCount);
		//请求转发到我的投资页面
		request.getRequestDispatcher("/client/myaccount/myloan.jsp").forward(request, response);
		
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

