package com.arc.learn.threaddemo;

public class ThreadDemo8 {
	public static void main(String[] args) {
		
		/**
		 * ������Ʊ
		 * 	���ĸ�������Ʊ
		 * 
		 * ͬ����ǰ�᣺�����ж���̲߳�ʹ��ͬһ������
		 */
		
		Ticket4 r = new Ticket4(100); // ��100��Ʊ
		Thread t0 = new Thread(r);
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		Thread t3 = new Thread(r);
		
		t0.start();
		t1.start();
		t2.start();
		t3.start();
	}

}
