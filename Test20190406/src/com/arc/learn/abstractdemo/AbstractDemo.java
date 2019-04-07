package com.arc.learn.abstractdemo;

public class AbstractDemo {

	public static void main(String[] args) {
//		printDemo(new Cat());
//		printDemo(new Tiger());
	}
	
	
//	public static void printDemo(Cat a) {
//		a.climb();
//	}
//	
//	public static void printDemo(Tiger b) {
//		b.climb();
//	}
	
	

}



/**
 * 
 * 1. 抽象类概述：
 * 1.1. 如果一个类中没有包含足够的信息来描绘一个具体的对象，这样的类就是抽象类。用abstract关键字修饰。
 * 1.2. 举列：猫科动物
 *  属性：
 * 	  名字： name
 *   年龄： age
 *  行为：
 * 	  爬树： climb
 * 猫，老虎都是猫科动物，都会爬树
 * 
 * 2. 抽象类特点：
 * 	2.1. 抽象类中函数（方法）只有声明没有实现时，该函数为抽象方法，需要被abstract修饰
 * 	2.2. 抽象方法必须放在抽象类中，该类必须用abstract修饰
 *  2.3. 抽象类不可以被实例化，即不能使用new关键字创建对象。
 *  2.4. 继承抽象类的子类，必须覆盖（重写）抽象类的全部方法。 	 
 *
 */
class Felid {
	// TODO
}

class Cat {
	// TODO
}


class Tiger {
	// TODO
}




