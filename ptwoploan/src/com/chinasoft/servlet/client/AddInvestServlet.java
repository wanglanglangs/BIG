package com.chinasoft.servlet.client;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chinasoft.dao.impl.InvestDaoImpl;
import com.chinasoft.entity.Invest;
import com.chinasoft.entity.Project;

public class AddInvestServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public AddInvestServlet() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
		out.println("  <BODY>");
		out.print("    This is ");
		out.print(this.getClass());
		out.println(", using the GET method");
		out.println("  </BODY>");
		out.println("</HTML>");
		out.flush();
		out.close();
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		String acc = (String) request.getSession().getAttribute("useraccount");
		Project p = (Project) request.getSession().getAttribute("p");
		String item = p.getName();
		String money = request.getParameter("mon");
		System.out.println(money);
		String total = request.getParameter("total");
		int time =Integer.parseInt(p.getTime()); 
		Date d = new Date();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String start=df.format(d);
		d.setMonth(d.getMonth()+time);
		String end=df.format(d);
		String rate = p.getRate();
		Invest i = new Invest();
			i.setTaccount(acc);
			i.setTitem(item);
			i.setTmoney(money);
			i.setTtotla(total);
			i.setTstart(start);
			i.setTend(end);
			i.setTrate(rate);
			int a = new InvestDaoImpl().addInvest(i);
			if(a>0)
			{
				request.getRequestDispatcher("/client/InvestSuccess.jsp").forward(request, response);
			}else{
				out.write("Õ∂◊  ß∞‹£¨«Î÷ÿ ‘£°");
				
			}
		}
		
	

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
