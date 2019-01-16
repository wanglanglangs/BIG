package com.chinasoft.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.chinasoft.dao.UserDao;
import com.chinasoft.entity.User;
import com.chinasoft.util.DBUtil;

public class UserDaoImpl implements UserDao {
	
	 private Connection conn =null;
	 private   PreparedStatement pstmt = null;
	 private  ResultSet rs = null;

	@Override
	public int updateUserInFor(User user) {
		// TODO Auto-generated method stub
		conn = DBUtil.getConn();
		try {
			pstmt  =conn.prepareStatement("update user set l_name = ?,l_address = ?,l_idcard = ?,l_company = ?,l_salary =?,l_otherinfor = ?,l_tel = ? where l_account = ? ");
			pstmt.setString(1, user.getName());
			pstmt.setString(2, user.getAddress());
			pstmt.setString(3, user.getIdcart());
			pstmt.setString(4, user.getCompany());
			pstmt.setString(5, user.getSalary());
			pstmt.setString(6, user.getOtherinfor());
			pstmt.setString(7, user.getTel());
			pstmt.setString(8, user.getAccount());
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBUtil.close(conn, pstmt, rs);
		}
		return 0;
	}

	
	@Override
	public int saveUser(User user) {
		conn = DBUtil.getConn();
		String sql ="insert into  user (l_account,l_pass,l_tel) values(?,?,?)";
		
		try {
			
			pstmt=conn.prepareStatement(sql);
			
			pstmt.setString(1, user.getAccount());
			pstmt.setString(2, user.getPass());
			pstmt.setString(3, user.getTel());
			
			int update = pstmt.executeUpdate();
			
			return update;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBUtil.close(conn, pstmt, rs);
		}
		
		return 0;
	}
	
	/**
	 * ”√ªßµ«¬º
	 */
	@Override
	public boolean queryUserByPassAndAccount(User user) {
		conn = DBUtil.getConn();
		String sql = "select * from user where l_account=? and l_pass=?";
		
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, user.getAccount());
			pstmt.setString(2, user.getPass());
			
			ResultSet executeUpdate = pstmt.executeQuery();
			
			if (executeUpdate.next()) {
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


	/**
	 * ≤‚ ‘
	 * @param args
	 */
	public static void main(String[] args) {
		User user = new User();
		user.setAccount("401945332");
		user.setPass("123456");
		user.setTel("13456985457");
		boolean user2 = new UserDaoImpl().queryUserByPassAndAccount(user);
		System.out.println(user2);
	}

}
