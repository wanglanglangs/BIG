package com.chinasoft.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

	private static final String driver ="com.mysql.jdbc.Driver";
	private static final String url="jdbc:mysql://localhost:3306/mydata?useUnicode=true&characterEncoding=UTF-8";
	private static final String username ="root";
	private static final String password ="root";
	private static Connection conn = null;
	static{
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static Connection getconn()
	{
		if(conn == null)
		{
			try {
				conn = DriverManager.getConnection(url,username,password);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return conn;
	}
	
}
