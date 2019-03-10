package com.arc.learn.arraydemo;

public class ArrayTest {

	public static void main(String[] args) {
		
		toHex(60);
	}

	/**
	 * 二进制转十六进制
	 * 
	 */
	public static void toHex(int num) {
		for(int x=0; x<8; x++) {
			int temp = num & 15;
			if(temp > 9) {
				System.out.print((char)(temp-10 + 'A'));
			}else {
				System.out.print(temp);
			}
			num = num >>> 4;
		}
	}
	
	public static void toHex2(int num) {
		char[] c = new char[] {
				'0', '1', '2','3',
				'4','5','6','7',
				'8','9','A','B'
				,'C','D','E','F'
		};
		for(int x=0; x<8; x++) {
			int temp = num & 15;
			System.out.print(c[temp]);
			num = num >>> 4;
		}
	}
	
	public static void toHex3(int num) {
		char[] c = new char[] {
				'0', '1', '2','3',
				'4','5','6','7',
				'8','9','A','B'
				,'C','D','E','F'
		};
		char[] arr = new char[8];
		int i = 0;
		while(num != 0) {
			int temp = num & 15;
			arr[i++]=c[temp];
			num = num >>> 4;
		}
		for(int x=0; x<i; x++) {
			System.out.print(arr[x] + ",");
		}
	}
	
	public static void toHex4(int num) {
		char[] c = new char[] {
				'0', '1', '2','3',
				'4','5','6','7',
				'8','9','A','B'
				,'C','D','E','F'
		};
		char[] arr = new char[8];
		int i = arr.length;
		while(num != 0) {
			int temp = num & 15;
			arr[--i]=c[temp];
			num = num >>> 4;
		}
		for(int x=i; x<arr.length; x++) {
			System.out.print(arr[x] + ",");
		}
	}
}
