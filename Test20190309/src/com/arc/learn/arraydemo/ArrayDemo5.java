package com.arc.learn.arraydemo;

public class ArrayDemo5 {

	public static void main(String[] args) {
		int[] arr = new int[] {5, 6, 11, 3, 101, 9};
		bubbleSort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] +",");
		}
	}
	/**
	 * 选择排序
	 * 
	 */
	public static void selectSort(int[] arr) {
		for(int x=0; x<arr.length-1; x++) {
			for(int y=x+1; y<arr.length; y++) {
				if(arr[x] > arr[y]) {
					int temp = arr[x];
					arr[x] = arr[y];
					arr[y] = temp;
				}
			}
		}
	}
	
	/**
	 * 冒泡排序
	 * 
	 */
	
	public static void bubbleSort(int[] arr) {
		for(int x=0; x<arr.length-1; x++) {
			for(int y=0; y<arr.length-1-x; y++) {
				if(arr[y] > arr[y+1]) {
					int temp = arr[y];
					arr[y] = arr[y+1];
					arr[y+1] = temp;
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
}
