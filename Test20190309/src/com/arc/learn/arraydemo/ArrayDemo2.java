package com.arc.learn.arraydemo;

public class ArrayDemo2 {

	public static void main(String[] args) {
		// ��ͼ�ڴ�ͼ��
		int[] x = new int[3];
		int[] y = new int[3];
		System.out.println(x);
		x[0] = 9;
		y[0] = 34;
		y=x;
		y=null;
		
		
		// �������ʱ��������
		// 1. ����Խ���쳣
		int[] arr = new int[3];
		int a = arr[3];
		System.out.println(a); // 
		// 2. ��ָ���쳣
		arr = null;
		int b = arr[0];
		//System.out.println(b);
	}

}
