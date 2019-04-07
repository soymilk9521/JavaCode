package com.arc.learn.extendsdemo4;

public class ExtendsDemo4 {

	public static void main(String[] args) {
		new Son();
//		new Son(6); // 思考3：运行结果为？
	}

}

/** 
 * 继承关系中构造函数的特点
 * 1. 使用new关键字创建子类对象时，子类构造函数默认调用父类的无参构造函数
 * 2. 如果父类没有无参构造函数，子类构造函数需要使用super关键字显示指定构造函数，
 * 3. 使用this关键字调用子类构造函数时，this关键字所在的构造函数中可以省略super，
 * 		在子类调用的构造函数中使用super关键字显示调用父类构造函数
 * 4. 子类实例化过程细节:
 * 		4.1. 为什么子类在实例化过程中会访问父类构造器：
 * 		     子类继承父类后可以访问父类中的成员，因而父类要调用本类构造函数先完成初始化操作，
 * 		   子类才能访问父类中的成员。
 * 		4.2. super语句必须放在子类构造函数的第一行
 * 		4.3. 子类在构造函数中使用this()语句调用本类构造函数时，this()语句构造函数不再隐式
 * 		   使用super()语句调用父类构造函数，因为this()和super()语句在调用构造函数时都必须放在第一行。
 * 	       但可以保证的是子类中会有其他构造函数访问父类构造函数。
 * 		4.4. Object类为所有Java类的父类
 */
class Father extends Object {
	Father() {
		// 思考1: 父类构造函数为什么被调用了？
		// 思考2: 如果父类中没有无参的构造函数或者无参构造函数被私有化程序如果运行？
		System.out.println("father is running...");
	}
	
	Father(int x) {
		this();
		System.out.println("father is running..." + x);
	}
}

class Son extends Father {
	Son() {
		this(6);  // 当时有this语句调用构造函数时，super()不再使用。
//		super(5); // 调用父类无参的构造函数
		System.out.println("son is running...");
	}
	Son(int x) {
		super(5);
//		super();
		System.out.println("son is running..." + x);
	}
}

class Demo extends Object{
	Demo(){
		super(); // 思考4： demo没有继承，为什么可以使用super()？
		return;
	}
}