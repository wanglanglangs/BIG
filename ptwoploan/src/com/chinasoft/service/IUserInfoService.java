package com.chinasoft.service;

import java.util.List;

import com.chinasoft.entity.Invest;
import com.chinasoft.entity.Loan;
import com.chinasoft.entity.Project;
import com.chinasoft.entity.User;

public interface IUserInfoService {
	/**
	 * 调用dao的查询用户信息方法
	 * @param account
	 * @return
	 */
	public User queryUserInfo(String account);
	/**
	 * 调用dao的查询当前用户下所有投资信息
	 * @param account
	 * @return
	 */
	public List<Invest> queryMyInvest(String account,int start,int end);
	/**
	 * 调用dao查询当前用户下的投资记录总数
	 * @return
	 */
	int queryCountMyInvest(String account);
	/**
	 * 调用dao的查询当前用户下的所有借款信息
	 * @param account
	 * @return
	 */
	public List<Loan> queryMyLoan(String account,int start,int end);
	/**
	 * 调用dao查询当前用户下的投资记录总数
	 * @return
	 */
	int queryCountMyLoan(String account);
	/**
	 * 调用dao查询当前用户下根据项目id查
	 * @param id
	 * @return
	 */
	Project queryProjectById(String id);
	/**
	 * 调用dao的修改用户信息
	 * @param user
	 * @return
	 */
	boolean updateMyInfo(User user);
	/**
	 * 调用dao根据id查询借款信息
	 * @param id
	 * @return
	 */
	Loan queryLoanById(long id);
	/**
	 * 调用dao根据id修改应还金额
	 * @param account账户
	 * @param tmon应还金额
	 * @param mon 还款金额
	 * @return
	 */
	boolean updateTotalMoney(String account, double tmon,double mon);
	/**
	 * 调用dao根据账户修改余额
	 * @param account
	 * @param mon
	 * @return
	 */
	boolean updateMoney(String account,int mon);
}
