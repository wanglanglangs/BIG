package com.chinasoft.entity;


public class Invest {
	//Ͷ�ʱ�
	
	private String taccount;//Ͷ�����˺���
	private String titem;//Ͷ����Ŀ��
	private String tmoney;//Ͷ�ʽ��
	private String ttotla;//Ԥ��������
	private String tstart;//Ͷ�ʿ�ʼʱ��
	private String tend;//Ͷ�ʽ���ʱ��
	private String trate;//Ͷ������
	private long tid;//��ͬID
	
	public Invest(long tid, String taccount, String titem, String tmoney,
			String ttotla, String tstart, String tend, String trate) {
		super();
		this.tid = tid;
		this.taccount = taccount;
		this.titem = titem;
		this.tmoney = tmoney;
		this.ttotla = ttotla;
		this.tstart = tstart;
		this.tend = tend;
		this.trate = trate;
	}

	public Invest() {
		super();
	}

	public long getTid() {
		return tid;
	}

	public void setTid(long tid) {
		this.tid = tid;
	}

	public String getTaccount() {
		return taccount;
	}

	public void setTaccount(String taccount) {
		this.taccount = taccount;
	}

	public String getTitem() {
		return titem;
	}

	public void setTitem(String titem) {
		this.titem = titem;
	}

	public String getTmoney() {
		return tmoney;
	}

	public void setTmoney(String tmoney) {
		this.tmoney = tmoney;
	}

	public String getTtotla() {
		return ttotla;
	}

	public void setTtotla(String ttotla) {
		this.ttotla = ttotla;
	}

	public String getTstart() {
		return tstart;
	}

	public void setTstart(String tstart) {
		this.tstart = tstart;
	}

	public String getTend() {
		return tend;
	}

	public void setTend(String tend) {
		this.tend = tend;
	}

	public String getTrate() {
		return trate;
	}

	public void setTrate(String trate) {
		this.trate = trate;
	}

	@Override
	public String toString() {
		return "Invest [taccount=" + taccount + ", titem=" + titem
				+ ", tmoney=" + tmoney + ", ttotla=" + ttotla + ", tstart="
				+ tstart + ", tend=" + tend + ", trate=" + trate + ", tid="
				+ tid + "]";
	}
	

}
