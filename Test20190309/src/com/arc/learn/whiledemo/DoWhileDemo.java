package com.arc.learn.whiledemo;

public class DoWhileDemo {

	public static void main(String[] args) {
		/*
		 * ��ʼֵ
		 * do {
		 *       ִ����䣨ѭ���壩��
		 * 	  ѭ��������䣻	
		 * } while(�������ʽ);
		 * 
		 * �������̷���
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
