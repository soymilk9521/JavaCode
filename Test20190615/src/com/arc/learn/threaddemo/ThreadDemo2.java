package com.arc.learn.threaddemo;

public class ThreadDemo2 {
	public static void main(String[] args) {
		/**
		 * ����������run��������û�п����´������̡߳������е�main��������main�߳�
		 */

		// �����߳�t0
		MyThread t0 = new MyThread("Gooooooool");
		// ����run����
		t0.run();
		// �����߳�t1
		MyThread t1 = new MyThread("Tom");
		// ����run����
		t1.run();
		
		System.out.println("----------------Hello world-------------");
	}
}
