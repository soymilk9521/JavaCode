package com.arc.learn.innerclass4;

public class InnerclassDemo4 {
	public static void main(String[] args) {
		/**
		 * 匿名内部类：
		 *  	匿名内部类就是内部类的简写。
		 * 匿名内部类前提：
		 *  	内部类必须继承类或实现一个接口；
		 */
		
//		new Outer().method();
		Outer outer = new Outer();
//		Outer.Inner in = outer.new Inner();
//		in.show();
//		
//		Outer.Inner2 in3 = outer.new Inner2();
//		in3.start();
		
		// 匿名內部类的方式继承一個抽象类
		new Demo() {
			@Override
			void show() {
				System.out.println("demo show is running");
				
			}
		}.show();
		
		// 匿名內部类的方式实现接口
		new USB() {
			@Override
			public void start() {
				System.out.println("USB start is running ...");
			}
			
		}.start();
		
		new DemoA() {
			
			@Override
			public void show() {
				System.out.println("DDDD");
			}
		}.show();
		
	}
}

interface USB {
	public abstract void start();
}

/**
 * 
 * 定义一个抽象类，包含一个抽象方法
 * 
 */
abstract class Demo {
	abstract void show();
}

interface DemoA {
	void show();
}


/**
 * 定义一个外部类
 *
 */
class Outer {
	int num = 9;
	/**
	 * 定义一个内部类，并继承抽象类，实现其抽象方法
	 *
	 */
	class Inner extends Demo{
		@Override
		void show() {
			System.out.println("Inner is showing ..." + num);
		}
	}
	
	class Inner2 implements USB {
		@Override
		public void start() {
			System.out.println("Inner2 start is running ...");
		}
		
	}
	
	void method() {
		// 传统方式
		new Inner().show();
		
		// 匿名内部类
		new Demo() {
			@Override
			void show() {
				System.out.println("Demo is showing ..." + num);
			}
		}.show();
	}
	
}




