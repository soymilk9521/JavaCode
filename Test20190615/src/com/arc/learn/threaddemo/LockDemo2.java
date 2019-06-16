package com.arc.learn.threaddemo;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockDemo2 {

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
		 *
		 *改装ProducerConsumerDemo2.java类，执行效果也与其相同，产生死锁。
		 *
		 */
		
		Resource8 r = new Resource8();
		Producer5 producer = new Producer5(r);
		Consumer5 consumer = new Consumer5(r);
		
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

class Resource8 {
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
			while (flag) {
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
			while (!flag) {
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
class Producer5 implements Runnable {
	private Resource8 r;
	public Producer5(Resource8 r) {
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
class Consumer5 implements Runnable {
	private Resource8 r;
	public Consumer5(Resource8 r) {
		this.r = r;
	}
	public void run() {
		while(true) {
			r.out();
		}
	}
}