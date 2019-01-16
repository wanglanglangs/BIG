package com.chinasoft.servlet.client;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chinasoft.dao.impl.UserDaoImpl;
import com.chinasoft.entity.User;
import com.chinasoft.service.impl.UserInfoServiceImpl;
import com.chinasoft.service.impl.UserServicesImpl;

/**
 * Servlet implementation class AddUserInfor
 */
@WebServlet("/InvestUserInfor")
public class InvestUserInfor extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InvestUserInfor() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset = utf-8");
		PrintWriter out = response.getWriter();
		String name = request.getParameter("l_name");
		String address = request.getParameter("l_address");
		String idcard = request.getParameter("l_idcard");
		String company = request.getParameter("l_company");
		String salary = request.getParameter("l_salary");
		String otherinfor = request.getParameter("l_otherinfor");
		String account = (String) request.getSession().getAttribute("useraccount");//登陆后将用户信息存储在会话中，获取会话中的账号
		//String account ="bbb";
		String tel = new UserInfoServiceImpl().queryUserInfo(account).getTel();
		User u = new User();
		u.setName(name);
		u.setAddress(address);
		u.setIdcart(idcard);
		u.setCompany(company);
		u.setSalary(salary);
		u.setOtherinfor(otherinfor);
		u.setAccount(account);//huoqu 
		u.setTel(tel);//huoqu 
		//out.print(u);
		UserServicesImpl usi = new UserServicesImpl();
		usi.updateUserInFor(u);
		
		response.sendRedirect("/ptwoploan/client/investmoney.jsp");
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}

}
