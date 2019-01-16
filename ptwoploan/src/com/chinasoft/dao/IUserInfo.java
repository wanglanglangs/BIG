package com.chinasoft.dao;

import java.sql.ResultSet;
import java.util.List;

import com.chinasoft.entity.Invest;
import com.chinasoft.entity.Loan;
import com.chinasoft.entity.Project;
import com.chinasoft.entity.User;

public interface IUserInfo {
	/**
	 * �ҵ��˻�����ʾ��ǰ�û���Ϣ
	 * @param account
	 * @return
	 */
	User queryUserInfo(String account);
	/**
	 * ��ѯ��ǰ�û��µ�����Ͷ����Ϣ
	 * @param account
	 * @return
	 */
	List<Invest> queryMyInvest(String account,int start,int end);
	/**
	 * ��ѯ��ǰ�û��µ�Ͷ�ʼ�¼����
	 * @return
	 */
	int queryCountMyInvest(String account);
	/**
	 * ��ѯ��ǰ�û��µ����н����Ϣ
	 * @param account
	 * @return
	 */
	List<Loan> queryMyLoan(String account,int start,int end);
	/**
	 * ��ѯ��ǰ�û��µĽ���¼����
	 * @return
	 */
	int queryCountMyLoan(String account);
	/**
	 * ����id��ѯ��Ŀ��Ϣ
	 * @param id
	 * @return
	 */
	Project queryProJectById(String id);
	/**
	 * �޸��û���Ϣ
	 * @param user
	 * @return
	 */
	boolean updateUserInfo(User user);
	/**
	 * ���ݽ��Ų�ѯ�����Ϣ
	 * @param lid
	 * @return
	 */
	Loan queryLoanByLId(long lid);
	/**
	 * �����˻��޸Ľ����Ӧ�����
	 * @param account
	 * @param tmonӦ�����
	 * @param mon������
	 * @return
	 */
	boolean updateTotalMoney(String account,double tmon,double mon);
	/**
	 * �����˻��޸����
	 * @param account
	 * @param mon
	 * @return
	 */
	boolean updateMoney(String account,int mon);
}
