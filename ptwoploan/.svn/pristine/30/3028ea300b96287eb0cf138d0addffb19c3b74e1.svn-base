package com.chinasoft.service.impl;


import java.util.List;

import com.chinasoft.dao.impl.UserInfoImpl;
import com.chinasoft.entity.Invest;
import com.chinasoft.entity.Loan;
import com.chinasoft.entity.Project;
import com.chinasoft.entity.User;
import com.chinasoft.service.IUserInfoService;

public class UserInfoServiceImpl implements IUserInfoService {
	
	private static UserInfoImpl uii = new UserInfoImpl();
	@Override
	public User queryUserInfo(String account) {
		return uii.queryUserInfo(account);
	}
	@Override
	public List<Invest> queryMyInvest(String account,int start,int end) {
		return uii.queryMyInvest(account,start,end);
	}
	@Override
	public List<Loan> queryMyLoan(String account,int start,int end) {
		return uii.queryMyLoan(account,start,end);
	}
	@Override
	public int queryCountMyInvest(String account) {
		return uii.queryCountMyInvest(account);
	}
	@Override
	public int queryCountMyLoan(String account) {
		return uii.queryCountMyLoan(account);
	}
	@Override
	public boolean updateMyInfo(User user) {
		return uii.updateUserInfo(user);
	}
	@Override
	public Project queryProjectById(String id) {
		return uii.queryProJectById(id);
	}
	@Override
	public Loan queryLoanById(long id) {
		return uii.queryLoanByLId(id);
	}
	@Override
	public boolean updateTotalMoney(String account, double tmon, double mon) {
		return uii.updateTotalMoney(account, tmon, mon);
	}
	@Override
	public boolean updateMoney(String account, int mon) {
		return uii.updateMoney(account, mon);
	}
	
}
