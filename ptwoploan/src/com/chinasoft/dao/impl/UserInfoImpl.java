package com.chinasoft.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.chinasoft.dao.IUserInfo;
import com.chinasoft.entity.Invest;
import com.chinasoft.entity.Loan;
import com.chinasoft.entity.Project;
import com.chinasoft.entity.User;
import com.chinasoft.util.DBUtil;

public class UserInfoImpl implements IUserInfo {

	private static Connection conn = null;
	private static PreparedStatement pstmt = null;
	private static ResultSet rs = null;

	@Override
	public User queryUserInfo(String account) {
		conn = DBUtil.getConn();
		String sql = "select * from user where l_account=?";
		User user = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, account);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				user = new User(rs.getInt(1), rs.getString(2), rs.getString(3),
						rs.getString(4), rs.getString(5), rs.getString(6),
						rs.getString(7), rs.getString(8), rs.getString(9),
						rs.getString(10));
			}
			return user;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(conn, pstmt, rs);
		}
		return null;
	}

	@Override
	public List<Invest> queryMyInvest(String account,int start,int end) {
		conn = DBUtil.getConn();
		List<Invest> list = new ArrayList<Invest>();
		try {
			pstmt = conn
					.prepareStatement("select * from invest where t_account = ? limit "+start+","+end);
			pstmt.setString(1, account);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				Invest invest = new Invest();
				invest.setTid(rs.getLong(1));
				invest.setTaccount(rs.getString(2));
				invest.setTitem(rs.getString(3));
				invest.setTmoney(rs.getString(4));
				invest.setTtotla(rs.getString(5));
				invest.setTstart(rs.getString(6));
				invest.setTend(rs.getString(7));
				invest.setTrate(rs.getString(8));
				list.add(invest);

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
	public List<Loan> queryMyLoan(String account,int start,int end) {
		conn = DBUtil.getConn();

		List<Loan> list = new ArrayList<Loan>();
		try {
			pstmt = conn
					.prepareStatement("select * from loan where b_account = ? limit "+start+","+end);
			pstmt.setString(1, account);
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

	@Override
	public int queryCountMyInvest(String account) {
		conn = DBUtil.getConn();
		try {
			pstmt = conn.prepareStatement("select count(1) co from invest where t_account = ?");
			pstmt.setString(1, account);
			rs = pstmt.executeQuery();
			if(rs.next()){
				return rs.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(conn, pstmt, rs);
		}
		return 0;
	}

	@Override
	public int queryCountMyLoan(String account) {
		conn = DBUtil.getConn();
		try {
			pstmt = conn.prepareStatement("select count(1) co from loan where b_account = ?");
			pstmt.setString(1, account);
			rs = pstmt.executeQuery();
			if(rs.next()){
				return rs.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(conn, pstmt, rs);
		}
		return 0;
	}

	@Override
	public boolean updateUserInfo(User user) {
		conn = DBUtil.getConn();
		try {
			pstmt = conn.prepareStatement("update user set l_name = ?,l_address = ?,l_idcard = ?,l_company = ?,l_salary =?,l_otherinfor = ?,l_tel = ? where l_account = ? ");
			pstmt.setString(1, user.getName());
			pstmt.setString(2, user.getAddress());
			pstmt.setString(3, user.getIdcart());
			pstmt.setString(4, user.getCompany());
			pstmt.setString(5, user.getSalary());
			pstmt.setString(6, user.getOtherinfor());
			pstmt.setString(7, user.getTel());
			pstmt.setString(8, user.getAccount());
			if(pstmt.executeUpdate() == 1){
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(conn, pstmt, rs);
		}
		return false;
	}

	@Override
	public Project queryProJectById(String id) {
		conn = DBUtil.getConn();
		try {
			pstmt = conn.prepareStatement("select * from projects where p_name = ?");
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if(rs.next()){
				Project pro = new Project(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
				return pro;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(conn, pstmt, rs);
		}
		return null;
	}

	@Override
	public Loan queryLoanByLId(long lid) {
		conn = DBUtil.getConn();
		try {
			pstmt = conn.prepareStatement("select * from loan where b_contractid = ?");
			pstmt.setLong(1, lid);
			rs = pstmt.executeQuery();
			if (rs.next()) {
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
			e.printStackTrace();
		}finally {
			DBUtil.close(conn, pstmt, rs);
		}
		return null;
	}

	@Override
	public boolean updateTotalMoney(String account, double tmon,double mon) {
		conn = DBUtil.getConn();
		try {
			if(tmon == mon){
				pstmt = conn.prepareStatement("update loan set b_totalmoney = 0,b_status=2 where b_contractid = ? ");
				pstmt.setInt(1, Integer.parseInt(account));
			}else{
				pstmt = conn.prepareStatement("update loan set b_totalmoney = ? where b_contractid = ? ");
				pstmt.setDouble(1, (tmon-mon));
				pstmt.setInt(2, Integer.parseInt(account));
			}
			
			if(pstmt.executeUpdate() == 1){
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(conn, pstmt, rs);
		}
		return false;
	}

	@Override
	public boolean updateMoney(String account, int mon) {
		conn = DBUtil.getConn();
		try {
			pstmt = conn.prepareStatement("update money set bal = ? where account = ? ");
			pstmt.setInt(1, mon);
			pstmt.setString(2, account);
			if(pstmt.executeUpdate() == 1){
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(conn, pstmt, rs);
		}
		return false;
	}

}
