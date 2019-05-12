package com.arc.learn.utilitiesdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysDemo {

	public static void main(String[] args) {
		/**
		 * Arrays：集合框架工具类
		 * 
		 * 	1. toString(array) 
		 * 	2. sort(array)   // 数组排序
		 * 	3. binarySearch(array)   // 二分查找
		 * 	4. asList(array) // 数组转集合
		 * 
		 * 集合转数组
		 * 
		 * foreach循环语句
		 * 格式：
		 * 	for（类型 变量 ： 集合|数组） {
		 * 		
		 *  }
		 *  
		 * 可变参数 
		 */
		int[] arr = new int[] {
			1, 6, 8, 9, 5, 2, 7, 3, 4	
		};
		arrayToString(arr);
		sortArray(arr);
		arrayToString(arr);
		int index = binarySearchArray(arr, 5);
		System.out.println(index);
		// 集合转数组
		// 优点：可以使用用集合框架方法
		// 缺点：数组长度不可改变，不能使用集合框架的增删方法
		// 注意:如果数组元素是基本数据类型,则整个数组作为集合中的一个元素，
		//     如果数组元素是引用数据类型，则数组中的每一个元素作为集合中的元素。
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
		
//		collectionToArray(); // 集合转数组
		
//		testForeach(); // foreach循环
		
		testArgs(1,2,3,4,5,6); // 可变参数
	}
	
	/**
	 * 可变参数
	 * @param arr
	 */
	private static void testArgs(int... arr) { // 将传入参数封装成数组
		for(int i : arr) {
			System.out.println(i);
		}
	}

	/**
	 * foreach循环
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
	 * 集合转数组
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
	 * 二分查找
	 * @param arr
	 * @param key
	 * @return
	 */
	private static int binarySearchArray(int[] arr, int key) {
		return Arrays.binarySearch(arr, key);
	}

	/**
	 * 数组排序
	 * @param arr
	 */
	private static void sortArray(int[] arr) {
		Arrays.sort(arr);
	}

	/**
	 * 打印数组内容
	 * @param arr
	 */
	public static void arrayToString(int[] arr) {
		System.out.println(Arrays.toString(arr));
	}
	
	

}
