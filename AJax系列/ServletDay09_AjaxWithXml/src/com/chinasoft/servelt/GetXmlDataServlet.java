package com.chinasoft.servelt;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

 

public class GetXmlDataServlet extends HttpServlet {

	private Connection conn;
	
	public GetXmlDataServlet() {
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

		response.setContentType("text/xml;charset=utf-8");
		PrintWriter out = response.getWriter();
		String sql = "";
		Statement stmt = null;
		ResultSet rs = null;
		StringBuffer sb = new StringBuffer();
		sb.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
		sb.append("<users>");
		try
		{
			sql = "select * from user";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next())
			{
				sb.append("<user>");
				sb.append("<id>"+rs.getString("id")+"</id>");
				sb.append("<username>"+rs.getString("name")+"</username>");
				sb.append("<password>"+rs.getString("pwd")+"</password>");
				sb.append("</user>");
			}
			sb.append("</users>");
			System.out.println(sb.toString());
			out.println(sb.toString());
			out.flush();
			out.close();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			
		}
		finally
		{
			try
			{
				rs.close();
				stmt.close();
				//conn.close();
				out.close();
			}
			catch(Exception ex)
			{
				
			}
		}
		
		
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

		doGet(request,response);
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
		try
		{
		  Context ic = new InitialContext();
		  DataSource source =	(DataSource)ic.lookup("java:comp/env/myDataSource");
		  this.conn = source.getConnection();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}

}
