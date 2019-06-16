package com.arc.learn.threaddemo;

public class ThreadDemo12 {

	public static void main(String[] args) {
		/**
		 * sleep������wait��������
		 * 1. sleep����ָ��ʱ�䣬wait����ָ��Ҳ���Բ�ָ��ʱ��
		 * 2. ��ͬ���У�sleep�ͷ�ִ��Ȩ���ͷ�����wait�ͷ�ִ��ȨҲ�ͷ���
		 * 
		 * �߳�ֹͣ������
		 * 1. stop()�������÷����Ѿ�������
		 * 2. run()���н���
		 * 
		 * ��ô�����̵߳���������أ�
		 * �����ж�����ѭ���ṹ��ֻҪֹͣѭ���Ϳ��Խ����̡߳�
		 * ʹ��break��������ѭ����
		 * 
		 * ����ʹ��interrupt()���������̴߳�����״̬�ָ�������״̬�����߳̾߱�ִ���ʸ�
		 * ʹ��interrupt()�����ᷢ��InterruptedException�쳣��
		 */
		
		DeadThread3 dt = new DeadThread3();
		Thread t0 = new Thread(dt);
		Thread t1 = new Thread(dt);
		t0.start();
		t1.start();
		
		int x = 1;
		for(;;) {
			if (++x == 50000) {
				dt.setFalse();
//				t0.interrupt();
//				t1.interrupt();
				break;
			}
			System.out.println(Thread.currentThread().getName() + "........");
		}
	}

}

class DeadThread implements Runnable { // ��ʾ�߳�����ѭ���ṹ�����������߳�
	private boolean flag = true;
	public void run() {
		while(flag) {
			System.out.println(Thread.currentThread().getName() + ".....");
		}
	}
	public void setFalse() {
		flag = false;
	}
}

class DeadThread2 implements Runnable { // ��ʾ�߳�����״̬���޷�ֹͣ�߳�
	private boolean flag = true;
	public synchronized void run() {
		while(flag) {
			try {
				this.wait(); 
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + ".....");
		}
	}
	public void setFalse() {
		flag = false;
	}
}

class DeadThread3 implements Runnable { // ��ʾ�߳�����״̬�£�ʹ��interrupted()������ֹ�߳��ж�״̬
	private boolean flag = true;
	public synchronized void run() {
		while(flag) {
			try {
				this.wait(); 
			} catch (InterruptedException e) {
				System.out.println(Thread.currentThread().getName() + "....." + e);
				flag = false; // ���ڽ����߳� 
			}
			System.out.println(Thread.currentThread().getName() + ".....");
		}
	}
	public void setFalse() {
		flag = false;
	}
}
