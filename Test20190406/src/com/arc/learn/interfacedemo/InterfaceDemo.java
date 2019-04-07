package com.arc.learn.interfacedemo;

public class InterfaceDemo {

	public static void main(String[] args) {
		Demo3Impl d3 = new Demo3Impl();
		System.out.println(d3.COLOR_BLUE);
//		d3.COLOR_BLUE = "yellow";
		System.out.println(Demo3Impl.COLOR_RED);
		d3.show();
		d3.add();
		
	}

}


/**
 * 1. 接口定义：
 *  1.1. 当一个类中都是抽象方法时，可以换一种定义和表示，即使用接口interface
 *	1.2. 定义接口的关键字不是class而是interface
 *
 * 2. 接口中成员：
 * 	2.1. 全局常量：修饰成分固定，默认使用public static final ，并且可以省略。
 *  2.2. 抽象方法：修饰成分固定，默认使用public abstract，并且可以省略。
 *  2.3. 结论：接口中的成员都是公共权限。
 */
abstract class Demo1 { // 抽象类的表示方式
	abstract void show();
	abstract void add();
}

abstract interface Demo2 { // 接口的表示方式
	void show();
	void add();
}

interface Demo3 {
	// 全局常量
	public static final String COLOR_RED  = "red";
	String COLOR_BLUE = "blue";
	
	// 抽象方法
	public abstract void show();
	void add();
}

/**
 * 
 * 3. 类与类之间是继承关系，类与接口之间是实现关系
 * 		3.1. 接口不能实例化 
 * 		3.2. 实现了接口就必须实现接口的全部抽象方法
 */
class Demo3Impl implements Demo3 {

	@Override
	public void show() {
		System.out.println("Demo3Impl is showing ...");
		
	}

	@Override
	public void add() {
		System.out.println("Demo3Impl is adding ...");
	}
	
}