package com.arc.learn.exceptiondemo;

public class ExceptionDemo3 {

	public static void main(String[] args) {//throws MinusAgeException {
		/**
		 * 1. 自定义异常
		 * 	1.1. 继承Exception类
		 *  1.2. 继承RuntimeException类
		 * 2. 异常分类
		 * 	2.1. 编译时检测异常，Exception类及其子类。
		 *  2.2. 运行时检测异常，RuntimeException类及其子类。
		 * 3. throw和throws区别：
		 * 	3.1. throws使用在函数上；throw使用在函数内部。
		 *  3.2. throws可以抛出多个异常类，用逗号隔开；throw抛出一个异常对象；
		 * 4. 画图理解异常抛出运行过程。
		 */
		
		Person p = new Person(12, "karl");
//		System.out.println(p.getAge());
//		System.out.println(p.getName());
//		p.setAge(-20);
		p.setAge2(-20);
		
	}
}


class Person {
	private int age;
	private String name;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) throws MinusAgeException, Exception {
		if(age < 0) {
//			System.out.println("年龄设置错误...");
			throw new MinusAgeException("年龄设置错误...");
			// 1.抛出异常； 2.抛出带有message异常 
		}
		this.age = age;
	}
	
	public void setAge2(int age) {
		if (age <0) {
			throw new MinusAgeException2("年龄设置错误...");
		}
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * 无参构造函数
	 */
	public Person() {
		super();
	}
	
	/**
	 * 有参数构造函数
	 * @param age 年龄
	 * @param name 名字
	 */
	public Person(int age, String name) {
		super();
		if (age<0) {
//			System.out.println("年龄设置错误。");
			throw new RuntimeException("年龄设置错误。");
//			return;
		}
		this.age = age;
		this.name = name;
	}
}

class MinusAgeException extends Exception {
	public MinusAgeException(String msg) {
		super(msg);
	}
}

class MinusAgeException2 extends RuntimeException {
	public MinusAgeException2(String msg) {
		super(msg);
	}
}
