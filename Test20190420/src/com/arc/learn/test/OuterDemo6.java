package com.arc.learn.test;

public class OuterDemo6 {

	public static void main(String[] args) {
//		Outer.Inner in = new Outer().new Inner();
//		System.out.println(in.num2);
//		in.show();
		Outer outer = new Outer();
//		Outer.Inner in2 = outer.getInnerInstance();
		Outer.Inner in3 = outer.getInnerInstance(99);
		Outer.Inner in4 = outer.new Inner();
		in3.show();
	}
	

}

class Outer  {
	private int num = 8;
	private void method() {
		System.out.println( "Outer method is running ...");
//		System.out.println(num2);
	}
	class Inner {
		
		int num = 10;
		public Inner() {
		}
		public Inner(int num) {
			this.num = num;
		}
		public void show() {
//			System.out.println(this.num);
//			System.out.println(Outer.this.num);
			Inner.this.method();
			Outer.this.method();
		}
		public void method() {
			System.out.println("Inner method is running ...");
		}
	}
	
	public Inner getInnerInstance() {
		return new Inner();
	}
	
	public Inner getInnerInstance(int num2) {
		return new Inner(num2);
	}
	
}
