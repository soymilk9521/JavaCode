package com.arc.learn.threaddemo;

public class ThreadDemo5 {

	public static void main(String[] args) {
		/**
		 * ������Ʊ
		 * 	���ĸ�������Ʊ
		 */
		
		Ticket1 t0 = new Ticket1();
		Ticket1 t1 = new Ticket1();
		Ticket1 t2 = new Ticket1();
		Ticket1 t3 = new Ticket1();
		
		t0.start();
		t1.start();
		t2.start();
		t3.start();
	}

}
