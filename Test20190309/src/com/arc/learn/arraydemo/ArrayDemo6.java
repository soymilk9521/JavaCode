package com.arc.learn.arraydemo;

public class ArrayDemo6 {

	public static void main(String[] args) {
		
	}
	
	/**
	 * 数组常见功能：查找元素下标
	 * 
	 */
	public static int getIndex(int[] arr, int key) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == key) {
				return i;
			}
		}
		return -1;
	}
	
	/**
	 * 二分查找
	 * 
	 */
	public static int halfSearch(int[] arr, int key) {
		int min = 0;
		int max = arr.length -1;;
		int mid = (min + max)/2;
		while(arr[mid]!=key) {
			if(key>arr[mid]) {
				min = mid + 1;
			}else if(key<arr[mid]) {
				max = mid-1;
			}
			if(max<min) {
				return -1;
			}
			mid = (max + min)/2;
		}
		return mid;
		
	}
	

}
