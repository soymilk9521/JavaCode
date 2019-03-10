package com.arc.lear.bitdemo;

public class BitDemo2 {

	public static void main(String[] args) {
		System.out.println(2*8);
		System.out.println(2<<3);
		
		int a = 5;
		int b = 3;
//		a = a + b;
//		b = a - b;
//		a = a - b;
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println("a="+ a + ", b=" + b);
	}

}
