package com.arc.learn.exceptiondemo;

public class ExceptionDemo {

	public static void main(String[] args) {
		/**
		 * 1. �쳣����
		 * 2. �쳣���壺java����ʱ�����Ĵ���
		 *    Java��ͨ�������ʽ�����й����г��ֵĴ�����������ͷ�װ����Щ���Ϊ�쳣��
		 *    �磺NullPointerException��ArrayIndexOutOfBoundsException, ClassCastException��
		 * 3. �쳣���֣�Throwable����
		 * 	  3.1. Error��:һ�㲻���Դ���ġ� 
		 * 			��JVM�׳��������Դ���һ�㲻����ֱ���޸ĳ���
		 * 	  3.2. Exception��:���Դ���ġ�
		 * 			Java��������ʱ�׳���
		 *    3.3. ������error����exception�����ⷢ��ʱ�Ϳ����׳����õ�����֪����������
		 *    3.4. �쳣���п����ԣ���������������֣�ͨ��throw��throws�ؼ������֡�
		 */
		
		int[] arr = new int[3];
//		System.out.println(arr[3]); // java.lang.ArrayIndexOutOfBoundsException
		arr = null;
//		System.out.println(arr[0]); // java.lang.NullPointerException
		
		Object object = new Object();
//		Person p2 = (Person)object; // java.lang.ClassCastException

//		Hello; // java.lang.Error   
//		int[] err = new int[1024*1024*1024]; // java.lang.OutOfMemoryError
		
		
//		throw new RuntimeException("�쳣����");
		
		
	}
	
	

}


