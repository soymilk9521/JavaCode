package com.arc.learn.innerclass4;

public class InnerclassDemo4 {
	public static void main(String[] args) {
		/**
		 * �����ڲ��ࣺ
		 *  	�����ڲ�������ڲ���ļ�д��
		 * �����ڲ���ǰ�᣺
		 *  	�ڲ������̳����ʵ��һ���ӿڣ�
		 */
		
//		new Outer().method();
		Outer outer = new Outer();
//		Outer.Inner in = outer.new Inner();
//		in.show();
//		
//		Outer.Inner2 in3 = outer.new Inner2();
//		in3.start();
		
		// �����Ȳ���ķ�ʽ�̳�һ��������
		new Demo() {
			@Override
			void show() {
				System.out.println("demo show is running");
				
			}
		}.show();
		
		// �����Ȳ���ķ�ʽʵ�ֽӿ�
		new USB() {
			@Override
			public void start() {
				System.out.println("USB start is running ...");
			}
			
		}.start();
		
		new DemoA() {
			
			@Override
			public void show() {
				System.out.println("DDDD");
			}
		}.show();
		
	}
}

interface USB {
	public abstract void start();
}

/**
 * 
 * ����һ�������࣬����һ�����󷽷�
 * 
 */
abstract class Demo {
	abstract void show();
}

interface DemoA {
	void show();
}


/**
 * ����һ���ⲿ��
 *
 */
class Outer {
	int num = 9;
	/**
	 * ����һ���ڲ��࣬���̳г����࣬ʵ������󷽷�
	 *
	 */
	class Inner extends Demo{
		@Override
		void show() {
			System.out.println("Inner is showing ..." + num);
		}
	}
	
	class Inner2 implements USB {
		@Override
		public void start() {
			System.out.println("Inner2 start is running ...");
		}
		
	}
	
	void method() {
		// ��ͳ��ʽ
		new Inner().show();
		
		// �����ڲ���
		new Demo() {
			@Override
			void show() {
				System.out.println("Demo is showing ..." + num);
			}
		}.show();
	}
	
}




