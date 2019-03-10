package com.arc.lear.bitdemo;

public class BitDemo3 {

	public static void main(String[] args) {
		int a = 5;
		int b = 3;
		
		a = a ^ b;
		// System.out.println("a=" + a);
		b = a ^ b ;
		// (a ^ b) ^ b = a
		System.out.println("b=" + b);
		
		a = a ^ b;
		//  (a ^ b) ^a = b
		System.out.println("a=" + a);
	}

}
