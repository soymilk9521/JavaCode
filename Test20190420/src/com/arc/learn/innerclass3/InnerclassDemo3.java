package com.arc.learn.innerclass3;

public class InnerclassDemo3 {

	public static void main(String[] args) {
		/**
		 * 内部类定义在局部作用域中
		 */
//		new Outer().method();
		
		Outer.Inner in = new Outer.Inner();
		in.show();
	}

}

class Outer {
	static int num = 5;
	static void method() {
		int x = 9;
		System.out.println(x);
//		class Inner {
//			void show() {
//				System.out.println(num);
//				System.out.println(x);
//			}
//		}
//		Inner in = new Inner();
//		in.show();
	}
	
	static class Inner {
		void show() {
			System.out.println(num);
			method();
		}
	}
	
}