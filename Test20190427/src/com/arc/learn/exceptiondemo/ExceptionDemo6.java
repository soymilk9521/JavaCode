package com.arc.learn.exceptiondemo;

public class ExceptionDemo6 {

	public static void main(String[] args) {
		/**
		 * 异常处理注意事项：
		 * 1. 子类覆盖父类方法时，父类方法如果抛出异常，那么子类方法必须抛出父类的异常或者该异常的子类。
		 * 2. 如果父类抛出多个异常，那么子类也必须抛出多个异常，并且子类抛出的异常时父类异常的子集。
		 * 3. 如果父类方法没有抛出异常， 那么子类覆盖的方法绝对不能抛出异常。
		 */
	}

}

class A extends Exception {
	
}

class B extends A {
	
}

class C extends Exception {
	
}

class D extends Exception {
	
}

class Father {
	void run() throws A, C {
		
	}
}

class Son extends Father {
	void run() throws A, C{
		
	}
}

