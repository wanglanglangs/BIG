package com.chinasoft.entity;


public class Users {

	private int uid;
	private String uname;
	private String pass;
	
	public Users(int uid, String uname, String pass) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.pass = pass;
	}
	public Users() {
	 
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	
	
}
