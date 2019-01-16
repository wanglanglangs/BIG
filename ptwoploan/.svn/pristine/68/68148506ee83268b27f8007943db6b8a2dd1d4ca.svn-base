package com.chinasoft.service.impl;

import java.util.List;

import com.chinasoft.dao.InvestDao;
import com.chinasoft.dao.impl.InvestDaoImpl;
import com.chinasoft.entity.Echarts_InvterInfor;
import com.chinasoft.entity.Invest;
import com.chinasoft.entity.QueryObject;
import com.chinasoft.service.InvestService;

public class InvestServiceImpl implements InvestService {
    
	private InvestDao dao = new InvestDaoImpl();
      
	@Override
	public List<Invest> getAll(int page,int pageSize,QueryObject qo) {
		
		return dao.getAll( page,pageSize,qo);
		
	}
	/**
	 * 删除投资信息
	 * @param str
	 * @returns
	 */
	@Override
	public boolean deleteInsertInfor(Long id) {
		
		return dao.deleteInsertInfor(id);
	}
	@Override
	public int getAllCount(QueryObject qo) {
		
		return dao.getAllCount(qo);
	}
	@Override
	public List<Echarts_InvterInfor> getEcharts_InvterInfor() {
		
		return dao.getEcharts_InvterInfor();
	}

}
