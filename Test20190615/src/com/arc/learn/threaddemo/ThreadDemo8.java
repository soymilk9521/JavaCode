package com.arc.learn.threaddemo;

public class ThreadDemo8 {
	public static void main(String[] args) {
		
		/**
		 * 需求：卖票
		 * 	开四个窗口卖票
		 * 
		 * 同步的前提：必须有多个线程并使用同一个锁。
		 */
		
		Ticket4 r = new Ticket4(100); // 卖100张票
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
