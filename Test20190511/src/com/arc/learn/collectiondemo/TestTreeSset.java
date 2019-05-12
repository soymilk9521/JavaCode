package com.arc.learn.collectiondemo;

import java.util.Iterator;
import java.util.TreeSet;

public class TestTreeSset {

	public static void main(String[] args) {
		/**
		 * °´ÕÕ×Ö·û´®³¤¶ÈÅÅÐò
		 */
		TreeSet<String> ts = new TreeSet<>(new StringLengthComparator());
		ts.add("aaaaaaaaaaaa");
		ts.add("fffff");
		ts.add("ggg");
		ts.add("aaa");
		ts.add("e");
		
		
		Iterator<String> it = ts.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}

