package com.arc.learn.thisdemo;

public class ThisDemo {

	public static void main(String[] args) {
		/*
		 * this关键字
		 *  1. 特点：
		 *   1.1. this代表所在函数所属对象的引用。
		 *   1.2. 换言之，this代表本类对象引用。
		 *   1.3. 简单说，哪个对象调用this所在的函数，this就代表哪个对象引用。
		 *  2. this关键字内存图解：
		 *  3. 构造函数调用构造函数
		 *  	3.1. this.Person(); （X） 
		 *  		错误原因：构造函数是创建对象时给对象初始化使用，this代表当前对象。
		 *                  构造函数先于this关键字产生运行消失。
		 *  	3.2. 注意：构造函数中调用构造函数时，必须放在第一行。原因构造函数初始化要先执行。
		 *  	          正确写法：this(name);
		 *      3.3. 图解构造函数调用构造函数
		 *  4. this调用本类函数。   
		 *  5. 比较两个人年龄是否相等
		 *   
		 */
		Person p = new Person("Eason");
		p.speak();
		Person p2 = new Person("Karen");
		p2.speak();
		Person p3 = new Person();
		p3.speak();
	}
}
/**
 * 属性：
 *  名称
 *  年龄
 * 行为：
 *  说话
 * @author kr
 *
 */
class Person {
	String name;
	int age;

	public Person() {
	}

	// 1.1. 同名引出this关键字
	// 
	public Person(String name) { // 有参数构造函数
		this.name = name;
	}
	void speak() {
		// 4. this调用本类中的函数
		this.openMouse();
		System.out.println(this.name + ":" + this.age);
	}
	
	void openMouse() {
		System.out.print("啊~ 我是：");
	}
	
	// 5. 比较两个人年龄是否相等
	boolean compare(Person person) {
		// TODO 年龄比较
		return false;
	}
}