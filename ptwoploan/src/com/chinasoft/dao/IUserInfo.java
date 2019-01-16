package com.chinasoft.dao;

import java.sql.ResultSet;
import java.util.List;

import com.chinasoft.entity.Invest;
import com.chinasoft.entity.Loan;
import com.chinasoft.entity.Project;
import com.chinasoft.entity.User;

public interface IUserInfo {
	/**
	 * 我的账户下显示当前用户信息
	 * @param account
	 * @return
	 */
	User queryUserInfo(String account);
	/**
	 * 查询当前用户下的所有投资信息
	 * @param account
	 * @return
	 */
	List<Invest> queryMyInvest(String account,int start,int end);
	/**
	 * 查询当前用户下的投资记录总数
	 * @return
	 */
	int queryCountMyInvest(String account);
	/**
	 * 查询当前用户下的所有借款信息
	 * @param account
	 * @return
	 */
	List<Loan> queryMyLoan(String account,int start,int end);
	/**
	 * 查询当前用户下的借款记录总数
	 * @return
	 */
	int queryCountMyLoan(String account);
	/**
	 * 根据id查询项目信息
	 * @param id
	 * @return
	 */
	Project queryProJectById(String id);
	/**
	 * 修改用户信息
	 * @param user
	 * @return
	 */
	boolean updateUserInfo(User user);
	/**
	 * 根据借款号查询借款信息
	 * @param lid
	 * @return
	 */
	Loan queryLoanByLId(long lid);
	/**
	 * 根据账户修改借款人应还金额
	 * @param account
	 * @param tmon应还金额
	 * @param mon还款金额
	 * @return
	 */
	boolean updateTotalMoney(String account,double tmon,double mon);
	/**
	 * 根据账户修改余额
	 * @param account
	 * @param mon
	 * @return
	 */
	boolean updateMoney(String account,int mon);
}
