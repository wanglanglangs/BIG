package com.chinasoft.servlet.manager;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chinasoft.entity.Capital;
import com.chinasoft.entity.Invest;
import com.chinasoft.service.InvestService;
import com.chinasoft.service.ManagerLoginService;
import com.chinasoft.service.impl.InvestServiceImpl;
import com.chinasoft.service.impl.ManagerLoginImpl;
import com.chinasoft.util.ChackStringUtil;
import com.chinasoft.util.DBUtil;
import com.google.gson.Gson;
@WebServlet("/QueryAllMoneyServlet")
public class QueryAllMoneyServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	private Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	public QueryAllMoneyServlet() {
		super();
	}

	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		Double allLoan = Double.parseDouble(getAll());
		
		Double allinvester = Double.parseDouble(getAllinvester());
		
		request.setAttribute("allLoan", allLoan);
		
		
		request.setAttribute("allinvester", allinvester);
		
		request.getRequestDispatcher("/admin/Manager_Money.jsp").forward(request, response);;
			
		}
	
	
	
	
	protected String getAll() {
		conn = DBUtil.getConn();
		try {
			
			pstmt = conn.prepareStatement("SELECT SUM(b_money) FROM loan");
			
			rs = pstmt.executeQuery();
			
			String moneyLon = null;
			
			if (rs.next()) {
				moneyLon=rs.getString(1);
			}

			return moneyLon;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtil.close(conn, pstmt, rs);
		}

		return null;
	}
	
	protected String getAllinvester() {
		conn = DBUtil.getConn();
		try {
			
			pstmt = conn.prepareStatement("SELECT SUM(t_money) FROM invest");
			
			rs = pstmt.executeQuery();
			
			String moneyLon = null;
			
			if (rs.next()) {
				moneyLon=rs.getString(1);
			}

			return moneyLon;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtil.close(conn, pstmt, rs);
		}

		return null;
	}
		
	}




