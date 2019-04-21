package com.arc.learn.innerclass5;

public class InnerclassDemo5 {

	public static void main(String[] args) {

	}

}

/**
 * 定义一个接口，包含两个抽象方法
 *
 */
interface Demo {
	public abstract void show();
	void show2();
}

/**
 * 定义一个外部类
 *
 */
class Outer {
	/**
	 * 定义一个内部类，实现接口并实现接口中的抽象方法
	 *
	 */
	class Inner implements Demo {

		@Override
		public void show() {
			System.out.println("Inner is showing ...");
		}

		@Override
		public void show2() {
			System.out.println("Inner is show2ing ...");
		}
	}
	
	void method() {
		// 创建内部类对象
		Inner in = new Inner();
		// 调用内部类方法
		in.show();
		in.show2();
		
		// 匿名内部类方式调用方法
		Demo demo = new Demo() {
			@Override
			public void show() {
				System.out.println("Demo is showing ...");
			}
			@Override
			public void show2() {
				System.out.println("Demo is show2ing ...");
			}
			public void show3() {
				System.out.println("Demo is show3ing ...");
			}
		};
		
		// 通过接口对象调用
		demo.show();
		demo.show2();
//		demo.show3();
	}
}