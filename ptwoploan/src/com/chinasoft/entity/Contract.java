package com.chinasoft.entity;

/**
 * 合同表实体类
 * @author 田振江
 * @date 2019年1月2日 上午9:35:40
 */
public class Contract {
	
	private long cid;//合同编号
	private long cinfor;//合同信息
	private String ctype;//合同类型
	
	public long getCid() {
		return cid;
	}
	public void setCid(long cid) {
		this.cid = cid;
	}
	public long getCinfor() {
		return cinfor;
	}
	public void setCinfor(long cinfor) {
		this.cinfor = cinfor;
	}
	public String getCtype() {
		return ctype;
	}
	public void setCtype(String ctype) {
		this.ctype = ctype;
	}
	public Contract(long cid, long cinfor, String ctype) {
		super();
		this.cid = cid;
		this.cinfor = cinfor;
		this.ctype = ctype;
	}
	public Contract() {
		super();
	}

}
