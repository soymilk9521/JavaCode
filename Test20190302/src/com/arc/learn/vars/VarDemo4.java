package com.arc.learn.vars;

public class VarDemo4 {
	public static void main(String[] args) {
		// ���ͼ�����Ľ����������
		int a = 1256/1000*1000;
		System.out.println(a);
		
		System.out.println("5+5="+5+5);
		/*
		 * b += 3
		 * b = b + 3;    
		 * b -= 3;
		 * b = b -3;
		 */
		
		int b = 3;
		b += 2;
		System.out.println(b);
		
		byte c = 4;
		c+=2;   // += �����б���������byte����ֱ�ӵļ����㲻����
		//c = c + 2; ��������Ϊint���ͣ���int���͸�ֵ��byte���ͣ����Ͳ�ƥ�䱨��
		System.out.println(c);
		
	}
}
