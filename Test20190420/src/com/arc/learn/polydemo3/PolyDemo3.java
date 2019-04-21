package com.arc.learn.polydemo3;

public class PolyDemo3 {
	public static void main(String[] args) {
		/**
		 * 1. 多态中成员变量的特点：
		 * 		编译时：参考引用型变量所属类中是否有被调用的成员变量：有，编译成功；没有，编译失败。
		 * 		运行时：参考引用型变量所属类中是否有被调用的成员变量：并运行该所属类中的成员变量。
		 * 		简单说：编译和运行都参考左边。
		 * 2. 多态中成员函数的特点（非静态）：
		 * 		编译时：参考引用型变量所属类中是否有被调用的成员函数：有，编译成功；没有，编译失败。
		 * 		运行时：参考对象所属类中是否有被调用的函数。
		 * 		简单说：编译参考左边，运行参考右边。
		 * 3. 多态中静态方法的特点：
		 * 		编译时：参考引用型变量所属类中是否有被调用的静态方法。
		 * 		运行时：参考引用型变量所属类中是否有被调用的静态方法。
		 * 		简单说：编译和运行都参考左边。
		 * 		其实静态方法，不依赖于对象，直接用类名访问。
		 */
		Father f = new Son(); // 向上转型隐藏子类成员
		System.out.println(f.num);
//		System.out.println(f.num2); // 无法访问子类成员变量
		f.show();
//		f.show2(); // 无法访问子类特有成员方法
		f.method();
//		f.method2(); // 无法访问子类中的静态方法
		Father.method();
		Son.method();
		
		Father f1 = new Father();
		Father f2 = new Father();
		System.out.println(f1.number);
		System.out.println(f2.number);
		f1.number = 2;
		System.out.println(f1.number);
		System.out.println(f2.number);
				
		
	}
}


class Father {
	int num = 8;
	static int number = 10;
	void show() {
		System.out.println("Father is showing ...");
	}
	static void method() {
		System.out.println("Father method ...");
	}
}

class Son extends Father {
	int num = 9;
	int num2 = 10; // 父类无法访问
	void show() {
		System.out.println("Son is showing ...");
	}
	void show2() {
		System.out.println("Son is show2ing ...");
	}
	
	static void method() {
		System.out.println("Son method ...");
	}
	
	static void method2() {
		System.out.println("Son method2 ...");
	}
}