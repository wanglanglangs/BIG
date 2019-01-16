package com.chinasoft.service.impl;

import com.chinasoft.dao.UserDao;
import com.chinasoft.dao.impl.UserDaoImpl;
import com.chinasoft.entity.User;
import com.chinasoft.service.IUserServices;


public class UserServicesImpl implements IUserServices{

	private UserDao userdao = new UserDaoImpl();
	/**
	 * 更新数据
	 */
	@Override
	public int updateUserInFor(User user) {
		
		return userdao.updateUserInFor(user);
	}

	/**
	 * 用户注册
	 */
	@Override
	public int saveUser(User user) {
		return userdao.saveUser(user);
	}

	/**
	 * 用户登录
	 * @param user
	 * @return true/false 判断登录是否成功
	 */
	@Override
	public boolean queryUserByPassAndAccount(User user) {
		
		return userdao.queryUserByPassAndAccount(user);
	}

}
