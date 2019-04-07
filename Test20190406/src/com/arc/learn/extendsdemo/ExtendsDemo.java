package com.arc.learn.extendsdemo;

public class ExtendsDemo {

	public static void main(String[] args) {
		/*
		 * 一、继承概述：
		 * 	1. 多个类中存在相同属性和行为时，将这些内容抽取到单独一个类中，
		 *     那么多个类无需再定义这些属性和行为，只要继那个类即可。
		 *  2. 多个类可以称为子类，单独这个类称为父类或者超类。
		 *  3. 子类可以直接访问父类中的非私有的属性和行为。
		 *  4. 通过 extends 关键字让类与类之间产生继承关系。
		 * 
		 * 二、继承的特点：
		 *  1. 继承的出现提高了代码的复用性。
		 *  2. 继承的出现让类与类之间产生了关系，提供了多态的前提。
		 *  
		 * 三、单继承与多继承：
		 * 	Java支持单继承，不直接支持多继承，对C++中的多继承进行了改良，
		 *  不直接支持多继承，因为多个父类可能有相同成员，会导致调用的不确定性。
		 *  1. 单继承：一个子类只有一个直接父类（Java）
		 *  2. 多继承：一个类可以有多个直接父类（C++ ）
		 *  3. Java支持多层继承（多重继承），比如：A继承B，B继承C
		 * 
		 * 四、什么时候使用继承
		 * 	当两个类存在所属关系的时候，就可以定义继承。
		 *  猫， 老虎 --> 猫科动物
		 *  狗， 狼 --> 犬科动物
		 *  当两个类具有相同属性或行为的时候，就可以向上提取为父类。 
		 *     
		 */
		Student student = new Student();
		student.name = "Kr";
		student.age  = 20;
		student.color = "red";
		student.study();
		student.speak();
		Worker worker = new Worker();
		worker.name = "Jay";
		worker.age = 28;
		worker.work();
		worker.speak();
	}
	

}

/**
 * 
 * 学生
 *
 */
class Student extends Person {
	public void study() {
		System.out.println(name + ":" + age);
	}
}

/**
 * 
 * 工人
 *
 */
class Worker extends Person {
	public void work() {
		System.out.println(name + ":" + age);
	}
}

/**
 * 
 *人类
 *
 */
class Person extends Demo {
	// 名字
	public String name;
	// 年龄
	public int age;
	
	public void speak() {
		System.out.println("Hello World...");
	}
}

class Demo {
	public String color ;
}