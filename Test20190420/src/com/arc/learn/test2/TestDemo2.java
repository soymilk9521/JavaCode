package com.arc.learn.test2;

public class TestDemo2 {
	public static void main(String[] args) {
		/**
		 * 1. Ĭ�ϳ�ʼ�� 
		 * 2. ���๹������ʼ��
		 * 3. ��������show����(����)
		 * 4. ��ʾ��ʼ��
		 * 5. ��������ִ��
		 * 6. ���๹������ʼ���
		 */
		new Son().show();
	}
}

class Father {
	public Father() {
		show();    
	}
	void show() {
		System.out.println("Father is showing ...");
	}
}

class Son extends Father {
	int num = 9;
	// ��������
	{
		System.out.println("son constructor code ...." + num);
		num = 10;
	}
	public Son() {
		super();
		// ��ʾ��ʼ��
		System.out.println("son const is running ..." + num);
	}
	
	void show() {
		System.out.println("Son is showing ..." + num);
	}
}


