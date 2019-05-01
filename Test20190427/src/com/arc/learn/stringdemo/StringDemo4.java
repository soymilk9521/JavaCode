package com.arc.learn.stringdemo;

public class StringDemo4 {

	public static void main(String[] args) {
		String str = "asfdsdfsfd";
		System.out.println(getLenth(str));
		System.out.println(getCharByIndex(str, 9));
		System.out.println(getIndexByChar(str, 'd'));
		System.out.println(getIndexByChar(str, 'd', 4));
		System.out.println(getSubstring(str, 5));
		System.out.println(getSubstring(str, 5, getLenth(str)));
	}
	
	
	/**
	 * ��ȡ�ַ�������
	 * @param str
	 * @return
	 */
	public static int getLenth(String str) {
		return str.length();
	}

	/**
	 * ����λ�û�ȡ�ַ�
	 * @param str
	 * @param index
	 * @return
	 */
	public static char getCharByIndex(String str, int index) {
		return str.charAt(index);
	}
	
	/**
	 * �����ַ���ȡ�����ַ����е�һ�γ��ֵ�λ�á�
	 * @param str
	 * @param c
	 * @return
	 */
	public static int getIndexByChar(String str, char c) {
//		return str.indexOf(c);
		return str.lastIndexOf(c);
	}
	
	/**
	 * �����ַ���ȡ�����ַ����е�һ�γ��ֵ�λ��, ��ָ����������ʼ����
	 * @param str
	 * @param c
	 * @param fromIndex
	 * @return
	 */
	public static int getIndexByChar(String str, char c, int fromIndex) {
		return str.indexOf(c, fromIndex);
	}
	/**
	 * ��ȡ�ַ����Ӵ�
	 * @param str
	 * @param beginIndex
	 * @return
	 */
	public static String getSubstring(String str, int beginIndex) {
		return str.substring(beginIndex);
	}
	
	public static String getSubstring(String str, int beginIndex, int endIndex) {
		return str.substring(beginIndex, endIndex); // ������ʼλ���ַ�������������λ���ַ�
	}
}
