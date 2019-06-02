package com.arc.learn.iodemo2;

import java.io.FileInputStream;
import java.io.IOException;

public class InputStreamDemo {

	public static void main(String[] args) throws IOException {
		/**
		 * InputStream 
		 * 		|-- FileInputStream
		 */
//		testFileInputStream();
//		testFileInputStream2();
//		testFileInputStream3();
//		testFileInputStream4();
		testFileInputStream5();
	}

	private static void testFileInputStream() throws IOException {
		// ����һ���ֽ����������󣬶�ȡһ���ļ�������ļ������ڣ����׳��쳣��
		FileInputStream fis = new FileInputStream("c:\\demo\\b.txt");
		// ��ȡһ���ֽ�
		int b = fis.read();
		System.out.println((char)b);
		int b1 = fis.read();
		System.out.println(b1);
		int b2 = fis.read();
		System.out.println(b2);
		int b3 = fis.read();
		System.out.println(b3);
		int b4 = fis.read();
		System.out.println(b4); // �����ȡ�������ݷ���-1
		fis.close();
	}

	private static void testFileInputStream2() throws IOException {
		// ����һ���ֽ����������󣬶�ȡһ���ļ�������ļ������ڣ����׳��쳣��
		FileInputStream fis = new FileInputStream("c:\\demo\\b.txt");
		// ѭ����ȡ
		int b = -1;
		while ((b = fis.read()) != -1) {
			System.out.println(b);
		}
		fis.close();
	}

	private static void testFileInputStream3() throws IOException {
		// ����һ���ֽ����������󣬶�ȡһ���ļ�������ļ������ڣ����׳��쳣��
		FileInputStream fis = new FileInputStream("c:\\demo\\b.txt");
		// ����һ��������
		byte[] buf = new byte[3];
		// ��ȡ�����ֽڳ���
		int len = fis.read(buf);
		System.out.println(len + ":" + new String(buf));
		int len2 = fis.read(buf);
		System.out.println(len2 + ":" + new String(buf));
//		System.out.println(len2 + ":" + new String(buf,0, len2));
		int len3 = fis.read(buf);
		System.out.println(len3 + ":" + new String(buf)); // �����ȡ�������ݷ���-1
		fis.close();
	}

	private static void testFileInputStream4() throws IOException {
		// ����һ���ֽ����������󣬶�ȡһ���ļ�������ļ������ڣ����׳��쳣��
		FileInputStream fis = new FileInputStream("c:\\demo\\b.txt");
		// ����һ��������
		byte[] buf = new byte[3];
		// ��ȡ�����ֽڳ���
		int len = 0;
		// ѭ����ȡ
		while ((len = fis.read(buf)) != -1) {
			System.out.println(len + ":" + new String(buf, 0, len));
		}
		fis.close();
	}

	private static void testFileInputStream5() throws IOException {
		// ����һ���ֽ����������󣬶�ȡһ���ļ�������ļ������ڣ����׳��쳣��
		FileInputStream fis = new FileInputStream("c:\\demo\\b.txt");
		// �������ȡ���ļ����ֽڸ���
		System.out.println(fis.available());
	}
}
