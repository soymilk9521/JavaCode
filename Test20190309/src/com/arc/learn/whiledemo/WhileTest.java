package com.arc.learn.whiledemo;

public class WhileTest {

	public static void main(String[] args) {
		/*
		 * 
		 *  累加思想练习
		 *   求1到10的和
		 *   定义一个变量sum记录和
		 */
		int sum = 0;
		int i = 1;
		while(i<=10) {
//			sum = sum + i;
			sum += i;
			i++;
		}
		System.out.println(sum);
		
		
	}

}
