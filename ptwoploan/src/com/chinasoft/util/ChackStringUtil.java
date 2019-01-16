package com.chinasoft.util;

public class ChackStringUtil {

	private ChackStringUtil(){}
	
	public static boolean isNull(String str){
		
		return  str!=null&&!"".equals(str.trim());
	}
}
