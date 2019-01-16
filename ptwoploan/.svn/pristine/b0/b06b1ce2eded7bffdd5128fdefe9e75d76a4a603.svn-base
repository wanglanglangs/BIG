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
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

	
	private static final long serialVersionUID = 1L;
	
	private IUserServices service=new UserServicesImpl();  

	User user = new User();
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		String account = req.getParameter("account");
		String pass = req.getParameter("pass");
		
		user.setAccount(account);
		user.setPass(pass);
		
		System.out.println(user);
		
		boolean queryUserByPassAndAccount = service.queryUserByPassAndAccount(user);
		
		System.out.println("1"+queryUserByPassAndAccount);
		
		boolean chanckCaptcha = chanckCaptcha(req,resp);
		
		
		if(queryUserByPassAndAccount&&chanckCaptcha){
			
			req.getSession().removeAttribute("message");
			
			req.getSession().setAttribute("useraccount", account);
			
			resp.sendRedirect("/ptwoploan/client/main.jsp");
			
			System.out.println("µÇÂ½³É¹¦");
			
		}else{
			
			req.getSession().setAttribute("message", "ÕËºÅ»òÃÜÂë´íÎó");
			
			resp.sendRedirect("/ptwoploan/client/main.jsp");
			
			System.out.println("µÇÂ½Ê§°Ü");
			
		}
	}

	private boolean chanckCaptcha(HttpServletRequest req, HttpServletResponse resp) {
		String captcha = req.getParameter("register");
		
		
		String str = (String) req.getSession().getAttribute("str");
		
		String str1=str.substring(4);
		
		if (captcha.equals(str1)) {
			
			return true;
		}
		
		return false;
	}
	

}
