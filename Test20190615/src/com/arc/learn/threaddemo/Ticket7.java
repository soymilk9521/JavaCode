package com.arc.learn.threaddemo;

/**
 * ����ʵ��Runnable��ʽ�������߳���
 * ͬ��Ƕ�׵ķ�ʽ��ʾ����
 */
public class Ticket7 implements Runnable {

	public int totle;
	
	public boolean flag = true;
	
	Object object = new Object(); 

	public Ticket7(int totle) {
		this.totle = totle;
	}
	
	
	public synchronized void sales() throws InterruptedException {
		synchronized (object) {
			if (totle > 0) {
				System.out.println(Thread.currentThread().getName() + "...synchronized function:" + totle--);
			}
		}
	}


	@Override
	public void run() {
		try {
			if (flag) { // ���true����ͬ������飬��֮����ͬ������
				while (true) {
					synchronized (object) {
						sales();
					}
				}
			}else {
				while(true) 
					sales();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
