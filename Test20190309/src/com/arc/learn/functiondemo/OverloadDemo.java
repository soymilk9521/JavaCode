package com.arc.learn.functiondemo;

public class OverloadDemo {

	public static void main(String[] args) {
		// ��������
		// ��ͬһ�����У��������һ�����ϵ�ͬ������, 
		// ֻҪ���������Ͳ������Ͳ�ͬ���ɡ�
		
//		multiplication();
		System.out.println("4+5=" + add(4,5));
		System.out.println("4+5+6=" + add(4,5,6));
		System.out.println("4.1+5.5=" + add(4.1, 5.5));
		int sum = add(9, 100);
		System.out.println(sum);
	}
	
	/**
	 * �ӷ����㣬 ���������ĺ�
	 */
	public static int add(int a, int b) {
		return a + b;
	}
	
	
	/**
	 * �ӷ����㣬��С���ĺ�
	 */
	public static double add(double a, double b) {
		return a + b;
	}
	
	
	
	/**
	 * �ӷ����㣬 ���������ĺ�
	 */
	public static int add(int a, int b, int c) {
//		return a + b + c;
		return add(a, b) + c;
	}
	
	
	
	/**
	 * �˷���
	 */
	public static void multiplication(int num) {
		for(int x = 1; x<= num; x++) {
			for(int y = 1; y <= x; y++) {
				System.out.print( y+"*"+x + "=" + y*x + "\t" );
			}
			System.out.println();
		}
	}
	
	public static void multiplication() {
		int num = 9;
		multiplication(num);
	}
	
	// ���������ֵ�޹�
	
	

}
