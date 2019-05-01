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
	 * 获取字符串长度
	 * @param str
	 * @return
	 */
	public static int getLenth(String str) {
		return str.length();
	}

	/**
	 * 根据位置获取字符
	 * @param str
	 * @param index
	 * @return
	 */
	public static char getCharByIndex(String str, int index) {
		return str.charAt(index);
	}
	
	/**
	 * 根据字符获取其在字符串中第一次出现的位置。
	 * @param str
	 * @param c
	 * @return
	 */
	public static int getIndexByChar(String str, char c) {
//		return str.indexOf(c);
		return str.lastIndexOf(c);
	}
	
	/**
	 * 根据字符获取其在字符串中第一次出现的位置, 以指定的索引开始搜索
	 * @param str
	 * @param c
	 * @param fromIndex
	 * @return
	 */
	public static int getIndexByChar(String str, char c, int fromIndex) {
		return str.indexOf(c, fromIndex);
	}
	/**
	 * 获取字符串子串
	 * @param str
	 * @param beginIndex
	 * @return
	 */
	public static String getSubstring(String str, int beginIndex) {
		return str.substring(beginIndex);
	}
	
	public static String getSubstring(String str, int beginIndex, int endIndex) {
		return str.substring(beginIndex, endIndex); // 包括开始位置字符，不包括结束位置字符
	}
}
