package com.arc.learn.exceptiondemo;

public class ExceptionDemo {

	public static void main(String[] args) {
		/**
		 * 1. �쳣����
		 * 2. �쳣���壺java����ʱ�����Ĵ���
		 *    Java��ͨ�������ʽ�����й����г��ֵĴ�����������ͷ�װ����Щ���Ϊ�쳣��
		 *    �磺NullPointerException��ArrayIndexOutOfBoundsException��
		 * 3. �쳣���֣�Throwable����
		 * 	  3.1. һ�㲻���Դ���ġ� Error�࣬��JVM�׳���
		 * 	  3.2. ���Դ���ġ�Exception�࣬Java��������ʱ�׳���
		 */
		
		int[] arr = new int[3];
//		System.out.println(arr[3]); // java.lang.ArrayIndexOutOfBoundsException
		arr = null;
		System.out.println(arr[0]); // java.lang.NullPointerException
	}

}
