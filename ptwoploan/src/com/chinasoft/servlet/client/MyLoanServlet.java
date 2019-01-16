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
		//��ȡ����session�еĵ�ǰ��¼�˻�
		String account =(String) request.getSession().getAttribute("useraccount");
		UserInfoServiceImpl uis = new UserInfoServiceImpl();
		//����ҳ���С
		int every = 2;
		//
		String everyPage = request.getParameter("everyPage");
		if(everyPage != null){
			every = Integer.parseInt(everyPage);
		}
		//����������
		int count = uis.queryCountMyLoan(account);
		//����ҳ��
		int pageCount = count/every;
		if(count%every > 0){
			pageCount +=1;
		}
		//��ȡ��ǰҳ��
		String page1 = request.getParameter("page");
		if(page1 == null || page1.equals("")){
			page1 = "1";
		}
		int page =Integer.parseInt(page1) ;
		//��ѯ��ҳ����û������Ϣ����request��
		List<Loan> list = null;
		list = uis.queryMyLoan(account,(page-1)*every,every);
		request.setAttribute("page", page);
		request.setAttribute("myloan", list);
		request.setAttribute("pageCount", pageCount);
		//����ת�����ҵ�Ͷ��ҳ��
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

