package com.arc.learn.collectiondemo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class TestArrayList {

	public static void main(String[] args) {
		ArrayList persons = new ArrayList<>();
		persons.add(new Person("Tom", 20));
		persons.add(new Person("Carry", 21));
		persons.add(new Person("Green", 25));
		persons.add(new Person("Lily", 18));
		
		// sort
		persons.sort(new Comparator<Person>() {
			@Override
			public int compare(Person p1, Person p2) {
				return p1.getAge() - p2.getAge();
			}
		});
		
		// iterator
		Iterator it = persons.iterator();
		while(it.hasNext()) {
//			System.out.println(((Person)it.next()).getName() + ":" + ((Person)it.next()).getAge());
			Person p = (Person)it.next();
			System.out.println(p.getName() + ":" + p.getAge());
		}
	}

}
