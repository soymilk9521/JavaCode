package com.arc.learn.threaddemo;

public class ThreadDemo4 {

	public static void main(String[] args) {
		/**
		 * ���߳��׳��쳣ֹͣ��t0��t1�̲߳������߳��׳��쳣Ӱ�졣
		 * 
		 */
		// �����߳�t0
		MyThread t0 = new MyThread("Gooooooool");
		// �����߳�t0
		t0.start();
		// �����߳�t1
		MyThread t1 = new MyThread("Tom");
		// �����߳�t1
		t1.start();

		// �������߳����쳣����������������̵߳�Ӱ��
		int i = 5 / 0; // �׳�ArithmeticException�쳣
		System.out.println("----------Hello Main---------"); // ���߳����쳣���������䲢δִ��

	}

}
