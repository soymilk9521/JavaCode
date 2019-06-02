package com.arc.learn.iodemo;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	/**
	 * д�����ݵ��ļ���
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

//		testFileWriter();
		
		testFileWriter2();
		
	}

	private static void testFileWriter() throws IOException {
		// ���demo.txt�ļ������ڣ����Զ������� ���demo.txt�ļ����ڣ����串��
		FileWriter fw = new FileWriter("d:\\demo.txt");
		// д�����ݣ�������д�뵽��ʱ�洢��������
		fw.write("abc1");
		fw.write("abc2");
		fw.write("\r\nabc3"); // ����
		// ˢ�»�������������������д���ļ�
//		fw.flush();
		// ��ˢ�»�������ر������
		fw.close();
		// ���رպ󣬲��ɼ�������
		// fw.write("exception");
	}
	
	private static void testFileWriter2() throws IOException {
		// ���demo.txt�ļ������ڣ����Զ����������demo.txt�ļ����ڣ���������ļ�����ӣ���д��
		FileWriter fw = new FileWriter("d:\\demo.txt", true);
		// д�����ݣ�������д�뵽��ʱ�洢��������
		fw.write("abc1");
		fw.write("abc2");
		fw.write("\r\nabc3"); // ����
		// ˢ�»�������������������д���ļ�
		fw.flush();
		// ��ˢ�»�������ر������
		fw.close();
	}

}
