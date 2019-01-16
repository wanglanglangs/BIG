package com.chinasoft.entity;

public class Echarts_InvterInfor {

	private String name;
	
	private int number;

	
	
	public Echarts_InvterInfor() {
		super();
		
	}

	
	public Echarts_InvterInfor(String name, int number) {
		super();
		this.name = name;
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Echarts_InvterInfor [name=" + name + ", number=" + number + "]";
	}
	
	
}
