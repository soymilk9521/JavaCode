package com.arc.learn.whiledemo;

public class WhileDemo {

	public static void main(String[] args) {
		/*
		 * 初始值
		 * while(条件表达式) {
		 *   执行语句（循环体）；
		 * 	 循环控制语句；	
		 * }
		 * 
		 * 运行流程分析
		 */
		int x = 1;
		while(x<3) {
			System.out.println("x=" + x);
			x++;
		}
		
	}

}
