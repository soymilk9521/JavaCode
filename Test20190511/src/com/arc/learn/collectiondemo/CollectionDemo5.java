package com.arc.learn.collectiondemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class CollectionDemo5 {

	public static void main(String[] args) {
		/**
		 * Set�ӿ� ��Ԫ�����򣬲������ظ�
		 * 	|-- HashSet���ڲ����ݽṹ�ǹ�ϣ������ͬ����
		 * 		��ϣ��ȷ��Ԫ���Ƿ���ͬ(��ͼ)
		 * 			1. �ж�����Ԫ�صĹ�ϣֵ�Ƿ���ȣ������ϣֵ��ȣ����ж���������������Ƿ���ͬ��
		 * 			2. �ж�����Ԫ�صĹ�ϣֵ�Ƿ���ȵ��ö����hashCode�������ж���Ԫ�������Ƿ���ͬ���ö����equals����
		 * 			ע�⣺ �����ϣֵ����ȣ��ǲ���Ҫʹ��equals�����жϵ�
		 *     |-- LinkedHashSet����Ԥ֪����˳���set�ӿڵĹ�ϣ�������ʵ��.
		 *     		1. ������Ԫ�ز���ʱ��˳��
		 *  |-- TreeSet:���Զ�set������Ԫ�����򣬲���ͬ���ġ�
		 *  	�ж�Ԫ���Ƿ�Ψһ��ʽ�ǣ����ݱȽϷ�����ֵ������0ʱ��Ԫ����ͬ������ӡ�
		 *  	�ȽϷ���һ�� ��Ԫ�ؾ߱��ȽϹ��ܣ�Ԫ����Ҫʵ��Comparable�ӿڣ�ʵ��compareTo������
		 *  	�ȽϷ������� �ü��Ͼ߱��ȽϹ��ܣ�����һ���Ƚ���ʵ��Compartor�ӿڣ�ʵ��compare������
		 * 
		 */
		
//		testHashSet();
//		testHashSet2();
//		testLinkedHashSet();
//		testLinkedHashSet2();
//		testTreeSet();
//		testTreeSet2();
//		testTreeSet3();
		
		
		
	}
	
	public static void testHashSet() {
		HashSet<String> hs = new HashSet<String>();
		hs.add("abc1");
		hs.add("abc2");
		hs.add("abc3");
		hs.add("abc4");
		hs.add("abc4"); // ��ϣ�㷨�ж�����Ԫ���Ƿ���ͬ��ͨ��hashCode������equals���� 
		
		// �����ַ�������Ԫ�أ���˳���ӡ
		Iterator it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
	public static void testHashSet2() {
		HashSet<Person> set = new HashSet<Person>();
		Person p1 = new Person("Tom", 20);
		System.out.println(p1.hashCode());
		Person p2 = new Person("Tom", 20);
		System.out.println(p2.hashCode());
		set.add(p1);
		set.add(new Person("Lily", 20));
		set.add(new Person("Karl", 20));
		set.add(p2); // ��ϣ�㷨�ж�����Ԫ���Ƿ���ͬ��ͨ��hashCode������equals���� 
		Iterator<Person> it = set.iterator();
		
		// ������������Ԫ�أ���˳���ӡ
		while(it.hasNext()) {
			Person p = (Person)it.next();
			System.out.println(p.getName() + "...." + p.getAge());
		}
		
	}
	
	public static void testLinkedHashSet() {
		HashSet<String> hs = new LinkedHashSet<String>();
		hs.add("abc1");
		hs.add("abc4");
		hs.add("abc3");
		hs.add("abc2");
		hs.add("abc4");
		
		// �����ַ�������Ԫ�أ�����Ԫ�ز���˳���ӡԪ��
		Iterator<String> it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
	public static void testLinkedHashSet2() {
		HashSet<Person> set = new LinkedHashSet<Person>();
		set.add(new Person("Tom", 20));
		set.add(new Person("Lily", 20));
		set.add(new Person("Karl", 20));
		set.add(new Person("Tom", 20)); // ��ϣ�㷨�ж�����Ԫ���Ƿ���ͬ��ͨ��hashCode������equals����  
		Iterator<Person> it = set.iterator();
		
		// ������������Ԫ�أ�����Ԫ�ز���˳���ӡԪ��
		while(it.hasNext()) {
			Person p = (Person)it.next();
			System.out.println(p.getName() + "...." + p.getAge());
		}
	}
	
	public static void testTreeSet() {
		TreeSet<String> ts = new TreeSet<String>(new StringLengthComparator());
		ts.add("aaa");
		ts.add("adadddd");
		ts.add("acasss");
		ts.add("aac");
		// �����ַ�������Ԫ�أ������ַ�����Ȼ˳���ӡԪ��
		Iterator<String> it = ts.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
	
	public static void testTreeSet2() {
		TreeSet<Person> ts = new TreeSet<Person>();
		ts.add(new Person("Tom", 21));
		ts.add(new Person("Karl", 25));
		ts.add(new Person("Lily", 22));
		ts.add(new Person("Green", 22));
		ts.add(new Person("Tom", 24));  // compareTo�����Ƚ������С
		
		// ������������Ԫ�أ������ַ�����Ȼ˳���ӡԪ��
		Iterator<Person> it = ts.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
	public static void testTreeSet3() {
		
		TreeSet<com.arc.learn.classesdemo.Person> ts = new TreeSet<com.arc.learn.classesdemo.Person>(new PersonCompator());//ʹ�ñȽ�����ʽ
		ts.add(new com.arc.learn.classesdemo.Person("Tom", 21));
		ts.add(new com.arc.learn.classesdemo.Person("Karl", 25));
		ts.add(new com.arc.learn.classesdemo.Person("Lily", 22));
		ts.add(new com.arc.learn.classesdemo.Person("Green", 24));
		ts.add(new com.arc.learn.classesdemo.Person("Tom", 24));  // compareTo�����Ƚ������С
		
		// ������������Ԫ�أ������ַ�����Ȼ˳���ӡԪ��
		Iterator<com.arc.learn.classesdemo.Person> it = ts.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}


