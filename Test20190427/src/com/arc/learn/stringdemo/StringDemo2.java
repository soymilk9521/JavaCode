package com.arc.learn.stringdemo;

public class StringDemo2 {

	public static void main(String[] args) {
		/**
		 * 1. 获取
		 *   1.1. 获取字符串长度（字符个数）
		 *   	int length(); // length, length()
		 *   1.2. 根据位置获取字符
		 *      char charAt(int index);
		 *   1.3. 根据字符获取其在字符串中第一次出现的位置。
		 *   	int indexOf（int ch）；
		 *      int lastIndexOf（int ch）；
		 *   1.4. 获取字符串子串。
		 *   	String substring（int startIndex）；
		 *      String substring（int startIndex， int endIndex）；
		 *      
		 *      
		 *      
		 * 2. 转换
		 *   2.1. 将字符串转换成字符串数组（字符串切割）。
		 *   	String[] split(String regex);
		 *   2.2. 将字符串变成字符数组。
		 *      char[] toCharArray();
		 *   2.3. 将字符串转换成字节数组。
		 *      byte[] getBytes();
		 *   2.4. 字符串大小写转换。
		 *      String toUpperCase();
		 *      String toLowerCase();
		 *   2.5. 将字符串中内容替换 
		 *   	String replace(char oldch, char newch);        
		 *   	String replace(String old, String new);
		 *   2.6. 去掉字符串两端空格。
		 *   	String trim();
		 *   2.7. 将字符连接。
		 *      String concat(String str);  
		 *      
		 *      
		 *      
		 *        
		 *        
		 * 3. 判断
		 * 	 3.1. 判断两个字符串内容是否相同。
		 * 		boolean equals(Object obj);
		 *  	boolean equalsIgnoreCase(String str);	 
		 *   3.2. 字符串中是否包含指定字符串。
		 *   	boolean contains(String str);
		 *   3.3. 字符串是否已指定字符串开头。
		 *   	boolean startsWith(String str);
		 *      boolean endsWith(String str);
		 * 4. 比较
		 * 	   compareTo(String str);
		 * 
		 * 5. String类-intern();     
		 * 
		 * 
		 */
	}

}
