package com.arc.learn.objectdemo;

/**
 * �����������ʹ���
 * @author kr
 *
 */
public class Demo2 {
	
	public static void main(String[] args) {
		// ͼ���������ʹ���
		Demo d  = new Demo();
		d.x = 9;
		System.out.println(d.x);
		d.show(d);
		System.out.println(d.x);
		
	}
}

class Demo {
	// ��Ա����
	int x=3;
	
	/**
	 * �����Ͳ�������
	 * @param car
	 */
	public void show(Demo demo) {
		demo.x = 4;
	}
}
