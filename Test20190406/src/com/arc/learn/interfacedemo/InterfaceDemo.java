package com.arc.learn.interfacedemo;

public class InterfaceDemo {

	public static void main(String[] args) {
		Demo3Impl d3 = new Demo3Impl();
		System.out.println(d3.COLOR_BLUE);
//		d3.COLOR_BLUE = "yellow";
		System.out.println(Demo3Impl.COLOR_RED);
		d3.show();
		d3.add();
		
	}

}


/**
 * 1. �ӿڶ��壺
 *  1.1. ��һ�����ж��ǳ��󷽷�ʱ�����Ի�һ�ֶ���ͱ�ʾ����ʹ�ýӿ�interface
 *	1.2. ����ӿڵĹؼ��ֲ���class����interface
 *
 * 2. �ӿ��г�Ա��
 * 	2.1. ȫ�ֳ��������γɷ̶ֹ���Ĭ��ʹ��public static final �����ҿ���ʡ�ԡ�
 *  2.2. ���󷽷������γɷ̶ֹ���Ĭ��ʹ��public abstract�����ҿ���ʡ�ԡ�
 *  2.3. ���ۣ��ӿ��еĳ�Ա���ǹ���Ȩ�ޡ�
 */
abstract class Demo1 { // ������ı�ʾ��ʽ
	abstract void show();
	abstract void add();
}

abstract interface Demo2 { // �ӿڵı�ʾ��ʽ
	void show();
	void add();
}

interface Demo3 {
	// ȫ�ֳ���
	public static final String COLOR_RED  = "red";
	String COLOR_BLUE = "blue";
	
	// ���󷽷�
	public abstract void show();
	void add();
}

/**
 * 
 * 3. ������֮���Ǽ̳й�ϵ������ӿ�֮����ʵ�ֹ�ϵ
 * 		3.1. �ӿڲ���ʵ���� 
 * 		3.2. ʵ���˽ӿھͱ���ʵ�ֽӿڵ�ȫ�����󷽷�
 */
class Demo3Impl implements Demo3 {

	@Override
	public void show() {
		System.out.println("Demo3Impl is showing ...");
		
	}

	@Override
	public void add() {
		System.out.println("Demo3Impl is adding ...");
	}
	
}