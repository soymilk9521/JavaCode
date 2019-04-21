package com.arc.learn.innerclass;

public class InnerclassDemo {

	public static void main(String[] args) {
		/**
		 * 内部类访问特点：
		 * 	内部类可以直接访问外部类成员，包括私有成员：私有成员变量，私有成员方法。
		 *  外部类如果要访问内部类成员，必须先创建内部类对象。
		 * 
		 */
		Outer out = new Outer();
		out.method(); // method方法内部创建内部类对象，并访问对象成员。
		
		// 1. 通过函数方式创建内部类实例
		Outer.Inner in = out.getInner();   // 通过函数方式创建内部类对象，通过无参的构造函数创建内部类对象
		System.out.println(in.num);        // 访问内部类中属性
		in.show(); 						   // 访问内部类中函数
		Outer.Inner in2 = out.getInner(9); // 通过函数方式创建内部类对象,通过有参的构造函数创建内部类对象
		System.out.println(in2.num);       // 访问内部类中属性
		in2.show();						   // 访问内部类中函数
		
		// 2. 直接创建内部类对象
//		Outer.Inner in3 = out.new Inner();
		Outer.Inner in4 = new Outer().new Inner();
		
		// 3. 静态内部类
//		Outer.Inner in5 = new Outer.Inner();
		
		Outer.Inner in6 = new Outer().new Inner();
	}
	
}


class Outer {
	
	int num = 3;
	private int num2 = 4;
	
	public void method() {
		Inner in = new Inner(); // 创建内部类， 访问内部类成员。
		System.out.println(in.num);
		in.show();
	}
	
	public Inner getInner() { // 获得内部类对象
		return new Inner();
	}
	
	public Inner getInner(int num) {
		return new Inner(num);
	}
	
	
	class Inner { // 内部类
		int num = 5;
		public Inner() { // 内部类无参构造函数

		}
		public Inner(int num) { // 内部类构造函数重载
			this.num = num;
		}
		void show() {
			System.out.println("Inner class showing ..." + num); // 访问内部类num属性
			System.out.println("Inner class showing ..." + num2);// 访问外部类私有属性
		}
	}
}