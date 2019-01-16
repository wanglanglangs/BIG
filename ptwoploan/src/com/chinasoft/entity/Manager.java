package com.chinasoft.entity;

public class Manager {

	private String m_account ;//管理员账号
	private String m_pass;//管理员密码
	private int m_status;//管理员特殊标志（用来区分老板和员工）
	
	
	
	
	
	public Manager() {
		super();
	}

	public Manager(String m_account, String m_pass, int m_status) {
		super();
		this.m_account = m_account;
		this.m_pass = m_pass;
		this.m_status = m_status;
	}

	public String getM_account() {
		return m_account;
	}

	public void setM_account(String m_account) {
		this.m_account = m_account;
	}

	public String getM_pass() {
		return m_pass;
	}

	public void setM_pass(String m_pass) {
		this.m_pass = m_pass;
	}

	public int getM_status() {
		return m_status;
	}

	public void setM_status(int m_status) {
		this.m_status = m_status;
	}

	@Override
	public String toString() {
		return "Manager [m_account=" + m_account + ", m_pass=" + m_pass
				+ ", m_status=" + m_status + "]";
	}
}
