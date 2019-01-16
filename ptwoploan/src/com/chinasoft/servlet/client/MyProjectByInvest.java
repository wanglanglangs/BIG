package com.chinasoft.servlet.client;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chinasoft.entity.Project;
import com.chinasoft.service.impl.UserInfoServiceImpl;
@WebServlet("/myproject")
public class MyProjectByInvest extends HttpServlet{
	
	public MyProjectByInvest() {
	}
	
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
		//获取投资项目编号
		String str = req.getParameter("id");
		//根据项目编号查询投资项目信息
		UserInfoServiceImpl uis = new UserInfoServiceImpl();
		Project pro = uis.queryProjectById(str);
		req.setAttribute("pro", pro);
		//请求转发到项目详细信息页面
		req.getRequestDispatcher("/client/myaccount/myproject.jsp").forward(req, resp);
	}
	
	@Override
	public void init() throws ServletException {
		super.init();
	}
}
