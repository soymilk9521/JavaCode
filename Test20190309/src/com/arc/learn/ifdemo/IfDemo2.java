package com.arc.learn.ifdemo;

/**
 * @author kr
 *
 */
public class IfDemo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * if���ڶ��ָ�ʽ :
		 * if���������ʽ�� { 
		 * 	ִ����� 1
		 * }else {
		 * 	ִ�����2
		 * }
		 */
		int x = 2;
		// if�����Ʒ�Χline22~26����Ҵ����Ž���
		if(x>1) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
		// ��Ԫ�����������if else���ļ�д��ʽ
		// ����֮�������
		// ��Ԫ����������з��ؽ��
		String c = (x>1)? "yes": "no";
		System.out.println(c);
 	}

}
