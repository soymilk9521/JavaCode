package com.arc.learn.array2demo;

public class ArrayTest2 {

	public static void main(String[] args) {
		int[][] arr = {{5, 4, 3, 2, 1}, {5, 4, 3, 2}, {5, 4, 3}, {5, 4}, {1}};
		print(arr);
	}
	
	/**
	 * 
	 * @param arr
	 */
	public static void print(int[][] arr) {
		// 二维数组中所有元素的和
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}

}
