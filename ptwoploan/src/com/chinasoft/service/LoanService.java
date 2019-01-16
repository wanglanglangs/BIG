package com.chinasoft.service;

import java.sql.ResultSet;
import java.util.List;

import com.chinasoft.entity.Loan;

public interface LoanService {
	
	/**
	 * 查询所有借款用户
	 * @return
	 */
	public List<Loan> getAll();
	//查询单个借款信息
	 public Loan get(long b_contractid);
	 //添加借款信息
	 public int addUser(Loan loan);
	 //删除借款信息
	 public void delLoan(long b_contractid);
	 // 修改借款用户信息
	 public void updateLoan(Loan loan);
	 
	 /**
	  * Loan分页接口
	  */
	 //查每页显示的条数，
	 public  List<Loan> find(int currPage,int pageSize);
	 //查总条数
	 public int findCount();
	

}
