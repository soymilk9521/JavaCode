package com.arc.learn.threaddemo;

public class SingleDemo {

	public static void main(String[] args) {
		/**
		 * ����ģʽ�е��̰߳�ȫ����
		 * 
		 */
	}

}

class SingleOne {
	/**
	 * ����ģʽ��
	 * 	����ʽ
	 *  �������̰߳�ȫ����
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
	 * ����ģʽ�� ����ʽ
	 * �����̰߳�ȫ����
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
	 * ����ģʽ�� ����ʽ
	 * �����̰߳�ȫ����
	 * ͬ����������̰߳�ȫ��ͬʱ�����Ч��
	 */
	private static SingleThree single;

	private SingleThree() {

	}

	public static SingleThree getInstance() {
		if (single == null) { // ���ҽ�����singleΪnullʱ��ʹ��ͬ������飬�����Ч��
			synchronized(SingleThree.class) {
				if (single == null) {
					single = new SingleThree();
				}
			}
		}
		return single;
	}
}


