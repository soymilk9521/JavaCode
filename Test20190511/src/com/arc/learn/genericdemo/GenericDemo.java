package com.arc.learn.genericdemo;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericDemo {

	public static void main(String[] args) {
		
		/**
		 * ���ͣ�Java1.5���ֵ�һ�ְ�ȫ����
		 * 	�ô��� �����ڼ������
		 * 		 �����ڽ�������ת���쳣
		 *  ʲôʱ��ʹ�ã�
		 * 
		 */
		
		// TODO ��ӷ���
		ArrayList al = new ArrayList();
		al.add("abc1");
		al.add("abc2");
		al.add("abc3");
//		al.add(new Integer(1));
		Iterator it = al.iterator();
		while(it.hasNext()) {
			String str = (String)it.next();
			System.out.println(str);
		}
		
	}

}
