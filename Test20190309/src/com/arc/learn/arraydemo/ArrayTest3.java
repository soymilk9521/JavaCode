package com.arc.learn.arraydemo;

public class ArrayTest3 {

	public static void main(String[] args) {
		String str = getWeek(2);
		System.out.println(str);
	}
	
	/**
	 * ����ת��
	 */
	
	public static String getWeek(int num) {
		if(num > 7 || num <0) {
			System.out.println("�������");
		}
		String[] weeks = new String[] {"","����һ", "���ڶ�", "������", "������", "������", "������", "������"};
		return weeks[num];
	}

}
