package com.arc.learn.finaldemo;

public class FinalDemo {

	/**
	 * Final�ؼ���
	 * 1. �����ࣺ��final���ε��಻�ܱ��̳�
	 * 2. ���κ�������final���εĺ������ܱ�����
	 * 3. ���α�������final���εı���Ϊ������ֻ�ܸ�ֵһ��
	 * 		д���淶������������ĸ���Ǵ�д����������м����»������� 
	 *      �磺 final int MY_PI = 3.14
	 */
	public static void main(String[] args) {

	}

}


class Father {
	
	void show() {
		System.out.println("Father is showing ...");
	}
}


class Son extends Father {
	
	final int NUM = 8; // final���γ�Ա����������ʾ��ʼ����
//	final int age;
	void show() {
		final int age; // final���ξֲ��������������������ʼ����
		age = 18;
		System.out.println("Son is showing ...");
	}
}