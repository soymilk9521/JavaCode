package com.arc.learn.threaddemo;

public class ThreadDemo13 {

	public static void main(String[] args) {
		/**
		 * setDaemon()������
		 * ���ֳ����Ϊ��̨�̣߳��ػ��̣߳����÷��������ڿ����߳�֮ǰ���á�
		 * ǰ̨�߳̽����󣬺�̨�߳��Զ�ֹͣ��
		 * 
		 */
		
		DeadThread3 dt = new DeadThread3();
		Thread t0 = new Thread(dt);
		Thread t1 = new Thread(dt);
		t0.start();
		t1.setDaemon(true); // ����Ϊ��̨�̣߳���t0�߳̽�����t1�߳��Զ�ֹͣ��
		t1.start();
		
		int x = 1;
		for(;;) {
			if (++x == 50000) {
				t0.interrupt();
//				t1.interrupt();
				break;
			}
			System.out.println(Thread.currentThread().getName() + "........");
		}
	}
}

