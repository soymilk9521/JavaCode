package com.arc.learn.threaddemo;

public class ThreadDemo {

	public static void main(String[] args) {
		/**
		 * 进程：正在运行中的程序（直译）
		 * 		进程其实就是一个应用程序在内存中所属的空间
		 * 线程：是进程中负责程序执行的一个控制单元（也叫执行路径）
		 * 		一个进制中至少有一个线程
		 * 		开启多个线程目的是为了同时执行多个任务
		 * 多线程弊端：
		 * 		单核CPU的情况下，在某一个时刻只有一个线程在运行，CPU在多个线程之间快速切换
		 * 		下载（复制）为例，同时执行多个下载（复制）任务时， 速度明显放缓。
		 * 
		 * 其实应用程序的执行都是CPU在做着快速切换完成的， 这个切换时随机的。
		 * 
		 * JVM中的多线程： java虚拟机本身就依赖多个线程。如：main函数--主线程,垃圾回器--垃圾回收线程
		 * 
		 * 调用run方法和调用start方法的区别
		 * 
		 * getName()方法获取线程名称，线程名称格式：Thread-编号（编号从0开始）
		 * 
		 * 主函数运行图解
		 * 
		 * 线程状态
		 * 	 初始(NEW)：新创建了一个线程对象，但还没有调用start()方法。
		 * 	 运行(RUNNABLE)：Java线程中将就绪（ready）和运行中（running）两种状态笼统的称为“运行”。
		 *  阻塞(BLOCKED)：表示线程阻塞于锁。
		 *  等待(WAITING)：进入该状态的线程需要等待其他线程做出一些特定动作（通知或中断）。
		 *  超时等待(TIMED_WAITING)：该状态不同于WAITING，它可以在指定的时间后自行返回。
		 *  终止(TERMINATED)：表示该线程已经执行完毕。
		 * 
		 */
		
		// 主线程执行，按顺序从上到下执行代码
		Person d1 = new Person("Goooooool");
		d1.show();
		Person d2 = new Person("Tom");
		d2.show();
		
		System.out.println("----------------Hello world-------------");
		
	}

}
