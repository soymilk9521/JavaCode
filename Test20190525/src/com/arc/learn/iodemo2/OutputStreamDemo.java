package com.arc.learn.iodemo2;

import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamDemo {

	public static void main(String[] args) throws IOException {
		/**
		 * OutputStream 
		 * 		|-- FileOutputStream 
		 * 
		 */
		testFileOutputStream();
	}

	public static void testFileOutputStream() throws IOException {
		// �����ֽ���������󡣹���һ���ļ�������ļ������ڣ��򴴽���
		FileOutputStream fos = new FileOutputStream("c:\\demo\\b.txt");
		// д����
		fos.write('B'); // дһ���ֽ�
		fos.write(65);  // дһ���ֽ�
		fos.write("BGM".getBytes()); // дһ���ֽ�����

//		fos.flush();// �����κδ���
		fos.close();
	}

}
