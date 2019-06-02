package com.arc.learn.iodemo3;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

public class SystemInDemo {

	public static void main(String[] args) throws IOException {
//		testSystemIn();
//		testSystemIn2();
//		testSystemIn3();
//		testSystemIn4();
//		
		System.out.println((int)'\r');
		System.out.println((int)'\n');
	}

	private static void testSystemIn() throws IOException {
		// ��ȡ����̨�����ֽ���
		InputStream is = System.in;
		// ��ȡ����̨�����һ���ֽ�
		int ch = is.read(); // read�����������ģ������ȡ����������ȴ�, ���᷵��-1
		System.out.println(ch);
		int ch2 = is.read();
		System.out.println(ch2);
		int ch3 = is.read();
		System.out.println(ch3);
		int ch4 = is.read();
		System.out.println(ch4);

		int ch5 = is.read();
		System.out.println(ch5);
		
		// ����Ҫ�ر���
//		is.close();
//		is = System.in; // ���������رգ����׳��쳣
//		is.read();
	}
	
	private static void testSystemIn2() throws IOException {
		// ����̨����
		InputStream is = System.in; 
		int ch = 0;
		// ѭ���ӿ���̨��ȡ�����һ���ֽ�
		while((ch=is.read()) != -1) { // read�����������ģ������ȡ����������ȴ�, ���᷵��-1
			System.out.println(ch);
		}
	}
	
	private static void testSystemIn3() throws IOException {
		// ����̨����
		InputStream is = System.in; 
		// ��ȡ����
		int len = 0;
		byte[] buff = new byte[10];
		// ѭ���ӿ���̨��ȡ�����һ���ֽ�
		while((len=is.read(buff)) != -1) { // read�����������ģ������ȡ����������ȴ�, ���᷵��-1
			System.out.println(new String(buff, 0, len));
		}
	}
	
	private static void testSystemIn4() throws IOException {
		// ����̨����
		InputStream is = System.in; 
		BufferedInputStream bis = new BufferedInputStream(is);
		// ��ȡ����
		int len = 0;
		byte[] buff = new byte[10];
		// ѭ���ӿ���̨��ȡ�����һ���ֽ�
		while((len=bis.read(buff)) != -1) { // read�����������ģ������ȡ����������ȴ�, ���᷵��-1
			System.out.println(new String(buff, 0, len));
		}
	}
	

}
