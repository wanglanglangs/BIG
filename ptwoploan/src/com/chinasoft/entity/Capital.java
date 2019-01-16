package com.chinasoft.entity;

public class Capital {
	private String c_account;  //账户
	private double c_balance;  //余额
	private double c_ttinvest; //总投资
	private double c_icinvest; //投资收益
	private double c_pdincome; //剩余收益
	private double c_ttloan;  //总借款
	private double c_reimburse; //已还款
	private double c_sploan;  //剩余还款
	
	
	
	public Capital() {
		super();
	}
	
	
	public Capital(String c_account, double c_balance, double c_ttinvest,
			double c_icinvest, double c_pdincome, double c_ttloan,
			double c_reimburse, double c_sploan) {
		super();
		this.c_account = c_account;
		this.c_balance = c_balance;
		this.c_ttinvest = c_ttinvest;
		this.c_icinvest = c_icinvest;
		this.c_pdincome = c_pdincome;
		this.c_ttloan = c_ttloan;
		this.c_reimburse = c_reimburse;
		this.c_sploan = c_sploan;
	}


	public String getC_account() {
		return c_account;
	}
	public void setC_account(String c_account) {
		this.c_account = c_account;
	}
	public double getC_balance() {
		return c_balance;
	}
	public void setC_balance(double c_balance) {
		this.c_balance = c_balance;
	}
	public double getC_ttinvest() {
		return c_ttinvest;
	}
	public void setC_ttinvest(double c_ttinvest) {
		this.c_ttinvest = c_ttinvest;
	}
	public double getC_icinvest() {
		return c_icinvest;
	}
	public void setC_icinvest(double c_icinvest) {
		this.c_icinvest = c_icinvest;
	}
	public double getC_pdincome() {
		return c_pdincome;
	}
	public void setC_pdincome(double c_pdincome) {
		this.c_pdincome = c_pdincome;
	}
	public double getC_ttloan() {
		return c_ttloan;
	}
	public void setC_ttloan(double c_ttloan) {
		this.c_ttloan = c_ttloan;
	}
	public double getC_reimburse() {
		return c_reimburse;
	}
	public void setC_reimburse(double c_reimburse) {
		this.c_reimburse = c_reimburse;
	}
	public double getC_sploan() {
		return c_sploan;
	}
	public void setC_sploan(double c_sploan) {
		this.c_sploan = c_sploan;
	}


	@Override
	public String toString() {
		return "Capital [c_account=" + c_account + ", c_balance=" + c_balance
				+ ", c_ttinvest=" + c_ttinvest + ", c_icinvest=" + c_icinvest
				+ ", c_pdincome=" + c_pdincome + ", c_ttloan=" + c_ttloan
				+ ", c_reimburse=" + c_reimburse + ", c_sploan=" + c_sploan
				+ "]";
	}
	
	

}
