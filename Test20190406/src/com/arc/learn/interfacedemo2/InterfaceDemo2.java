package com.arc.learn.interfacedemo2;

public class InterfaceDemo2 {

	public static void main(String[] args) {

	}

}

/**
 * Java�в�֧�ֶ�̳У�ԭ���ǵ��õĲ�ȷ���ԡ�
 * ����Java����̳л��ƽ����˸�����Java�п��Զ�ʵ�֡�
 * 
 * ��һ�������ʵ�ֶ���ӿڡ�
 * ˼���� ��������ӿ�����ͬ�����󷽷�����������У�
 *  ���ȹ۲������ӿ��е�ͬ�������Ĳ����б��Ƿ���ͬ��
 *  �������ȫһ�µ���������������ʵ�ֽӿڵ�˳������ʵ������ǰ��Ľӿ��еĳ��󷽷�
 */
class Demo implements DemoA, DemoB {

	@Override
	public void showA() {
		System.out.println("show A is running ...");
		
	}
	
	@Override
	public void showB() {
		System.out.println("show B is running ...");
		
	}

	@Override
	public void add() { // ʵ����DemoA��add���󷽷���
		System.out.println("add is running ...");
		
	}
	
}

interface DemoA {
	void showA();
	void add(); // �����ӿ���ͬ�����󷽷�
}

interface DemoB {
	void showB();
	void add();
}