package com.arc.learn.classesdemo;

import java.util.Calendar;
import java.util.Date;

public class CalendarDemo {

	public static void main(String[] args) {
		/**
		 * Calendar�࣬�����Date���й��ڷ��������ӹ��ʻ�
		 * ���÷�����
		 * 		Calendar getInstance():ȡ��Calendar��ʵ��
		 * 		long getTimeInMillis()��ȡ�ô�1970.01.01����ǰʱ��ĺ�����
		 * 		int get(int field):���ظ��������ֶε�ֵ
		 * 		void add(int field, int amount) // ���ڼӼ�
		 * 		void set(int field, int value):�������������ֶ�����Ϊ������ֵ�� 
		 *		void set(int year, int month, int date) : ���������ֶ��е�ֵ YEAR �� MONTH�� DAY_OF_MONTH �� 
		 * 		void set(int year, int month, int date, int hourOfDay, int minute) : ���������ֶ��е�ֵ YEAR �� MONTH �� DAY_OF_MONTH �� HOUR_OF_DAY�� MINUTE �� 
		 * 		void set(int year, int month, int date, int hourOfDay, int minute, int second) : �����ֶ��е�ֵ YEAR �� MONTH �� DAY_OF_MONTH �� HOUR_OF_DAY �� MINUTE�� SECOND �� 
		 * 		void setTime(Date date):ʹ�ø����� Date���ô�������ʱ��
		 * 		Date getTime(): ����һ�� Date��ʾ������ Calendar��ʱ��ֵ
		 */
		
		Calendar c = Calendar.getInstance(); // ȡ��Calendar��ʵ��
		Date date = c.getTime();
//		System.out.println(date);
		long l = c.getTimeInMillis(); // ȡ�ô�1970.01.01����ǰʱ��ĺ�����
//		System.out.println(l);
		
		int year = c.get(Calendar.YEAR);       // ��
		int month = c.get(Calendar.MONTH) + 1; // �·�Χ0~11
		int day = c.get(Calendar.DAY_OF_MONTH);// ��
//		System.out.println(c.get(Calendar.DATE));// ��
//		System.out.println(year + "��" + month + "��" + day + "��");
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
