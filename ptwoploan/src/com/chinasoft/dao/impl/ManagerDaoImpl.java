package com.chinasoft.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.chinasoft.dao.ManagerDao;
import com.chinasoft.entity.Manager;
import com.chinasoft.util.DBUtil;

public class ManagerDaoImpl implements ManagerDao{
    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;
	@Override
	public boolean getAll(String m_account ,String m_pass) {
		conn = DBUtil.getConn();
		try {
			pstmt = conn.prepareStatement("select * from manager where  m_account =? and m_pass=?");
			pstmt.setString(1, m_account);
			pstmt.setString(2, m_pass);
			rs=pstmt.executeQuery();
			
			while(rs.next())
			{
				Manager manager = new Manager();
				manager.setM_account(rs.getString(1));
				manager.setM_pass(rs.getString(2));
				manager.setM_status(rs.getInt(3));
				return true;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBUtil.close(conn, pstmt, rs);
		}
		
		return false;
	}

}
