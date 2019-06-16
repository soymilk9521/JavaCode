package com.arc.learn.threaddemo;

public class SingleDemo {

	public static void main(String[] args) {
		/**
		 * 单例模式中的线程安全问题
		 * 
		 */
	}

}

class SingleOne {
	/**
	 * 单例模式：
	 * 	饿汉式
	 *  不存在线程安全问题
	 */
	private static SingleOne single = new SingleOne();

	private SingleOne() {

	}

	public static SingleOne getInstance() {
		return single;
	}
}

class SingleTwo {
	/**
	 * 单例模式： 懒汉式
	 * 存在线程安全问题
	 */
	private static SingleTwo single;

	private SingleTwo() {

	}

	public static SingleTwo getInstance() {
		if (single == null) {
			single = new SingleTwo();
		}
		return single;
	}
}

class SingleThree {
	/**
	 * 单例模式： 懒汉式
	 * 存在线程安全问题
	 * 同步代码块解决线程安全，同时提高了效率
	 */
	private static SingleThree single;

	private SingleThree() {

	}

	public static SingleThree getInstance() {
		if (single == null) { // 当且仅当，single为null时才使用同步代码块，提高了效率
			synchronized(SingleThree.class) {
				if (single == null) {
					single = new SingleThree();
				}
			}
		}
		return single;
	}
}


