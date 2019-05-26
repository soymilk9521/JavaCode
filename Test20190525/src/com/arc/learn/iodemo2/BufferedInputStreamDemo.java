package com.arc.learn.iodemo2;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStreamDemo {

	public static void main(String[] args) throws IOException {
		testBufferedInputStream2();
	}

	private static void testBufferedInputStream() throws IOException {
		// ����һ���ֽ����������󣬶�ȡһ���ļ�������ļ������ڣ����׳��쳣��
		FileInputStream fis = new FileInputStream("c:\\demo\\a.txt");
		// ����һ��������
		BufferedInputStream bis = new BufferedInputStream(fis);
		// ��ȡ�����ֽڳ���
		int len = 0;
		// ѭ����ȡ
		while ((len = bis.read()) != -1) {
			System.out.println((char)len);
		}
		fis.close();
	}
	
	private static void testBufferedInputStream2() throws IOException {
		// ����һ���ֽ����������󣬶�ȡһ���ļ�������ļ������ڣ����׳��쳣��
		FileInputStream fis = new FileInputStream("c:\\demo\\a.txt");
		// ����һ���������� ͬʱ����ָ�������������鳤��
		BufferedInputStream bis = new BufferedInputStream(fis, 1024);
		// ��ȡ�����ֽڳ���
		int len = 0;
		byte[] buff = new byte[1024];
		// ѭ����ȡ
		while ((len = bis.read(buff)) != -1) {
			System.out.println(new String(buff, 0, len));
		}
		fis.close();
	}
}
