package com.arc.learn.polydemo3;

public class PolyDemo3 {
	public static void main(String[] args) {
		/**
		 * 1. ��̬�г�Ա�������ص㣺
		 * 		����ʱ���ο������ͱ������������Ƿ��б����õĳ�Ա�������У�����ɹ���û�У�����ʧ�ܡ�
		 * 		����ʱ���ο������ͱ������������Ƿ��б����õĳ�Ա�����������и��������еĳ�Ա������
		 * 		��˵����������ж��ο���ߡ�
		 * 2. ��̬�г�Ա�������ص㣨�Ǿ�̬����
		 * 		����ʱ���ο������ͱ������������Ƿ��б����õĳ�Ա�������У�����ɹ���û�У�����ʧ�ܡ�
		 * 		����ʱ���ο��������������Ƿ��б����õĺ�����
		 * 		��˵������ο���ߣ����вο��ұߡ�
		 * 3. ��̬�о�̬�������ص㣺
		 * 		����ʱ���ο������ͱ������������Ƿ��б����õľ�̬������
		 * 		����ʱ���ο������ͱ������������Ƿ��б����õľ�̬������
		 * 		��˵����������ж��ο���ߡ�
		 * 		��ʵ��̬�������������ڶ���ֱ�����������ʡ�
		 */
		Father f = new Son(); // ����ת�����������Ա
		System.out.println(f.num);
//		System.out.println(f.num2); // �޷����������Ա����
		f.show();
//		f.show2(); // �޷������������г�Ա����
		f.method();
//		f.method2(); // �޷����������еľ�̬����
		Father.method();
		Son.method();
		
		Father f1 = new Father();
		Father f2 = new Father();
		System.out.println(f1.number);
		System.out.println(f2.number);
		f1.number = 2;
		System.out.println(f1.number);
		System.out.println(f2.number);
				
		
	}
}


class Father {
	int num = 8;
	static int number = 10;
	void show() {
		System.out.println("Father is showing ...");
	}
	static void method() {
		System.out.println("Father method ...");
	}
}

class Son extends Father {
	int num = 9;
	int num2 = 10; // �����޷�����
	void show() {
		System.out.println("Son is showing ...");
	}
	void show2() {
		System.out.println("Son is show2ing ...");
	}
	
	static void method() {
		System.out.println("Son method ...");
	}
	
	static void method2() {
		System.out.println("Son method2 ...");
	}
}