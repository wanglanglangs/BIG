package com.chinasoft.entity;
/*
 * ��Ŀ��Ϣ��
 */
public class Project {
	
	private int id;//��Ŀ���
	private String name;//��Ŀ��
	private String rate;//��Ŀ����
	private String money;//Ͷ���ʽ�
	private String time;//Ͷ��ʱ��
	public Project() {
		super();
	}

	public Project(int id, String name, String rate,String money,String time) {
		super();
		this.id = id;
		this.name = name;
		this.rate = rate;
		this.money=money;
		this.time=time;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRate() {
		return rate;
	}

	public void setRate(String rate) {
		this.rate = rate;
	}

	public String getMoney() {
		return money;
	}

	public void setMoney(String money) {
		this.money = money;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}
	
}
