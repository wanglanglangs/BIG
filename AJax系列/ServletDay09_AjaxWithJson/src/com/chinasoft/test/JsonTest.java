package com.chinasoft.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import net.sf.json.JSONArray;

import com.chinasoft.entity.Users;

public class JsonTest {

	public static void main(String[] args) {
		//1.����תJSON
		String [] arr = {"����","�Ϻ�","����","����","�Ͼ�"};
		JSONArray  json = JSONArray.fromObject(arr);
		System.out.println(json);
      //2.����תJSON
		Users u = new Users(1,"tom","1234");
		json = JSONArray.fromObject(u);
		System.out.println(json);
	//3.��LISTת����JSON
		List list = new ArrayList();
		list.add(new Users(1,"����1","12345"));
		list.add(new Users(2,"����2","12345"));
		list.add(new Users(3,"����3","12345"));
		list.add(new Users(4,"����4","12345"));
		list.add(new Users(5,"����5","12345"));
		json = JSONArray.fromObject(list);
		System.out.println(json);
		//4.��setת����JSON
		Set set = new HashSet();
		set.add(new Users(1,"����1","12345"));
		set.add(new Users(2,"����2","12345"));
		set.add(new Users(3,"����3","12345"));
		
		json = JSONArray.fromObject(set);
		System.out.println(json);
		//5.��mapת����JSON
		Map map = new HashMap();
		map.put("id", 1);
		map.put("name", "jerry");
		map.put("pass", "1234");
		json = JSONArray.fromObject(map);
		System.out.println(json);
	}

}
