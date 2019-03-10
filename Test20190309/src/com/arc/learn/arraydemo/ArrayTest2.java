package com.arc.learn.arraydemo;

public class ArrayTest2 {

	public static void main(String[] args) {
		toHex(60);
		toBinary(60);
		toOctal(60);
	}

	/**
	 * 十进制转十六进制
	 * 
	 */
	public static void toHex(int num) {
		trans(num, 15, 4);
	}
	
	/**
	 * 十进制转二进制
	 * 
	 * @param num
	 */
	public static void toBinary(int num) {
		trans(num, 1, 1);
	}
	
	/**
	 * 十进制转八进制
	 * 
	 * @param num
	 */
	public static void toOctal(int num) {
		trans(num, 7, 3);
	}
	
	public static void trans(int num, int base, int offset) {
		if(num == 0) {
			System.out.println("0");
		}
		char[] c = new char[] {
				'0', '1', '2','3',
				'4','5','6','7',
				'8','9','A','B'
				,'C','D','E','F'
		};
		char[] arr = new char[8];
		int i = arr.length;
		while(num != 0) {
			int temp = num & base;
			arr[--i]=c[temp];
			num = num >>> offset;
		}
		for(int x=i; x<arr.length; x++) {
			System.out.print(arr[x]);
		}
		System.out.println();
	}
}
