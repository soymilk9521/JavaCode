package com.arc.learn.threaddemo;

public class ThreadDemo11 {

	public static void main(String[] args) throws InterruptedException {
		/**
		 * ������ʾ��
		 * ����������ԭ��ͬ��Ƕ��
		 */
		Ticket7 r = new Ticket7(100); // ��100��Ʊ
		Thread t0 = new Thread(r);
		Thread t1 = new Thread(r);
		
		t0.start();
		Thread.sleep(1);
		r.flag = false;
		t1.start();
	}

}
