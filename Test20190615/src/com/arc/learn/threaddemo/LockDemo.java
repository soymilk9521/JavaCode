package com.arc.learn.threaddemo;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockDemo {

	public static void main(String[] args) {
		/**
		 * synchronized（obj）{
		 * 		code...
		 * }
		 * 同步代码块中锁的操作时隐式的，系统负责锁的操作
		 * 
		 * Lock lock = new ReentrantLock();
		 * lock.lock();
		 * lock.unLock();
		 *java1.5以后将同步和锁封装成对象，可以显示操作。 
		 *
		 *改装ProducerConsumerDemo.java类，执行效果也与其相同，解决了线程安全问题。
		 */
		
		Resource7 r = new Resource7();
		Producer4 producer = new Producer4(r);
		Consumer4 consumer = new Consumer4(r);
		
		Thread t0 = new Thread(producer);
		Thread t1 = new Thread(producer);
		Thread t2 = new Thread(consumer);
		Thread t3 = new Thread(consumer);
		t0.start();
		t1.start();
		t2.start();
		t3.start();
	}

}

class Resource7 {
	private String name;
	private int count = 1;
	private boolean flag = false;
	
	// 创建一锁对象
	Lock lock = new ReentrantLock();
	// 创建该锁的监听对象
	Condition con = lock.newCondition();
	
	public void set(String name) { 
		lock.lock();
		try {
			if (flag) {
				try {
					con.await(); 
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			this.name = name + count; 
			count++;
			System.out.println(Thread.currentThread().getName() + "-- 生产者---" + this.name); 
			flag = true;
			con.signal();
		} finally {
			lock.unlock();
		}
		
	}
	
	public void out() { 
		lock.lock();
		try {
			if (!flag) {
				try {
					con.await(); 
				} catch (InterruptedException e) { 
					e.printStackTrace();
				}
			}
			System.out.println(Thread.currentThread().getName() + "-- 消费者------" + this.name + "------");
			flag = false;
			con.signal();
		} finally {
			lock.unlock();
		}
	}
}

/**
 * 生产者
 */
class Producer4 implements Runnable {
	private Resource7 r;
	public Producer4(Resource7 r) {
		this.r = r;
	}
	public void run() {
		while(true) {
			r.set("烤鸭");
		}
	}
}
/**
 * 消费者
 */
class Consumer4 implements Runnable {
	private Resource7 r;
	public Consumer4(Resource7 r) {
		this.r = r;
	}
	public void run() {
		while(true) {
			r.out();
		}
	}
}