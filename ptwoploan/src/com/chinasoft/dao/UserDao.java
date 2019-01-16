package com.chinasoft.dao;

import com.chinasoft.entity.User;

public interface UserDao {
	/**
	 *�����û���Ϣ
	 * @param user
	 * @return
	 */
	public int updateUserInFor(User user); 
	/**
	 * ע�����û�
	 * @return
	 */
	public int saveUser(User user);
	/**
	 * �û���¼
	 * @param user
	 * @return true/false �жϵ�¼�Ƿ�ɹ�
	 */
	public boolean queryUserByPassAndAccount(User user);
}
