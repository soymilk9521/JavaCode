package com.arc.learn.threaddemo;

public class ProducerConsumerDemo2 {

	public static void main(String[] args) {
		/**
		 * �̼߳�ͨ��֮�����ߣ�������
		 * ����̲߳���ͬһ����Դ����ͬ����
		 * ��if�жϸ�Ϊwhileѭ��
		 * δ����̰߳�ȫ���⣬����������
		 */
		
		Resource5 r = new Resource5();
		Producer2 producer = new Producer2(r);
		Consumer2 consumer = new Consumer2(r);
		
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

class Resource5 {
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
		this.name = name + count; 
		count++;
		System.out.println(Thread.currentThread().getName() + "-- ������---" + this.name); 
		flag = true;
		this.notify(); 
	}
	
	public synchronized void out() { 
		while (!flag) {
			try {
				this.wait(); 
			} catch (InterruptedException e) { 
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName() + "-- ������------" + this.name + "------");
		flag = false;
		this.notify();
	}
}
/**
 * ������
 */
class Producer2 implements Runnable {
	private Resource5 r;
	public Producer2(Resource5 r) {
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
class Consumer2 implements Runnable {
	private Resource5 r;
	public Consumer2(Resource5 r) {
		this.r = r;
	}
	public void run() {
		while(true) {
			r.out();
		}
			
	}
}

