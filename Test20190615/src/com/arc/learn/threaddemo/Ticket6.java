package com.arc.learn.threaddemo;

/**
 * ����ʵ��Runnable��ʽ�������߳���
 * ��֤��̬ͬ����������
 * ��̬ͬ���������ǣ���ǰ����ֽ�����󣬼���ǰ������.class����getClass��������ȡ��
 */
public class Ticket6 implements Runnable {

	public static int totle;
	
	public boolean flag = true;
	
	Object object = new Object(); 

	public Ticket6(int totle) {
		this.totle = totle;
	}
	
	
	public synchronized static void sales() throws InterruptedException {
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
					synchronized (Ticket6.class) {
//					synchronized (object) {
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
