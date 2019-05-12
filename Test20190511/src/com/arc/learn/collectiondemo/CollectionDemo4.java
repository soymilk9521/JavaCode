package com.arc.learn.collectiondemo;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class CollectionDemo4 {
	public static void main(String[] args) {
		/**
		 * List
		 * 	|--Vector：内部是数组结构，是同步的
		 * 		添加
		 * 			addElement(Object obj)
		 * 			insertElementAt(Object obj, int index)
		 * 		获取
		 * 			capacity()：获取当前容量
		 * 			elementAt(int index):获取指定索引元素
		 * 			elements()：返回一个枚举类（Enumeration相当于Iterator，推荐使用Iterator）
		 * 			firstElement()
		 * 			lastElement()
		 * 		删除
		 * 			removeAllElements() 
		 * 			 
		 *  |--ArrayList：内部是数组接口，不是同步的，查询速度快。
		 *  |--LinkedList：内部是链表结构，不是同步的，增删元素速度快。
		 *  	添加
		 *  		addFirst()
		 *  		addLast()
		 *      获取
		 *      	getFirst()：获取链表中第一个元素，如果链表没有内容则抛异常
		 *      	peekFirst():获取但不移除链表中第一个元素，如果链表没有内容则返回null
		 *      	pollFirst():获取并移除链表中第一个元素，如果链表没有内容则返回null
		 *      	getLast()：获取链表中最后一个元素，如果链表没有内容则抛异常
		 *      	peekLast()：获取但不移除链表中最后一个元素，如果链表没有内容则返回null
		 *      	pollLast():获取并移除链表中最后一个元素，如果链表没有内容则返回null
		 *      删除
		 *      	removeFirst()
		 *      	removeLast()
		 */
		
		testAddFirst();
//		testVector();
		
	}
	
	public static void testVector() {
		Vector v = new Vector();
		v.addElement("abc1");
		v.addElement("abc2");
		v.addElement("abc3");
		v.addElement("abc4");
		// 旧，Enumeration相当于Iterator，推荐使用Iterator
		Enumeration en =  v.elements();
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
		
		// 新
		Iterator it = v.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	public static void testAddFirst() {
		LinkedList<String> ll = new LinkedList<>();
		// addFirst
		ll.addFirst("abc1");
		ll.addFirst("abc2");
		ll.addFirst("abc3");
		ll.addFirst("abc4");
		System.out.println(ll);
		Iterator<String> it = ll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		// getFirst
//		ll = new LinkedList<>();
		System.out.println(ll.getFirst()); // 获取链表中第一个元素，但不删除,如果链表中没有内容测抛出异常
//		
//		// removeFirst
		System.out.println(ll.removeFirst()); // 获取第一个元素并删除。
		System.out.println(ll);
//		
//		// isEmpty
		while(!ll.isEmpty()) {
			System.out.println(ll.removeFirst());
		}
//		System.out.println(ll);
		
		
	}
	
	
}
