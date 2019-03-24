package com.arc.learn.test;

public class Test2 {

	public static void main(String[] args) {
		for(int i=65; i<91; i++) {
			System.out.print((char)i);
		}
		System.out.println();
		for(int i=97; i<123; i++) {
			System.out.print((char)i);
		}
		System.out.println();
		
		for (int i = 'a'; i <= 'z'; i++) {
			System.out.println(i);
		}
		
		//challenge("fun&!! time");
		
	}
	
	public static String challenge(String str) {
		byte[] b = str.getBytes();
		for(int i=0; i<b.length; i++) {
			System.out.println(b[i]);
		}
		return null;
	}

}
