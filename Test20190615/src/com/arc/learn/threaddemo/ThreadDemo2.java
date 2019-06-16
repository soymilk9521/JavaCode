package com.arc.learn.threaddemo;

public class ThreadDemo2 {
	public static void main(String[] args) {
		/**
		 * 调用子类中run方法，并没有开启新创建的线程、仍运行的main方法，即main线程
		 */

		// 创建线程t0
		MyThread t0 = new MyThread("Gooooooool");
		// 调用run方法
		t0.run();
		// 创建线程t1
		MyThread t1 = new MyThread("Tom");
		// 调用run方法
		t1.run();
		
		System.out.println("----------------Hello world-------------");
	}
}
