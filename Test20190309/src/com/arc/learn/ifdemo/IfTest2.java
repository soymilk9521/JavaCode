package com.arc.learn.ifdemo;

public class IfTest2 {

	public static void main(String[] args) {
		/*
		 * if���ʵ���·��뼾��ת����
		 * 12 ~ 2��  ... ����
		 * 3 ~ 5��    ... ����
		 * 6 ~ 8��    ... �ļ�
		 * 9~11��    ... �＾
		 */
		int month = 6;
		if(month >12 || month < 1) {
			System.out.println("��֪��");
		}else {
			if(month>=3 && month<=5) {
				System.out.println("����");
			}else if(month >=6 && month <=8) {
				System.out.println("�ļ�");
			}else if(month >=9 && month <=11) {
				System.out.println("�＾");
			}else {
				System.out.println("����");
			}
		}
	}

}
