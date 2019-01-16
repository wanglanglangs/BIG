package com.chinasoft.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import com.chinasoft.dao.InvestDao;
import com.chinasoft.entity.Echarts_InvterInfor;
import com.chinasoft.entity.Invest;
import com.chinasoft.entity.QueryObject;
import com.chinasoft.util.DBUtil;

public class InvestDaoImpl implements InvestDao {
   Connection conn = null;
   PreparedStatement pstmt = null;
   ResultSet rs = null;
   //查询所有的投资人信息
	@Override
	public List<Invest> getAll(int page,int pageSize,QueryObject qo) {
		
		String sql1=" limit ?,?";
		
		conn = DBUtil.getConn();
		
		String sql2= "select * from Invest";
		
		StringBuffer sb = new StringBuffer();
		
		sb.append(sql2);
		
		//得到数据
		String querySQL = qo.getQuerySQL();
		
		sb.append(querySQL);
		
		sb.append(sql1);
		
		System.out.println(sb.toString());
		
		List<Invest> list = new ArrayList<Invest>();
		try {
			
			pstmt= conn.prepareStatement(sb.toString());
			pstmt.setInt(1, (page-1)*pageSize);
			pstmt.setInt(2, pageSize);
			rs = pstmt.executeQuery();
			while(rs.next())
			{
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
		}finally{
			DBUtil.close(conn, pstmt, rs);
		}
		
		return null;
	}
  //查询单个的投资人信息表
	@Override
	public Invest get(long tid) {
		
		conn = DBUtil.getConn();
		try {
			pstmt= conn.prepareStatement("select * from Invest where tid=? ");
			pstmt.setLong(1, tid);
		    rs=pstmt.executeQuery();
		    while(rs.next())
		    {
		    	Invest invest = new Invest();
		    	invest.setTid(rs.getLong(1));
				invest.setTaccount(rs.getString(2));
				invest.setTitem(rs.getString(3));
				invest.setTmoney(rs.getString(4));
				invest.setTtotla(rs.getString(5));
				invest.setTstart(rs.getString(6));
				invest.setTend(rs.getString(7));
				invest.setTrate(rs.getString(8));
				
				return invest;
		    	
		    }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBUtil.close(conn, pstmt, rs);
		}
		
		return null;
	}
	
	
	@Override
	public boolean deleteInsertInfor(Long id) {
		
		String sql = "delete from Invest where t_id="+id;
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
	public int getAllCount(QueryObject qo) {
		String sql = "select count(*) from Invest";
		
		StringBuffer sb = new StringBuffer();
		
		
		//得到数据
		String querySQL = qo.getQuerySQL();
		
		
		sb.append(sql);
		sb.append(querySQL);
		
		conn = DBUtil.getConn();
		try {
			pstmt= conn.prepareStatement(sb.toString());
		    
			ResultSet res = pstmt.executeQuery();
			
			if (res.next()) {
				int count = res.getInt(1);
				
				return count;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBUtil.close(conn, pstmt, rs);
		}
		
		return 0;
	}
	
	public int addInvest(Invest pro) {
		conn=DBUtil.getConn();
		try {
			pstmt = conn.prepareStatement("insert into invest(t_account,t_item,t_money,t_total,t_start,t_end,t_rate) values (?,?,?,?,?,?,?)");
			pstmt.setString(1, pro.getTaccount());
			pstmt.setString(2, pro.getTitem());
			pstmt.setString(3, pro.getTmoney());
			pstmt.setString(4, pro.getTtotla());
			pstmt.setString(5, pro.getTstart());
			pstmt.setString(6, pro.getTend());
			pstmt.setString(7, pro.getTrate());
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}finally{
			DBUtil.close(conn, pstmt, rs);
		}
		return -1;
	}
	
	
	@Override
	public List<Echarts_InvterInfor> getEcharts_InvterInfor() {

		
		
		conn = DBUtil.getConn();
		
		String sql2= "select t_money,t_start from Invest";
		
		List<Echarts_InvterInfor> list = new ArrayList<Echarts_InvterInfor>();
		
		try {
			
			pstmt= conn.prepareStatement(sql2);
			
			rs = pstmt.executeQuery();
			
			while(rs.next())
			{
				Echarts_InvterInfor ei =new Echarts_InvterInfor(); 
				
				
//				ei.setName(rs.getString("t_start").substring(0,4));
				
				ei.setName(rs.getString("t_start"));
				
				ei.setNumber(Integer.parseInt(rs.getString("t_money")));
				
				list.add(ei);
				
			}
			
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBUtil.close(conn, pstmt, rs);
		}
		
		return null;
		
	}
	
	
	
	/**
	 * 测试
	 */
	public static void main(String[] args) {
		
		QueryObject qo=new	QueryObject();
		qo.setH_id(1L);
//		qo.setH_userInfor("aa");
//		qo.setH_startMoney(200);
//		qo.setH_endMoney(0);
		
		
		
		Echarts_InvterInfor ei = new Echarts_InvterInfor();
		
		Echarts_InvterInfor ei1 = new Echarts_InvterInfor();
		
		List<Echarts_InvterInfor> de = new InvestDaoImpl().getEcharts_InvterInfor();
		
		
		List<Echarts_InvterInfor> dep = new ArrayList<Echarts_InvterInfor>();
		
		int sum=0;
		int sum1=0;
		
		for (int i = 0; i < de.size(); i++) {
			
			
				if (de.get(i).getName().equals("2018")) {
					
					sum+=de.get(i).getNumber();
					
				}
				
                if (de.get(i).getName().equals("2019")) {
					
					sum1+=de.get(i).getNumber();
				}
			
		}
		ei.setName("2018");
		ei.setNumber(sum);
		dep.add(ei);
		
		ei1.setName("2019");
		ei1.setNumber(sum1);
		dep.add(ei1);
		
		System.out.println(sum);
		System.out.println(sum1);
		
		System.out.println(dep);
		
	}
	
	
}
