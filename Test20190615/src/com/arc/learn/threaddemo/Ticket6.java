package com.arc.learn.threaddemo;

/**
 * 采用实现Runnable方式，创建线程类
 * 验证静态同步函数的锁
 * 静态同步函数锁是，当前类的字节码对象，即当前类类名.class或者getClass（）方法取得
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
			if (flag) { // 如果true调用同步代码块，反之调用同步函数
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
