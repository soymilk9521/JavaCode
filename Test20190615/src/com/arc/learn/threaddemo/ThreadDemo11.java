package com.arc.learn.threaddemo;

public class ThreadDemo11 {

	public static void main(String[] args) throws InterruptedException {
		/**
		 * 死锁演示：
		 * 死锁产生的原因：同步嵌套
		 */
		Ticket7 r = new Ticket7(100); // 卖100张票
		Thread t0 = new Thread(r);
		Thread t1 = new Thread(r);
		
		t0.start();
		Thread.sleep(1);
		r.flag = false;
		t1.start();
	}

}
