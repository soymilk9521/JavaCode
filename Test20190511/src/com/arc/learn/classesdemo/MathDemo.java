package com.arc.learn.classesdemo;

public class MathDemo {

	public static void main(String[] args) {
		/**
		 * Math类，提供操作数学运算的静态方法
		 * 常用方法：
		 * 	1. double ceil(double):返回最小的double，大于等于传入参数，并等于某个整数
		 *  2. double floor(double)：返回最大的double，小于等于传入参数，并等于某个整数
		 *  3. double round(double)：返回传入参数四舍五入的double，并等于某个整数
		 *  4. double pow(double a, double b):返回a的b次幂。
		 *  5. double random():返回0到1之间的随机数。
		 */
		
//		System.out.println(Math.abs(-15));
//		double c = Math.ceil(12.56);
//		System.out.println(c);
//		double f = Math.floor(12.56);
//		System.out.println(f);
//		double r = Math.round(12.56);
//		System.out.println(r);
//		double p = Math.pow(2, 3);
//		System.out.println(p);
//		double rd = Math.random();
//		System.out.println(rd);
		
		for (int i = 0; i < 10; i++) {
			System.out.println((int)(Math.random() * 6) + 1);
		}
		
	}

}
