package com.arc.learn.functiondemo;

public class FunctionDemo {

	public static void main(String[] args) {
//		int sum = add2(3, 4);
//		System.out.println(sum);
//		int sum2 = add2(7,8);
//		System.out.println(sum2);
//		
//		System.out.println(add2(9,100));
//		System.out.println(sub(111,20));
//		noreturnMethod();
//		draw(4,5);
//		draw(8,9);
//		System.out.println(equals(4,5));
//		mul99();
		System.out.println(level(79));
		
		
	}
	public static int add2(int a, int b){
		return a + b;
	}
	/*
	 * ��ʽ��
	 * ���η� ����ֵ���� ���������������� ������1�� �������� ����2�� ....�� {
	 * 		ִ����䣻
	 * 		return ����ֵ��
	 * }
	 */
	public static int add(int a, int b) {
		return a + b;
	}
	
	public static int sub(int a, int b) {
		return a-b;
	}
	
	// ���������û�з���ֵ
	public static void noreturnMethod() {
		System.out.println("hello world ");
//		return;
	}
	
	/**
	 * ����һ�����ܣ��ڿ���̨��һ��row�У�col�еľ���
	 * ��ȷ����ֵΪ�� void
	 * ��ȷ�����б� row�У� col��
	 * 
	 */
	public static void draw(int row, int col) {
		for(int i = 1; i<= row; i++) {
			for(int y=1; y<=col; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	
	
	/**
	 * ����һ�����ܣ��Ƚ��������Ƿ����
	 * ��ȷ�����б� ������ֵ
	 * ��ȷ����ֵ����: true/false
	 * 
	 * 1. if else��ʽ 
	 * 2. ��Ԫ�������ʽ
	 * 3. ֱ�ӷ��رȽ������
	 */
	public static boolean equals(int a, int b) {
//		if(a == b) {
//			return true;
//		}else {
//			return false;
//		}
//		return (a==b)?true:false;
		return a==b;
	}
	
	
	
	/**
	 * ����һ�����ܣ���ӡ�žų˷���
	 * ��ȷ����ֵ�� void
	 * ��ȷ������ û�в���
	 * 
	 * ���ѭ��9��.
	 * �ڲ�ѭ��ѭ��������
	 * \t�Ʊ��
	 */
	public static void mul99() {
		for(int x=1; x<=9; x++) {
			for(int y=1; y<=x; y++) {
				System.out.print(y + "*" + x + "=" + y*x + "\t");
			}
			System.out.println();
		}
	}
	
	
	
	/**
	 * ���ݿ��Գɼ���ȡѧ��������Ӧ�ȼ�
	 * 90~100   A
	 * 80~89    B
	 * 70~79    C
	 * 60~69    D
	 * 60����       E
	 * 
	 * ��ȷ���ؽ���� �ȼ� char����
	 * ��ȷ�����б� ���� int����
	 * 
	 */
	public static char level(int score) {
		if(score>=90 && score <=100) {
			return 'A';
		}else if(score>=80 && score <=89) {
			return 'B';
		}else if(score>=70 && score <=79) {
			return 'C';
		}else if(score>=60 && score <=69) {
			return 'B';
		}else {
			return 'E';
		}
	}
	
	
}
