package com.arc.learn.threaddemo;

/**
 * ����ʵ��Runnable��ʽ�������߳���
 * ���̰߳�ȫ���� 
 *
 */
public class Ticket2 implements Runnable {

	public int totle;

	public Ticket2(int totle) {
		this.totle = totle;
	}

	public void sales() throws InterruptedException {
		while (true) {
				if (totle > 0) {
					Thread.sleep(10); // ����10���룬�����̰߳�ȫ����
					System.out.println(Thread.currentThread().getName() + "...ticketNo:" + totle);
					totle--;
				} else {
					break;
				}
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
