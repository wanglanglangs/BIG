package com.chinasoft.dao;

import java.util.List;

import com.chinasoft.entity.Project;
public interface IProject {
	
	public List<Project> getAll();//查询所有项目列表
	
	public List<Project> queryProjectByTime(String time);//通过投资时长查询项目
	
}
