package com.arc.learn.arraydemo;

public class ArrayDemo6 {

	public static void main(String[] args) {
		int[] arr2 = new int[] {5, 6, 11, 3, 101, 9};
		int index = getIndex(arr2, 5);
		System.out.println(index);
	}
	
	/**
	 * ���鳣�����ܣ�����Ԫ���±�
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
	 * ��ȷ�����б�
	 *    ����int[] arr�� int e
	 *  ��ȷ����ֵ��
	 *    int
	 */
	public static int getIndex2(int[] arr, int e) {
		int index = -1;
		for(int i =0; i<arr.length; i++) {
			if (arr[i] == e) {
				index = i;
			}
		}
		return index;
	}
	
	/**
	 * ���ֲ���
	 * ǰ����������
	 */
	public static int halfSearch(int[] arr, int key) {
		int min = 0;
		int max = arr.length -1;
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
	
	public static int halfSearch2(int[] arr, int key) {
		int min = 0;
		int max = arr.length -1;;
		int mid = (min + max)/2;
		while(max>=min) {
			if(key>arr[mid]) {
				min = mid + 1;
			}else if(key<arr[mid]) {
				max = mid-1;
			}else {
				return mid;
			}
			mid = (max + min)/2;
		}
		return -1;
		
	}
	
	
	/**
	 * ����һ���������飬�����������д洢һ��������֤�����黹������ġ�
	 * ��ô���Ԫ�ص������Ƕ��١�
	 * {13, 15, 19, 28, 29, 35, 70, 109}
	 * @param arr
	 * @param key
	 * @return
	 */
	public static int halfSearch3(int[] arr, int key) {
		int min = 0;
		int max = arr.length -1;;
		int mid = (min + max)/2;
		while(max>=min) {
			if(key>arr[mid]) {
				min = mid + 1;
			}else if(key<arr[mid]) {
				max = mid-1;
			}else {
				return mid;
			}
			mid = (max + min)/2;
		}
		return min;
		
	}
	
	
	

}
