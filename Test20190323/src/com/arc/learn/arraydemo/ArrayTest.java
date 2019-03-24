package com.arc.learn.arraydemo;

public class ArrayTest {

	public static void main(String[] args) {
		int n = 0b00111100;
		int d = 60;
		int o = 074;
		int h = 0x3C;
		
//		System.out.println((char)(2 + 'A'));
//		char[] arr = new char[8];
//		System.out.println(arr[0]);
		
		
		
		toHex4(60);
	}

	/**
	 * 二进制转十六进制：
	 * 四个二进制位一组，表示一个十六进制数字
	 * 一个二进制数与15做与运算，取最后四位，转换为十六进制数字
	 * 移位运算，求二进制数的十六进制值
	 */
	public static void toHex(int num) {
		for(int x=0; x<8; x++) { // 32位
			int temp = num & 0b1111;
			if(temp > 9) {
				System.out.print((char)(temp-10 + 'A'));
			}else {
				System.out.print(temp);
			}
			num = num >>> 4;
		}
	}
	
	/**
	 * 查表法
	 * 0,1,2,3,4,5,6,7,8,9, A, B， C， D， E， F
	 * 0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15
	 * @param num
	 */
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
			arr[i]=c[temp];
			num = num >>> 4;
			i++;
		}
		for(int x=0; x<arr.length; x++) {
			System.out.print(arr[x] + ",");
		}
	}
	
	public static void toHex4(int num) {
		if (num == 0) {
			System.out.println(num);
			return;
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
			int temp = num & 15;
			arr[--i]=c[temp];
			num = num >>> 4;
		}
		for(int x=i; x<arr.length; x++) {
			System.out.print(arr[x]);
		}
	}
}
