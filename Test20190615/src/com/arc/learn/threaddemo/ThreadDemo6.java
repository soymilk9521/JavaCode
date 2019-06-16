package com.arc.learn.threaddemo;

public class ThreadDemo6 {
	public static void main(String[] args) {
		
		/**
		 * 需求：卖票
		 * 	开四个窗口卖票
		 * 
		 * 线程安全产生原因：
		 * 1. 多个线程操作共享数据
		 * 2. 当一个线程在执行操作共享数据的多条代码时， 其他线程参与了运算，就会导致线程安全问题
		 * 
		 */
		
		Ticket2 r = new Ticket2(100); // 卖100张票
		Thread t0 = new Thread(r);
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		Thread t3 = new Thread(r);
		
		t0.start();
		t1.start();
		t2.start();
		t3.start();
	}

}
