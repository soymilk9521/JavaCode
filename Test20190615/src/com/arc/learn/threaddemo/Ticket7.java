package com.arc.learn.threaddemo;

/**
 * 采用实现Runnable方式，创建线程类
 * 同步嵌套的方式演示死锁
 */
public class Ticket7 implements Runnable {

	public int totle;
	
	public boolean flag = true;
	
	Object object = new Object(); 

	public Ticket7(int totle) {
		this.totle = totle;
	}
	
	
	public synchronized void sales() throws InterruptedException {
		synchronized (object) {
			if (totle > 0) {
				System.out.println(Thread.currentThread().getName() + "...synchronized function:" + totle--);
			}
		}
	}


	@Override
	public void run() {
		try {
			if (flag) { // 如果true调用同步代码块，反之调用同步函数
				while (true) {
					synchronized (object) {
						sales();
					}
				}
			}else {
				while(true) 
					sales();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
