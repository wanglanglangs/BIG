package com.chinasoft.servlet.manager.invest;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chinasoft.entity.Invest;
import com.chinasoft.service.InvestService;
import com.chinasoft.service.ManagerLoginService;
import com.chinasoft.service.impl.InvestServiceImpl;
import com.chinasoft.service.impl.ManagerLoginImpl;
import com.chinasoft.util.ChackStringUtil;
import com.google.gson.Gson;
@WebServlet("/DeleteInvestServlet")
public class DeleteInvestServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	private InvestService service =null;
	
	public DeleteInvestServlet() {
		super();
	}

	public void init() throws ServletException {
		service=new InvestServiceImpl();
	}
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		String tid = request.getParameter("id");
		
		if (ChackStringUtil.isNull(tid)) {
			
			int id = Integer.parseInt(tid);
			
			Long d = (long) id;
			
			System.out.println(d);
			
			service.deleteInsertInfor(d);
			
			request.setAttribute("message", "É¾³ý³É¹¦£¡£¡");
			
			request.getRequestDispatcher("QueryAllInvestServlet").forward(request, response);;
			
			
		}
		
	}

}
