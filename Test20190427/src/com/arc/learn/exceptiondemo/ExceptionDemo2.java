package com.arc.learn.exceptiondemo;

public class ExceptionDemo2 {

	public static void main(String[] args) {
		int[] arr = new int[] {15, 20, 16};
		int a = Demo.getElementByIndex(arr, 3);
		System.out.println("a=" + a); // 不执行
	}

}

class Demo {
	public static int getElementByIndex(int[] arr, int index) {
		int a = arr[index];
		System.out.println("a=" + a); // 不执行
		return a;
	}
}
