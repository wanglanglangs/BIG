package com.chinasoft.servlet.manager;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chinasoft.entity.Manager;
import com.chinasoft.service.ManagerLoginService;
import com.chinasoft.service.impl.ManagerLoginImpl;
@WebServlet("/ManagerServlet")
public class ManagerServlet extends HttpServlet {

	
	private static final long serialVersionUID = 1L;
	ManagerLoginService  manager =null;
	
	public void init() throws ServletException {
		manager = new ManagerLoginImpl();
	}
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("*******************************---");
		request.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		String mzhanghao = request.getParameter("zhanghao");
		String mmima = request.getParameter("mima");
		
		System.out.println(mzhanghao);
		
		System.out.println(mmima);
		
		Manager m = new Manager();
		
		m.setM_account(mzhanghao);
		m.setM_pass(mmima);
		
		boolean ma = manager.get(m.getM_account(),m.getM_pass());
		
		System.out.println(ma);
		
		if(ma)
		{
			response.sendRedirect("/ptwoploan/admin/frame/mainFrame.html");
			
		}else {
			
			response.sendRedirect("/ptwoploan/client/main.jsp");
		}
	
		      
		      
		      
		      
	   /* 
		if(list.contains(mzhanghao)&&list.contains(mmima))
		{
			out.write("LoginSuccess!!");
			response.sendRedirect("/ptwoploan/admin/manager.jsp");
		}else {
			out.write("LoginFail!!");
			response.sendRedirect("/ptwoploan/client/main.jsp");
		}*/
		
	
	}

}
