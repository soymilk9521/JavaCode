package com.arc.learn.classesdemo;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

public class DateFormatDemo {

	public static void main(String[] args) throws ParseException {
		/**
		 * DateFormat抽象类，日期格式转换
		 * 	获取DateFormat实例：
		 * 		DateFormat.getDateInstance()：默认格式化
		 * 		DateFormat.getDateInstance(int dateStyle)：指定格式化
		 * 		DateFormat.getTimeInstance()：默认格式化
		 * 		DateFormat.getTimeInstance(int timeStyle)：指定格式
		 *		DateFormat.getDateTimeInstance()：默认格式化
		 *		DateFormat.getDateTimeInstance(int dateStyle, int timeStyle)：指定式化
		 * 时间格式化为字符串
		 * 		String format(Date):将日期转换为指定格式的字符串
		 *		Date parse(String)：将指定格式的日期字符串转换为日期
		 *		
		 */
		
		
		DateFormat df1 = DateFormat.getDateInstance();
		System.out.println(df1.format(new Date())); // 默认日期格式化
		
		DateFormat df2 = DateFormat.getTimeInstance(); 
		System.out.println(df2.format(new Date())); // 默认时间格式化
		
		DateFormat df3 = DateFormat.getDateTimeInstance();
		System.out.println(df3.format(new Date())); // 默认日期时间格式化
		
		DateFormat df7 = DateFormat.getInstance();
		System.out.println(df7.format(new Date()));
		
		DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println(df4.format(new Date())); // 指定日期格式化
		
		DateFormat df5 = DateFormat.getTimeInstance(DateFormat.FULL); 
		System.out.println(df5.format(new Date())); // 指定时间格式化
		
		DateFormat df6 = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL);
		System.out.println(df6.format(new Date())); // 指定日期时间格式化
		
		Date date =  df1.parse("1999/08/08");
		System.out.println(date);
		Date date2 =  df4.parse("2018年5月8日");
		System.out.println(date2);
	}

}
