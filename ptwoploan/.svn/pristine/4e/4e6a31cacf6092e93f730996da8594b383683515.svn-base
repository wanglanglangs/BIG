package com.chinasoft.dao;

import java.sql.ResultSet;
import java.util.List;

import com.chinasoft.entity.Loan;
import com.chinasoft.entity.User;

public interface LoanDao {

//查询所有借款信息
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
 //查每页显示的信息数，所以用一个集合来接收
 public  List<Loan> find(int currPage,int pageSize);
 //查总条数，返回的是一个数字，所以返回一个int
 public int findCount();
 
}
