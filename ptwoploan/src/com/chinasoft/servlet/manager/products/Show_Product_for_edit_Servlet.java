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
@WebServlet("/Show_Product_for_edit_Servlet")
public class Show_Product_for_edit_Servlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	public Show_Product_for_edit_Servlet() {
		super();
	}
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String tid = request.getParameter("id");
		
		if (ChackStringUtil.isNull(tid)) {
			int id = Integer.parseInt(tid);
			
			System.out.println(id);
			
			 Project p = new ProjectImpl().queryProjectById(id);
			
			 request.setAttribute("p", p);
			 
			request.getRequestDispatcher("/admin/Manager_projuct_edit.jsp").forward(request, response);;
			
		}
		
	}

}
