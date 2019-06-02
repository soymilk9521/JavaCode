package com.arc.learn.iodemo;

import java.io.FileReader;
import java.io.IOException;

import sun.font.TrueTypeFont;

public class FileReaderDemo {

	/**
	 * ���󣺶�ȡһ���ļ�������ȡ�����ַ�д������̨
	 * 
	 * @param args
	 * @throws IOExceptionException
	 */
	public static void main(String[] args) throws IOException {

//		testFileReader();

//		testFileReader2();
//
//		testFileReader3();
//
		testFileReader4();
	}

	private static void testFileReader() throws IOException {
		// ����һ���ַ����Ķ�ȡ�������ļ�������ļ������ڣ����׳��쳣
		FileReader fr = new FileReader("demo.txt");
		// ��ȡһ���ַ�, ���ظ��ַ�����ֵ��ch�����ȡ�����ַ�
		int ch = fr.read(); 
		System.out.println(ch);
		ch = fr.read();
		// ������ǿתΪ�ַ�
		System.out.println((char) ch);
		ch = fr.read();
		System.out.println((char) ch);
		ch = fr.read();
		// -1������-1��ȡ���
		System.out.println(ch); 
		// �ر�����Դ
		fr.close();
	}

	private static void testFileReader2() throws IOException {
		// ����һ���ַ����Ķ�ȡ�������ļ�������ļ������ڣ����׳��쳣
		FileReader fr = new FileReader("demo.txt");
		int ch = 0;
		// ѭ����ȡ��ֻҪ��ȡ���Ĳ���-1�ͼ���ѭ��
		while ((ch = fr.read()) != -1) { 
			System.out.println((char) ch);
		}
		// �ر�����Դ
		fr.close();
	}

	private static void testFileReader3() throws IOException {
		// ����һ���ַ����Ķ�ȡ�������ļ�������ļ������ڣ����׳��쳣
		FileReader fr = new FileReader("demo.txt");
		// ����һ���ַ����黺����
		char[] buf = new char[3];
		// ����ȡ�������ݴ洢�������У�num��ʾ��ȡ�����ַ�����
		int num = fr.read(buf); 
		// ���ַ�����ת��Ϊ�ַ������
		System.out.println(num + ":" + new String(buf)); 
		num = fr.read(buf); 
		System.out.println(num + ":" + new String(buf, 0, num)); // 0 count
		num = fr.read(buf); 
		System.out.println(num);
		System.out.println(num + ":" + (num !=-1 ? new String(buf) : ""));// false ? ���ʽ1�����ʽ2
		// �ر�����Դ
		fr.close();
	}

	private static void testFileReader4() throws IOException {
		// ����һ���ַ����Ķ�ȡ�������ļ�������ļ������ڣ����׳��쳣
		FileReader fr = new FileReader("demo.txt");
		// ����һ���ַ����黺����
		char[] buf = new char[1024*2];
		// �������len�����ȡ���ַ�����
		int len = 0;
		// ѭ����ȡ
		while ((len = fr.read(buf)) != -1) {
			// ���ַ�����ת��Ϊ�ַ������
			System.out.println(len + ":" + new String(buf, 0, len));
		}
		fr.close();
	}

}
