package com.arc.learn.threaddemo;

/**
 * 采用实现Runnable方式，创建线程类
 * 添加同步锁，解决线程安全问题。
 *
 */
public class Ticket3 implements Runnable {

	public int totle;
	
	Object object = new Object();
	
	public Ticket3(int totle) {
		this.totle = totle;
	}
	
	
	public void sales() throws InterruptedException {
		while (true) {
			synchronized (object) {
				if (totle > 0) {
					Thread.sleep(10);
					System.out.println(Thread.currentThread().getName() + "...ticketNo:" + totle--);
				}else {
					break;
				}
			}
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
