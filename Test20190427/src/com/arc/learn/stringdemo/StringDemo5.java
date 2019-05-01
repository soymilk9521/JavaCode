package com.arc.learn.stringdemo;

public class StringDemo5 {

	public static void main(String[] args) {
//		String str = "abc nba cba gafa";
////		String[] arr = testSplit(str, " ");
////		printArray(arr);
//		byte[] carr = testGetBytes(str);
//		printArray(carr);
//		String str2 = str.toUpperCase();
//		System.out.println(str2);
//		System.out.println(str2.toLowerCase());
//		System.out.println(str.replace('a', 'z'));
//		System.out.println(str.replace("abc", "zzz"));
//		String str3 = "  naad sdfd     abc   ";
//		System.out.println(str3.trim());
//		System.out.println(str3.replace(" ", ""));
//		System.out.println(str + str3);
//		System.out.println(str.concat(str3));
		
		String str4 = "abcnbacba";
		String str5 = new String("abc");
		
		System.out.println(str4 == str5);
		System.out.println(str4.equals(str5));
		System.out.println(str4.equalsIgnoreCase(str5));
		System.out.println(str4.contains(str5));
		System.out.println(str4.startsWith(str5));
		System.out.println(str4.endsWith("cba"));
		System.out.println("cc".compareTo("aa") > 0);
		
		
		String str6 = "abc" + "abc";
		String str7 = "abcabc";
		String str8 = str7 + "abc";
		
		System.out.println(str6 == str8.intern());
		System.out.println(str6 == str7);
		
	}
	
	/**
	 * ×Ö·û´®ÇÐ¸î
	 * @param str
	 * @param regex
	 * @return
	 */
	public static String[] testSplit(String str, String regex) {
		String[] arr = str.split(regex);
		return arr;
	}
	
	/**
	 * ½«×Ö·û´®±ä³É×Ö·ûÊý×é
	 * @param str
	 * @return
	 */
	public static char[] testToCharArray(String str) {
		return str.toCharArray();
	}
	
	public static byte[] testGetBytes(String str) {
		return str.getBytes();
	}
	
	
	
	
	private static void printArray(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	private static void printArray(char[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	private static void printArray(byte[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
