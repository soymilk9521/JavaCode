package com.arc.learn.polydemo;

public class PolyDemo {

	public static void main(String[] args) {
		/**
		 * 1. 多态的定义：一类事物具有多种形态。Java中表现为父类引用指向子类对象
		 * 2. 多态的好处：提高了代码的扩展性。
		 * 3. 多态的局限性：父类对象不能使用子类中特有方法。 
		 * 4. 多态的前提：
		 * 		4.1. 类与类之间必须是继承或者实现关系
		 *  	4.2. 覆盖父类方法或者实现接口方法
		 * 5. 向上转型，向下转型，以及类型转换异常。 
		 * 		向上转型隐藏子类特有方法。
		 */
		
		// 通常使用方式：new关键字创建Cat类对象
		Cat cat = new Cat();
//		cat.eat();
//		cat.catchMouse();
		/*
		 * 猫这类事物既有猫的形态，又具有动物的形态，这就是对象的多态。
		 * 简单说，就是一个对象对应着不同的类型。
		 * 代码中体现：父类或者接口的引用指向子类或实现类对象。 
		 */ 
		// 多态使用方式：父类引用指向子类对象。
		Animal an = new Cat(); // 自动类型提升，猫对象提升为父类动物对象，但动物对象不能使用猫对象中特有方法。	
//		System.out.println(an.num);
//		an.method();
		
		// 多态使用演示
		method(new Cat());
//		method(new Dog());
//		method(new Pig());
		
		// 多态弊端演示，不可以访问cat对象中特有方法
//		an.catchMouse();
		
		// 向下转型演示，可以访问cat对象中特有方法
//		Cat cat2 = (Cat) an;
//		cat2.catchMouse();
//		System.out.println(cat2.num);
		
		// 转型过程中的异常演示
//		Father father = new Father();
//		Son son = (Son)father;
	}
	
//	/**
//	 * 猫吃鱼
//	 * @param cat
//	 */
//	public static void method(Cat cat) {
//		cat.eat();
//	}
//	
//	/**
//	 * 狗啃骨头
//	 * @param dog
//	 */
//	public static void method(Dog dog) {
//		dog.eat();
//	}
	
	// 其他动物吃饭。。。
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
		System.out.println("猫吃鱼 ...");
	}
	
	void catchMouse() {
		System.out.println("猫捉老鼠 ...");
	}
	
	void method() {
//		super.method();
		System.out.println("cat method is running ...");
	}
	
}

class Dog  extends Animal {

	@Override
	void eat() {
		System.out.println("狗啃骨头 ...");
	}
	
	void watchHouse() {
		System.out.println("狗看家 ...");
	}
	
}

class Pig extends Animal {

	@Override
	void eat() {
		System.out.println("猪吃糠");
	}
	void sleep() {
		System.out.println("pig is sleeping ...");
	}
}


class Father {

}

class Son extends Father {
	
}