package com.arc.learn.extendsdemo3;

public class ExtendsDemo3 {
	public static void main(String[] args) {
//		Son son = new Son();
//		son.show();
//		son.show();
		
		NewPhone p = new NewPhone();
		p.show();
	}
}

/**
 * 继承关系中成员函数的特点
 * 1. 继承关键成员函数图解
 * 2. 当子父类中出现同名成员函数时，会运行子类同名函数，这种现象称为覆盖。
 * 3. 函数两个特性：
 * 		3.1. 重载：同一个类中 overload
 * 		3.2. 覆盖：子父类中，也可以称为重写 override
 * 4. 覆盖注意事项：
 * 		4.1. 子父类覆盖时，子类的访问权限必须大于等于父类的权限，private除外。
 * 		4.2. 静态方法只能覆盖静态方法，或被静态方法覆盖。
 * 
 */
class Father {
	// 思考1： 当子父类中出现同名函数如何运行
	public void show() {
		System.out.println("father is running");
	}
	
	public static int add() {
		return 0;
	}
}

class Son extends Father {
	// public protected default private 
	public void show() {
//		super.show();
		System.out.println("son is running");
	}
	
	public static int add() {
		return 1;
	}
}

/**
 * 5. 什么时候使用覆盖操作
 * 		5.1. 父类提供的方法不能满足子类要求时，可以重写父类的方法，实现功能的扩展
 * 		5.2. 子类方法中调用父类的成员函数时可以使用super关键字
 *		
 */

class Phone {
	void show() {
		System.out.println("call number...");
	}
}

class NewPhone extends Phone {
	/*
	 * 当一个类要对另一个类进行功能扩展时可以使用继承来实现。
	 */
	void show() {
		super.show();
		// 思考2： 如何提高代码复用性
		System.out.println("use Wechat...");
		System.out.println("take photo...");
	}
}

