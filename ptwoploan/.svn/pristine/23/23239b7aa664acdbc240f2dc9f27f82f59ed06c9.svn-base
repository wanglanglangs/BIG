package com.chinasoft.entity;

import com.chinasoft.util.ChackStringUtil;

/*
 * 借款人基本信息表
 */
public class QueryObject {
	
	private long h_id;    //合同編號
	private String h_userInfor; //用户账号
	private int h_startMoney;//开始金额
	private int h_endMoney;//结束金额
	
	
    public String getQuerySQL() {
		
    	
		StringBuffer sb = new StringBuffer(200);
		
		boolean isfirst = true;
		//合同編號
		if (h_id>0) {
			if (isfirst) {
				sb.append( " where t_id="+h_id);
				isfirst = false;
			}else{
				sb.append( " and t_id="+h_id);
			}
		}
		//用戶信息
		if (ChackStringUtil.isNull(h_userInfor)) {
			if (isfirst) {
				sb.append( " where t_account  like  '%"+h_userInfor+"%'");
				isfirst = false;
			}else{
				sb.append( " and t_account  like   '%"+h_userInfor+"%'");
			}
		}
		
		if (h_startMoney>0) {
			if (isfirst) {
				sb.append( " where t_money>="+h_startMoney);
				isfirst = false;
			}else{
				sb.append( " and t_money>="+h_startMoney);
			}
		}
		
		if (h_endMoney>0) {
			if (isfirst) {
				sb.append( " where t_money>="+h_endMoney);
				isfirst = false;
			}else{
				sb.append( " and t_money>="+h_endMoney);
			}
		}
		
		return sb.toString();
		
	}
	
	
	public QueryObject() {
		super();
	}

	
	public QueryObject(long h_id, String h_userInfor, int h_startMoney,
			int h_endMoney) {
		super();
		this.h_id = h_id;
		this.h_userInfor = h_userInfor;
		this.h_startMoney = h_startMoney;
		this.h_endMoney = h_endMoney;
	}




	public long getH_id() {
		return h_id;
	}




	public void setH_id(long h_id) {
		this.h_id = h_id;
	}




	public String getH_userInfor() {
		return h_userInfor;
	}




	public void setH_userInfor(String h_userInfor) {
		this.h_userInfor = h_userInfor;
	}




	public int getH_startMoney() {
		return h_startMoney;
	}




	public void setH_startMoney(int h_startMoney) {
		this.h_startMoney = h_startMoney;
	}




	public int getH_endMoney() {
		return h_endMoney;
	}




	public void setH_endMoney(int h_endMoney) {
		this.h_endMoney = h_endMoney;
	}




	@Override
	public String toString() {
		return "QueryObject [h_id=" + h_id + ", h_userInfor=" + h_userInfor
				+ ", h_startMoney=" + h_startMoney + ", h_endMoney="
				+ h_endMoney + "]";
	}
	
	public static void main(String[] args) {
		QueryObject qo=new	QueryObject();
		qo.setH_id(1L);
//		qo.setH_userInfor("aaaa");
		qo.setH_startMoney(50000);
//		qo.setH_endMoney(60000);
		System.out.println(qo.getQuerySQL());
	}
	
	
	
}
