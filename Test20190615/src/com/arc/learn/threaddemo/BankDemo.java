package com.arc.learn.threaddemo;

public class BankDemo {

	public static void main(String[] args) {
		/**
		 * ͬ��������
		 * ��ϰ����������ȥ���д�Ǯ��ÿ�δ�100Ԫ��ÿ�˴����Ρ�
		 */
		
		SaveAction sa = new SaveAction();
		Thread t0 = new Thread(sa);
		Thread t1 = new Thread(sa);
		t0.start();
		t1.start();
		
	}

}

class Bank {
	
	Object obj = new Object();
	
	private int sum;

//	public void add(int num) {
//		synchronized(obj) {  // ͬ�������
//			sum = sum + num;
//			try {
//				Thread.sleep(10);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//			System.out.println("sum=" + sum);
//		}
//	}
	
	public synchronized void add(int num) { // ͬ������
		sum = sum + num;
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("sum=" + sum);
	}
}

class SaveAction implements Runnable {

	private Bank bank = new Bank();

	@Override
	public void run() {
//		Bank bank = new Bank();
		for (int i = 0; i < 3; i++) {
			bank.add(100);
		}
	}

}