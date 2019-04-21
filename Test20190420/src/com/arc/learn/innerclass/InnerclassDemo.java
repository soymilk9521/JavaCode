package com.arc.learn.innerclass;

public class InnerclassDemo {

	public static void main(String[] args) {
		/**
		 * �ڲ�������ص㣺
		 * 	�ڲ������ֱ�ӷ����ⲿ���Ա������˽�г�Ա��˽�г�Ա������˽�г�Ա������
		 *  �ⲿ�����Ҫ�����ڲ����Ա�������ȴ����ڲ������
		 * 
		 */
		Outer out = new Outer();
		out.method(); // method�����ڲ������ڲ�����󣬲����ʶ����Ա��
		
		// 1. ͨ��������ʽ�����ڲ���ʵ��
		Outer.Inner in = out.getInner();   // ͨ��������ʽ�����ڲ������ͨ���޲εĹ��캯�������ڲ������
		System.out.println(in.num);        // �����ڲ���������
		in.show(); 						   // �����ڲ����к���
		Outer.Inner in2 = out.getInner(9); // ͨ��������ʽ�����ڲ������,ͨ���вεĹ��캯�������ڲ������
		System.out.println(in2.num);       // �����ڲ���������
		in2.show();						   // �����ڲ����к���
		
		// 2. ֱ�Ӵ����ڲ������
//		Outer.Inner in3 = out.new Inner();
		Outer.Inner in4 = new Outer().new Inner();
		
		// 3. ��̬�ڲ���
//		Outer.Inner in5 = new Outer.Inner();
		
		Outer.Inner in6 = new Outer().new Inner();
	}
	
}


class Outer {
	
	int num = 3;
	private int num2 = 4;
	
	public void method() {
		Inner in = new Inner(); // �����ڲ��࣬ �����ڲ����Ա��
		System.out.println(in.num);
		in.show();
	}
	
	public Inner getInner() { // ����ڲ������
		return new Inner();
	}
	
	public Inner getInner(int num) {
		return new Inner(num);
	}
	
	
	class Inner { // �ڲ���
		int num = 5;
		public Inner() { // �ڲ����޲ι��캯��

		}
		public Inner(int num) { // �ڲ��๹�캯������
			this.num = num;
		}
		void show() {
			System.out.println("Inner class showing ..." + num); // �����ڲ���num����
			System.out.println("Inner class showing ..." + num2);// �����ⲿ��˽������
		}
	}
}