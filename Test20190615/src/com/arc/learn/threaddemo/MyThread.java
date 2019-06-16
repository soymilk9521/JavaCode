package com.arc.learn.threaddemo;
/**
 * �����������̲߳���(һ)��
 * 1. �����ಢ�̳�Thread�߳��ࡣ
 * 2. ���ǣ���д��run������
 * 3. ����������󣬲�����start���������̡߳�
 */
public class MyThread extends Thread { 
	
	private String name;
	
	public MyThread(String name) {
//		super(name + "=====");
		this.name = name;
	}
	

	@Override
	public void run() {
		Person d = new Person(name);
		d.show();
	}
	
	
	public static void main(String[] args) {
		MyThread mt = new MyThread("����");
		MyThread mt2 = new MyThread("hhhhhhhhh");
		mt.start();
		mt2.start();
	}

}
