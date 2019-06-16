package com.arc.learn.threaddemo;

public class ThreadDemo12 {

	public static void main(String[] args) {
		/**
		 * sleep方法和wait方法区别：
		 * 1. sleep必须指定时间，wait可以指定也可以不指定时间
		 * 2. 在同步中，sleep释放执行权不释放锁，wait释放执行权也释放锁
		 * 
		 * 线程停止方法：
		 * 1. stop()方法，该方法已经被废弃
		 * 2. run()运行结束
		 * 
		 * 怎么控制线程的任务结束呢？
		 * 任务中都会有循环结构，只要停止循环就可以结束线程。
		 * 使用break方法跳出循环。
		 * 
		 * 可以使用interrupt()方法，将线程从阻塞状态恢复到运行状态，让线程具备执行资格，
		 * 使用interrupt()方法会发生InterruptedException异常。
		 */
		
		DeadThread3 dt = new DeadThread3();
		Thread t0 = new Thread(dt);
		Thread t1 = new Thread(dt);
		t0.start();
		t1.start();
		
		int x = 1;
		for(;;) {
			if (++x == 50000) {
				dt.setFalse();
//				t0.interrupt();
//				t1.interrupt();
				break;
			}
			System.out.println(Thread.currentThread().getName() + "........");
		}
	}

}

class DeadThread implements Runnable { // 演示线程跳出循环结构，正常结束线程
	private boolean flag = true;
	public void run() {
		while(flag) {
			System.out.println(Thread.currentThread().getName() + ".....");
		}
	}
	public void setFalse() {
		flag = false;
	}
}

class DeadThread2 implements Runnable { // 演示线程阻塞状态，无法停止线程
	private boolean flag = true;
	public synchronized void run() {
		while(flag) {
			try {
				this.wait(); 
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + ".....");
		}
	}
	public void setFalse() {
		flag = false;
	}
}

class DeadThread3 implements Runnable { // 演示线程阻塞状态下，使用interrupted()方法终止线程中断状态
	private boolean flag = true;
	public synchronized void run() {
		while(flag) {
			try {
				this.wait(); 
			} catch (InterruptedException e) {
				System.out.println(Thread.currentThread().getName() + "....." + e);
				flag = false; // 用于结束线程 
			}
			System.out.println(Thread.currentThread().getName() + ".....");
		}
	}
	public void setFalse() {
		flag = false;
	}
}
