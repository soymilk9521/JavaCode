package com.arc.learn.threaddemo;

/**
 * ���ü̳з�ʽ�����߳���
 *
 */
public class Ticket1 extends Thread {

	public  int totle = 100;

	public void sales() {
		while (true) {
			if (totle > 0) {
				System.out.println(Thread.currentThread().getName() + "...ticketNo:" + totle);
				totle--;
			}else {
				break;
			}
		}
	}
	
	public void run() {
		sales();
	}
}
