package com.arc.learn.classesdemo;

import java.util.Properties;
import java.util.Set;

public class SystemDemo {

	public static void main(String[] args) {
		/**
		 * System:���е����Ժͷ������Ǿ�̬��
		 * ���÷�����
		 * 	long currentTimeMillis() ���ص�ǰʱ��ĺ�����
		 *  Properties getProperties() ��ȡϵͳ������Ϣ
		 */
		
		long time = System.currentTimeMillis(); // ϵͳ��ǰʱ���������1970-01-01��
		System.out.println(time);
		
		Properties prop = System.getProperties(); // ϵͳ����
		Set<String> set = prop.stringPropertyNames();
		for(String key : set) {
			String value =  prop.getProperty(key);
			System.out.println(key + "=" + value);
		}
		
		String separator = System.getProperty("line.separator"); // ��ȡ�ָ�����linux �� \n , windows:\r\n
		System.out.println("hello " + separator + "world");
		String s = System.getProperty("path.separator");
		System.out.println(s);
		
	}

}
