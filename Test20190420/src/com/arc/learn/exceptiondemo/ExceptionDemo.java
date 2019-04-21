package com.arc.learn.exceptiondemo;

public class ExceptionDemo {

	public static void main(String[] args) {
		/**
		 * 1. 异常举列
		 * 2. 异常定义：java运行时发生的错误
		 *    Java将通过类的形式对运行过程中出现的错误进行描述和封装，这些类成为异常类
		 *    如：NullPointerException，ArrayIndexOutOfBoundsException等
		 * 3. 异常体现：Throwable父类
		 * 	  3.1. 一般不可以处理的。 Error类，由JVM抛出。
		 * 	  3.2. 可以处理的。Exception类，Java程序运行时抛出。
		 */
		
		int[] arr = new int[3];
//		System.out.println(arr[3]); // java.lang.ArrayIndexOutOfBoundsException
		arr = null;
		System.out.println(arr[0]); // java.lang.NullPointerException
	}

}
