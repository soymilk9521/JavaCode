package com.arc.learn.arraydemo;

public class ArrayDemo2 {

	public static void main(String[] args) {
		// 画图内存图解
		int[] x = new int[3];
		int[] y = new int[3];
		System.out.println(x);
		x[0] = 9;
		y[0] = 34;
		y=x;
		y=null;
		
		
		// 数组操作时常见问题
		// 1. 数组越界异常
		int[] arr = new int[3];
		int a = arr[3];
		System.out.println(a); // 
		// 2. 空指针异常
		arr = null;
		int b = arr[0];
		//System.out.println(b);
	}

}
