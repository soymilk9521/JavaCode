package com.arc.learn.filedemo;

import java.io.File;

public class RecursiveDemo {

	public static void main(String[] args) {
		/**
		 * 递归：
		 * 	直接或者间接调用自身
		 *  注意：
		 *  	递归调用必须明确递归结束条件，防止内存溢出。
		 */
		
		int sum = testSum(5);
		System.out.println(sum);
		
		String bin = testToBinary(8);
		System.out.println(bin);
		
		File dir = new File("C:\\demo\\deep-aaa_2");
//		testDelete(dir);
	}
	
	/**
	 * 练习一： 1+2+3+4+ ... 10（求和）
	 */
	
	public static int testSum(int num) {
		if(num == 1) {
			return 1;
		}
		return num + testSum(num-1);
	}
	
	/**
	 * 练习二： 求十进制转二进制
	 */
	public static String testToBinary(int num) {
		if (num == 1) {
			return "1";
		}
		int mod = num % 2;
		return "" + testToBinary(num / 2) + mod;
	}
	
	/**
	 * 练习三：使用递归删除文件
	 */
	
	public static void testDelete(File dir) {
		File[] files = dir.listFiles();
		for(File file: files) {
			if (file.isDirectory()) {
				testDelete(file);
			}else {
				System.out.println("file was deleted :" + file.delete());
			}
		}
		System.out.println("dir was deleted : " + dir.delete());
	}
	
	
}
