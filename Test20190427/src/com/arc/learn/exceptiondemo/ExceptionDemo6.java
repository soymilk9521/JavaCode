package com.arc.learn.exceptiondemo;

public class ExceptionDemo6 {

	public static void main(String[] args) {
		/**
		 * �쳣����ע�����
		 * 1. ���า�Ǹ��෽��ʱ�����෽������׳��쳣����ô���෽�������׳�������쳣���߸��쳣�����ࡣ
		 * 2. ��������׳�����쳣����ô����Ҳ�����׳�����쳣�����������׳����쳣ʱ�����쳣���Ӽ���
		 * 3. ������෽��û���׳��쳣�� ��ô���า�ǵķ������Բ����׳��쳣��
		 */
	}

}

class A extends Exception {
	
}

class B extends A {
	
}

class C extends Exception {
	
}

class D extends Exception {
	
}

class Father {
	void run() throws A, C {
		
	}
}

class Son extends Father {
	void run() throws A, C{
		
	}
}

