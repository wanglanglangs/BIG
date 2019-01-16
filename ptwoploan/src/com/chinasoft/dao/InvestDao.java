package com.chinasoft.dao;

import java.util.List;

import com.chinasoft.entity.Echarts_InvterInfor;
import com.chinasoft.entity.Invest;
import com.chinasoft.entity.QueryObject;

public interface InvestDao {
	
	//��ѯ����Ͷ����Ϣ
	public List<Invest> getAll(int page,int pageSize,QueryObject qo);
	
	//��ѯ����Ͷ����Ϣ
	public Invest get(long id);
	
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
