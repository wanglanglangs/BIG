package com.chinasoft.service.impl;


import com.chinasoft.dao.ManagerDao;
import com.chinasoft.dao.impl.ManagerDaoImpl;
import com.chinasoft.service.ManagerLoginService;

public class ManagerLoginImpl  implements ManagerLoginService{
     ManagerDao dao = new ManagerDaoImpl();

	@Override
	public boolean get(String m_account, String m_pass) {
		
		return dao.getAll(m_account, m_pass);
	}
    

}
