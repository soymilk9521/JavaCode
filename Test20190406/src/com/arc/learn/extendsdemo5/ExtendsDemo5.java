package com.arc.learn.extendsdemo5;

public class ExtendsDemo5 {

	public static void main(String[] args) {
		Son son = new Son();
		son.show(); // 思考1：运行结果
	}

}

/**
 * 
 * 继承实例化过程图解
 * Person p = new Person（）；
 * 一个对象实例化过程
 * 1. JVM会读取指定路径下Person.class文件，并加载进内存，并且优先加载Person类的父类
 * 2. 在堆内存中开辟内存空间，分配内存地址。
 * 3. 并在对象空间中，对对象属性进行默认初始化。
 * 4. 调用对应的构造函数进行初始化。
 * 5. 在构造函数中，第一行会先调用父类的构造函数进行初始化
 * 6. 父类初始化完毕后，再对子类的属性进行显示初始化。
 * 7. 再进行子类构造函数特定初始化。
 * 8. 初始化完毕后， 将地址赋值给引用变量。
 * 
 */
class Father extends Object{
	Father() {
		super();
		this.show();
		return;
	}
	public void show() {
		System.out.println("Father is showing ...");
	}
}

class Son extends Father {
	int num = 8;
	Son(){
		super();
		// 通过super初始化父类时，子类成员变量并未显示初始化。
		// 等super()父类初始化完毕后，才进行子类的成员变量显示初始化。
		System.out.println("Son cons is running ..." + num);
		return;
	}
	public void show() {
//		super.show();
		System.out.println("Son is showing ..." + num);
	}
}
