package com.arc.learn.classesdemo;

import java.util.Date;

public class DateDemo {

	public static void main(String[] args) throws InterruptedException {
		/**
		 * Date类
		 * 	构造函数
		 * 	 	Date()；
		 * 	 	Date(long)；
		 *  常用方法
		 *  	void setTime(long):毫秒数转日期
		 *  	boolean before(Date):判断该当日期是否在传入日期之前
		 *  	boolean after(Date): 判断该当日期是否在传入日期之后
		 *  	boolean compareTo(Date):时间比较
		 *  	boolean equals(Date):比较两个时间是否相等
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
		 * 日期比较
		 */
		Date d1 = new Date();
		Thread.sleep(500); // 线程休眠0.5秒
		Date d2 = new Date();
		System.out.println(d1.before(d2)); // true
		System.out.println(d1.after(d2));  // false
		System.out.println(d1.compareTo(d2)); // -1
		System.out.println(d1.equals(d2)); // false;
		
	}

	private static void testDateConvert() {
		/**
		 * 日期对象和毫秒值之间的转换
		 * 
		 * 毫秒 → 日期
		 * 1. new Date(long);
		 * 2. setTime(long);
		 * 
		 * 日期 → 毫秒
		 * 1. long getTime();
		 * 
		 */
		long time = System.currentTimeMillis(); // 1970.01.01当前日期时间的毫秒数
		System.out.println(time);
		Date d = new Date(time);
		System.out.println(d);
		d.setTime(time); // 毫秒数转日期
		
		long l = d.getTime();
		System.out.println(l);

	}

}
