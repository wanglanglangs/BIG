package com.chinasoft.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.chinasoft.dao.IProject;
import com.chinasoft.entity.Project;
import com.chinasoft.util.DBUtil;



public class ProjectImpl implements IProject {
	private Connection conn =  null;
	private PreparedStatement pstmt=null;
	private ResultSet rs=null;
	List<Project> list=new ArrayList<Project>();

	@Override
	public  List<Project> getAll() {
		// TODO 自动生成的方法存根
		try {
			conn =DBUtil.getConn();
			pstmt=conn.prepareStatement("select * from projects");
			rs=pstmt.executeQuery();
			while(rs.next())
			{
				Project p = new Project();
				p.setId(rs.getInt(1));
				p.setName(rs.getString(2));
				p.setRate(rs.getString(3));
				p.setMoney(rs.getString(4));
				p.setTime(rs.getString(5));
				list.add(p);
			}
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}finally{
			DBUtil.close(conn, pstmt, rs);
		}
		return list;
	}

	@Override
	public List<Project> queryProjectByTime(String time) {
		// TODO 自动生成的方法存根
		try {
			conn =DBUtil.getConn();
			pstmt=conn.prepareStatement("select * from projects where p_time=?");
			pstmt.setString(1, time);
			rs=pstmt.executeQuery();
			while(rs.next())
			{
				Project p = new Project();
				p.setId(rs.getInt(1));
				p.setName(rs.getString(2));
				p.setRate(rs.getString(3));
				p.setMoney(rs.getString(4));
				p.setTime(rs.getString(5));
				list.add(p);
			}
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}finally{
			DBUtil.close(conn, pstmt, rs);
		}
		
		return list;
	}
	public List<Project> queryProjectByOther() {//查询其他项目
		// TODO 自动生成的方法存根
		try {
			conn =DBUtil.getConn();
			pstmt=conn.prepareStatement("select * from projects where p_time not in (1,3,6,9,12)");
			rs=pstmt.executeQuery();
			while(rs.next())
			{
				Project p = new Project();
				p.setId(rs.getInt(1));
				p.setName(rs.getString(2));
				p.setRate(rs.getString(3));
				p.setMoney(rs.getString(4));
				p.setTime(rs.getString(5));
				list.add(p);
			}
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}finally{
			DBUtil.close(conn, pstmt, rs);
		}
		return list;
	}
	public Project queryProjectById(int id) {
		// TODO 自动生成的方法存根
		try {
			conn =DBUtil.getConn();
			pstmt=conn.prepareStatement("select * from projects where p_id=?");
			pstmt.setInt(1, id);
			rs=pstmt.executeQuery();
			while(rs.next())
			{
				Project p = new Project();
				p.setId(rs.getInt(1));
				p.setName(rs.getString(2));
				p.setRate(rs.getString(3));
				p.setMoney(rs.getString(4));
				p.setTime(rs.getString(5));
				return p;
			}
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}finally{
			DBUtil.close(conn, pstmt, rs);
		}
		
		return null;
	}
}
