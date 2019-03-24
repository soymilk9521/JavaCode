package com.arc.learn.array2demo;

public class ArrayDemo2 {

	public static void main(String[] args) {
		int[] arr = new int[3];
		System.out.println(arr); // [I@7852e922
		
		int[][] arr2 = new int[3][2]; // 创建一个二维数组，该数组中有三个一维数组，每个数组有两个元素
		System.out.println(arr2); // 直接打印二维数组 [[I@4e25154f
		System.out.println(arr2[0]); // 打印二维数组索引为0的一维数组 [I@70dea4e
		System.out.println(arr2[0][0]); // 打印二维数组索引为0的一维数组的索引为0的元素
		
//		int[][] arr3 = new int[3][];
//		System.out.println(arr3); // 直接打印二维数组 [[I@5c647e05
//		System.out.println(arr3[0]); // 打印二维数组索引为0的一维数组 null
//		System.out.println(arr3[0][0]); // 打印二维数组索引为0的一维数组的索引为0的元素 NullPointerException
		
		int[][] arr4 = new int[3][2];
		System.out.println(arr4.length); // 打印二维数组的长度
		System.out.println(arr4[1].length); // 打印二维数组中索引为1的一维数组的长度
		
		int[][] arr5 = {{3, 5, 6, 12,9}, {6, 19, 90}, {12, 3, 99, 10}};
		
//		int[][] arr3 = new int[3][];
//		int[] a = {3, 5, 6, 12,9};
//		arr3[0] = a;
//		int[] b =  {6, 19, 90};
//		arr3[1] = b;
//		int[] c = {12, 3, 99, 10};
//		arr3[2] = c;
		
		// 打印数组内容
		System.out.println("打印数组内容1:");
		for (int i = 0; i < arr5.length; i++) { // 外层循环循环外层数组
			for (int j = 0; j < arr5[i].length; j++) { // 内层循环循环内层数组
				System.out.print(arr5[i][j] + ", ");
			}
		}
		
	}

}
