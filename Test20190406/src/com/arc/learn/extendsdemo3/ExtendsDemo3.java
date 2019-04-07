package com.arc.learn.extendsdemo3;

public class ExtendsDemo3 {
	public static void main(String[] args) {
//		Son son = new Son();
//		son.show();
//		son.show();
		
		NewPhone p = new NewPhone();
		p.show();
	}
}

/**
 * �̳й�ϵ�г�Ա�������ص�
 * 1. �̳йؼ���Ա����ͼ��
 * 2. ���Ӹ����г���ͬ����Ա����ʱ������������ͬ�����������������Ϊ���ǡ�
 * 3. �����������ԣ�
 * 		3.1. ���أ�ͬһ������ overload
 * 		3.2. ���ǣ��Ӹ����У�Ҳ���Գ�Ϊ��д override
 * 4. ����ע�����
 * 		4.1. �Ӹ��า��ʱ������ķ���Ȩ�ޱ�����ڵ��ڸ����Ȩ�ޣ�private���⡣
 * 		4.2. ��̬����ֻ�ܸ��Ǿ�̬�������򱻾�̬�������ǡ�
 * 
 */
class Father {
	// ˼��1�� ���Ӹ����г���ͬ�������������
	public void show() {
		System.out.println("father is running");
	}
	
	public static int add() {
		return 0;
	}
}

class Son extends Father {
	// public protected default private 
	public void show() {
//		super.show();
		System.out.println("son is running");
	}
	
	public static int add() {
		return 1;
	}
}

/**
 * 5. ʲôʱ��ʹ�ø��ǲ���
 * 		5.1. �����ṩ�ķ���������������Ҫ��ʱ��������д����ķ�����ʵ�ֹ��ܵ���չ
 * 		5.2. ���෽���е��ø���ĳ�Ա����ʱ����ʹ��super�ؼ���
 *		
 */

class Phone {
	void show() {
		System.out.println("call number...");
	}
}

class NewPhone extends Phone {
	/*
	 * ��һ����Ҫ����һ������й�����չʱ����ʹ�ü̳���ʵ�֡�
	 */
	void show() {
		super.show();
		// ˼��2�� �����ߴ��븴����
		System.out.println("use Wechat...");
		System.out.println("take photo...");
	}
}

