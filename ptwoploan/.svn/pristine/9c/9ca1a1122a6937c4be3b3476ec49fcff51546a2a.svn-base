package com.chinasoft.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.chinasoft.dao.ICaptialDao;
import com.chinasoft.entity.Capital;
import com.chinasoft.servlet.login.CaptchaServlet;
import com.chinasoft.util.DBUtil;

public class CapitalDaoImpl implements ICaptialDao {
	private Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	

	@Override
	public List<Capital> getAll() {
		conn = DBUtil.getConn();
		List<Capital> list = new ArrayList<Capital>();
		try {
			pstmt = conn.prepareStatement("select * from capital");
			rs = pstmt.executeQuery();
			while (rs.next()) {
				Capital capital = new Capital();
				capital.setC_account(rs.getString(1));
				capital.setC_balance(rs.getDouble(2));
				capital.setC_icinvest(rs.getDouble(3));
				capital.setC_pdincome(rs.getDouble(4));
				capital.setC_reimburse(rs.getDouble(5));
				capital.setC_sploan(rs.getDouble(6));
				capital.setC_ttinvest(rs.getDouble(7));
				capital.setC_ttloan(rs.getDouble(8));
				
				list.add(capital);
				//System.out.println(capital);
			}
			return list;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtil.close(conn, pstmt, rs);
		}

		return null;
	}

	@Override
	public Capital get(String c_account) {
		conn = DBUtil.getConn();
		try {
			pstmt = conn
					.prepareStatement("select * from capital where c_account=? ");
			pstmt.setString(1, c_account);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				Capital capital = new Capital();
				capital.setC_account(rs.getString(1));
				capital.setC_balance(rs.getDouble(2));
				capital.setC_icinvest(rs.getDouble(3));
				capital.setC_pdincome(rs.getDouble(4));
				capital.setC_reimburse(rs.getDouble(5));
				capital.setC_sploan(rs.getDouble(6));
				capital.setC_ttinvest(rs.getDouble(7));
				capital.setC_ttloan(rs.getDouble(8));
				//System.out.println(capital);
				return capital;
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtil.close(conn, pstmt, rs);
		}
		return null;
	}


	@Override
	public void updateLoan(Capital capital) {
		conn = DBUtil.getConn();

		try {
			pstmt = conn.prepareStatement("UPDATE capital SET c_balance=?,c_ttinvest=?,c_icinvest=?,c_pdincome=?,c_ttloan=?,c_reimburse=?,c_sploan=? WHERE c_account=?");

			pstmt.setDouble(1, capital.getC_balance());
			pstmt.setDouble(2, capital.getC_ttinvest());
			pstmt.setDouble(3, capital.getC_icinvest());
			pstmt.setDouble(4, capital.getC_pdincome());
			pstmt.setDouble(5, capital.getC_ttloan());
			pstmt.setDouble(6, capital.getC_reimburse());
			pstmt.setDouble(7, capital.getC_sploan());
			pstmt.setString(8, capital.getC_account());
			
			pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtil.close(conn, pstmt, rs);
		}
		
	}
	

		@Override
		public int addCapital(Capital capital) {
	
			conn = DBUtil.getConn();
			String sql = "insert into capital(c_account,c_balance,c_ttinvest,c_icinvest,c_pdincome,c_ttloan,c_reimburse,c_sploan)  values(?,?,?,?,?,?,?,?)";
			try {
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, capital.getC_account());
				pstmt.setDouble(2, capital.getC_balance());
				pstmt.setDouble(3, capital.getC_ttinvest());
				pstmt.setDouble(4, capital.getC_icinvest());
				pstmt.setDouble(5, capital.getC_pdincome());
				pstmt.setDouble(6, capital.getC_ttloan());
				pstmt.setDouble(7, capital.getC_reimburse());
				pstmt.setDouble(8, capital.getC_sploan());
				
				return pstmt.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				DBUtil.close(conn, pstmt, rs);
			}
	
			return 0;
		}
	
	public static void main(String[] args) {
		CapitalDaoImpl cdi = new CapitalDaoImpl();
		Capital capital = new Capital();
		capital.setC_account("zhang");
		capital.setC_sploan(500);
		capital.setC_ttinvest(2000);
		cdi.updateLoan(capital);
		cdi.addCapital(capital);
	}


	

}
