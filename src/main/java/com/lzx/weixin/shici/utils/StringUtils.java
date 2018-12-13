package com.lzx.weixin.shici.utils;

public class StringUtils {

	public static boolean isEmpty(String s) {
		if(s!=null && !"".equals(s)) {
			return true;
		}
		return false;
	}
}
