package com.arc.learn.threaddemo;

public class ResourceDemo3 {

	public static void main(String[] args) {
		/**
		 * 线程间通信之等待唤醒机制：
		 * 	涉及方法：
		 * 1. wait():让线程处于阻塞状态，处于阻塞状态的线程会被存储到线程池中。
		 * 2. notify()：唤醒线程池中的某个线程（随机）
		 * 3. notifyAll()：唤醒线程池中所有的线程
		 * 
		 * 以上方法都必须放在同步中（同步代码块，同步函数），因为这些方法都是用于操作线程状态的方法，
		 * 必须要明确操作的是哪个锁上的线程。
		 * 
		 * 为什么操作线程的方法定义在了Object类中？
		 * 因为这些方法是监视器方法，监视器就是锁，锁就是监视器，锁可以是任意的对象，因而定义在Object类中。
		 * 
		 * 每一个锁对应一个线程池。
		 */
		
		Resource2 r = new Resource2();
		Input3 in = new Input3(r);
		Output3 out = new Output3(r);
		
		Thread t0 = new Thread(in);
		Thread t1 = new Thread(out);
		t0.start();
		t1.start();
		
		
	}

}

class Resource2 {
	public String name;
	public String sex;
	public boolean flag;
}

class Input3 implements Runnable {
	private Resource2 r;
	
	public Input3(Resource2 r) {
		this.r = r;
	}
	
	public void run() {
		int x = 0;
		while(true) {
			synchronized(r) {
				if (r.flag) {
					try {
						r.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				if (x==0) {
					r.name="Tom";
					r.sex = "male";
				}else {
					r.name = "莉莉";
					r.sex = "女女女女";
				}
				r.flag=true;
				r.notify();
			}
			x = (x+1) % 2;
		}
	}
	
}

class Output3 implements Runnable {
	private Resource2 r;
	public Output3(Resource2 r) {
		this.r = r;
	}
	
	public void run() {
		while(true) {
			synchronized(r) {
				if (!r.flag) {
					try {
						r.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println(r.name + "..." + r.sex);
				r.flag = false;
				r.notify();
			}
		}
	}
}