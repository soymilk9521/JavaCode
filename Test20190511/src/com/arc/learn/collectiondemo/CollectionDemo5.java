package com.arc.learn.collectiondemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class CollectionDemo5 {

	public static void main(String[] args) {
		/**
		 * Set接口 ：元素无序，不可以重复
		 * 	|-- HashSet：内部数据结构是哈希表，不是同步的
		 * 		哈希表确定元素是否相同(画图)
		 * 			1. 判断两个元素的哈希值是否相等，如果哈希值相等，再判断两个对象的内容是否相同。
		 * 			2. 判断两个元素的哈希值是否相等调用对象的hashCode方法，判断两元素内容是否相同调用对象的equals方法
		 * 			注意： 如果哈希值不相等，是不需要使用equals方法判断的
		 *     |-- LinkedHashSet具有预知迭代顺序的set接口的哈希表和链表实现.
		 *     		1. 保存了元素插入时的顺序
		 *  |-- TreeSet:可以对set集合中元素排序，不是同步的。
		 *  	判断元素是否唯一方式是：根据比较方法返值，返回0时两元素相同，不添加。
		 *  	比较方法一： 让元素具备比较功能，元素需要实现Comparable接口，实现compareTo方法，
		 *  	比较方法二： 让集合具备比较功能，定义一个比较器实现Compartor接口，实现compare方法，
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
		hs.add("abc4"); // 哈希算法判断两个元素是否相同，通过hashCode方法，equals方法 
		
		// 迭代字符串类型元素，无顺序打印
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
		set.add(p2); // 哈希算法判断两个元素是否相同，通过hashCode方法，equals方法 
		Iterator<Person> it = set.iterator();
		
		// 迭代字类类型元素，无顺序打印
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
		
		// 迭代字符串类型元素，按照元素插入顺序打印元素
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
		set.add(new Person("Tom", 20)); // 哈希算法判断两个元素是否相同，通过hashCode方法，equals方法  
		Iterator<Person> it = set.iterator();
		
		// 迭代字类类型元素，按照元素插入顺序打印元素
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
		// 迭代字符串类型元素，按照字符串自然顺序打印元素
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
		ts.add(new Person("Tom", 24));  // compareTo方法比较年龄大小
		
		// 迭代字类类型元素，按照字符串自然顺序打印元素
		Iterator<Person> it = ts.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
	public static void testTreeSet3() {
		
		TreeSet<com.arc.learn.classesdemo.Person> ts = new TreeSet<com.arc.learn.classesdemo.Person>(new PersonCompator());//使用比较器方式
		ts.add(new com.arc.learn.classesdemo.Person("Tom", 21));
		ts.add(new com.arc.learn.classesdemo.Person("Karl", 25));
		ts.add(new com.arc.learn.classesdemo.Person("Lily", 22));
		ts.add(new com.arc.learn.classesdemo.Person("Green", 24));
		ts.add(new com.arc.learn.classesdemo.Person("Tom", 24));  // compareTo方法比较年龄大小
		
		// 迭代字类类型元素，按照字符串自然顺序打印元素
		Iterator<com.arc.learn.classesdemo.Person> it = ts.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}


