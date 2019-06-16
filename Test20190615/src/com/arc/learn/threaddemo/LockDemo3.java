package com.arc.learn.threaddemo;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockDemo3 {

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
		 *改装ProducerConsumerDemo3.java类，执行效果也与其相同，产生死锁。
		 *
		 *
		 *Lock接口：
		 *	1. 用面向对象的思想将同步和锁封装为对象，替代了同步函数和同步代码块。
		 *	2. 将同步的隐式锁操作变成了显示锁操作，使锁操作变得更为灵活。
		 *	3. 一个锁可以创建多个监视器对象。
		 *	lock方法：获取锁
		 *	unlock方法释放锁，通常需要定义在finally代码块中
		 *
		 *Condition接口：
		 *	1. 替代了Object类中的wait(),notify(),notifyAll()方法。
		 *	2. 将对象锁中的wait(),notify(),notifyAll()方法进行封装，变成Condition监视器对象。
		 *	3. 监视器可以任意组合。
		 *	await()方法相当于对象锁中的wait()
		 *  signal()方法相当于对象锁中的notify()方法
		 *  signalAll()方法相等于对象锁中的notifyAll()方法
		 */
		
		Resource9 r = new Resource9();
		Producer6 producer = new Producer6(r);
		Consumer6 consumer = new Consumer6(r);
		
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

class Resource9 {
	private String name;
	private int count = 1;
	private boolean flag = false;
	
	// 创建一锁对象
	Lock lock = new ReentrantLock();
	// 创建该锁的生产者监听对象
	Condition prod_con = lock.newCondition();
	// 创建该锁的消费者监听对象
	Condition cons_con = lock.newCondition();
	
	public void set(String name) { 
		lock.lock();
		try {
			while (flag) {
				try {
					prod_con.await(); 
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
			cons_con.signal();
		} finally {
			lock.unlock();
		}
		
	}
	
	public void out() { 
		lock.lock();
		try {
			while (!flag) {
				try {
					cons_con.await(); 
				} catch (InterruptedException e) { 
					e.printStackTrace();
				}
			}
			System.out.println(Thread.currentThread().getName() + "-- 消费者------" + this.name + "------");
			flag = false;
			prod_con.signal();
		} finally {
			lock.unlock();
		}
	}
}

/**
 * 生产者
 */
class Producer6 implements Runnable {
	private Resource9 r;
	public Producer6(Resource9 r) {
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
class Consumer6 implements Runnable {
	private Resource9 r;
	public Consumer6(Resource9 r) {
		this.r = r;
	}
	public void run() {
		while(true) {
			r.out();
		}
	}
}