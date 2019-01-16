package com.chinasoft.service;

import java.util.List;

import com.chinasoft.entity.Echarts_InvterInfor;
import com.chinasoft.entity.Invest;
import com.chinasoft.entity.QueryObject;

public interface InvestService {
	
	/**
	 * 查询所有投资用户
	 * @return
	 */
	public List<Invest> getAll(int page,int pageSize,QueryObject qo);
	
	/**
	 * 删除投资信息
	 * @param str
	 * @return
	 */
	public boolean deleteInsertInfor(Long id);


	/**
	 * 查询所有投资信息总数
	 * @return 查询的总条数
	 */
	public int getAllCount(QueryObject qo);
	
	/**
	 * 查询所有投资信息用于表报
	 * @return 查询的总条数
	 */
	
	public List<Echarts_InvterInfor> getEcharts_InvterInfor();

}
