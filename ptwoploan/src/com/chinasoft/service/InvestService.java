package com.chinasoft.service;

import java.util.List;

import com.chinasoft.entity.Echarts_InvterInfor;
import com.chinasoft.entity.Invest;
import com.chinasoft.entity.QueryObject;

public interface InvestService {
	
	/**
	 * ��ѯ����Ͷ���û�
	 * @return
	 */
	public List<Invest> getAll(int page,int pageSize,QueryObject qo);
	
	/**
	 * ɾ��Ͷ����Ϣ
	 * @param str
	 * @return
	 */
	public boolean deleteInsertInfor(Long id);


	/**
	 * ��ѯ����Ͷ����Ϣ����
	 * @return ��ѯ��������
	 */
	public int getAllCount(QueryObject qo);
	
	/**
	 * ��ѯ����Ͷ����Ϣ���ڱ�
	 * @return ��ѯ��������
	 */
	
	public List<Echarts_InvterInfor> getEcharts_InvterInfor();

}
