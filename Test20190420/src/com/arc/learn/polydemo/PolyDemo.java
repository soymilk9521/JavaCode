package com.arc.learn.polydemo;

public class PolyDemo {

	public static void main(String[] args) {
		/**
		 * 1. ��̬�Ķ��壺һ��������ж�����̬��Java�б���Ϊ��������ָ���������
		 * 2. ��̬�ĺô�������˴������չ�ԡ�
		 * 3. ��̬�ľ����ԣ����������ʹ�����������з����� 
		 * 4. ��̬��ǰ�᣺
		 * 		4.1. ������֮������Ǽ̳л���ʵ�ֹ�ϵ
		 *  	4.2. ���Ǹ��෽������ʵ�ֽӿڷ���
		 * 5. ����ת�ͣ�����ת�ͣ��Լ�����ת���쳣�� 
		 * 		����ת�������������з�����
		 */
		
		// ͨ��ʹ�÷�ʽ��new�ؼ��ִ���Cat�����
		Cat cat = new Cat();
//		cat.eat();
//		cat.catchMouse();
		/*
		 * è�����������è����̬���־��ж������̬������Ƕ���Ķ�̬��
		 * ��˵������һ�������Ӧ�Ų�ͬ�����͡�
		 * ���������֣�������߽ӿڵ�����ָ�������ʵ������� 
		 */ 
		// ��̬ʹ�÷�ʽ����������ָ���������
		Animal an = new Cat(); // �Զ�����������è��������Ϊ���ද����󣬵����������ʹ��è���������з�����	
//		System.out.println(an.num);
//		an.method();
		
		// ��̬ʹ����ʾ
		method(new Cat());
//		method(new Dog());
//		method(new Pig());
		
		// ��̬�׶���ʾ�������Է���cat���������з���
//		an.catchMouse();
		
		// ����ת����ʾ�����Է���cat���������з���
//		Cat cat2 = (Cat) an;
//		cat2.catchMouse();
//		System.out.println(cat2.num);
		
		// ת�͹����е��쳣��ʾ
//		Father father = new Father();
//		Son son = (Son)father;
	}
	
//	/**
//	 * è����
//	 * @param cat
//	 */
//	public static void method(Cat cat) {
//		cat.eat();
//	}
//	
//	/**
//	 * ���й�ͷ
//	 * @param dog
//	 */
//	public static void method(Dog dog) {
//		dog.eat();
//	}
	
	// ��������Է�������
	public static void method(Animal animal) {
//		animal.eat();
		if (animal instanceof Cat) {
			Cat cat = (Cat) animal;
			cat.catchMouse();
			animal.method();
		}else if (animal instanceof Dog) {
			Dog dog = (Dog)animal;
			dog.watchHouse();
		}else if (animal instanceof Pig) {
			Pig pig = (Pig)animal;
			pig.sleep();
		}
		animal.method();
	}
}


abstract class Animal {
	int num = 10;
	abstract void eat();
	void method() {
		System.out.println("Animal method is running ...");
	}
}

class Cat extends Animal {
	int num = 12;
	@Override
	void eat() {
		System.out.println("è���� ...");
	}
	
	void catchMouse() {
		System.out.println("è׽���� ...");
	}
	
	void method() {
//		super.method();
		System.out.println("cat method is running ...");
	}
	
}

class Dog  extends Animal {

	@Override
	void eat() {
		System.out.println("���й�ͷ ...");
	}
	
	void watchHouse() {
		System.out.println("������ ...");
	}
	
}

class Pig extends Animal {

	@Override
	void eat() {
		System.out.println("��Կ�");
	}
	void sleep() {
		System.out.println("pig is sleeping ...");
	}
}


class Father {

}

class Son extends Father {
	
}