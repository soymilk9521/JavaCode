package com.arc.learn.threaddemo;

public class ThreadDemo3 {
	public static void main(String[] args) throws InterruptedException {
		/**
		 * ����start���������߳�
		 * 	�����̣߳�
		 *  	�߳�t0
		 * 		�߳�t1
		 * 		���߳�main
		 * 
		 * ���߳�ͼ��
		 */
		
		// �����߳�t0
		MyThread t0 = new MyThread("Gooooooool");
		// �����߳�t0
		t0.start();
		// �����߳�t1
		MyThread t1 = new MyThread("Tom");
		// �����߳�t1
		t1.start();
		
		System.out.println("----------------Hello world-------------");
		
		
		// ������߳�ѭ�����
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + "----------" + i);
		}
	}
}
