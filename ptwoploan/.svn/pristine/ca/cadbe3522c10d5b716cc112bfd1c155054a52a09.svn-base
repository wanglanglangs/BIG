package com.chinasoft.servlet.client;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;






import com.chinasoft.dao.impl.LoanDaoImpl;
import com.chinasoft.entity.Loan;
import com.chinasoft.service.impl.LoanServiceImpl;


@WebServlet("/UpDateLoanServlet")
public class UpDateLoanServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public UpDateLoanServlet() {
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
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;chartset = utf-8");
		PrintWriter out = response.getWriter();
		
		String account  = (String) request.getSession().getAttribute("useraccount");//登陆后从会话获取登录账号
		//String account  = "王浪";
		//String contractid = request.getParameter("l_contractid");//合同编号，自增
		
		if(account ==null && account == "")
		{
			response.sendRedirect("/ptwoploan/client/main.jsp");
		}
		String money = request.getParameter("summoney");//从借款申请界面获取
		String starttime = request.getParameter("start");
		String endtime = request.getParameter("end");
		String rate = request.getParameter("rateselect");
		String totalmoney = request.getParameter("repayment");
		String type = request.getParameter("typeselect");
		int status = Integer.parseInt(request.getParameter("status"));
		
		
		Loan loan = new Loan();
		loan.setB_account(account);
		loan.setB_money(Double.valueOf(money));
		loan.setB_starttime(starttime);
		loan.setB_endtime(endtime);
		loan.setB_rate(rate);
		loan.setB_totalmoney(totalmoney);
		loan.setB_type(type);
		loan.setB_status(status);
		
		LoanServiceImpl lai = new LoanServiceImpl();
		lai.addUser(loan);
		response.sendRedirect("/ptwoploan/client/main.jsp");
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
