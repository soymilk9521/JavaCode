package com.arc.learn.threaddemo;

public class ResourceDemo4 {

	public static void main(String[] args) {
		/**
		 * 线程间通信之等待唤醒机制（代码优化）
		 * 
		 * 
		 */
		
		Resource3 r = new Resource3();
		Input4 in = new Input4(r);
		Output4 out  = new Output4(r);
		
		Thread t0 = new Thread(in);
		Thread t1 = new Thread(out);
		t0.start();
		t1.start();
		
	}

}


class  Resource3 {
	private String name;
	private String sex;
	private boolean flag;
	
	public synchronized void setInfo(String name, String sex) {
		if (this.flag) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.name= name;
		this.sex = sex;
		this.flag=true;
		this.notify();
	}
	
	public synchronized void getInfo() {
		if (!this.flag) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(this.name + "..." + this.sex);
		this.flag = false;
		this.notify();
	}
}

class Input4 implements Runnable {
	private Resource3 r;
	public Input4(Resource3 r) {
		this.r = r;
	}
	public void run() {
		int x = 0;
		while(true) {
			if (x==0) {
				r.setInfo("Tome", "male");
			}else {
				r.setInfo("莉莉", "女女女女");
			}
			x = (x+1) % 2;
		}
	}
}

class Output4 implements Runnable {
	private Resource3 r;
	public Output4(Resource3 r) {
		this.r = r;
	}
	public void run() {
		while(true) {
			r.getInfo();
		}
	}
}