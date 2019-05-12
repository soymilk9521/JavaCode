package com.arc.learn.collectiondemo;

import java.util.LinkedList;

public class TestLinkedList {

	public static void main(String[] args) {
		/**
		 * 使用LinkedList模拟一个堆栈或队列数据结构。
		 * 
		 * 堆栈：先进后出。
		 * 队列：先进先出。
		 * 
		 */
		LinkedList ll = new LinkedList();
//		firstInFirstOut(ll);
		firstInLastOut(ll);
	}

	public static void firstInFirstOut(LinkedList ll) {
		ll.addLast("abc1");
		ll.addLast("abc2");
		ll.addLast("abc3");
		ll.addLast("abc4");
		System.out.println(ll);
		while(!ll.isEmpty()) {
			System.out.println(ll.removeFirst());
		}
	}
	
	public static void firstInLastOut(LinkedList ll) {
		ll.addFirst("abc1");
		ll.addFirst("abc2");
		ll.addFirst("abc3");
		ll.addFirst("abc4");
		System.out.println(ll);
		while(!ll.isEmpty()) {
			System.out.println(ll.removeFirst());
		}
	}
}
