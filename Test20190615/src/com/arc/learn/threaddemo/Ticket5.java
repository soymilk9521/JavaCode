package com.arc.learn.threaddemo;

/**
 * 采用实现Runnable方式，创建线程类
 * 验证同步函数锁
 * 同步函数使用的锁是this，固定的代表当前对象
 * 同步代码块使用的锁，可以指定任意对象。
 * 建议使用同步代码块。
 */
public class Ticket5 implements Runnable {

	public int totle;
	
	public boolean flag = true;
	
	Object object = new Object(); 

	public Ticket5(int totle) {
		this.totle = totle;
	}
	
	
	public synchronized void sales() throws InterruptedException {
		while (true) {
//			synchronized (object) {
				if (totle > 0) {
					Thread.sleep(10);
					System.out.println(Thread.currentThread().getName() + "...synchronized function:" + totle--);
				}else {
					break;
				}
//			}
		}
	}


	@Override
	public void run() {
		try {
			if (flag) { // 如果true调用同步代码块，反之调用同步函数
				while (true) {
					synchronized (object) {
						if (totle > 0) {
							Thread.sleep(10);
							System.out.println(Thread.currentThread().getName() + "...synchronized block:" + totle--);
						}else {
							break;
						}
					}
				}
			}else {
				while(true) {
					sales();
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
