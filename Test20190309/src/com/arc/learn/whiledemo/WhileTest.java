package com.arc.learn.whiledemo;

public class WhileTest {

	public static void main(String[] args) {
		/*
		 * 
		 *  �ۼ�˼����ϰ
		 *   ��1��10�ĺ�
		 *   ����һ������sum��¼��
		 */
		int sum = 0;
		int i = 1;
		while(i<=10) {
//			sum = sum + i;
			sum += i;
			i++;
		}
		System.out.println(sum);
		
		
	}

}
