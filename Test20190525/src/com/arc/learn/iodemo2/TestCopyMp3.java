package com.arc.learn.iodemo2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestCopyMp3 {

	public static void main(String[] args) throws IOException {
		testCopy1();
		testCopy2();
		testCopy3();
	}

	private static void testCopy1() throws IOException {
		// �����ֽ���������������һ���ļ�������ļ������ڣ� ���׳��쳣
		FileInputStream fis = new FileInputStream("c:\\demo\\m.mp3");
		// �����ֽ����������ָ��Ŀ���ļ�������ļ������ڣ� �򴴽�
		FileOutputStream fos = new FileOutputStream("d:\\demo\\m1.mp3");  // �ļ�·��������Ҳ���׳��쳣
		byte[] bs = new byte[1024];
		int len = 0;
		while((len = fis.read(bs)) != -1) {
			fos.write(bs, 0, len);
		}
		fis.close();
		fos.close();
	}
	
	private static void testCopy2() throws IOException {
		// �����ֽ���������������һ���ļ�������ļ������ڣ� ���׳��쳣
		FileInputStream fis = new FileInputStream("c:\\demo\\m.mp3");
		// �����ֽ����������ָ��Ŀ���ļ�������ļ������ڣ� �򴴽�
		FileOutputStream fos = new FileOutputStream("d:\\demo\\m1.mp3");  // �ļ�·��������Ҳ���׳��쳣
		// ����һ���ֽ����黺���������鳤��Ϊ�ļ����ȡ� �����Ƽ�ʹ�ã�
		byte[] bs = new byte[fis.available()]; 
		int len = 0;
		while((len = fis.read(bs)) != -1) {
			fos.write(bs, 0, len);
		}
		fis.close();
		fos.close();
	}
	
	private static void testCopy3() throws IOException {
		// �����ֽ���������������һ���ļ�������ļ������ڣ� ���׳��쳣
		FileInputStream fis = new FileInputStream("c:\\demo\\m.mp3");
		// �����ֽ��������Ļ�����
		BufferedInputStream bis = new BufferedInputStream(fis);
		// �����ֽ����������ָ��Ŀ���ļ�������ļ������ڣ� �򴴽�
		FileOutputStream fos = new FileOutputStream("d:\\demo\\m2.mp3");  // �ļ�·��������Ҳ���׳��쳣
		// �����ֽ���������Ļ�����
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		int ch = -1;
		while((ch = bis.read()) != -1) {
			bos.write(ch);
		}
		bis.close();
		bos.close();
	}


}
