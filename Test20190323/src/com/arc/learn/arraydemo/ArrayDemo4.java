package com.arc.learn.arraydemo;

public class ArrayDemo4 {

	public static void main(String[] args) {
		int[] arr = new int[] {4, 3, 12, 15, 8};
		System.out.println(getMaxInt(arr));
	}
	
	/**
	 * �������3�����ֵ����Сֵ(ͼ��)
	 * ����˼·��
	 * 	1. ���������¼���Ԫ��ֵ    int max = arr[0];
	 *  2. ���������¼���Ԫ���±� int maxIndex = 0;
	 */
	
	public static int getMaxInt(int[] arr) {
		int max = 0;
		for(int i=0; i<arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		return max ;
	}
	
	public static int getMaxInt1(int[] arr) {
		int max = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}
	
	public static int getMaxInt2(int[] arr) {
		int maxIndex = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[maxIndex] < arr[i]) {
				maxIndex = i;
			}
		}
		return maxIndex;
	}
	
	

}
