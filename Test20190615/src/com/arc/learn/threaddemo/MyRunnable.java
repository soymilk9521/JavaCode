package com.arc.learn.threaddemo;

/**
 * �����������̲߳���(��)��
 * 1. ������ʵ��Runnable�ӿڡ�
 * 2. ʵ�ֽӿ�run�����������߳����������뵽run�����С�
 * 3. ͨ��Thread�ഴ���̶߳��󣬲���Runnable�ӿ�ʵ���������Ϊ�������ݡ�
 * 4. �����̶߳����start���������߳�
 * 
 * ʵ��Runnable�ӿڵĺô�
 * 1. ���̵߳�������߳������з�����������е�����װ��
 * 		����java�����˼�뽫�߳������װ�ɶ���
 * 2. ������Java���̳еľ�����
 * 
 * ���ԣ��ڶ��ַ�ʽ�Ƚϳ��á�
 * 
 */
public class MyRunnable implements Runnable {
	
	private int num;
	
	public MyRunnable(int num) {
		this.num = num;
	}
	@Override
	public void run() {
		while(true) {
			if(num > 0) {
				System.out.println("num=" + num);
				num--;
			}else {
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		MyRunnable ticket = new MyRunnable(100);
		Thread t0 = new Thread(ticket);
		t0.start();
	}

}
