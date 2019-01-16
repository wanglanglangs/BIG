package com.chinasoft.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.chinasoft.dao.LoanDao;
import com.chinasoft.entity.Loan;
import com.chinasoft.util.DBUtil;

public class LoanDaoImpl implements LoanDao {
	private Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	// 查询所有借款人信息
	@Override
	public List<Loan> getAll() {
		conn = DBUtil.getConn();
		List<Loan> list = new ArrayList<Loan>();
		try {
			pstmt = conn.prepareStatement("select * from loan");
			rs = pstmt.executeQuery();
			while (rs.next()) {
				Loan loan = new Loan();
				loan.setB_contractid(rs.getLong(1));
				loan.setB_account(rs.getString(2));
				loan.setB_starttime(rs.getString(3));
				loan.setB_endtime(rs.getString(4));
				loan.setB_totalmoney(rs.getString(5));
				loan.setB_rate(rs.getString(6));
				loan.setB_type(rs.getString(7));
				loan.setB_status(rs.getInt(8));
				loan.setB_reason(rs.getString(9));
				loan.setB_money(rs.getDouble(10));
				list.add(loan);

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

	// 查询一个借款人信息
	@Override
	public Loan get(long b_contractid) {
		conn = DBUtil.getConn();
		try {
			pstmt = conn
					.prepareStatement("select * from loan where b_contractid=? ");
			pstmt.setLong(1, b_contractid);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				Loan loan = new Loan();
				loan.setB_contractid(rs.getLong(1));
				loan.setB_account(rs.getString(2));
				loan.setB_starttime(rs.getString(3));
				loan.setB_endtime(rs.getString(4));
				loan.setB_totalmoney(rs.getString(5));
				loan.setB_rate(rs.getString(6));
				loan.setB_type(rs.getString(7));
				loan.setB_status(rs.getInt(8));
				loan.setB_reason(rs.getString(9));
				loan.setB_money(rs.getDouble(10));

				return loan;
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtil.close(conn, pstmt, rs);
		}
		return null;
	}

	// 增加借款人信息
	@Override
	public int addUser(Loan loan) {
		
		conn = DBUtil.getConn();
		String sql = "insert into Loan(b_account,b_starttime,b_endtime,b_totalmoney,b_rate,b_type,b_money,b_status)  values(?,?,?,?,?,?,?,?)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, loan.getB_account());
			pstmt.setString(2, loan.getB_starttime());
			pstmt.setString(3, loan.getB_endtime());
			pstmt.setString(4, loan.getB_totalmoney());
			pstmt.setString(5, loan.getB_rate());
			pstmt.setString(6, loan.getB_type());
			pstmt.setDouble(7, loan.getB_money());
			pstmt.setInt(8, loan.getB_status());
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(conn, pstmt, rs);
		}

		return 0;
	}

	// 删除借款人信息
	@Override
	public void delLoan(long b_contractid) {
		conn = DBUtil.getConn();
		try {
			pstmt = conn
					.prepareStatement("delete from loan where b_contractid=?");
			pstmt.setLong(1, b_contractid);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtil.close(conn, pstmt, rs);
		}

	}
     //修改借款人信息
	@Override
	public void updateLoan(Loan loan) {

		conn = DBUtil.getConn();

		try {
			pstmt = conn
					.prepareStatement("UPDATE loan SET b_account=?,b_starttime=?,b_endtime=?,b_totalmoney=?,b_rate=?,b_type=?,b_status=?,b_reason=?,b_money=? WHERE b_contractid=?");

			pstmt.setString(1, loan.getB_account());
			pstmt.setString(2, loan.getB_starttime());
			pstmt.setString(3, loan.getB_endtime());
			pstmt.setString(4, loan.getB_totalmoney());
			pstmt.setString(5, loan.getB_rate());
			pstmt.setString(6, loan.getB_type());
			pstmt.setInt(7, loan.getB_status());
			pstmt.setString(8, loan.getB_reason());
			pstmt.setDouble(9, loan.getB_money());
			pstmt.setLong(10, loan.getB_contractid());
			pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtil.close(conn, pstmt, rs);
		}

	}

	/**
	 * Loan分页方法 1.查询每页的显示条数 分页直接在方法里分好，有两个参数，切记：第一个参数是当前页，第二个参数是页面大小（就是
	 * 一页显示的条数）。对两个参数进行设置的时候，套用公式第一个参数即（当前页-1）*页面大小，第二个参数就是页面大小。
	 * 然后把结果集封装成对象放到list集合中 2.查询总条数 开始设个常量来接收查询到的总条数
	 * 
	 * 
	 */
	@Override
	public List<Loan> find(int currPage, int pageSize) {
		conn = DBUtil.getConn();
		List<Loan> list = new ArrayList<Loan>();
		try {
			pstmt = conn.prepareStatement("select * from loan limit ?,?");
			pstmt.setInt(1, (currPage - 1) * pageSize);
			pstmt.setInt(2, pageSize);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next() && rs != null) {
				Loan loan = new Loan(rs.getLong(1), rs.getString(2),
						rs.getString(3), rs.getString(4), rs.getString(5),
						rs.getString(6), rs.getString(7), rs.getInt(8),
						rs.getString(9), rs.getDouble(10));

				list.add(loan);
			}
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBUtil.close(conn, pstmt, rs);
		}
		return null;
	}

	@Override
	public int findCount() {
		conn = DBUtil.getConn();
		int count = 0;
		try {
			pstmt = conn.prepareStatement("select count(*) co from loan");

			rs = pstmt.executeQuery();
			if (rs.next()) {
				count = rs.getInt("co");
			}
			return count;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtil.close(conn, pstmt, rs);
		}
		return 0;
	}

	public static void main(String[] args) {

	/*	LoanDaoImpl l = new LoanDaoImpl();

		System.out.println("djaldja");

		System.out.println(l.findCount());*/

	}

}
