package com.chinasoft.servlet.manager;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chinasoft.entity.Loan;
import com.chinasoft.service.LoanService;
import com.chinasoft.service.impl.LoanServiceImpl;
import com.chinasoft.util.ChackStringUtil;
import com.chinasoft.util.DBUtil;

@WebServlet(name = "LoanServlet", urlPatterns = "/Loan", initParams = { @WebInitParam(name = "every", value = "5") })
public class LoanServlet extends HttpServlet {
	LoanServiceImpl lsi = new LoanServiceImpl();
	LoanService dao = null;
	Loan loan = new Loan();
	List<Loan> list = null;
	int count = 0;

	public LoanServlet() {
		super();
	}

	public void init() throws ServletException {
		dao = new LoanServiceImpl();
	}

	@Override
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String cmd = request.getParameter("cmd");
		if ("add".equals(cmd)) {
			this.addAndUpdate(request, response);
		} else if ("edit".equals(cmd)) {
			this.edit(request, response);
		} else if ("del".equals(cmd)) {
			this.del(request, response);
		} else {
			this.list(request, response);
		}

	}

	public void addAndUpdate(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		String account = request.getParameter("b_account");
		String starttime = request.getParameter("b_starttime");
		String endtime = request.getParameter("b_endtime");
		String totalmoney = request.getParameter("b_totalmoney");
		String rate = request.getParameter("b_rate");
		String type = request.getParameter("b_type");
		String status = request.getParameter("b_status");
		String reason = request.getParameter("b_reason");
		String money = request.getParameter("b_money");
		String id = request.getParameter("id");
		
		
		loan.setB_account(account);
		loan.setB_starttime(starttime);
		loan.setB_endtime(endtime);
		loan.setB_totalmoney(totalmoney);
		loan.setB_rate(rate);
		loan.setB_type(type);
		loan.setB_status(Integer.valueOf(status));
		loan.setB_reason(reason);
		loan.setB_money(Double.valueOf(money));
		
		if (hasLength(id)) {
			int iid = Integer.parseInt(id);
			long l = iid;
			loan.setB_contractid(l);
			dao.updateLoan(loan);

		} else {
			dao.addUser(loan);
		}
		
		response.sendRedirect(" /ptwoploan/Loan");

	}

	public void del(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String sid = request.getParameter("id");
		dao.delLoan(Long.valueOf(sid));
		response.sendRedirect(" /ptwoploan/Loan");

	}

	public void edit(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String sid = request.getParameter("id");
		System.out.println(sid);

		if (hasLength(sid)) {
			int parseInt = Integer.parseInt(sid);
			Long lo = (long) parseInt;
			Loan loan = dao.get(lo);
			request.setAttribute("loan", loan);

		}

		request.getRequestDispatcher("/admin/edit.jsp").forward(request,
				response);

	}

	public void list(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 当前页
		String currtpage = request.getParameter("page");
		int icurrtpage = 1;
		if (LoanServlet.hasLength(currtpage)) {
			int c = Integer.parseInt(currtpage);
			icurrtpage = c;
		}
		String ievery = this.getInitParameter("every");
		int every = Integer.parseInt(ievery);
		// 分页后的借款人（查询得到）
		List<Loan> list = dao.find(icurrtpage, every);
		// 当前页（页面传来）
		// 页面大小（定值）
		// 上一页
		// 下一页
		// 首页
		// 末页（总页数）
		// 总页数（计算出来）
		int count = dao.findCount();
		int tatolPage = count / every;
		if (count % every > 0) {
			tatolPage += 1;
		}
		request.setAttribute("loan", list);
		request.setAttribute("page", icurrtpage);

		request.setAttribute("pagecount", tatolPage);

		request.getRequestDispatcher("/admin/managerloan.jsp").forward(request,
				response);
	}

	public static boolean hasLength(String str) {
		return str != null && !"".equals(str.trim());

	}

}
