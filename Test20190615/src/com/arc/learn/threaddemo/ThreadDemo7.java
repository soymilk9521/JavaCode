package com.arc.learn.threaddemo;

public class ThreadDemo7 {
	public static void main(String[] args) {
		
		/**
		 * 需求：卖票
		 * 	开四个窗口卖票
		 * 
		 * 解决线程安全思路：
		 * 	就是将多条操作共享数据的线程代码封装起来，当有线程操作这些代码的时候，其他线程不可以参与运算，
		 *  必须当前线程把这些代码执行完毕后，其他线程才可以参与运算。 Java中提供了synchronized关键字来解决这个问题。
		 *
		 * 同步代码块格式：(举列：以火车上的厕所来理解同步锁)
		 * synchronized(对象锁){
		 * 	  需要同步的代码
		 * }
		 * 
		 * 同步的好处：解决了线程安全问题。
		 * 同步的弊端：相对降低了效率，因为同步以外的线程都会判断同步锁。
		 * 同步的前提：必须有多个线程并使用同一个锁。
		 */
		
		Ticket3 r = new Ticket3(100); // 卖100张票
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
