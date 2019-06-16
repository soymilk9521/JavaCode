package com.arc.learn.threaddemo;

public class ThreadDemo13 {

	public static void main(String[] args) {
		/**
		 * setDaemon()方法：
		 * 将现场标记为后台线程（守护线程）。该方法必须在开启线程之前调用。
		 * 前台线程结束后，后台线程自动停止。
		 * 
		 */
		
		DeadThread3 dt = new DeadThread3();
		Thread t0 = new Thread(dt);
		Thread t1 = new Thread(dt);
		t0.start();
		t1.setDaemon(true); // 设置为后台线程，当t0线程结束后，t1线程自动停止。
		t1.start();
		
		int x = 1;
		for(;;) {
			if (++x == 50000) {
				t0.interrupt();
//				t1.interrupt();
				break;
			}
			System.out.println(Thread.currentThread().getName() + "........");
		}
	}
}

