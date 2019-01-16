package com.chinasoft.service.impl;

import java.sql.ResultSet;
import java.util.List;

import com.chinasoft.dao.LoanDao;
import com.chinasoft.dao.impl.LoanDaoImpl;
import com.chinasoft.entity.Loan;
import com.chinasoft.service.LoanService;

public class LoanServiceImpl implements LoanService{
      LoanDao  dao = new LoanDaoImpl();
	@Override
	public List<Loan> getAll() {
		
		return dao.getAll();
	}
	@Override
	public Loan get(long b_contractid) {
		return dao.get(b_contractid);
	}
	@Override
	public int addUser(Loan loan) {
		return dao.addUser(loan);
	}
	@Override
	public void delLoan(long b_contractid) {
		dao.delLoan(b_contractid);
	}
	@Override
	public void updateLoan(Loan loan) {
		dao.updateLoan(loan);
		
	}
	/**
	 * Loan∑÷“≥
	 */
	@Override
	public  List<Loan> find(int currPage, int pageSize) {
		return dao.find(currPage, pageSize);
	}
	@Override
	public int findCount() {
		return dao.findCount();
	}
	

}
