package com.arc.learn.threaddemo;

/**
 * 创建并运行线程步骤(二)：
 * 1. 创建类实现Runnable接口。
 * 2. 实现接口run方法，并将线程任务代码放入到run方法中。
 * 3. 通过Thread类创建线程对象，并将Runnable接口实现类对象作为参数传递。
 * 4. 调用线程对象的start方法开启线程
 * 
 * 实现Runnable接口的好处
 * 1. 将线程的任务从线程子类中分离出来，进行单独封装。
 * 		按照java面向的思想将线程任务封装成对象。
 * 2. 避免了Java单继承的局限性
 * 
 * 所以，第二种方式比较常用。
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
