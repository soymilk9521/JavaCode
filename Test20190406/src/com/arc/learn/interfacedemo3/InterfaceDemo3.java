package com.arc.learn.interfacedemo3;

public class InterfaceDemo3 {
	public static void main(String[] args) {
		Student stu = new Student("Kr", 18);
		stu.play();
		stu.speak();
	}
}



/**
 * 1. 接口的细节：
 * 1.1. 一个类继承另一个类的同时还可以实现多个接口
 * 1.2. 接口的出现避免了但继承的局限性
 * 1.3. 接口与接口之间是继承关系，而且可以多继承
 *
 */
interface Action {
	void play();
}
class Person {
	String name;
	int age;
	void speak() {
		System.out.println(name + "...." + age + " ....");
	}
}

class Student extends Person implements Action {
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public void play() {
		System.out.println(name + " is play ....");
		
	}
}

// 接口之间多继承
interface Demo extends DemoA, DemoB, DemoC {
	void show();
}

// 实现接口Demo就必须实现接口Demo，DemoA，DemoB，DemoC中的全部抽象方法
class DemoImpl implements Demo {

	@Override
	public void showA() {
		System.out.println("showA is running...");
	}

	@Override
	public void showB() {
		System.out.println("showB is running...");
	}

	@Override
	public void showC() {
		System.out.println("showC is running...");
	}

	@Override
	public void show() {
		System.out.println("show is running...");
		
	}
	
}


interface DemoA {
	void showA();
}

interface DemoB {
	void showB();
}

interface DemoC {
	void showC();
}