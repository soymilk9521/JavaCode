package com.arc.learn.switchdemo;

public class SwitchTest {

	public static void main(String[] args) {
		/*
		 switch���ʵ������ת����
		 1 ... ����һ
		 2 ... ���ڶ�
		 3 ... ������
		 4 ... ������
		 5 ... ������
		 6 ... ������
		 7 ... ������
		 */
		int x = 3;
		switch(x) {
		case 1:
			System.out.println("����һ");
			break;
		case 2:
			System.out.println("���ڶ�");
			break;
		case 3:
			System.out.println("������");
			break;
		case 4:
			System.out.println("������");
			break;
		case 5:
			System.out.println("������");
			break;
		case 6:
			System.out.println("������");
			break;
		case 7:
			System.out.println("������");
			break;
		default:
			System.out.println("��֪��");
		}
	}

}
