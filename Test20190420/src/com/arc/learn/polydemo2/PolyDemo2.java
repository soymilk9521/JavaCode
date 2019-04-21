package com.arc.learn.polydemo2;

public class PolyDemo2 {

	public static void main(String[] args) {
		/**
		 * 1. instanceof: 
		 * 		用于判断对象的具体类型，只能用于引用数据类型判断。
		 * 		 通常用于向下转型前，提高代码的健壮性。
		 * 
		 */
//		keepDog(new Husky());
		keepDog(new Akita());
//		keepDog(new SharpPei());
	}

	
	public static void keepDog(Dog dog) {
		// instanceof使用演示 	
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
		System.out.println("哈士奇 汪汪汪。。");
	}
	
	void sayHello() {
		System.out.println("我是哈士奇。。");
	}
	
}

class Akita extends Dog {

	@Override
	void bark() {
		System.out.println("秋田犬 汪汪汪。。");
	}
	
	void sayHai() {
		System.out.println("我是秋田犬。。");
	}
	
}

class SharpPei extends Dog {

	@Override
	void bark() {
		System.out.println("沙皮狗 汪汪汪。。");
	}
	
	void sayHi() {
		System.out.println("我是沙皮狗。。");
	}
	
}