package com.chinasoft.service.impl;

import com.chinasoft.dao.UserDao;
import com.chinasoft.dao.impl.UserDaoImpl;
import com.chinasoft.entity.User;
import com.chinasoft.service.IUserServices;


public class UserServicesImpl implements IUserServices{

	private UserDao userdao = new UserDaoImpl();
	/**
	 * ��������
	 */
	@Override
	public int updateUserInFor(User user) {
		
		return userdao.updateUserInFor(user);
	}

	/**
	 * �û�ע��
	 */
	@Override
	public int saveUser(User user) {
		return userdao.saveUser(user);
	}

	/**
	 * �û���¼
	 * @param user
	 * @return true/false �жϵ�¼�Ƿ�ɹ�
	 */
	@Override
	public boolean queryUserByPassAndAccount(User user) {
		
		return userdao.queryUserByPassAndAccount(user);
	}

}
