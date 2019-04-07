package com.arc.learn.interfacedemo3;

public class InterfaceDemo3 {
	public static void main(String[] args) {
		Student stu = new Student("Kr", 18);
		stu.play();
		stu.speak();
	}
}



/**
 * 1. �ӿڵ�ϸ�ڣ�
 * 1.1. һ����̳���һ�����ͬʱ������ʵ�ֶ���ӿ�
 * 1.2. �ӿڵĳ��ֱ����˵��̳еľ�����
 * 1.3. �ӿ���ӿ�֮���Ǽ̳й�ϵ�����ҿ��Զ�̳�
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

// �ӿ�֮���̳�
interface Demo extends DemoA, DemoB, DemoC {
	void show();
}

// ʵ�ֽӿ�Demo�ͱ���ʵ�ֽӿ�Demo��DemoA��DemoB��DemoC�е�ȫ�����󷽷�
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