package com.arc.learn.stringdemo;

public class StringDemo {

	public static void main(String[] args) {
		/**
		 * 1. String����ص�
		 * 	һ������ʼ���Ͳ��ܸı�
		 * 
		 * 2. String�๹�캯��
		 * 	  String();
		 *    String(byte[] bytes);
		 *    String(char[] value);
		 */
		
		String str1 = "abc"; // ������
		String str2 = new String("abc"); // ���ڴ�
		
//		System.out.println( str1 == str2);
		
		String str3 = new String(); // ��Ч�� String str3 = "" , ����Ч�� String str3 = null��
		
		
		byte[] bytes = new byte[]{65, 66, 67, 68}; // byte���鴴���ַ���
		String str4 = new String(bytes);
		System.out.println(str4);
		
		char[] ch = new char[] {'A', 'B', 'C', 'D'}; // �ַ����鴴���ַ���
		String str5 = new String(ch);
		System.out.println(str5);
		
		String str6 = new String("ABCD"); // �ַ��������ַ�������
		System.out.println(str6);
		
		String str7 = "ABCD";
		System.out.println(str7);
		
		
		System.out.println(str7 + 8);
		System.out.println(String.valueOf(4) + 5);
		
		
		
			
	}

}
