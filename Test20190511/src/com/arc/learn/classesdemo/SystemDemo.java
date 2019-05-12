package com.arc.learn.classesdemo;

import java.util.Properties;
import java.util.Set;

public class SystemDemo {

	public static void main(String[] args) {
		/**
		 * System:类中的属性和方法都是静态的
		 * 常用方法：
		 * 	long currentTimeMillis() 返回当前时间的毫秒数
		 *  Properties getProperties() 获取系统属性信息
		 */
		
		long time = System.currentTimeMillis(); // 系统当前时间毫秒数（1970-01-01）
		System.out.println(time);
		
		Properties prop = System.getProperties(); // 系统属性
		Set<String> set = prop.stringPropertyNames();
		for(String key : set) {
			String value =  prop.getProperty(key);
			System.out.println(key + "=" + value);
		}
		
		String separator = System.getProperty("line.separator"); // 获取分隔符，linux ： \n , windows:\r\n
		System.out.println("hello " + separator + "world");
		String s = System.getProperty("path.separator");
		System.out.println(s);
		
	}

}
