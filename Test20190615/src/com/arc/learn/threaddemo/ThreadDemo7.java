package com.arc.learn.threaddemo;

public class ThreadDemo7 {
	public static void main(String[] args) {
		
		/**
		 * ������Ʊ
		 * 	���ĸ�������Ʊ
		 * 
		 * ����̰߳�ȫ˼·��
		 * 	���ǽ����������������ݵ��̴߳����װ�����������̲߳�����Щ�����ʱ�������̲߳����Բ������㣬
		 *  ���뵱ǰ�̰߳���Щ����ִ����Ϻ������̲߳ſ��Բ������㡣 Java���ṩ��synchronized�ؼ��������������⡣
		 *
		 * ͬ��������ʽ��(���У��Ի��ϵĲ��������ͬ����)
		 * synchronized(������){
		 * 	  ��Ҫͬ���Ĵ���
		 * }
		 * 
		 * ͬ���ĺô���������̰߳�ȫ���⡣
		 * ͬ���ı׶ˣ���Խ�����Ч�ʣ���Ϊͬ��������̶߳����ж�ͬ������
		 * ͬ����ǰ�᣺�����ж���̲߳�ʹ��ͬһ������
		 */
		
		Ticket3 r = new Ticket3(100); // ��100��Ʊ
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
