package com.arc.learn.array2demo;

public class ArrayDemo {

	public static void main(String[] args) {
//		 创建一个二维数组，该数组中有三个一维数组，每个数组有两个元素
//		 二维数组内存图解
		int[][] arr = new int[3][2];
		arr[1][1]=5; 
		arr[2][0] = 88;
		
//		 二维数组内存图解
		int[][] arr2 = new int[3][];
		arr2[0] = new int[2];
		arr2[1] = new int[3];
		arr2[2] = new int[1];
	}

}
