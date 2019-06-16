package com.arc.learn.threaddemo;
/**
 * 创建并运行线程步骤(一)：
 * 1. 创建类并继承Thread线程类。
 * 2. 覆盖（重写）run方法。
 * 3. 创建子类对象，并调用start方法开启线程。
 */
public class MyThread extends Thread { 
	
	private String name;
	
	public MyThread(String name) {
//		super(name + "=====");
		this.name = name;
	}
	

	@Override
	public void run() {
		Person d = new Person(name);
		d.show();
	}
	
	
	public static void main(String[] args) {
		MyThread mt = new MyThread("旺财");
		MyThread mt2 = new MyThread("hhhhhhhhh");
		mt.start();
		mt2.start();
	}

}
