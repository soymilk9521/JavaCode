package com.arc.learn.classesdemo;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

public class DateFormatDemo {

	public static void main(String[] args) throws ParseException {
		/**
		 * DateFormat�����࣬���ڸ�ʽת��
		 * 	��ȡDateFormatʵ����
		 * 		DateFormat.getDateInstance()��Ĭ�ϸ�ʽ��
		 * 		DateFormat.getDateInstance(int dateStyle)��ָ����ʽ��
		 * 		DateFormat.getTimeInstance()��Ĭ�ϸ�ʽ��
		 * 		DateFormat.getTimeInstance(int timeStyle)��ָ����ʽ
		 *		DateFormat.getDateTimeInstance()��Ĭ�ϸ�ʽ��
		 *		DateFormat.getDateTimeInstance(int dateStyle, int timeStyle)��ָ��ʽ��
		 * ʱ���ʽ��Ϊ�ַ���
		 * 		String format(Date):������ת��Ϊָ����ʽ���ַ���
		 *		Date parse(String)����ָ����ʽ�������ַ���ת��Ϊ����
		 *		
		 */
		
		
		DateFormat df1 = DateFormat.getDateInstance();
		System.out.println(df1.format(new Date())); // Ĭ�����ڸ�ʽ��
		
		DateFormat df2 = DateFormat.getTimeInstance(); 
		System.out.println(df2.format(new Date())); // Ĭ��ʱ���ʽ��
		
		DateFormat df3 = DateFormat.getDateTimeInstance();
		System.out.println(df3.format(new Date())); // Ĭ������ʱ���ʽ��
		
		DateFormat df7 = DateFormat.getInstance();
		System.out.println(df7.format(new Date()));
		
		DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println(df4.format(new Date())); // ָ�����ڸ�ʽ��
		
		DateFormat df5 = DateFormat.getTimeInstance(DateFormat.FULL); 
		System.out.println(df5.format(new Date())); // ָ��ʱ���ʽ��
		
		DateFormat df6 = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL);
		System.out.println(df6.format(new Date())); // ָ������ʱ���ʽ��
		
		Date date =  df1.parse("1999/08/08");
		System.out.println(date);
		Date date2 =  df4.parse("2018��5��8��");
		System.out.println(date2);
	}

}
