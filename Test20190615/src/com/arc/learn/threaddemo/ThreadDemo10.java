package com.arc.learn.threaddemo;

public class ThreadDemo10 {
	public static void main(String[] args) throws InterruptedException {
		
		/**
		 * 需求：卖票
		 * 	开四个窗口卖票
		 * 
		 * 验证静态同步函数的锁
		 */
		
		Ticket6 r = new Ticket6(100); // 卖100张票
		Thread t0 = new Thread(r);
		Thread t1 = new Thread(r);
		
		t0.start();
		Thread.sleep(10);
		r.flag = false;
		t1.start();
	}

}
