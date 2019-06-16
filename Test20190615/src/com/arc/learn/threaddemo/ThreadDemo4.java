package com.arc.learn.threaddemo;

public class ThreadDemo4 {

	public static void main(String[] args) {
		/**
		 * 主线程抛出异常停止，t0，t1线程不受主线程抛出异常影响。
		 * 
		 */
		// 创建线程t0
		MyThread t0 = new MyThread("Gooooooool");
		// 开启线程t0
		t0.start();
		// 创建线程t1
		MyThread t1 = new MyThread("Tom");
		// 开启线程t1
		t1.start();

		// 测试主线程抛异常情况，对其他两个线程的影响
		int i = 5 / 0; // 抛出ArithmeticException异常
		System.out.println("----------Hello Main---------"); // 主线程抛异常，该输出语句并未执行

	}

}
