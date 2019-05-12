package com.arc.learn.classesdemo;

import java.util.Calendar;
import java.util.Date;

public class CalendarDemo {

	public static void main(String[] args) {
		/**
		 * Calendar类，替代了Date类中过期方法，更加国际化
		 * 常用方法：
		 * 		Calendar getInstance():取得Calendar类实例
		 * 		long getTimeInMillis()：取得从1970.01.01到当前时间的毫秒数
		 * 		int get(int field):返回给定日历字段的值
		 * 		void add(int field, int amount) // 日期加减
		 * 		void set(int field, int value):将给定的日历字段设置为给定的值。 
		 *		void set(int year, int month, int date) : 设置日历字段中的值 YEAR ， MONTH和 DAY_OF_MONTH 。 
		 * 		void set(int year, int month, int date, int hourOfDay, int minute) : 设置日历字段中的值 YEAR ， MONTH ， DAY_OF_MONTH ， HOUR_OF_DAY和 MINUTE 。 
		 * 		void set(int year, int month, int date, int hourOfDay, int minute, int second) : 设置字段中的值 YEAR ， MONTH ， DAY_OF_MONTH ， HOUR_OF_DAY ， MINUTE和 SECOND 。 
		 * 		void setTime(Date date):使用给定的 Date设置此日历的时间
		 * 		Date getTime(): 返回一个 Date表示此物体 Calendar的时间值
		 */
		
		Calendar c = Calendar.getInstance(); // 取得Calendar类实例
		Date date = c.getTime();
//		System.out.println(date);
		long l = c.getTimeInMillis(); // 取得从1970.01.01到当前时间的毫秒数
//		System.out.println(l);
		
		int year = c.get(Calendar.YEAR);       // 年
		int month = c.get(Calendar.MONTH) + 1; // 月范围0~11
		int day = c.get(Calendar.DAY_OF_MONTH);// 日
//		System.out.println(c.get(Calendar.DATE));// 日
//		System.out.println(year + "年" + month + "月" + day + "日");
//		System.out.println(c.get(Calendar.DAY_OF_WEEK));
		
		c.add(Calendar.MONTH, 2);
//		System.out.println(c.get(Calendar.MONTH));
		c.set(Calendar.YEAR, 2017);
//		System.out.println(c.get(Calendar.YEAR));
		
		int lastDay = getDayOfFeb(2021);
		System.out.println(lastDay);
		
	}
	
	public static int getDayOfFeb(int year) {
		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, year);
		c.set(Calendar.MONTH, 2);
		c.set(Calendar.DAY_OF_MONTH, 1);
		c.add(Calendar.DAY_OF_MONTH, -1);
		return c.get(Calendar.DAY_OF_MONTH);
	}

}
