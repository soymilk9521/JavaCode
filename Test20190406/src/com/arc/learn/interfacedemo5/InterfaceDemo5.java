package com.arc.learn.interfacedemo5;

/**
 * 1. �ӿںͳ����������
 *  1.1. ��ͬ�㣺�ӿںͳ����඼����ʵ������
 *  1.2. ��ͬ�㣺
 * 		1.2.1. ��������Ҫ���̳У�����ֻ�ܵ��̳С��ӿ���Ҫ��ʵ�֣����Զ�ʵ�֡�
 * 		1.2.2. ��������Զ�����󷽷��ͷǳ��󷽷����ӿ�ֻ�ܶ�����󷽷���
 * 	
 */
public class InterfaceDemo5 {
	public static void main(String[] args) {
		
	}
	
}


/**
 * è�ƶ��felid�� 
 *
 */
abstract class Felid {
	String name;
	abstract void climb();
}

/**
 * ����ӿڣ�skills��
 *
 */
interface Skills {
	abstract void catches(); // ׽����
}

/**
 * 
 * ����һ��è��
 * �̳�è�ƶ����ࡣ
 * ʵ���˱���ӿڡ�
 */
class Cat extends Felid implements Skills{

	@Override
	void climb() {
		System.out.println("cat is running ..."); // ���Ǹ�����󷽷���
	}

	@Override
	public void catches() {
		System.out.println("cat is catching ..."); // ͨ��ʵ��Skills�ӿڻ��
	}
}

/**
 * 
 * ����һ���ϻ���
 * �̳�è�ƶ����ࡣ
 */
class Tiger extends Felid {

	@Override
	void climb() {
		System.out.println("tiger is runing ...");// ���Ǹ�����󷽷���
	}
}

/**
 * 
 * ����һ������
 * ʵ���˱���ӿڡ�
 */
class Dog implements Skills {

	@Override
	public void catches() {
		System.out.println("dog is catching ..."); // ͨ��ʵ��Skills�ӿڻ��
	}
	
}