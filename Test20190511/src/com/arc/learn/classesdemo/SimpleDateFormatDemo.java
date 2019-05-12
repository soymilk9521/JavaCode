package com.arc.learn.classesdemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class SimpleDateFormatDemo {

	public static final String PATTERN = "yyyy��MM��dd�� HH:mm:ss";
	public static final String PATTERN2 = "GGGGy��M��d��";
	
	public static void main(String[] args) throws ParseException {
		/**
		 * SimpleDateFormat�࣬�Զ����ʽ����ʱ��ת���࣬����ΪDateFormat������
		 * 	���÷�����
		 * 		String format(Date)
		 * 		Date parse(Strnig)
		 */
		
		SimpleDateFormat sdf1 = new SimpleDateFormat();
		System.out.println(sdf1.format(new Date())); // Ĭ�ϸ�ʽ��ʽ����
		
		SimpleDateFormat sdf2 = new SimpleDateFormat(PATTERN); // ���캯��
		System.out.println(sdf2.format(new Date())); // ָ����ʽ��ʽ����
		
		
//		Date d = sdf2.parse("2018��05��22�� 23:20:30");
//		System.out.println(d);
		Locale locale = new Locale("ja", "JP", "JP");
		SimpleDateFormat sdf3 = new SimpleDateFormat(PATTERN2, locale);
		System.out.println(sdf3.format(new Date())); // Ĭ�ϸ�ʽ��ʽ����
		
		
	}

}
