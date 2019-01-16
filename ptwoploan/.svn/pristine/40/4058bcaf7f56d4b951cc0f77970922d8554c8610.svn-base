package com.chinasoft.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/**
 * 数据源工具类
 * @author 田振江
 * @date 2018年12月27日 下午4:47:33
 */
public class DBUtil {
	//
	private static DataSource dataSource = new ComboPooledDataSource();
	//创建本地线程池
	private static ThreadLocal<Connection> tl = new ThreadLocal<Connection>();
	
	public static DataSource getDataSource(){
		return dataSource;
	}
	/**
	 * 如果需要手动控制事物,可以调用方法获得一个连接
	 * @return
	 */
	public static Connection getConn(){
		Connection conn = tl.get();
		try {
			conn = dataSource.getConnection();
			tl.set(conn);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	/**
	 * 开始事物
	 */
	public static void startTransanction(){
		Connection conn = getConn();
		if(conn != null){
			try {
				conn.setAutoCommit(false);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	/**
	 * 从ThreadLocal中关闭Conn,并结束事物
	 */
	public static void releaseAndCloseConnection(){
		Connection conn = getConn();
		if(conn != null){
			try {
				conn.commit();
				tl.remove();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	/**
	 * 事物回滚
	 */
	public static void rollback(){
		Connection conn = getConn();
		if(conn != null){
			try {
				conn.rollback();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void close(Connection conn,PreparedStatement pstmt, ResultSet rs) {
		try {
			if (rs != null) {
				rs.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null) {
					pstmt.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}finally{
				try {
					if (conn != null) {
						conn.close();
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		System.out.println(getConn());
		
	}
}

