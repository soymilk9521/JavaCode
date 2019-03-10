package com.arc.learn.functiondemo;

public class OverloadDemo {

	public static void main(String[] args) {
		// 函数重载
		// 在同一个类中，允许存在一个以上的同名函数, 
		// 只要参数个数和参数类型不同即可。
		
//		multiplication();
		System.out.println("4+5=" + add(4,5));
		System.out.println("4+5+6=" + add(4,5,6));
		System.out.println("4.1+5.5=" + add(4.1, 5.5));
		int sum = add(9, 100);
		System.out.println(sum);
	}
	
	/**
	 * 加法运算， 两个整数的和
	 */
	public static int add(int a, int b) {
		return a + b;
	}
	
	
	/**
	 * 加法运算，两小数的和
	 */
	public static double add(double a, double b) {
		return a + b;
	}
	
	
	
	/**
	 * 加法运算， 三个整数的和
	 */
	public static int add(int a, int b, int c) {
//		return a + b + c;
		return add(a, b) + c;
	}
	
	
	
	/**
	 * 乘法表
	 */
	public static void multiplication(int num) {
		for(int x = 1; x<= num; x++) {
			for(int y = 1; y <= x; y++) {
				System.out.print( y+"*"+x + "=" + y*x + "\t" );
			}
			System.out.println();
		}
	}
	
	public static void multiplication() {
		int num = 9;
		multiplication(num);
	}
	
	// 与参数返回值无关
	
	

}
