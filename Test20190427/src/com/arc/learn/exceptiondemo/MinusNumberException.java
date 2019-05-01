package com.arc.learn.exceptiondemo;

import com.arc.learn.objectdemo.Demo99;

/**
 * 自定义异常类
 *
 */
public class MinusNumberException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MinusNumberException() {
		super();
	}

	/**
	 * super关键字调用父类构造函数
	 * @param message
	 */
	public MinusNumberException(String message) {
		super(message);
	}
	
	
	public static void main(String[] args) {
		Demo99 demo = new Demo99();
	}
}
