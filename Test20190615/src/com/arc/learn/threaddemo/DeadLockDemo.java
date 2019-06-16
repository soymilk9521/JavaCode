package com.arc.learn.threaddemo;

public class DeadLockDemo {

	public static void main(String[] args) throws InterruptedException {
		Demo r0 = new Demo(true); 
		Demo r1 = new Demo(false); 
		Thread t0 = new Thread(r0);
		Thread t1 = new Thread(r1);
		t0.start();
		t1.start();
	}

}

class Demo implements Runnable {
	
	private boolean flag;
	
	Demo(boolean flag) {
		this.flag = flag;
	}
	
	@Override
	public void run() {
		if (flag) {
			while(true) {
				synchronized (MyLock.locka) {
					System.out.println(Thread.currentThread().getName() + "...if...locka");
					synchronized (MyLock.lockb) {
						System.out.println(Thread.currentThread().getName() + "...if...lockb");
					}
				}
			}
		}else {
			while(true) {
				synchronized (MyLock.lockb) {
					System.out.println(Thread.currentThread().getName() + "...else...lockb");
					synchronized (MyLock.locka) {
						System.out.println(Thread.currentThread().getName() + "...else...locka");
					}
				}
			}
		}
	}
}

class MyLock {
	public static Object locka = new Object();
	public static Object lockb = new Object();
}
