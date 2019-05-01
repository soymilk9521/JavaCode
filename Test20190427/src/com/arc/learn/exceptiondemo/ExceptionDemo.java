package com.arc.learn.exceptiondemo;

public class ExceptionDemo {

	public static void main(String[] args) {
		/**
		 * 1. 异常举列
		 * 2. 异常定义：java运行时发生的错误
		 *    Java将通过类的形式对运行过程中出现的错误进行描述和封装，这些类成为异常类
		 *    如：NullPointerException，ArrayIndexOutOfBoundsException, ClassCastException等
		 * 3. 异常体现：Throwable父类
		 * 	  3.1. Error类:一般不可以处理的。 
		 * 			由JVM抛出的严重性错误，一般不处理直接修改程序。
		 * 	  3.2. Exception类:可以处理的。
		 * 			Java程序运行时抛出。
		 *    3.3. 无论是error还是exception，问题发生时就可以抛出，让调用者知道，并处理。
		 *    3.4. 异常具有可抛性，可抛性是如何体现？通过throw、throws关键字体现。
		 */
		
		int[] arr = new int[3];
//		System.out.println(arr[3]); // java.lang.ArrayIndexOutOfBoundsException
		arr = null;
//		System.out.println(arr[0]); // java.lang.NullPointerException
		
		Object object = new Object();
//		Person p2 = (Person)object; // java.lang.ClassCastException

//		Hello; // java.lang.Error   
//		int[] err = new int[1024*1024*1024]; // java.lang.OutOfMemoryError
		
		
//		throw new RuntimeException("异常出现");
		
		
	}
	
	

}


