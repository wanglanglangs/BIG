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
		//1.数据转JSON
		String [] arr = {"北京","上海","广州","西安","南京"};
		JSONArray  json = JSONArray.fromObject(arr);
		System.out.println(json);
      //2.对象转JSON
		Users u = new Users(1,"tom","1234");
		json = JSONArray.fromObject(u);
		System.out.println(json);
	//3.将LIST转换成JSON
		List list = new ArrayList();
		list.add(new Users(1,"张三1","12345"));
		list.add(new Users(2,"张三2","12345"));
		list.add(new Users(3,"张三3","12345"));
		list.add(new Users(4,"张三4","12345"));
		list.add(new Users(5,"张三5","12345"));
		json = JSONArray.fromObject(list);
		System.out.println(json);
		//4.将set转换成JSON
		Set set = new HashSet();
		set.add(new Users(1,"张三1","12345"));
		set.add(new Users(2,"张三2","12345"));
		set.add(new Users(3,"张三3","12345"));
		
		json = JSONArray.fromObject(set);
		System.out.println(json);
		//5.将map转换成JSON
		Map map = new HashMap();
		map.put("id", 1);
		map.put("name", "jerry");
		map.put("pass", "1234");
		json = JSONArray.fromObject(map);
		System.out.println(json);
	}

}
