package com.arc.learn.staticdemo;

public class StaticDemo4 {

	public static void main(String[] args) {
		
		/*
		 * 1. ��̬�����
		 * 		1.1. ������ļ��ض����У�����ֻ����һ�Ρ�
		 * 		1.2. ���ڸ�����г�ʼ����
		 * 2. ��������
		 * 		2.1. ���������ڹ��캯��ǰִ�У�����һ���������󶼻�ִ�й�������	��
		 * 		2.2. ����������Ը�������г�ʼ����
		 * 3. �ֲ������
		 * 		3.1. �ֲ����������������������ڡ�
		 */
		new Demo().show();
//		new Demo().show();
		
	}
}

class Demo {
	static int num; 
	// ��̬�����
	static {
		num = 10; // ����̬���Ը�ֵ
		num *= 2; // ��������
		System.out.println("static block is running");
	}
	// ��������
	{
		System.out.println("non-static block is running");
	}
	void show() {
		System.out.println("show is running");
	}
}