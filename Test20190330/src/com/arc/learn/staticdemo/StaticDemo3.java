package com.arc.learn.staticdemo;

public class StaticDemo3 {

	public static void main(String[] args) {
		/*
		 * 1. static内存图解：
		 * 	1.1. 方法区： 一般方法区， 静态区 
		 * 	1.2. 加载类：staticDemo3类和Person类
		 * 	1.3. this问题:静态方法中不能使用this关键字
		 * 2. static关键字应用场景：
		 * 	2.1. 静态变量
		 * 		当分析对象所具有的成员变量的值都是相同的，这时可以使用static关键字修饰成员。
		 * 		只要对象中属性值可以有不同，就是对象的特有数据，必须存储在对象中，不适用static修饰。
		 *  2.2. 静态函数
		 *  	函数是否用static修饰参考一点，就是该函数是否访问对象中的特有数据。
		 */
		Person.method();
		Person p = new Person("Jhon", 20);
		p.show();
	}
	
}

class Person {
	private String name;
	private int age;
	static String country = "CHINA";
	public Person(String name, int age) {
		this.name = name;
		this.age  = age;
	}
	
	void show() {
		System.out.println(Person.country + ":" + this.name + ":" + this.age);
	}
	
	public static void method() {
		System.out.println(Person.country);
	}
	
	
}