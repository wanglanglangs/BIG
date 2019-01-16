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
import com.chinasoft.entity.QueryObject;
import com.chinasoft.service.InvestService;
import com.chinasoft.service.impl.InvestServiceImpl;
import com.chinasoft.util.ChackStringUtil;
@WebServlet("/QueryAllInvestServlet")
public class QueryAllInvestServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	private InvestService service =null;
	
	public QueryAllInvestServlet() {
		super();
	}

	public void init() throws ServletException {
		service=new InvestServiceImpl();
	}
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//获取分页数据
		String page = request.getParameter("page");
		
		String pageSize = request.getParameter("pageSize");
		
		String qo1 =request.getParameter("qo");
		
//		System.out.println("======="+qo1);
		
		//获取查询数据
		QueryObject qo = getQueryObject(request,response);
		
//		System.out.println(qo);
		
		int ipage = 1;
		
		int ipageSize =3;
		
		if (ChackStringUtil.isNull(page)) {
			
			int page1 = Integer.parseInt(page);
			
			ipage=page1;
			
		}
       if (ChackStringUtil.isNull(pageSize)) {
			
			int page1 = Integer.parseInt(pageSize);
			
			ipageSize=page1;
			
		}
		
		PrintWriter out = response.getWriter();
		
		/**
		 * 查询得到的集合
		 */
	    List<Invest> list = service.getAll(ipage,ipageSize,qo);
	    
	   /**
	    * 查询得到的总信息数
	    */
	    int lPage = service.getAllCount(qo);
	    
	   int totalPage =lPage%ipageSize==0?lPage/ipageSize:lPage/ipageSize+1;
	    
	   
	   /**
	    * 
	    * 共享数据
	    * 
	    */
	    request.setAttribute("totalPage", totalPage);
	    
	    request.setAttribute("page", ipage);
	    
	    request.setAttribute("list", list);
	    
	    request.setAttribute("pageSize", ipageSize);
	    
	    request.setAttribute("h_userInfor", qo.getH_userInfor());
	    request.setAttribute("h_id", qo.getH_id());
	    request.setAttribute("h_StartMoney", qo.getH_startMoney());
	    request.setAttribute("h_endMoney", qo.getH_endMoney());
	    
	   
		request.getRequestDispatcher("/admin/managerinvest.jsp").forward(request, response);
		
	}

	private QueryObject getQueryObject(HttpServletRequest request, HttpServletResponse response) {
		
		
		QueryObject qo=new	QueryObject();
		//得到数据
		String h_id = request.getParameter("h_id");
		String h_userInfor = request.getParameter("h_userInfor");
		String h_StartMoney =request.getParameter("h_StartMoney");
		String h_endMoney =request.getParameter("h_endMoney");
		
		System.out.println(h_id+h_userInfor+h_StartMoney+h_endMoney);
		
		if (ChackStringUtil.isNull(h_id)) {
			int qh_id = Integer.parseInt(h_id);
			long iqh_id=qh_id;
			qo.setH_id(iqh_id);
		}
		if (ChackStringUtil.isNull(h_userInfor)) {
			
			
			qo.setH_userInfor(h_userInfor);
		}
		if (ChackStringUtil.isNull(h_StartMoney)) {
			int qh_id = Integer.parseInt(h_StartMoney);
			
			qo.setH_startMoney(qh_id);
		}
		
		
		if (ChackStringUtil.isNull(h_endMoney)) {
			int qh_id = Integer.parseInt(h_endMoney);
			
			qo.setH_endMoney(qh_id);
		}
		
		System.out.println(qo);
		
		return qo;
	}

}
