package com.arc.learn.classesdemo;

public class MathDemo {

	public static void main(String[] args) {
		/**
		 * Math�࣬�ṩ������ѧ����ľ�̬����
		 * ���÷�����
		 * 	1. double ceil(double):������С��double�����ڵ��ڴ��������������ĳ������
		 *  2. double floor(double)����������double��С�ڵ��ڴ��������������ĳ������
		 *  3. double round(double)�����ش���������������double��������ĳ������
		 *  4. double pow(double a, double b):����a��b���ݡ�
		 *  5. double random():����0��1֮����������
		 */
		
//		System.out.println(Math.abs(-15));
//		double c = Math.ceil(12.56);
//		System.out.println(c);
//		double f = Math.floor(12.56);
//		System.out.println(f);
//		double r = Math.round(12.56);
//		System.out.println(r);
//		double p = Math.pow(2, 3);
//		System.out.println(p);
//		double rd = Math.random();
//		System.out.println(rd);
		
		for (int i = 0; i < 10; i++) {
			System.out.println((int)(Math.random() * 6) + 1);
		}
		
	}

}
