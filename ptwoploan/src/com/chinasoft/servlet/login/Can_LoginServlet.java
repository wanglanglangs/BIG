package com.chinasoft.servlet.login;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chinasoft.entity.User;
import com.chinasoft.service.IUserServices;
import com.chinasoft.service.impl.UserServicesImpl;
@WebServlet("/Can_LoginServlet")
public class Can_LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
			
			req.getSession().removeAttribute("useraccount");
			
			resp.sendRedirect("/ptwoploan/client/main.jsp");
			
	}


}
