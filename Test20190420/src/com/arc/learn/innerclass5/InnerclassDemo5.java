package com.arc.learn.innerclass5;

public class InnerclassDemo5 {

	public static void main(String[] args) {

	}

}

/**
 * ����һ���ӿڣ������������󷽷�
 *
 */
interface Demo {
	public abstract void show();
	void show2();
}

/**
 * ����һ���ⲿ��
 *
 */
class Outer {
	/**
	 * ����һ���ڲ��࣬ʵ�ֽӿڲ�ʵ�ֽӿ��еĳ��󷽷�
	 *
	 */
	class Inner implements Demo {

		@Override
		public void show() {
			System.out.println("Inner is showing ...");
		}

		@Override
		public void show2() {
			System.out.println("Inner is show2ing ...");
		}
	}
	
	void method() {
		// �����ڲ������
		Inner in = new Inner();
		// �����ڲ��෽��
		in.show();
		in.show2();
		
		// �����ڲ��෽ʽ���÷���
		Demo demo = new Demo() {
			@Override
			public void show() {
				System.out.println("Demo is showing ...");
			}
			@Override
			public void show2() {
				System.out.println("Demo is show2ing ...");
			}
			public void show3() {
				System.out.println("Demo is show3ing ...");
			}
		};
		
		// ͨ���ӿڶ������
		demo.show();
		demo.show2();
//		demo.show3();
	}
}