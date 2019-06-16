package com.arc.learn.threaddemo;

public class ThreadDemo14 {

	public static void main(String[] args) throws InterruptedException {
		/**
		 * 1. join()方法：等待该线程终止。
		 */
		
		JoinThread j = new JoinThread();
		Thread t0 = new Thread(j);
		Thread t1 = new Thread(j);
		t0.start();
		t0.join(); // t0线程申请加入进来运行
		t1.start(); // t1线程处于阻塞状态，直到t0线程运行结束才开始运行。
		
		/**
		 * 2. toString()方法[线程名称， 优先级，线程组]
		 */
//		t1.join();
//		System.out.println(t1.toString());
		
		/**
		 * 3. setPriorty()设置线程的优先级。
		 * Thread.MIN_PRIORITY: 1
		 * Thread.NORM_PRIORITY: 5
		 * Thread.MAX_PRIORITY: 10
		 */
		t1.setPriority(Thread.MAX_PRIORITY);
		
		/**
		 * 4. ThreadGroup线程组：
		 * 同时操作一组线程，可以中断，停止一组线程等。	
		 */
		
		
	}

}

class JoinThread implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + "....." + i);
		}
	}
	
}