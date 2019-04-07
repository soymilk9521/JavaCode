package com.arc.learn.abstractdemo2;

public class AbstractDemo {

	public static void main(String[] args) {
//		Demo demo = new Demo(); // 抽象类不能实例化
	}

}

/**
 *  1. 抽象类细节：
 *  1.1. 抽象类有没有构造函数？ --可以
 *  1.2. 抽象类可以有非抽象方法吗？ --可以
 *  1.3. abstract关键字不可以与哪些关键字一起使用？ -- final，private，static
 *  1.4. 抽象类与一般类的区别：
 *  	1.4.1. 相同点：抽象类与一般类都是描述一类事物，都有属性和行为
 *  	1.4.2. 不同点：
 *  		一般类有足够的信息描述一类事物，抽象类描述信息不足
 *  		一般类中不能定义抽象方法，抽象类中可以有非抽象方法
 *  		一般类可以实例化，抽象方法不能实例化
 *  1.5. 抽象类一定是父类吗？ -- 是的
 */
abstract class Demo {
	Demo() { //1.1 构造函数
		
	}
	
	abstract void show(); // 抽象方法
	
	int add(int a, int b) { // 1.2. 非抽象方法
		return a + b;
	}
	
	
}