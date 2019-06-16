package com.arc.learn.threaddemo;

public class ProducerConsumerDemo {

	public static void main(String[] args) {
		/**
		 * 线程间通信之生产者，消费者
		 * 
		 * 多个线程操作同一个资源，有同步锁
		 * 出现线程安全问题
		 * 
		 */
		
		Resource4 r = new Resource4();
		Producer producer = new Producer(r);
		Consumer consumer = new Consumer(r);
		
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

class Resource4 {
	private String name;
	private int count = 1;
	private boolean flag = false;
	
	public synchronized void set(String name) { 
		if (flag) {
			try {
				this.wait(); 
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
		this.notify(); 
	}
	
	public synchronized void out() { 
		if (!flag) {
			try {
				this.wait(); 
			} catch (InterruptedException e) { 
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName() + "-- 消费者------" + this.name + "------");
		flag = false;
		this.notify();
	}
}
/**
 * 生产者
 */
class Producer implements Runnable {
	private Resource4 r;
	public Producer(Resource4 r) {
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
class Consumer implements Runnable {
	private Resource4 r;
	public Consumer(Resource4 r) {
		this.r = r;
	}
	public void run() {
		while(true) {
			r.out();
		}
			
	}
}

