package com.arc.learn.collectiondemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo2 {

	public static void main(String[] args) {
		/**
		 * Iterator����������
		 * 
		 */
		Collection<String> c = new ArrayList<>();
		c.add("abc1");
		c.add("abc2");
		c.add("abc3");
		c.add("abc4");
		System.out.println(c);
		
		Iterator<String> it = c.iterator();
//		System.out.println(it.hasNext());
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next()); // java.util.NoSuchElementException
		// whileѭ��
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		// forѭ��
		for(int i=0; i<c.size(); i++) {
			System.out.println(it.next());
		}
		
		for(;it.hasNext();) {
			System.out.println(it.next());
		}
		
		for(String string : c) {
			System.out.println(string);
		}
	}

}
