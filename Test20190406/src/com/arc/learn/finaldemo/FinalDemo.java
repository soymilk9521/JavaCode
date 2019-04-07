package com.arc.learn.finaldemo;

public class FinalDemo {

	/**
	 * Final关键字
	 * 1. 修饰类：被final修饰的类不能被继承
	 * 2. 修饰函数：被final修饰的函数不能被覆盖
	 * 3. 修饰变量：被final修饰的变量为常量，只能赋值一次
	 * 		写法规范：常量所有字母都是大写，多个单词中间用下划线链接 
	 *      如： final int MY_PI = 3.14
	 */
	public static void main(String[] args) {

	}

}


class Father {
	
	void show() {
		System.out.println("Father is showing ...");
	}
}


class Son extends Father {
	
	final int NUM = 8; // final修饰成员变量必须显示初始化。
//	final int age;
	void show() {
		final int age; // final修饰局部变量可以先声明，后初始化。
		age = 18;
		System.out.println("Son is showing ...");
	}
}