package com.arc.learn.fordemo;

public class ContinueDemo {

	public static void main(String[] args) {
		/* 
		 * continue������ǰѭ��, ����ִ����һ��ѭ��
		 * continue���ֻ����ѭ�����
		 * continue������д�κδ��룬����������
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
