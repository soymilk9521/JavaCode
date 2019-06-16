package com.arc.learn.threaddemo;

public class ThreadDemo3 {
	public static void main(String[] args) throws InterruptedException {
		/**
		 * 调用start方法开启线程
		 * 	三个线程：
		 *  	线程t0
		 * 		线程t1
		 * 		主线程main
		 * 
		 * 多线程图解
		 */
		
		// 创建线程t0
		MyThread t0 = new MyThread("Gooooooool");
		// 开启线程t0
		t0.start();
		// 创建线程t1
		MyThread t1 = new MyThread("Tom");
		// 开启线程t1
		t1.start();
		
		System.out.println("----------------Hello world-------------");
		
		
		// 添加主线程循环语句
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + "----------" + i);
		}
	}
}
