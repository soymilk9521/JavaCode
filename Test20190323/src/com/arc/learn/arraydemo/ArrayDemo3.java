package com.arc.learn.arraydemo;

public class ArrayDemo3 {

	public static void main(String[] args) {
		/*
		 * ��ʽ1
		 * ��Ҫһ�������� ���ǲ���ȷ�����ľ������ݡ�
		 * 
		 */
		int[] arr = new int[3];
		
		
		/*
		 * ��ʽ2
		 * ��Ҫһ���������洢��֪�ľ�������
		 * 
		 */
		int[] arr2 = new int[] {-4, -3, -12, -15, -8};
		int[] arr3 = {5, 3, 8, 11};
		
		/*
		 * �������1�� ��ȡֵ
		 */
		arr[0] = 3;
//		System.out.println(arr[0]);
		
		/*
		 * �������2�� ѭ������ �Ƶ�ʹ��forѭ��
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
