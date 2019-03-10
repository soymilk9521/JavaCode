package com.arc.lear.bitdemo;

public class BitDemo {

	public static void main(String[] args) {

		/*
		 *  0000 0110
		 * &0000 0011
		 * ---------------
		 *  000000010   = 2
		 */
		int i = 6 & 3;
		System.out.println(i);
		
		// 二进制中1位有效位，与运算中和1与运算，保留原有数值
		// 取二进制中的某一段
		
		
		
		
		
		
		/*
		 *  0000 0110
		 * |0000 0011
		 * ---------------
		 *  000000111   = 7
		 */
		int i2 = 6 | 3;
		System.out.println(i2);
		
		// 二进制中1位有效位，或运算中和1或运算，保留所有有效位
		
		
		
		/*
		 *  0000 0110
		 * ^0000 0011
		 * ---------------
		 *  000000101   = 5
		 */
		int i3 = 6 ^ 3;
		System.out.println(i3);
		
		int a = 0b0101010;
		a = 012345;
		a = 0x123f;
		
		
	}

}
