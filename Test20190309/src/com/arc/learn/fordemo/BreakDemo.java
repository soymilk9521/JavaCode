package com.arc.learn.fordemo;

public class BreakDemo {

	public static void main(String[] args) {
		/* 
		 * break������ǰ����ѭ��
		 * break���ֻ����switch����ѭ�����
		 * break������д�κδ��룬����������
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
