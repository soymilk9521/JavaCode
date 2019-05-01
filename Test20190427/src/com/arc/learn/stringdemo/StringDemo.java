package com.arc.learn.stringdemo;

public class StringDemo {

	public static void main(String[] args) {
		/**
		 * 1. String类的特点
		 * 	一旦被初始化就不能改变
		 * 
		 * 2. String类构造函数
		 * 	  String();
		 *    String(byte[] bytes);
		 *    String(char[] value);
		 */
		
		String str1 = "abc"; // 常量池
		String str2 = new String("abc"); // 堆内存
		
//		System.out.println( str1 == str2);
		
		String str3 = new String(); // 等效于 String str3 = "" , 不等效于 String str3 = null；
		
		
		byte[] bytes = new byte[]{65, 66, 67, 68}; // byte数组创建字符串
		String str4 = new String(bytes);
		System.out.println(str4);
		
		char[] ch = new char[] {'A', 'B', 'C', 'D'}; // 字符数组创建字符串
		String str5 = new String(ch);
		System.out.println(str5);
		
		String str6 = new String("ABCD"); // 字符串创建字符串对象
		System.out.println(str6);
		
		String str7 = "ABCD";
		System.out.println(str7);
		
		
		System.out.println(str7 + 8);
		System.out.println(String.valueOf(4) + 5);
		
		
		
			
	}

}
