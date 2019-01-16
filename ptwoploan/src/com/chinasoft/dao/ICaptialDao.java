package com.chinasoft.dao;

import java.util.List;

import com.chinasoft.entity.Capital;



public interface ICaptialDao {

	
	//查询所有账户资金信息
	 public List<Capital> getAll();	
	 //查询单个借款信息
	 public Capital get(String c_account);
	// 修改用户资金信息
	 public void updateLoan(Capital capital);
	 //添加用户资金信息
	 public int addCapital(Capital capital);
}
