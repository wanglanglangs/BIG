package com.chinasoft.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;

public class SearchServlet extends HttpServlet {

	static List<String> infor = new ArrayList<String>();
	
	
	static{
		infor.add("ajax url");
		infor.add("ajax post");
		infor.add("json");
		infor.add("json xml");
		infor.add("jerry");
		infor.add("tomcat");
		infor.add("java");
		infor.add("西安");
		infor.add("西北大学");
		infor.add("西北工业大学");
		infor.add("西安理工大学");
	}
	/**
	 * Constructor of the object.
	 */
	public SearchServlet() {
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

		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		//获取客户端的数据
		String key = request.getParameter("keywords");
		List<String> list = fetchData(key);
		//返回JSON格式
		JSONArray json = JSONArray.fromObject(list);
		System.out.println(json);
		out.print(json);
		  
	}

	private List<String> fetchData(String keywords)
	{
		List<String> data= new ArrayList<String>();
		    for(String info :infor)
		    {  
		    	if(info.contains(keywords))
		    	{
		    		data.add(info);
		    	}
		    	
		    }
		    return data;
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
        this.doGet(request, response);
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
