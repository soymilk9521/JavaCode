package com.arc.learn.utilitiesdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import com.arc.learn.collectiondemo.StringLengthComparator;

public class CollectionsDemo {

	public static void main(String[] args) {
		/**
		 * Collections:���Ͽ�ܹ����ࡣ
		 * 1. ����
		 * 		void sort(List);
		 * 		void sort(List, �Ƚ���);
		 * 2. ����
		 * 		int binarySearch(list, T);
		 * 		int binarySearch(list, T, �Ƚ���);
		 * 3. ����ֵ
		 * 		T max(list);
		 * 		T max(list, �Ƚ���);
		 * 		T min(list);
		 * 		T min(list, �Ƚ���);
		 * 4. ����&�滻
		 * 		Collections.reverseOrder(�Ƚ���)
		 * 		void reverse(list)
		 * 		void replaceAll(list, oldVal, newVal)
		 * 		void file(list,newVal)
		 * 		void shuffle(list)
		 * 
		 */
		
//		sortList(); // ����
//		binarySearch(); // ���ֲ���
//		getMax();   // ��ν�����ֵ
//		getMin();	// ��ν����Сֵ
//		reverseSet(); // ����
//		reverseSet2(); // ���бȽ�������
//		reverseList();// ����
		replaceAll(); 
		
		
	}

	/**
	 * Ԫ���滻
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
		Collections.shuffle(list); // ʹ��Ĭ�����Դ�� ��ָ���б��û�
		System.out.println(list);
	}

	/**
	 * List����Ԫ������
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
	 * TreeSet������������
	 * 1. ʹ��Ĭ�ϱȽ���
	 */
	private static void reverseSet() {
		TreeSet<String>	ts = new TreeSet<>(Collections.reverseOrder()); // Collections.reverseOrder()����һ���Ƚ���
		ts.add("abc");
		ts.add("aaa");
		ts.add("ddd");
		ts.add("abcd");
		ts.add("ccc");
		ts.add("asdf");
		ts.add("a");
		ts.add("da");
		System.out.println(ts); // ��Ȼ˳��������
	}
	
	/**
	 * TreeSet������������
	 * 1. ʹ���Զ���Ƚ���
	 */
	private static void reverseSet2() {
		TreeSet<String>	ts = new TreeSet<>(Collections.reverseOrder(new StringLengthComparator())); // �����еıȽ���������ת����
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
	 * ���ֲ���
	 * 1. ��Ȼ˳����ֲ���
	 * 2. ʹ�ñȽ���ָ��˳����ֲ���
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
		System.out.println(list); // ��Ȼ˳��
		int index = Collections.binarySearch(list, "ddd");
		System.out.println(index);
		
		Collections.sort(list,new StringComparator());
		System.out.println(list); // ��Ȼ˳����
		index = Collections.binarySearch(list, "ddd", new StringComparator());
		System.out.println(index);
		
		Collections.sort(list,new StringLengthComparator());
		System.out.println(list); // �Ȱ���������Ȼ����ĸ��Ȼ˳������
		index = Collections.binarySearch(list, "ddd", new StringLengthComparator());
		System.out.println(index);
		
		
	}

	/**
	 * ������ȡ��Сֵ������������Ϊ0λ�õ�Ԫ�أ�
	 * 1. Ĭ��˳��
	 * 2. ָ��˳��
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
		System.out.println(min); // ��Ȼ˳�򣬵�һ��Ԫ��
		min = Collections.min(list, new StringComparator());
		System.out.println(min); // ��Ȼ˳���򣬵�һ��Ԫ��
		min = Collections.min(list, new StringLengthComparator());
		System.out.println(min); // �Ȱ���������Ȼ����ĸ��Ȼ˳�����򣬵�һ��Ԫ��
	}

	/**
	 * ȡ���������ֵ�����������һ��Ԫ�أ�
	 * 1. Ĭ��˳��
	 * 2. ָ��˳��
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
		System.out.println(max); // ��Ȼ˳�����һ��Ԫ��
		max = Collections.max(list, new StringComparator());
		System.out.println(max); // ��Ȼ˳�������һ��Ԫ��
		max = Collections.max(list, new StringLengthComparator());
		System.out.println(max); // �Ȱ���������Ȼ����ĸ��Ȼ˳���������һ��Ԫ��
	}

	/**
	 * ��������
	 * 1. Ĭ������
	 * 2. ʹ�ñȽ�������
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
		System.out.println(list); // ����˳��
		
		Collections.sort(list);   // ��Ȼ˳��
		System.out.println(list);
		
		Collections.sort(list, new StringComparator());
		System.out.println(list); // ��Ȼ˳����
		
		Collections.sort(list, new StringLengthComparator());
		System.out.println(list); // �Ȱ���������Ȼ����ĸ��Ȼ˳������
		
	}
	
	

}
