package com.chinasoft.entity;

/**
 * ��ͬ��ʵ����
 * @author ����
 * @date 2019��1��2�� ����9:35:40
 */
public class Contract {
	
	private long cid;//��ͬ���
	private long cinfor;//��ͬ��Ϣ
	private String ctype;//��ͬ����
	
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
