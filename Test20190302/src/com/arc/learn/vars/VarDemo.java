package com.arc.learn.vars;

public class VarDemo {

	public static void main(String[] args) {
		// ����һ������
		// ��������   �������� = ����ֵ
		int age = 180;
		
		byte b = 10;
		
		// �Զ�����ת��
		int sum = b + age ;
		
		// ǿ������ת��
		byte b2 = (byte)age;
		
		System.out.println("age=" + age);
		System.out.println("b2=" + b2);
		
		
	    // byte�� short�� char��������л��Զ�ת��Ϊint���ͣ�Ȼ��������㡣
		byte b3 = 5;
		// byte b4 =  b2 + b3 ; ��������������������б����Զ�����Ϊint���ͣ���int���͸���byte���ͣ����Ͳ�ƥ�����Դ���
		byte b4 = (byte) (b2 + b3);
		
		short s = 100;
		short s2 = 50;
		short s3 = (short) (s + s2);
		
		long l = 99999999999L;
		
		float f = 2.3f;
		float f1 = 50.25f;
		float f2 = f + f1;
	}

}
