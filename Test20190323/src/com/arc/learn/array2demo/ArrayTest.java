package com.arc.learn.array2demo;

public class ArrayTest {

	public static void main(String[] args) {
		int[][] arr = {{3, 5, 6, 12,9}, {6, 19, 90}, {12, 3, 99, 10}};
		int[][] arr2 = new int[3][];
		int[][] arr3 = null;
	}
	
	/**
	 * 需求：打印二维数组最后一个一维数组中的最后一个元素值
	 * 明确参数列表： 一个二维数组
	 * 明确返回值：  void
	 * @param arr
	 */
	public static void printLastValue(int[][] arr) {
		// 1.定义一个变量表示二维数组长度

		// 2.定义一个一维数组变量

		// 3. 判空处理

		// 4.打印元素值
	}
	
	/**
	 * 需求：打印二维数组所有元素
	 * 格式如下： [3, 5, 6, 12, 9, 6, 19, 90, 12, 3, 99, 10] 
	 * 明确参数列表： 一个二维数组
	 * 明确返回值： void
	 * @param arr
	 */
	public static void printAllValue(int[][] arr) {
		// TODO 判空处理
		
		System.out.print("[");
		// 循环嵌套打印数组元素内容
		for (int i = 0; i < arr.length; i++) {
			// TODO 判空处理
			for (int j = 0; j < arr[i].length; j++) {
				// TODO 去掉最后一个逗号
				System.out.print(arr[i][j] + ", ");
			}
		}
		System.out.println("]");
	}
	
	/**
	 * 需求： 求int类型二维数组中所有元素的和
	 * 明确参数列表： 一个二维数组
	 * 明确返回值： int
	 * @param arr
	 * @return
	 */
	public static int sum(int[][] arr) {
		// TODO 判空处理
		// 二维数组中所有元素的和
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			// TODO 判空处理
			for (int j = 0; j < arr[i].length; j++) {
				// TODO 求和处理
				System.out.println(arr[i][j]);
			}
		}
		return sum;
	}

}
