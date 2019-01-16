package com.chinasoft.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.chinasoft.dao.IMoneyDao;
import com.chinasoft.entity.Money;
import com.chinasoft.util.DBUtil;

public class MoneyImpl implements IMoneyDao {
	private Connection conn = null;
	private PreparedStatement pstmt=null;
	private ResultSet rs=null;
	List<Money> list = new ArrayList<Money>();

	@Override
	public int showMoneyByAccount(String account) {
		int balance=0;
		String sql="select * from money where account=?";
		try {
			conn=DBUtil.getConn();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, account);
			rs=pstmt.executeQuery();
			while(rs.next())
			{
				balance= rs.getInt("bal");
			}
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}finally{
			DBUtil.close(conn, pstmt, rs);
		}
	    return balance;
	}

	@Override
	public boolean updateMoneyByAccount(String account,int balance) {
		int flag=1;
		String sql = "update money set bal=? where account=?";
		try {
			conn=DBUtil.getConn();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, account);
		    flag=pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}finally{
			DBUtil.close(conn, pstmt, rs);
		}
		if(flag>0)
		{
			return true;
		}else
		{
			return false;
		}	
	}

	@Override
	public int addUser(Money money) {
		conn = DBUtil.getConn();
		String sql = "insert into money(account,bal)  values(?,?)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, money.getAccount());
			pstmt.setInt(2, money.getMoney());
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(conn, pstmt, rs);
		}

		return 0;
	}
}
