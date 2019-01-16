package com.chinasoft.servlet.client;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chinasoft.dao.impl.InvestDaoImpl;
import com.chinasoft.entity.Echarts_InvterInfor;
import com.chinasoft.service.InvestService;
import com.chinasoft.service.impl.InvestServiceImpl;
import com.google.gson.Gson;

@WebServlet("/Echarts_Invest_Servlet")
public class Echarts_Invest_Servlet extends HttpServlet{

	
	private static final long serialVersionUID = 1L;
	
   private InvestService service =null;
	
	public Echarts_Invest_Servlet() {
		super();
	}

	public void init() throws ServletException {
		service=new InvestServiceImpl();
	}
	
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		PrintWriter out = resp.getWriter();
		
		List<Echarts_InvterInfor> list_Echarts=new InvestDaoImpl().getEcharts_InvterInfor();
		
		System.out.println(list_Echarts);
		
		Gson gson = new Gson();
		
		String goal=gson.toJson(list_Echarts);
		
		out.write(goal);
		
	}

	private List<Echarts_InvterInfor> getEchart_investInfot() {
		
		Echarts_InvterInfor ei = new Echarts_InvterInfor();
		Echarts_InvterInfor ei1 = new Echarts_InvterInfor();
		List<Echarts_InvterInfor> de = new InvestDaoImpl().getEcharts_InvterInfor();
		
		
		List<Echarts_InvterInfor> dep = new ArrayList<Echarts_InvterInfor>();
		
		int sum=0;
		int sum1=0;
		
		for (int i = 0; i < de.size(); i++) {
				if (de.get(i).getName().equals("2018")) {
					sum+=de.get(i).getNumber();
				}
                if (de.get(i).getName().equals("2019")) {
					sum1+=de.get(i).getNumber();
				}
		}
		ei.setName("2018");
		ei.setNumber(sum);
		dep.add(ei);
		
		ei1.setName("2019");
		ei1.setNumber(sum1);
		dep.add(ei1);
		
		System.out.println(dep);
		
		return  dep;
		
		
	}

}
