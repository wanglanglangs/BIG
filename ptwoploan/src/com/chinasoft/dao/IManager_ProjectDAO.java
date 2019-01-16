package com.chinasoft.dao;

import com.chinasoft.entity.Project;


public interface IManager_ProjectDAO {

	/**
	 * 删除投资项目
	 * @return
	 */
	public boolean deleteProjuct(int id);
	/**
	 * 修改投资项目
	 * @return
	 */
	public boolean updateProduct(Project pro);
	
	/**
	 * 增加投资项目
	 * 
	 */
	public boolean saveProjuct();
	
	
}
