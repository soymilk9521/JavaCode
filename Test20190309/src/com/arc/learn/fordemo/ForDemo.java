package com.arc.learn.fordemo;

public class ForDemo {

	public static void main(String[] args) {
		/*
		 *  ��ʽ��
		 * for(��ʼ�����ʽ��ѭ���������ʽ��ѭ����������ʽ)
		 * {
		 * 	 ִ��ѭ�����
		 * }
		 * 
		 */
		for(int i = 0; i<3; i++) {
			System.out.println("i=" + i);
		}
		
//		System.out.println(i);
		
		int a = 0;
		while(a<3) {
			System.out.println("a=" + a);
			a++;
		}
		System.out.println("a=" + a);
		
		
		System.out.println("-------------");
		
		// ѭ������
		// ��ʼ�����ʽִֻ��һ��
		int i = 0;
		for(System.out.print("a"); i<5; System.out.print("c")) {
			System.out.print("b");
			i++;
		}
		
//		while(true) ;
//		for(;;);
		
	}

}
