package com.arc.learn.whiledemo;

public class DoWhileDemo {

	public static void main(String[] args) {
		/*
		 * 初始值
		 * do {
		 *       执行语句（循环体）；
		 * 	  循环控制语句；	
		 * } while(条件表达式);
		 * 
		 * 运行流程分析
		 */
		
		
		int x = 1;
		do {
			System.out.println("x=" + x);
			x++;
		}while(x<1);
		
		System.out.println("------------");
		
		int y = 1;
		while(y<1) {
			System.out.println("y=" + y);
			y++;
		}
		
		
//		int x2 = 1;
//		if(x2>2) {
//			
//		}else if(x2>1){
//			
//		}else if(x2>0) {
//			
//		}
//		
//		if(x2>2) {
//			
//		}else {
//			if(x2>1){
//				
//			}else {
//				if(x2>0) {
//					
//				}
//			}
//		}
		
	}

}
