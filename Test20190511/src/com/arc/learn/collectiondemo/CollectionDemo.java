package com.arc.learn.collectiondemo;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {

	public static void main(String[] args) {
		/**
		 * 容器：
		 * 	1. 数组：存储相同元素的一组数据的集合
		 *  2. StringBuilder、StringBuffer：可以存任意类型元素，最终转为字符串类型。
		 *  3. 对象：将属性和行为封装起来。
		 *  
		 * 集合特点：
		 *  1. 集合用于存储对象的容器
		 *  2. 集合的长度是可变的
		 *  3. 集合不能存储基本数据类型
		 *  
		 * Collection接口常见方法
		 * 	1. 添加 
		 * 		boolean add(Object object);
		 * 		boolean addAll(Collection c);
		 *  2. 删除
		 *      boolean remove(Object object);
		 *      boolean removeAll(Collection c);
		 *      void clear();
		 *  3. 判断
		 *  	boolean contains(Object object);
		 *  	boolean containAll(Collection c);
		 *  	boolean isEmpty();
		 *  4. 获取
		 *  	int size();
		 *  	Iterator iterator()：迭代器
		 *  5. 其他
		 *  	boolean retainAll(collection c):取交集
		 *  	Object[] toArray();
		 *  
		 * 
		 */
		Collection<String> c = new ArrayList<>();
		Collection<String> c2 = new ArrayList<>();
//		show(c);
		show(c,c2);
		
	}
	
	public static void show(Collection<String> c) {
		c.add("abc");
		c.add("def");
		c.add("ghi");
		Collection<String> sub = new ArrayList<>();
		sub.add("123");
		sub.add("345");
		sub.add("456");
		c.addAll(sub);
		System.out.println(c); // AbstractCollection#toString()
		
		// contains
		System.out.println(c.contains("abc"));
		
		// remove
		c.remove("abc");
		System.out.println(c);
		
		System.out.println(c.contains("abc"));
		
		c.removeAll(sub);
		System.out.println(c);
		
		System.out.println(c.isEmpty());
		
		System.out.println(c.size());
		
//		
//		// clear
//		c.clear();
//		System.out.println(c);
	}
	
	public static void show(Collection c1 , Collection c2) {
		c1.add("abc1");
		c1.add("abc2");
		c1.add("abc3");
		c1.add("abc4");
		
		c2.add("abc1");
		c2.add("abc2");
		c2.add("bcd3");
		c2.add("bcd4");
//		System.out.println(c1);
		
		// addAll
//		c1.addAll(c2);
//		System.out.println(c1);
		
		// containsAll
		boolean flg = c1.containsAll(c2);
		System.out.println(flg);
		
		// retainAll
		c1.retainAll(c2);
		System.out.println(c1);
		
		// removeAll
		c1.removeAll(c2);
		System.out.println(c1);
		
		
	}

}
