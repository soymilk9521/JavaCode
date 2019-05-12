package com.arc.learn.utilitiesdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import com.arc.learn.collectiondemo.StringLengthComparator;

public class CollectionsDemo {

	public static void main(String[] args) {
		/**
		 * Collections:集合框架工具类。
		 * 1. 排序
		 * 		void sort(List);
		 * 		void sort(List, 比较器);
		 * 2. 查找
		 * 		int binarySearch(list, T);
		 * 		int binarySearch(list, T, 比较器);
		 * 3. 求最值
		 * 		T max(list);
		 * 		T max(list, 比较器);
		 * 		T min(list);
		 * 		T min(list, 比较器);
		 * 4. 逆序&替换
		 * 		Collections.reverseOrder(比较器)
		 * 		void reverse(list)
		 * 		void replaceAll(list, oldVal, newVal)
		 * 		void file(list,newVal)
		 * 		void shuffle(list)
		 * 
		 */
		
//		sortList(); // 排序
//		binarySearch(); // 二分查找
//		getMax();   // 所谓的最大值
//		getMin();	// 所谓的最小值
//		reverseSet(); // 逆序
//		reverseSet2(); // 已有比较器逆序
//		reverseList();// 逆序
		replaceAll(); 
		
		
	}

	/**
	 * 元素替换
	 */
	private static void replaceAll() {
		List<String> list = new ArrayList<String>();
		list.add("abc");
		list.add("aaa");
		list.add("ddd");
		list.add("abcd");
		list.add("ccc");
		list.add("ccc");
		list.add("asdf");
		list.add("a");
		list.add("da");
		System.out.println(list);
//		Collections.replaceAll(list, "ccc", "ttt");
//		Collections.fill(list, "aaa");
		Collections.shuffle(list); // 使用默认随机源， 对指定列表置换
		System.out.println(list);
	}

	/**
	 * List集合元素逆序
	 */
	private static void reverseList() {
		List<String> list = new ArrayList<String>();
		list.add("abc");
		list.add("aaa");
		list.add("ddd");
		list.add("abcd");
		list.add("ccc");
		list.add("asdf");
		list.add("a");
		list.add("da");
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
	}

	/**
	 * TreeSet集合逆序排序
	 * 1. 使用默认比较器
	 */
	private static void reverseSet() {
		TreeSet<String>	ts = new TreeSet<>(Collections.reverseOrder()); // Collections.reverseOrder()返回一个比较器
		ts.add("abc");
		ts.add("aaa");
		ts.add("ddd");
		ts.add("abcd");
		ts.add("ccc");
		ts.add("asdf");
		ts.add("a");
		ts.add("da");
		System.out.println(ts); // 自然顺序倒序排序
	}
	
	/**
	 * TreeSet集合逆序排序
	 * 1. 使用自定义比较器
	 */
	private static void reverseSet2() {
		TreeSet<String>	ts = new TreeSet<>(Collections.reverseOrder(new StringLengthComparator())); // 将已有的比较器排序逆转排序
		ts.add("abc");
		ts.add("aaa");
		ts.add("ddd");
		ts.add("abcd");
		ts.add("ccc");
		ts.add("asdf");
		ts.add("a");
		ts.add("da");
		System.out.println(ts); // 
		
	}

	/**
	 * 二分查找
	 * 1. 自然顺序二分查找
	 * 2. 使用比较器指定顺序二分查找
	 */
	private static void binarySearch() {
		List<String> list = new ArrayList<String>();
		list.add("abc");
		list.add("aaa");
		list.add("ddd");
		list.add("abcd");
		list.add("ccc");
		list.add("asdf");
		list.add("a");
		list.add("da");
		Collections.sort(list);
		System.out.println(list); // 自然顺序
		int index = Collections.binarySearch(list, "ddd");
		System.out.println(index);
		
		Collections.sort(list,new StringComparator());
		System.out.println(list); // 自然顺序倒序
		index = Collections.binarySearch(list, "ddd", new StringComparator());
		System.out.println(index);
		
		Collections.sort(list,new StringLengthComparator());
		System.out.println(list); // 先按长度排序，然后按字母自然顺序排序
		index = Collections.binarySearch(list, "ddd", new StringLengthComparator());
		System.out.println(index);
		
		
	}

	/**
	 * 集合中取最小值（集合中索引为0位置的元素）
	 * 1. 默认顺序
	 * 2. 指定顺序
	 */
	private static void getMin() {
		List<String> list = new ArrayList<String>();
		list.add("abc");
		list.add("aaa");
		list.add("ddd");
		list.add("abcd");
		list.add("ccc");
		list.add("asdf");
		list.add("a");
		list.add("da");
		String min = Collections.min(list);
		System.out.println(min); // 自然顺序，第一个元素
		min = Collections.min(list, new StringComparator());
		System.out.println(min); // 自然顺序倒序，第一个元素
		min = Collections.min(list, new StringLengthComparator());
		System.out.println(min); // 先按长度排序，然后按字母自然顺序排序，第一个元素
	}

	/**
	 * 取集合中最大值（集合中最后一个元素）
	 * 1. 默认顺序
	 * 2. 指定顺序
	 */
	private static void getMax() {
		List<String> list = new ArrayList<String>();
		list.add("abc");
		list.add("aaa");
		list.add("ddd");
		list.add("abcd");
		list.add("ccc");
		list.add("asdf");
		list.add("a");
		list.add("da");
		String max = Collections.max(list);
		System.out.println(max); // 自然顺序，最后一个元素
		max = Collections.max(list, new StringComparator());
		System.out.println(max); // 自然顺序倒序，最后一个元素
		max = Collections.max(list, new StringLengthComparator());
		System.out.println(max); // 先按长度排序，然后按字母自然顺序排序，最后一个元素
	}

	/**
	 * 集合排序
	 * 1. 默认排序
	 * 2. 使用比较器排序
	 */
	private static void sortList() {
		List<String> list = new ArrayList<String>();
		list.add("abc");
		list.add("aaa");
		list.add("ddd");
		list.add("abcd");
		list.add("ccc");
		list.add("asdf");
		list.add("a");
		list.add("da");
		System.out.println(list); // 插入顺序
		
		Collections.sort(list);   // 自然顺序
		System.out.println(list);
		
		Collections.sort(list, new StringComparator());
		System.out.println(list); // 自然顺序倒序
		
		Collections.sort(list, new StringLengthComparator());
		System.out.println(list); // 先按长度排序，然后按字母自然顺序排序
		
	}
	
	

}
