package com.arc.learn.threaddemo;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockDemo2 {

	public static void main(String[] args) {
		/**
		 * synchronized��obj��{
		 * 		code...
		 * }
		 * ͬ������������Ĳ���ʱ��ʽ�ģ�ϵͳ�������Ĳ���
		 * 
		 * Lock lock = new ReentrantLock();
		 * lock.lock();
		 * lock.unLock();
		 *java1.5�Ժ�ͬ��������װ�ɶ��󣬿�����ʾ������ 
		 *
		 *
		 *��װProducerConsumerDemo2.java�ִ࣬��Ч��Ҳ������ͬ������������
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
	
	// ����һ������
	Lock lock = new ReentrantLock();
	// ���������ļ�������
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
			System.out.println(Thread.currentThread().getName() + "-- ������---" + this.name); 
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
			System.out.println(Thread.currentThread().getName() + "-- ������------" + this.name + "------");
			flag = false;
			con.signal();
		} finally {
			lock.unlock();
		}
	}
}

/**
 * ������
 */
class Producer5 implements Runnable {
	private Resource8 r;
	public Producer5(Resource8 r) {
		this.r = r;
	}
	public void run() {
		while(true) {
			r.set("��Ѽ");
		}
	}
}
/**
 * ������
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