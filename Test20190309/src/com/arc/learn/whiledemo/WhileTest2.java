package com.arc.learn.whiledemo;

public class WhileTest2 {

	public static void main(String[] args) {
		/*
		 *  计数器思想练习
		 *   求1到100之间6的倍数有多少个
		 *   定义一个变量count记录个数
		 */
		int count = 0;
		int i = 1;
		while(i<=100) {
			if(i%6==0) {
				System.out.println(i);
				count++;
			}
			i++;
		}
		System.out.println(count);
		
//		int a = 1;
//		while(a<=100) {
//			System.out.println(a);
//			a++;
//		}
		
//		int b = 1;
//		do {
//			System.out.println(b);
//			b++;
//		}while(b<=100);
		
		
		
		
		
		
	}

}
