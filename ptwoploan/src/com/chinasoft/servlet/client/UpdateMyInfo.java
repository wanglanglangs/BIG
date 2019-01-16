package com.chinasoft.servlet.client;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chinasoft.entity.User;
import com.chinasoft.service.impl.UserInfoServiceImpl;

@WebServlet ("/updatemyinfo")
public class UpdateMyInfo extends HttpServlet{
	
	@Override
	public void destroy() {
		super.destroy();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		this.doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//获取存在session中的当前登录账户
		String account =(String) req.getSession().getAttribute("useraccount");
		//将页面要修改的用户信息存为对象
		User user = new User();
		user.setAccount(account);
		user.setAddress(req.getParameter("address"));
		user.setCompany(req.getParameter("company"));
		user.setIdcart(req.getParameter("idcart"));
		user.setName(req.getParameter("name"));
		user.setOtherinfor(req.getParameter("otherinfor"));
		user.setSalary(req.getParameter("salary"));
		user.setTel(req.getParameter("tel"));
		//调用dao方法判断返回值,返回值为1时表示修改成功,0表示失败
		UserInfoServiceImpl uis = new UserInfoServiceImpl();
		if(uis.updateMyInfo(user)){
			req.setAttribute("message", 1);
			req.getRequestDispatcher("/client/myaccount/updateres.jsp").forward(req, resp);
		}else{
			req.setAttribute("message", 0);
			req.getRequestDispatcher("/client/myaccount/updateres.jsp").forward(req, resp);
		}
	}
	@Override
	public void init() throws ServletException {
		super.init();
	}
	
	public UpdateMyInfo() {
	}
}
