package com.arc.learn.utilitiesdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysDemo {

	public static void main(String[] args) {
		/**
		 * Arrays�����Ͽ�ܹ�����
		 * 
		 * 	1. toString(array) 
		 * 	2. sort(array)   // ��������
		 * 	3. binarySearch(array)   // ���ֲ���
		 * 	4. asList(array) // ����ת����
		 * 
		 * ����ת����
		 * 
		 * foreachѭ�����
		 * ��ʽ��
		 * 	for������ ���� �� ����|���飩 {
		 * 		
		 *  }
		 *  
		 * �ɱ���� 
		 */
		int[] arr = new int[] {
			1, 6, 8, 9, 5, 2, 7, 3, 4	
		};
		arrayToString(arr);
		sortArray(arr);
		arrayToString(arr);
		int index = binarySearchArray(arr, 5);
		System.out.println(index);
		// ����ת����
		// �ŵ㣺����ʹ���ü��Ͽ�ܷ���
		// ȱ�㣺���鳤�Ȳ��ɸı䣬����ʹ�ü��Ͽ�ܵ���ɾ����
		// ע��:�������Ԫ���ǻ�����������,������������Ϊ�����е�һ��Ԫ�أ�
		//     �������Ԫ���������������ͣ��������е�ÿһ��Ԫ����Ϊ�����е�Ԫ�ء�
		List list = Arrays.asList(arr); 
		System.out.println(list);
		System.out.println(list.size()); // 1
		String[] strs = new String[] {
				"abc1",
				"abc2",
				"abc3",
				"abc4",
				"abc5"
		};
		List<String> strList = Arrays.asList(strs);
		System.out.println(strList);
		System.out.println(strList.size()); // 6
		
//		collectionToArray(); // ����ת����
		
//		testForeach(); // foreachѭ��
		
		testArgs(1,2,3,4,5,6); // �ɱ����
	}
	
	/**
	 * �ɱ����
	 * @param arr
	 */
	private static void testArgs(int... arr) { // �����������װ������
		for(int i : arr) {
			System.out.println(i);
		}
	}

	/**
	 * foreachѭ��
	 */
	private static void testForeach() {
		String[] strs = new String[] {
				"abc1",
				"abc2",
				"abc3",
				"abc4",
				"abc5"
		};
		
		for(String str: strs) {
			System.out.println(str);
		}
		
		
		List<String> list = new ArrayList<String>();
		list.add("abc1");
		list.add("abc2");
		list.add("abc3");
		list.add("abc4");
		list.add("abc5");
		for(String str: list) {
			System.out.println(str);
		}
	}

	/**
	 * ����ת����
	 */
	private static void collectionToArray() {
		List<String> list = new ArrayList<String>();
		list.add("abc1");
		list.add("abc2");
		list.add("abc3");
		list.add("abc4");
		list.add("abc5");
		String[] strArr = list.toArray(new String[1]);
		System.out.println(Arrays.toString(strArr));
		System.out.println(strArr.length);
	}

	/**
	 * ���ֲ���
	 * @param arr
	 * @param key
	 * @return
	 */
	private static int binarySearchArray(int[] arr, int key) {
		return Arrays.binarySearch(arr, key);
	}

	/**
	 * ��������
	 * @param arr
	 */
	private static void sortArray(int[] arr) {
		Arrays.sort(arr);
	}

	/**
	 * ��ӡ��������
	 * @param arr
	 */
	public static void arrayToString(int[] arr) {
		System.out.println(Arrays.toString(arr));
	}
	
	

}
