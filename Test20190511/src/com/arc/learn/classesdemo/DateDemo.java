package com.arc.learn.classesdemo;

import java.util.Date;

public class DateDemo {

	public static void main(String[] args) throws InterruptedException {
		/**
		 * Date��
		 * 	���캯��
		 * 	 	Date()��
		 * 	 	Date(long)��
		 *  ���÷���
		 *  	void setTime(long):������ת����
		 *  	boolean before(Date):�жϸõ������Ƿ��ڴ�������֮ǰ
		 *  	boolean after(Date): �жϸõ������Ƿ��ڴ�������֮��
		 *  	boolean compareTo(Date):ʱ��Ƚ�
		 *  	boolean equals(Date):�Ƚ�����ʱ���Ƿ����
		 */
		
		
		Date d = new Date();
		System.out.println(d);
		long l = System.currentTimeMillis();
		Date d2 = new Date(l - 24*60*60*1000);
		System.out.println(d2);
		d.setTime(l - 24*60*60*1000);
		System.out.println(d);
		
//		testDateConvert();
//		testDateMethod();
		
	}

	private static void testDateMethod() throws InterruptedException {
		/**
		 * ���ڱȽ�
		 */
		Date d1 = new Date();
		Thread.sleep(500); // �߳�����0.5��
		Date d2 = new Date();
		System.out.println(d1.before(d2)); // true
		System.out.println(d1.after(d2));  // false
		System.out.println(d1.compareTo(d2)); // -1
		System.out.println(d1.equals(d2)); // false;
		
	}

	private static void testDateConvert() {
		/**
		 * ���ڶ���ͺ���ֵ֮���ת��
		 * 
		 * ���� �� ����
		 * 1. new Date(long);
		 * 2. setTime(long);
		 * 
		 * ���� �� ����
		 * 1. long getTime();
		 * 
		 */
		long time = System.currentTimeMillis(); // 1970.01.01��ǰ����ʱ��ĺ�����
		System.out.println(time);
		Date d = new Date(time);
		System.out.println(d);
		d.setTime(time); // ������ת����
		
		long l = d.getTime();
		System.out.println(l);

	}

}
