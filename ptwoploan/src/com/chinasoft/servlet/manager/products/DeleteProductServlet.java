package com.chinasoft.servlet.manager.products;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chinasoft.dao.impl.Manager_ProjectDAOImpl;
import com.chinasoft.entity.Invest;
import com.chinasoft.service.InvestService;
import com.chinasoft.service.ManagerLoginService;
import com.chinasoft.service.impl.InvestServiceImpl;
import com.chinasoft.service.impl.ManagerLoginImpl;
import com.chinasoft.util.ChackStringUtil;
import com.google.gson.Gson;
@WebServlet("/DeleteProduct")
public class DeleteProductServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	
	
	public DeleteProductServlet() {
		super();
	}
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		Manager_ProjectDAOImpl mpd=new Manager_ProjectDAOImpl();
		
		PrintWriter out = response.getWriter();
		
		String tid = request.getParameter("id");
		
		if (ChackStringUtil.isNull(tid)) {
			
			int id = Integer.parseInt(tid);
			
			System.out.println(id);
			
			mpd.deleteProjuct(id);
			
			request.setAttribute("message", "É¾³ý³É¹¦£¡£¡");
			
			request.getRequestDispatcher("Manager_ShowAllProduct").forward(request, response);;
			
			
		}
		System.out.println("+++++++++++++++++");
		
	}

}
