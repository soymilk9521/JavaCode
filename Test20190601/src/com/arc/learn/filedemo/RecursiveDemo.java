package com.arc.learn.filedemo;

import java.io.File;

public class RecursiveDemo {

	public static void main(String[] args) {
		/**
		 * �ݹ飺
		 * 	ֱ�ӻ��߼�ӵ�������
		 *  ע�⣺
		 *  	�ݹ���ñ�����ȷ�ݹ������������ֹ�ڴ������
		 */
		
		int sum = testSum(5);
		System.out.println(sum);
		
		String bin = testToBinary(8);
		System.out.println(bin);
		
		File dir = new File("C:\\demo\\deep-aaa_2");
//		testDelete(dir);
	}
	
	/**
	 * ��ϰһ�� 1+2+3+4+ ... 10����ͣ�
	 */
	
	public static int testSum(int num) {
		if(num == 1) {
			return 1;
		}
		return num + testSum(num-1);
	}
	
	/**
	 * ��ϰ���� ��ʮ����ת������
	 */
	public static String testToBinary(int num) {
		if (num == 1) {
			return "1";
		}
		int mod = num % 2;
		return "" + testToBinary(num / 2) + mod;
	}
	
	/**
	 * ��ϰ����ʹ�õݹ�ɾ���ļ�
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
