package com.arc.learn.test2;

public class TestDemo2 {
	public static void main(String[] args) {
		/**
		 * 1. 默认初始化 
		 * 2. 父类构造器初始化
		 * 3. 调用子类show方法(覆盖)
		 * 4. 显示初始化
		 * 5. 构造代码块执行
		 * 6. 子类构造器初始完成
		 */
		new Son().show();
	}
}

class Father {
	public Father() {
		show();    
	}
	void show() {
		System.out.println("Father is showing ...");
	}
}

class Son extends Father {
	int num = 9;
	// 构造代码块
	{
		System.out.println("son constructor code ...." + num);
		num = 10;
	}
	public Son() {
		super();
		// 显示初始化
		System.out.println("son const is running ..." + num);
	}
	
	void show() {
		System.out.println("Son is showing ..." + num);
	}
}


