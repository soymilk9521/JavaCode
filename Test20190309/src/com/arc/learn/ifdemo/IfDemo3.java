package com.arc.learn.ifdemo;

public class IfDemo3 {

	public static void main(String[] args) {
		/*
		 * if�������ָ�ʽ ����������жϣ�ֻ��ִ��һ����
		 * if���������ʽ�� { 
		 * 	ִ����� 1
		 * }else if(�������ʽ){
		 * 	ִ�����2
		 * }else if(�������ʽ){
		 * 	ִ�����3
		 * }else {
		 *  ִ�����4
		 * }
		 */
		int x = 4;
		if(x>2) {
			System.out.println("x ����2");
		}else if(x>1) {
			System.out.println("x ���� 1");
		}else if(x>3) {
			System.out.println("x ���� 3");
		}else {
			System.out.println("����");
		}
		System.out.println("-------------------");
		// ��if������
		if(x>1) {
			System.out.println("x ���� 1");
		}
		if(x>2) {
			System.out.println("x ���� 2");
		}
		if(x>3) {
			System.out.println("x ���� 3");
		}
		
		// �ֲ������
		if(x>1);
		{
			System.out.println("�ֲ������");
			int x2 = 2;
			System.out.println("�ֲ�����x2=" + x2);
		}
		// System.out.println("�ֲ�����x2=" + x2);
		
	}

}
