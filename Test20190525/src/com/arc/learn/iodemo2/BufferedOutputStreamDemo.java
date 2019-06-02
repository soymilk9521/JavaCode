package com.arc.learn.iodemo2;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamDemo {

	public static void main(String[] args) throws IOException {
		testBufferOutputStream2();
	}

	private static void testBufferOutputStream() throws IOException {
		// ����һ���ֽ���������󣬲�����һ���ļ��� ����ļ��������򴴽�
		FileOutputStream fos = new FileOutputStream("c:\\demo\\buff.txt");
		// ����һ���ֽ�������Ļ�����
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		bos.write('a');// дһ���ֽ�
		bos.write(98);// дһ���ֽ�
		bos.write("defj".getBytes()); // дһ���ֽ�����
		bos.close();
	}
	
	private static void testBufferOutputStream2() throws IOException {
		// ����һ���ֽ���������󣬲�����һ���ļ��� ����ļ��������򴴽�
		FileOutputStream fos = new FileOutputStream("c:\\demo\\buff.txt");
		// ����һ���ֽ�������Ļ�����, ͬʱ����֪�������������鳤��
		BufferedOutputStream bos = new BufferedOutputStream(fos, 1024);
		bos.write('a');// дһ���ֽ�
		bos.write(98);// дһ���ֽ�
		bos.write("defj".getBytes()); // дһ���ֽ�����
		bos.close();
	}

}
