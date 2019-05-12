package com.arc.learn.collectiondemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class CollectionDemo3 {

	public static void main(String[] args) {
		/**
		 * Collection接口
		 * 	-List接口：有序（保持元素存入时的顺序），可以重复（元素内容可以重复），元素都有索引
		 * 		常见方法：CURD
		 * 			添加：
		 * 				void add(Object e);
		 * 				void add(int index, Object e);
		 * 				void addAll(Collection c);
		 * 				void addAll(int index, Collection c);
		 * 			删除：
		 * 				remove(int index);
		 * 				remove(Object e);
		 * 			修改：
		 * 				set(int index, Object e);
		 * 			获取：
		 * 				Object get(int index);
		 * 				int indexOf(Object e);
		 * 				int lastIndexOf(Object e);
		 * 				List subList(int from, int to);
		 * 			并发修改错误：java.util.ConcurrentModificationException
		 *  -Set接口 ：元素无序，不可以重复
		 *    
		 *  
		 *  
		 */
		
//		showList();
		
		List l = new ArrayList();
		l.add("abc1");
		l.add("abc2");
		l.add("abc3");
		l.add("abc4");
//		iteratorList(l);
//		forList(l);
//		conCurrentModification(l);
		listIteratordemo(l);
	}

	private static void showList() {
		List<String> l = new ArrayList<String>();
		// add, addAll
		l.add("abc1");
		l.add("abc1");
		l.add("abc3");
		l.add(1, "abc4");
//		System.out.println(l);
//		l.addAll(l);
//		System.out.println(l);
//		l.addAll(1, l);
//		System.out.println(l);

//		// remove 
//		l.remove("abc1"); // 有相同元素的时候，只删除第一个元素，
//		Iterator<String> iterator = l.iterator();
//		ListIterator<String> it = l.listIterator();
//		while(it.hasNext()) {
//			String str = it.next();
//			if ("abc1".equals(str)) {
//				it.remove();   // 调用的是迭代器的删除方法
//				l.remove(str); // 循环过程中不能对数组进行添加，删除和修改
//			}
//		}
		
//		System.out.println(l);
//		l.remove(7);
		System.out.println(l);
//		
//		// set
//		l.set(0, "999");
		System.out.println(l);
//		
//		// indexOf, lastIndexOf
//		int f = l.indexOf("abc1");
//		System.out.println(f);
//		int t = l.lastIndexOf("abc1");
//		System.out.println(t);
		
		System.out.println(l.get(l.size()-1));
//		
//		// subList
		List<String> sub = l.subList(0, 3);
		System.out.println(sub);
		
		Object[] objs = l.toArray();
		
	}
	
	public static void iteratorList(List l) {
		Iterator it = l.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
	public static void forList(List l) {
		for (int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i));
		}
	}
	
	public static void conCurrentModification(List l) {
		// 在迭代过程中不要使用集合的方法操作元素，会产生java.util.ConcurrentModificationException异常
		// 可以使用Iterator接口的子接口ListIterator来完成在迭代过程中对元素的操作。
		Iterator it = l.iterator();
		while (it.hasNext()) {
			Object object = it.next();
			if("abc1".equals(object)) {
				l.add("999"); 
			}else {
				System.out.println(object.toString());
			}
		}
	}
	
	public static void listIteratordemo(List l) {
		// ListIterator运行在集合遍历过程中对元素进行增删改查
		ListIterator lit = l.listIterator(); 
		while (lit.hasNext()) {
			Object object = lit.next();
			if("abc1".equals(object)) {
				lit.add("999"); 
			}else {
				System.out.println(object.toString());
			}
			
		}
		System.out.println(l);
	}
	
	
	

}
