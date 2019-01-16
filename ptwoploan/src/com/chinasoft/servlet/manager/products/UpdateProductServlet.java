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
import com.chinasoft.dao.impl.ProjectImpl;
import com.chinasoft.entity.Invest;
import com.chinasoft.entity.Project;
import com.chinasoft.service.InvestService;
import com.chinasoft.service.ManagerLoginService;
import com.chinasoft.service.impl.InvestServiceImpl;
import com.chinasoft.service.impl.ManagerLoginImpl;
import com.chinasoft.util.ChackStringUtil;
import com.google.gson.Gson;
@WebServlet("/UpdateProduct")
public class UpdateProductServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	
	
	public UpdateProductServlet() {
		super();
	}

	
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		Manager_ProjectDAOImpl mpd=new Manager_ProjectDAOImpl();
		
		PrintWriter out = response.getWriter();
		
		String tid = request.getParameter("id");
		String p_name = request.getParameter("p_name");
		String p_rate =request.getParameter("p_rate");
		String p_money =request.getParameter("p_money");
		String p_time =request.getParameter("p_time");
		
		
		Project p = new Project();
		
		if (ChackStringUtil.isNull(tid)) {
			int id = Integer.parseInt(tid);
			
			System.out.println(id);
			
			p.setId(id);
			p.setName(p_name);
			p.setRate(p_rate);
			p.setMoney(p_money);
			p.setTime(p_time);
			
			System.out.println(p);
			
			mpd.updateProduct(p);
			
			response.sendRedirect("Manager_ShowAllProduct");
			
		}
		
	}

}
