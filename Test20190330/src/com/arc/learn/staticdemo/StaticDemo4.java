package com.arc.learn.staticdemo;

public class StaticDemo4 {

	public static void main(String[] args) {
		
		/*
		 * 1. 静态代码块
		 * 		1.1. 随着类的加载而运行，而且只运行一次。
		 * 		1.2. 用于给类进行初始化。
		 * 2. 构造代码块
		 * 		2.1. 构造代码块在构造函数前执行，而且一旦创建对象都会执行构造代码块	。
		 * 		2.2. 构造代码块可以给对象进行初始化。
		 * 3. 局部代码块
		 * 		3.1. 局部代码块决定变量的生命周期。
		 */
		new Demo().show();
//		new Demo().show();
		
	}
}

class Demo {
	static int num; 
	// 静态代码块
	static {
		num = 10; // 给静态属性赋值
		num *= 2; // 算数运算
		System.out.println("static block is running");
	}
	// 构造代码块
	{
		System.out.println("non-static block is running");
	}
	void show() {
		System.out.println("show is running");
	}
}