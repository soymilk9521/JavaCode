package com.arc.learn.objectdemo;


import com.arc.learn.exceptiondemo.MinusNumberException;

public class ObjectDemo {

	public static void main(String[] args) {
		/**
		 * 1. Object类为所有类的父类。
		 *   1.1. 所以任何类都可以调用Object类中公共方法。
		 * 2. Object类-equals()方法：
		 *   2.1. 覆盖父类equals方法
		 * 3. Object类-hashCode()方法
		 *   3.1. 对象哈希值演示 System.out.println(p1);
		 * 4. Object类-getClass()方法
		 * 	 4.1. Java字节码（即class文件）中都包含name，field，constructor，method
		 * 		  Java用Class类来描述字节码文件。
		 * 5. Object类-toString()方法 
		 *    toString():className@hashCode
		 * 6. 包
		 *    6.1. 导包
		 *    6.2. protected关键字 
		 */
		
		Person p1 = new Person(20);
		Person p2 = new Person(21);
//		Demo demo = new Demo();
//		System.out.println(p1);
//		System.out.println(p1.hashCode());
//		System.out.println(Integer.toHexString(p1.hashCode()));

		System.out.println(p1 == p2); // == 比较内存地址
		System.out.println(p1.equals(p2));// equals方法比较内容
		
		
		
		
		Class class1 = p1.getClass();
		Class class2 = p2.getClass(); 
		
//		System.out.println(class1.getName());
//		System.out.println(class1.getSimpleName());
//		Method[] m = class1.getMethods();
//		for(int i=0; i<m.length; i++) {
//			System.out.println(m[i].getName());
//		}
		
		System.out.println(class1 == class2);
		
		System.out.println(p1);
		System.out.println(p1.getClass().getName() + "!" + Integer.toHexString(p1.hashCode()));
		
		
	}

}

class Person extends Object {
	private int age;
	public Person(int age) {
		this.age = age;
	}
//	public boolean compare(Person person) {
//		if (person == null) {
//			throw new NullPointerException("查无此人。");
//		}
//		return this.age == person.age;
//	}
//	
	@Override
	public boolean equals(Object object) { // Object object = new Person();
		if (!(object instanceof Person)) {
			return false;
		}
		Person p = (Person)object;
		return this.age == p.age;
	}
	
	public String toString() {
		return "[age=" + this.age + "]";
	}
	
	@Override
	public int hashCode() {
		return Integer.valueOf(Integer.toHexString(this.age));
	}
	
	public void show() throws MinusNumberException {
		
	}
	
	
}

