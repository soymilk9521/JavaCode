package com.arc.learn.threaddemo;

public class ThreadDemo10 {
	public static void main(String[] args) throws InterruptedException {
		
		/**
		 * ������Ʊ
		 * 	���ĸ�������Ʊ
		 * 
		 * ��֤��̬ͬ����������
		 */
		
		Ticket6 r = new Ticket6(100); // ��100��Ʊ
		Thread t0 = new Thread(r);
		Thread t1 = new Thread(r);
		
		t0.start();
		Thread.sleep(10);
		r.flag = false;
		t1.start();
	}

}
