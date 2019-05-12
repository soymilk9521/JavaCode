package com.arc.learn.classesdemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class SimpleDateFormatDemo {

	public static final String PATTERN = "yyyy年MM月dd日 HH:mm:ss";
	public static final String PATTERN2 = "GGGGy年M月d日";
	
	public static void main(String[] args) throws ParseException {
		/**
		 * SimpleDateFormat类，自定义格式日期时间转换类，该类为DateFormat的子类
		 * 	常用方法：
		 * 		String format(Date)
		 * 		Date parse(Strnig)
		 */
		
		SimpleDateFormat sdf1 = new SimpleDateFormat();
		System.out.println(sdf1.format(new Date())); // 默认格式格式日期
		
		SimpleDateFormat sdf2 = new SimpleDateFormat(PATTERN); // 构造函数
		System.out.println(sdf2.format(new Date())); // 指定格式格式日期
		
		
//		Date d = sdf2.parse("2018年05月22日 23:20:30");
//		System.out.println(d);
		Locale locale = new Locale("ja", "JP", "JP");
		SimpleDateFormat sdf3 = new SimpleDateFormat(PATTERN2, locale);
		System.out.println(sdf3.format(new Date())); // 默认格式格式日期
		
		
	}

}
