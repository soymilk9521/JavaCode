package com.arc.learn.arraydemo;

import java.util.Arrays;

public class ArrayDemo5 {

	public static void main(String[] args) {
		int[] arr = new int[] {5, 6, 11, 3, 101, 9};
		
		Arrays.sort(arr);
		
		selectSort2(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] +" ");
		}
	}
	/**
	 * 选择排序
	 * 
	 */
	public static void selectSort(int[] arr) {
		for(int x=0; x<arr.length-1; x++) { // 外层循环比较的轮数。
			for(int y=x+1; y<arr.length; y++) {// 内层循环是每轮比较的次数。
				if(arr[x] > arr[y]) {
					int temp = arr[x];
					arr[x] = arr[y];
					arr[y] = temp;
				}
			}
		}
	}
	
	public static void selectSort3(int[] arr) {
		for(int x = 0; x< arr.length - 1; x ++) {
			for(int y = x+1; y < arr.length; y++) {
				if(arr[x] > arr[y]) {
//					int temp = arr[x];
//					arr[x] = arr[y];
//					arr[y] = temp;
					swap(arr, x, y);
				}
			}
		}
	}
	
	/**
	 * 冒泡排序
	 * 
	 */
	
	public static void bubbleSort(int[] arr) {
		for(int x=0; x<arr.length-1; x++) { // 外层循环代表比较轮数
			for(int y=0; y<arr.length-1-x; y++) { // 内层循环代表每轮比较次数
				if(arr[y] > arr[y+1]) {
//					int temp = arr[y];
//					arr[y] = arr[y+1];
//					arr[y+1] = temp;
					swap(arr, y, y+1);
				}
			}
		}
	}
	
	/**
	 * 换位功能提取
	 */
	public static void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	
	/**
	 * 性能提升：每轮比较之后进行数组元素交换
	 * 定义一个变量num记录最大元素
	 * 定义一个变量index记录最大元素索引
	 */
	public static void selectSort2(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int num = arr[i];
			int index = i;
			for (int j = i+1; j < arr.length; j++) {
				if (num > arr[j]) {
					num = arr[j];
					index = j;
				}
			}
			if (index != i) {
				swap(arr, index, i);
			}
		}
	}
	
	
}
