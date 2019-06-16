package com.arc.learn.threaddemo;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockDemo3 {

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
		 *��װProducerConsumerDemo3.java�ִ࣬��Ч��Ҳ������ͬ������������
		 *
		 *
		 *Lock�ӿڣ�
		 *	1. ����������˼�뽫ͬ��������װΪ���������ͬ��������ͬ������顣
		 *	2. ��ͬ������ʽ�������������ʾ��������ʹ��������ø�Ϊ��
		 *	3. һ�������Դ����������������
		 *	lock��������ȡ��
		 *	unlock�����ͷ�����ͨ����Ҫ������finally�������
		 *
		 *Condition�ӿڣ�
		 *	1. �����Object���е�wait(),notify(),notifyAll()������
		 *	2. ���������е�wait(),notify(),notifyAll()�������з�װ�����Condition����������
		 *	3. ����������������ϡ�
		 *	await()�����൱�ڶ������е�wait()
		 *  signal()�����൱�ڶ������е�notify()����
		 *  signalAll()��������ڶ������е�notifyAll()����
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
	
	// ����һ������
	Lock lock = new ReentrantLock();
	// ���������������߼�������
	Condition prod_con = lock.newCondition();
	// ���������������߼�������
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
			System.out.println(Thread.currentThread().getName() + "-- ������---" + this.name); 
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
			System.out.println(Thread.currentThread().getName() + "-- ������------" + this.name + "------");
			flag = false;
			prod_con.signal();
		} finally {
			lock.unlock();
		}
	}
}

/**
 * ������
 */
class Producer6 implements Runnable {
	private Resource9 r;
	public Producer6(Resource9 r) {
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