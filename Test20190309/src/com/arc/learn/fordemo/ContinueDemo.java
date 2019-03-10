package com.arc.learn.fordemo;

public class ContinueDemo {

	public static void main(String[] args) {
		/* 
		 * continue跳出当前循环, 继续执行下一次循环
		 * continue语句只用于循环语句
		 * continue语句后不能写任何代码，否则编译出错
		 */
		
//		for(int x = 0; x < 10; x++) {
//			if(x==2) {
//				continue;
//				System.out.println("x=" +x);
//			}
//			System.out.println("x=" +x);
//		}
		System.out.println("-------------");
		
//		for(int x = 0; x < 10; x++) {
//			for(int y = 0; y < 10; y++) {
//				if(y==2) {
//					continue;
//				}
//				System.out.println("y=" +y);
//			}
//		}
		
		System.out.println("-------------");
		here:for(int x = 0; x < 10; x++) {
			for(int y = 0; y < 10; y++) {
				System.out.print("x=" +x);
				System.out.println(", y=" +y);
				continue here;
			}
			
			System.out.println("ddddd");
		}
	}

}
