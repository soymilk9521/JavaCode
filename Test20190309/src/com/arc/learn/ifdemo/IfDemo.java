package com.arc.learn.ifdemo;

public class IfDemo {

	public static void main(String[] args) {
		/*
		 * if语句第一种格式 :
		 * if（条件表达式） { 
		 * 	执行语句 
		 * }
		 */
		int x = 1;
		if (x > 1) {
			System.out.println("x大于1");
		}
		
		// 如果if语句的后只有一句时，可以省略大括号。
		int x2 = 1;
		if(x2>1) 
			System.out.println("x2大于1");
		
		System.out.println("aaaaa");
		
		
		// 单条语句和单行语句的区别
		int x3 = 3;
		if(x3>1)
			if(x3>2)
				System.out.println("x3大于2");
		
		System.out.println("who am I?");
	}

}
