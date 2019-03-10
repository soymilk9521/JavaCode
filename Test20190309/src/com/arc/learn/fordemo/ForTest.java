package com.arc.learn.fordemo;

public class ForTest {

	public static void main(String[] args) {
		/*
		 * 累加算法
		 * 求1-10的和
		 */
		int sum = 0;
		for(int i = 1; i<=10; i++) {
			sum +=i;
		}
		System.out.println(sum);
		
		
		/*
		 * 计数器算法
		 * 求1-100之间6的倍数有多少个
		 */
		int count = 0;
		for (int i = 1; i <=100; i++) {
			if(i%6 == 0) {
				count++;
			}
		}
		System.out.println(count);
		
		
		// for和while 的区别
		int x = 1;
		while(x<5) {
			System.out.println("x=" + x);
			x++;
		}
		System.out.println("x=" + x);
		System.out.println("--------------");
		for(int y=1;y <5; y++) {
			System.out.println("y=" + y);
		}
		//System.out.println("y=" + y);
		
		
		//无线循环表达方式
//		while(true) {}
//		for(;;) {}
		
	}

}
