package com.arc.learn.array2demo;

public class ArrayDemo {

	public static void main(String[] args) {
//		 ����һ����ά���飬��������������һά���飬ÿ������������Ԫ��
//		 ��ά�����ڴ�ͼ��
		int[][] arr = new int[3][2];
		arr[1][1]=5; 
		arr[2][0] = 88;
		
//		 ��ά�����ڴ�ͼ��
		int[][] arr2 = new int[3][];
		arr2[0] = new int[2];
		arr2[1] = new int[3];
		arr2[2] = new int[1];
	}

}
