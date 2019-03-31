package com.arc.learn.constructor;

public class ConstDemo {

	public static void main(String[] args) {
		/*
		 * 构造函数
		 *   1. 特点：
		 *     1.1. 函数名称和类名一致
		 *     1.2. 不定义返回值类型
		 *     1.3. 没有具体的返回值
		 *   2. 作用：
		 *     2.1 给对象初始化
		 *   3. 细节：
		 *     3.1  默认构造函数
		 *     3.2 构造函数可以重载
		 *   4. 解释：
		 *     4.1 构建创造对象时，调用的函数，  
		 *   5. 默认构造函数：
		 *     5.1 通过new创建对象时，必须调用构造函数。
		 *     5.2 如果没有，系统会自动为该类创建一个无参的构造函数。
		 *   6. 构造函数和一般函数的区别：
		 *     6.1 构造函数：创建对象时调用，一个构造函数只调用一次。
		 *     6.2 一般函数：创建对象后调用，需要使用时才调用，可以重复使用。
		 *   7. 什么时候使用构造函数？
		 *     7.1 创建对象时给对象特有属性赋值。
		 *   8. 有参数的构造函数
		 *     8.1 Person p = new Person(name);
		 *   9. 构造函数重载
		 *     9.1 Person p = new Person(name, age);
		 *     9.2 Person p2 = new Person(age, name); 回顾重载
		 *   10. 构造函数内存体现图解
		 *   11. 构造函数细节： 
		 *   	11.1. 变量赋值时，构造函数与一般函数可以同时存在。
		 *      11.2. 构造函数可以调用一般函数，一般函数不可以直接调用构造函数
		 *      11.3. 构造函数前是否可以加void？ -- 不可以
		 *      11.4. 构造函数有没有return关键字？ -- 可以
		 */
		Person p = new Person();
		p.speak();
		// 6.1 调用构造函数
		Person p2 = new Person("JAY");
		p2.speak();
		Person p3 = new Person("Kr", 20);
		// 6.2 重复调用一般函数
		p3.speak();
		p3.speak();
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
	
	// 1.1. 定义一个无参构造函数
	public Person() {
		// 1.1. 输出一条语句
		System.out.println("person is running");
		speak(); // 构造函数可以调用一般函数
		return;  // 构造函数可以使用return关键字
	}
	
	// 8.1. 定义一个构造函数包含一个参数
	// 8.1. 使用有参构造函数给属性赋值
	public Person(String n) {
		name = n;
	}
	
	// 9.1. 定义一个构造函数包含两个参数
	// 10. 构造函数内存体现
	public Person(String n, int a) {
		name=n;
		age=a;
	}
	
	public Person(int a, String n) {
		name=n;
		age=a;
	}
	
	// 11.1. 定义setName（name）函数
	public void setName(String n) {
		// 7.1. 一般函数给属性赋值。
		name = n;
	}
	
	void speak() {
//		Person(); // 一般函数不能直接调用构造函数
		System.out.println(name + ":" + age);
	}
	
	public void getAge() {
//		return ; // return关键字解释函数
	}
}