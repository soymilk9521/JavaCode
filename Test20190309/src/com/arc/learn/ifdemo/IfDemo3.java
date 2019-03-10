package com.arc.learn.ifdemo;

public class IfDemo3 {

	public static void main(String[] args) {
		/*
		 * if语句第三种格式 （多条语句判断，只能执行一条）
		 * if（条件表达式） { 
		 * 	执行语句 1
		 * }else if(条件表达式){
		 * 	执行语句2
		 * }else if(条件表达式){
		 * 	执行语句3
		 * }else {
		 *  执行语句4
		 * }
		 */
		int x = 4;
		if(x>2) {
			System.out.println("x 大于2");
		}else if(x>1) {
			System.out.println("x 大于 1");
		}else if(x>3) {
			System.out.println("x 大于 3");
		}else {
			System.out.println("其他");
		}
		System.out.println("-------------------");
		// 与if的区别
		if(x>1) {
			System.out.println("x 大于 1");
		}
		if(x>2) {
			System.out.println("x 大于 2");
		}
		if(x>3) {
			System.out.println("x 大于 3");
		}
		
		// 局部代码块
		if(x>1);
		{
			System.out.println("局部代码块");
			int x2 = 2;
			System.out.println("局部变量x2=" + x2);
		}
		// System.out.println("局部变量x2=" + x2);
		
	}

}
