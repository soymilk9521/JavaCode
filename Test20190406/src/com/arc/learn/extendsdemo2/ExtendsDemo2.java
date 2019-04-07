package com.arc.learn.extendsdemo2;

public class ExtendsDemo2 {

	public static void main(String[] args) {
		Son son = new Son();
		son.show();
	}

}

/**
 * 继承关系中成员变量特点：
 * 1. 当本类的成员变量和局部变量重名时，用this关键字区分
 * 2. 当子类和父类中成员变量重名时，用super关键字区分
 * 3. this和super用法相似，区别：
 *		3.1. this代表本类对象的引用。
 * 		3.2. super代表父类的空间。
 * 4. 继承关系成员变量的内存图解
 * 
 */
class Father {
	// 思考1: 如果父类与子类中成员变量同名
	int num = 5; 
}

class Son extends Father {
	int num = 8;
	void show() {
		// 子类继承父类，子类就可以直接方法父类中的成员变量
		// 思考2： 如果父类中将成员变量私有化子类能否访问到父类的成员变量
		System.out.println(this.num + "..." + super.num); 
	}
}