package com.arc.learn.extendsdemo4;

public class ExtendsDemo4 {

	public static void main(String[] args) {
		new Son();
//		new Son(6); // ˼��3�����н��Ϊ��
	}

}

/** 
 * �̳й�ϵ�й��캯�����ص�
 * 1. ʹ��new�ؼ��ִ����������ʱ�����๹�캯��Ĭ�ϵ��ø�����޲ι��캯��
 * 2. �������û���޲ι��캯�������๹�캯����Ҫʹ��super�ؼ�����ʾָ�����캯����
 * 3. ʹ��this�ؼ��ֵ������๹�캯��ʱ��this�ؼ������ڵĹ��캯���п���ʡ��super��
 * 		��������õĹ��캯����ʹ��super�ؼ�����ʾ���ø��๹�캯��
 * 4. ����ʵ��������ϸ��:
 * 		4.1. Ϊʲô������ʵ���������л���ʸ��๹������
 * 		     ����̳и������Է��ʸ����еĳ�Ա���������Ҫ���ñ��๹�캯������ɳ�ʼ��������
 * 		   ������ܷ��ʸ����еĳ�Ա��
 * 		4.2. super������������๹�캯���ĵ�һ��
 * 		4.3. �����ڹ��캯����ʹ��this()�����ñ��๹�캯��ʱ��this()��乹�캯��������ʽ
 * 		   ʹ��super()�����ø��๹�캯������Ϊthis()��super()����ڵ��ù��캯��ʱ��������ڵ�һ�С�
 * 	       �����Ա�֤���������л����������캯�����ʸ��๹�캯����
 * 		4.4. Object��Ϊ����Java��ĸ���
 */
class Father extends Object {
	Father() {
		// ˼��1: ���๹�캯��Ϊʲô�������ˣ�
		// ˼��2: ���������û���޲εĹ��캯�������޲ι��캯����˽�л�����������У�
		System.out.println("father is running...");
	}
	
	Father(int x) {
		this();
		System.out.println("father is running..." + x);
	}
}

class Son extends Father {
	Son() {
		this(6);  // ��ʱ��this�����ù��캯��ʱ��super()����ʹ�á�
//		super(5); // ���ø����޲εĹ��캯��
		System.out.println("son is running...");
	}
	Son(int x) {
		super(5);
//		super();
		System.out.println("son is running..." + x);
	}
}

class Demo extends Object{
	Demo(){
		super(); // ˼��4�� demoû�м̳У�Ϊʲô����ʹ��super()��
		return;
	}
}