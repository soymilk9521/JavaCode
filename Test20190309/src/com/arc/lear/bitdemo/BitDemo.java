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
		
		// ��������1λ��Чλ���������к�1�����㣬����ԭ����ֵ
		// ȡ�������е�ĳһ��
		
		
		
		
		
		
		/*
		 *  0000 0110
		 * |0000 0011
		 * ---------------
		 *  000000111   = 7
		 */
		int i2 = 6 | 3;
		System.out.println(i2);
		
		// ��������1λ��Чλ���������к�1�����㣬����������Чλ
		
		
		
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
