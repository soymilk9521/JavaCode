package com.arc.learn.arraydemo;

public class ArrayTest3 {

	public static void main(String[] args) {
		String[] weeks = new String[] {"","����һ", "���ڶ�", "������", "������", "������", "������", "������"};
//										0    1        2			3 		4			5		6		7
		int x = 8;
		String str = getWeek(weeks, x);
		System.out.println(str);
	}
	
	/**
	 * ��ȷ�����б� 
	 *  String[] weeks
	 * 	int x
	 * ��ȷ����ֵ����
	 * 	String 
	 */
	public static String getWeek(String[] weeks, int x) {
		if(weeks != null && x>=0 && x<weeks.length) {
			return weeks[x];
		}
		return "û���ҵ�����";
		
//		if(weeks == null || (x>7 || x<0)) {
//			return "û���ҵ�����";
//		}
//		return weeks[x];
	}
	
	
	
	

}
