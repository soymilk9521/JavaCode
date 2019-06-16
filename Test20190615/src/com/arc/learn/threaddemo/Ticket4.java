package com.arc.learn.threaddemo;

/**
 * ����ʵ��Runnable��ʽ�������߳���
 * �����ͬ���������Ƕ���߳�֮��δ����ͬһ��ͬ�����������̰߳�ȫ���⡣
 */
public class Ticket4 implements Runnable {

	public int totle;
	
	
	public Ticket4(int totle) {
		this.totle = totle;
	}
	
	
	public synchronized void sales() throws InterruptedException {
//		Object object = new Object(); // ÿ�ε��ö��ᴴ��һ���µ�ͬ����
		while (true) {
//			synchronized (object) {
				if (totle > 0) {
					Thread.sleep(10);
					System.out.println(Thread.currentThread().getName() + "...ticketNo:" + totle--);
				}else {
					break;
				}
//			}
		}
	}


	@Override
	public void run() {
		try {
			sales();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
