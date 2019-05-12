package com.arc.learn.collectiondemo;

import java.util.Comparator;

public class PersonCompator implements Comparator<com.arc.learn.classesdemo.Person> {
	@Override
	public int compare(com.arc.learn.classesdemo.Person p1, com.arc.learn.classesdemo.Person p2) {
		int temp = p1.getName().compareTo(p2.getName());
		return temp == 0 ? p1.getAge() - p2.getAge(): temp;
//		return 1;
	}
	
}
