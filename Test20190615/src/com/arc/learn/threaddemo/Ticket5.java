package com.arc.learn.threaddemo;

/**
 * ����ʵ��Runnable��ʽ�������߳���
 * ��֤ͬ��������
 * ͬ������ʹ�õ�����this���̶��Ĵ���ǰ����
 * ͬ�������ʹ�õ���������ָ���������
 * ����ʹ��ͬ������顣
 */
public class Ticket5 implements Runnable {

	public int totle;
	
	public boolean flag = true;
	
	Object object = new Object(); 

	public Ticket5(int totle) {
		this.totle = totle;
	}
	
	
	public synchronized void sales() throws InterruptedException {
		while (true) {
//			synchronized (object) {
				if (totle > 0) {
					Thread.sleep(10);
					System.out.println(Thread.currentThread().getName() + "...synchronized function:" + totle--);
				}else {
					break;
				}
//			}
		}
	}


	@Override
	public void run() {
		try {
			if (flag) { // ���true����ͬ������飬��֮����ͬ������
				while (true) {
					synchronized (object) {
						if (totle > 0) {
							Thread.sleep(10);
							System.out.println(Thread.currentThread().getName() + "...synchronized block:" + totle--);
						}else {
							break;
						}
					}
				}
			}else {
				while(true) {
					sales();
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
