package com.arc.learn.polydemo2;

public class PolyDemo2 {

	public static void main(String[] args) {
		/**
		 * 1. instanceof: 
		 * 		�����ж϶���ľ������ͣ�ֻ�������������������жϡ�
		 * 		 ͨ����������ת��ǰ����ߴ���Ľ�׳�ԡ�
		 * 
		 */
//		keepDog(new Husky());
		keepDog(new Akita());
//		keepDog(new SharpPei());
	}

	
	public static void keepDog(Dog dog) {
		// instanceofʹ����ʾ 	
//		dog.bark();
		if(dog instanceof Husky) {
			Husky husky = (Husky)dog;
			husky.sayHello();
		}
		
	}
}


abstract class Dog {
	abstract void bark();
}

class Husky extends Dog {

	@Override
	void bark() {
		System.out.println("��ʿ�� ����������");
	}
	
	void sayHello() {
		System.out.println("���ǹ�ʿ�档��");
	}
	
}

class Akita extends Dog {

	@Override
	void bark() {
		System.out.println("����Ȯ ����������");
	}
	
	void sayHai() {
		System.out.println("��������Ȯ����");
	}
	
}

class SharpPei extends Dog {

	@Override
	void bark() {
		System.out.println("ɳƤ�� ����������");
	}
	
	void sayHi() {
		System.out.println("����ɳƤ������");
	}
	
}