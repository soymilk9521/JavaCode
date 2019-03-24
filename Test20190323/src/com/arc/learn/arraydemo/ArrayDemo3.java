package com.arc.learn.arraydemo;

public class ArrayDemo3 {

	public static void main(String[] args) {
		/*
		 * 格式1
		 * 需要一个容器， 但是不明确容器的具体数据。
		 * 
		 */
		int[] arr = new int[3];
		
		
		/*
		 * 格式2
		 * 需要一个容器，存储已知的具体数据
		 * 
		 */
		int[] arr2 = new int[] {-4, -3, -12, -15, -8};
		int[] arr3 = {5, 3, 8, 11};
		
		/*
		 * 数组操作1： 存取值
		 */
		arr[0] = 3;
//		System.out.println(arr[0]);
		
		/*
		 * 数组操作2： 循环遍历 推导使用for循环
		 */
//		System.out.println(arr2[0]);
//		System.out.println(arr2[1]);
//		System.out.println(arr2[2]);
//		System.out.println(arr2[3]);
//		System.out.println(arr2[4]);
		int maxIndex = 0;
		for (int i = 0; i < arr2.length; i++) {
			if (arr2[maxIndex] < arr2[i]) {
				maxIndex = i;
			}
		}
		System.out.println(arr2[maxIndex]);
		
		
		
		
		
	}

}
