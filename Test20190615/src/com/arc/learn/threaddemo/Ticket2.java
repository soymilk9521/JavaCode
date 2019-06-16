package com.arc.learn.threaddemo;

/**
 * 采用实现Runnable方式，创建线程类
 * 有线程安全问题 
 *
 */
public class Ticket2 implements Runnable {

	public int totle;

	public Ticket2(int totle) {
		this.totle = totle;
	}

	public void sales() throws InterruptedException {
		while (true) {
				if (totle > 0) {
					Thread.sleep(10); // 休眠10毫秒，引出线程安全问题
					System.out.println(Thread.currentThread().getName() + "...ticketNo:" + totle);
					totle--;
				} else {
					break;
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
