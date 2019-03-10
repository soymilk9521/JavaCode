package com.arc.learn.fordemo;

public class BreakDemo {

	public static void main(String[] args) {
		/* 
		 * break跳出当前所在循环
		 * break语句只用于switch语句和循环语句
		 * break语句后不能写任何代码，否则编译出错
		 */
		
		for(int x = 0; x < 10; x++) {
			System.out.println("x=" +x);
			if(x==1) {
				break;
//				System.out.println("x=" +x);
			}
		}
		System.out.println("-------------");
		
		for(int x = 0; x < 10; x++) {
			for(int y = 0; y < 10; y++) {
				System.out.println("x=" +x);
				break;
			}
		}
		
		System.out.println("-------------");
		here:for(int x = 0; x < 10; x++) {
			for(int y = 0; y < 10; y++) {
				System.out.println("x=" +x);
				break here;
			}
		}
	}

}
