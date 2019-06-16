package com.arc.learn.threaddemo;

public class BankDemo {

	public static void main(String[] args) {
		/**
		 * 同步函数：
		 * 练习：两个储户去银行存钱，每次存100元，每人存三次。
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
//		synchronized(obj) {  // 同步代码块
//			sum = sum + num;
//			try {
//				Thread.sleep(10);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//			System.out.println("sum=" + sum);
//		}
//	}
	
	public synchronized void add(int num) { // 同步方法
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