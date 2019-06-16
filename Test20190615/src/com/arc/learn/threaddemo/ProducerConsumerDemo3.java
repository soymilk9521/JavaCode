package com.arc.learn.threaddemo;

public class ProducerConsumerDemo3 {

	public static void main(String[] args) {
		/**
		 * 线程间通信之生产者，消费者
		 * 多个线程操作同一个资源，有同步锁
		 *将notify方法改为notifyAll方法 
		 * 解决了线程安全问题，未出现死锁
		 * 
		 */
		
		Resource6 r = new Resource6();
		Producer3 producer = new Producer3(r);
		Consumer3 consumer = new Consumer3(r);
		
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

class Resource6 {
	private String name;
	private int count = 1;
	private boolean flag = false;
	
	public synchronized void set(String name) { 
		while (flag) {
			try {
				this.wait(); 
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.name = name + count; 
		count++;
		System.out.println(Thread.currentThread().getName() + "-- 生产者---" + this.name); 
		flag = true;
		this.notifyAll(); 
	}
	
	public synchronized void out() { 
		while (!flag) {
			try {
				this.wait(); 
			} catch (InterruptedException e) { 
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName() + "-- 消费者------" + this.name + "--------");
		flag = false;
		this.notifyAll();
	}
}
/**
 * 生产者
 */
class Producer3 implements Runnable {
	private Resource6 r;
	public Producer3(Resource6 r) {
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
class Consumer3 implements Runnable {
	private Resource6 r;
	public Consumer3(Resource6 r) {
		this.r = r;
	}
	public void run() {
		while(true) {
			r.out();
		}
			
	}
}

