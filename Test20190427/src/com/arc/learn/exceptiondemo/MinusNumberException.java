package com.arc.learn.exceptiondemo;

import com.arc.learn.objectdemo.Demo99;

/**
 * �Զ����쳣��
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
	 * super�ؼ��ֵ��ø��๹�캯��
	 * @param message
	 */
	public MinusNumberException(String message) {
		super(message);
	}
	
	
	public static void main(String[] args) {
		Demo99 demo = new Demo99();
	}
}
