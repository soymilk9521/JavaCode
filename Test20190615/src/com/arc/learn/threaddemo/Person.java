package com.arc.learn.threaddemo;

public class Person {
	private String name;

	public Person(String name) {
		this.name = name;
	}

	public void show() {
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() +" " +name + "...i=" + i);
		}
	}
}
