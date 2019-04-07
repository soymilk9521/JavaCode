package com.arc.learn.interfacedemo2;

public class InterfaceDemo2 {

	public static void main(String[] args) {

	}

}

/**
 * Java中不支持多继承，原因是调用的不确定性。
 * 所以Java将多继承机制进行了改良，Java中可以多实现。
 * 
 * 即一个类可以实现多个接口。
 * 思考： 如果两个接口中有同名抽象方法程序如何运行？
 *  首先观察两个接口中的同名函数的参数列表是否相同。
 *  如果是完全一致的两个函数，则按照实现接口的顺序，优先实现排在前面的接口中的抽象方法
 */
class Demo implements DemoA, DemoB {

	@Override
	public void showA() {
		System.out.println("show A is running ...");
		
	}
	
	@Override
	public void showB() {
		System.out.println("show B is running ...");
		
	}

	@Override
	public void add() { // 实现了DemoA中add抽象方法。
		System.out.println("add is running ...");
		
	}
	
}

interface DemoA {
	void showA();
	void add(); // 两个接口有同名抽象方法
}

interface DemoB {
	void showB();
	void add();
}