package com.arc.learn.threaddemo;

public class ResourceDemo3 {

	public static void main(String[] args) {
		/**
		 * �̼߳�ͨ��֮�ȴ����ѻ��ƣ�
		 * 	�漰������
		 * 1. wait():���̴߳�������״̬����������״̬���̻߳ᱻ�洢���̳߳��С�
		 * 2. notify()�������̳߳��е�ĳ���̣߳������
		 * 3. notifyAll()�������̳߳������е��߳�
		 * 
		 * ���Ϸ������������ͬ���У�ͬ������飬ͬ������������Ϊ��Щ�����������ڲ����߳�״̬�ķ�����
		 * ����Ҫ��ȷ���������ĸ����ϵ��̡߳�
		 * 
		 * Ϊʲô�����̵߳ķ�����������Object���У�
		 * ��Ϊ��Щ�����Ǽ������������������������������Ǽ�������������������Ķ������������Object���С�
		 * 
		 * ÿһ������Ӧһ���̳߳ء�
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
					r.name = "����";
					r.sex = "ŮŮŮŮ";
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