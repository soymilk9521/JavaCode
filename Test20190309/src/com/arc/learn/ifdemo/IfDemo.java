package com.arc.learn.ifdemo;

public class IfDemo {

	public static void main(String[] args) {
		/*
		 * if����һ�ָ�ʽ :
		 * if���������ʽ�� { 
		 * 	ִ����� 
		 * }
		 */
		int x = 1;
		if (x > 1) {
			System.out.println("x����1");
		}
		
		// ���if���ĺ�ֻ��һ��ʱ������ʡ�Դ����š�
		int x2 = 1;
		if(x2>1) 
			System.out.println("x2����1");
		
		System.out.println("aaaaa");
		
		
		// �������͵�����������
		int x3 = 3;
		if(x3>1)
			if(x3>2)
				System.out.println("x3����2");
		
		System.out.println("who am I?");
	}

}
