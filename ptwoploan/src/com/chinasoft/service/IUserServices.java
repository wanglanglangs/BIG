package com.chinasoft.service;

import com.chinasoft.entity.User;

public interface IUserServices {

	/**
	 *完善用户信息
	 * @param user
	 * @return
	 */
	public int updateUserInFor(User user); 
	/**
	 * 注册新用户
	 * @return
	 */
	public int saveUser(User user);

	/**
	 * 用户登录
	 * @param user
	 * @return true/false 判断登录是否成功
	 */
	public boolean queryUserByPassAndAccount(User user);



}

