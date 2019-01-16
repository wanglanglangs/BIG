package com.chinasoft.dao;

import java.sql.ResultSet;
import java.util.List;

import com.chinasoft.entity.Loan;
import com.chinasoft.entity.User;

public interface LoanDao {

//��ѯ���н����Ϣ
 public List<Loan> getAll();	
 //��ѯ���������Ϣ
 public Loan get(long b_contractid);
 //��ӽ����Ϣ
 public int addUser(Loan loan);
 //ɾ�������Ϣ
 public void delLoan(long b_contractid);
 // �޸Ľ���û���Ϣ
 public void updateLoan(Loan loan);
 
 
 /**
  * Loan��ҳ�ӿ�
  */
 //��ÿҳ��ʾ����Ϣ����������һ������������
 public  List<Loan> find(int currPage,int pageSize);
 //�������������ص���һ�����֣����Է���һ��int
 public int findCount();
 
}
