package com.arc.learn.threaddemo;

public class ThreadDemo14 {

	public static void main(String[] args) throws InterruptedException {
		/**
		 * 1. join()�������ȴ����߳���ֹ��
		 */
		
		JoinThread j = new JoinThread();
		Thread t0 = new Thread(j);
		Thread t1 = new Thread(j);
		t0.start();
		t0.join(); // t0�߳���������������
		t1.start(); // t1�̴߳�������״̬��ֱ��t0�߳����н����ſ�ʼ���С�
		
		/**
		 * 2. toString()����[�߳����ƣ� ���ȼ����߳���]
		 */
//		t1.join();
//		System.out.println(t1.toString());
		
		/**
		 * 3. setPriorty()�����̵߳����ȼ���
		 * Thread.MIN_PRIORITY: 1
		 * Thread.NORM_PRIORITY: 5
		 * Thread.MAX_PRIORITY: 10
		 */
		t1.setPriority(Thread.MAX_PRIORITY);
		
		/**
		 * 4. ThreadGroup�߳��飺
		 * ͬʱ����һ���̣߳������жϣ�ֹͣһ���̵߳ȡ�	
		 */
		
		
	}

}

class JoinThread implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + "....." + i);
		}
	}
	
}