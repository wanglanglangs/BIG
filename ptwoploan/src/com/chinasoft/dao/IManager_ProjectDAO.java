package com.chinasoft.dao;

import com.chinasoft.entity.Project;


public interface IManager_ProjectDAO {

	/**
	 * ɾ��Ͷ����Ŀ
	 * @return
	 */
	public boolean deleteProjuct(int id);
	/**
	 * �޸�Ͷ����Ŀ
	 * @return
	 */
	public boolean updateProduct(Project pro);
	
	/**
	 * ����Ͷ����Ŀ
	 * 
	 */
	public boolean saveProjuct();
	
	
}
