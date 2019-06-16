package com.arc.learn.threaddemo;

/**
 * 采用实现Runnable方式，创建线程类
 * 添加了同步锁，但是多个线程之间未采用同一个同步锁，引发线程安全问题。
 */
public class Ticket4 implements Runnable {

	public int totle;
	
	
	public Ticket4(int totle) {
		this.totle = totle;
	}
	
	
	public synchronized void sales() throws InterruptedException {
//		Object object = new Object(); // 每次调用都会创建一个新的同步锁
		while (true) {
//			synchronized (object) {
				if (totle > 0) {
					Thread.sleep(10);
					System.out.println(Thread.currentThread().getName() + "...ticketNo:" + totle--);
				}else {
					break;
				}
//			}
		}
	}


	@Override
	public void run() {
		try {
			sales();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
