package com.arc.learn.fordemo;

public class ForDemo {

	public static void main(String[] args) {
		/*
		 *  格式：
		 * for(初始化表达式；循环条件表达式；循环后操作表达式)
		 * {
		 * 	 执行循环语句
		 * }
		 * 
		 */
		for(int i = 0; i<3; i++) {
			System.out.println("i=" + i);
		}
		
//		System.out.println(i);
		
		int a = 0;
		while(a<3) {
			System.out.println("a=" + a);
			a++;
		}
		System.out.println("a=" + a);
		
		
		System.out.println("-------------");
		
		// 循环次数
		// 初始化表达式只执行一次
		int i = 0;
		for(System.out.print("a"); i<5; System.out.print("c")) {
			System.out.print("b");
			i++;
		}
		
//		while(true) ;
//		for(;;);
		
	}

}
