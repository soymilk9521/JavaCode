package com.arc.learn.collectiondemo;

public class Person implements Comparable<Person> {
	private String name;
	private int age;
	
	public Person() {
		super();
	}
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	 
//	@Override
//	public int hashCode() {
////		System.out.println("hashCode is running ...");
//		System.out.println( this.name + ":"+ this.name.hashCode());
//		return this.name.hashCode() + this.age;
//	}
	
	@Override
	public boolean equals(Object obj) {
		Person p = (Person)obj;
		System.out.println("eqauls is running ...");
		return this.name.equals(p.getName()) && this.age == p.getAge();
	}

	@Override
	public int compareTo(Person p) {
		// 按照年龄从小到大排序，如果年龄相同，再按照名字字母排序
//		int temp = this.age - p.getAge();
//		return temp == 0 ? this.name.compareTo(p.getName()): temp; 
//		 按照名字字母排序，如果名字相同再按照年龄从小到大排序
		int temp = this.name.compareTo(p.getName());
		return temp == 0 ? this.age - p.getAge() : temp; 
//		return this.age - p.getAge(); // 按照年龄从小到大排序
	}
	
	
	
	
	
}
