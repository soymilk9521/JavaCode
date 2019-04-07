package com.arc.learn.interfacedemo5;

/**
 * 1. 接口和抽象类的区别
 *  1.1. 相同点：接口和抽象类都不能实例化。
 *  1.2. 不同点：
 * 		1.2.1. 抽象类需要被继承，而且只能单继承。接口需要被实现，可以多实现。
 * 		1.2.2. 抽象类可以定义抽象方法和非抽象方法。接口只能定义抽象方法。
 * 	
 */
public class InterfaceDemo5 {
	public static void main(String[] args) {
		
	}
	
}


/**
 * 猫科动物（felid） 
 *
 */
abstract class Felid {
	String name;
	abstract void climb();
}

/**
 * 本领接口（skills）
 *
 */
interface Skills {
	abstract void catches(); // 捉老鼠
}

/**
 * 
 * 定义一个猫类
 * 继承猫科动物类。
 * 实现了本领接口。
 */
class Cat extends Felid implements Skills{

	@Override
	void climb() {
		System.out.println("cat is running ..."); // 覆盖父类抽象方法。
	}

	@Override
	public void catches() {
		System.out.println("cat is catching ..."); // 通过实行Skills接口获得
	}
}

/**
 * 
 * 定义一个老虎类
 * 继承猫科动物类。
 */
class Tiger extends Felid {

	@Override
	void climb() {
		System.out.println("tiger is runing ...");// 覆盖父类抽象方法。
	}
}

/**
 * 
 * 定义一个狗类
 * 实现了本领接口。
 */
class Dog implements Skills {

	@Override
	public void catches() {
		System.out.println("dog is catching ..."); // 通过实行Skills接口获得
	}
	
}