package com.arc.learn.objectdemo;

/**
 * 基本数据类型传递
 * @author kr
 *
 */
public class Demo1 {

	public static void main(String[] args) {
		// 图解基本数据类型传递
		int x = 3;
		show(x);
		System.out.println(x);
	}
	
	/**
	 * int类型参数传递
	 * 
	 * @param x
	 */
	public static void show(int x) {
		x = 4;
	}
	
	

}

