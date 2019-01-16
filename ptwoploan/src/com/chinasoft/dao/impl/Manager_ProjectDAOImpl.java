package com.chinasoft.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.chinasoft.dao.IManager_ProjectDAO;
import com.chinasoft.entity.Project;
import com.chinasoft.util.DBUtil;


public class Manager_ProjectDAOImpl implements IManager_ProjectDAO {

	   Connection conn = null;
	   PreparedStatement pstmt = null;
	   ResultSet rs = null;
	   
	   
	@Override
	public boolean deleteProjuct(int id) {
		String sql = "delete from projects where p_id="+id;
		conn = DBUtil.getConn();
		try {
			pstmt= conn.prepareStatement(sql);
		    
			int res = pstmt.executeUpdate();
			
			if (res>0) {
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

	@Override
	public boolean updateProduct(Project pro) {
		
		conn = DBUtil.getConn();
		try {
			pstmt = conn.prepareStatement("UPDATE projects SET p_name=?,p_rate=?,p_money=?,p_time=?  WHERE p_id=?");
				pstmt.setString(1, pro.getName());
				pstmt.setString(2, pro.getRate());
				pstmt.setString(3, pro.getMoney());
				pstmt.setString(4, pro.getTime());
				pstmt.setInt(5, pro.getId());
			int update = pstmt.executeUpdate();

			if (update>0) {
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtil.close(conn, pstmt, rs);
		}
		return false;
	}

	@Override
	public boolean saveProjuct() {
		// TODO Auto-generated method stub
		return false;
	}

	public static void main(String[] args) {
		
		Project p = new Project();
		p.setId(123);
		p.setName("123");
		p.setRate("123");
		p.setMoney("123");
		p.setTime("123");
		System.out.println(new Manager_ProjectDAOImpl().updateProduct(p));
	}
}
