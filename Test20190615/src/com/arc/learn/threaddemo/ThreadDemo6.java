package com.arc.learn.threaddemo;

public class ThreadDemo6 {
	public static void main(String[] args) {
		
		/**
		 * ������Ʊ
		 * 	���ĸ�������Ʊ
		 * 
		 * �̰߳�ȫ����ԭ��
		 * 1. ����̲߳�����������
		 * 2. ��һ���߳���ִ�в����������ݵĶ�������ʱ�� �����̲߳��������㣬�ͻᵼ���̰߳�ȫ����
		 * 
		 */
		
		Ticket2 r = new Ticket2(100); // ��100��Ʊ
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
