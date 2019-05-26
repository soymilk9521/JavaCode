package com.arc.learn.iodemo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {

	// ϵͳ���з�
	private static final String LINE_SEPARATOR = System.getProperty("line.separator");

	public static void main(String[] args) throws IOException {

		testBufferedWriter();

		testBufferedWriter2();

		testBufferedWriter3();
	}

	private static void testBufferedWriter() throws IOException {
		// ����һ���ַ����������buf.txt����������ļ��������򴴽�
		FileWriter fw = new FileWriter("buff.txt");
		// ����һ���ַ�������Ļ�����
		BufferedWriter bw = new BufferedWriter(fw);
		// ʹ���ַ�������write������������д�뻺������
		bw.write("abcddd");
		// ʹ���ַ�������write��������������������д���ļ�
		bw.flush();
		// �رջ�����ͬʱҲ�ر��ַ������
		bw.close();
//		fw.write("abc"); // д��ʧ�ܣ��ַ�������ѹر� 
	}

	private static void testBufferedWriter2() throws IOException {
		// ����һ���ַ����������buf.txt����������ļ��������򴴽�
		FileWriter fw = new FileWriter("buff.txt");
		// ����һ���ַ�������Ļ�����
		BufferedWriter bw = new BufferedWriter(fw);
		// ʹ���ַ�������write������������д�뻺������
		bw.write("abc" + LINE_SEPARATOR + "ddd");
		// ʹ���ַ�������write��������������������д���ļ�
		bw.flush();
		// �رջ�����ͬʱҲ�ر��ַ������
		bw.close();

	}

	private static void testBufferedWriter3() throws IOException {
		// ����һ���ַ����������buf.txt����������ļ��������򴴽�
		FileWriter fw = new FileWriter("buff.txt");
		// ����һ���ַ�������Ļ�����
		BufferedWriter bw = new BufferedWriter(fw);
		// ʹ���ַ�������write������������д�뻺������
		bw.write("abc1");
		// ���һ�����з�
		bw.newLine(); 
		bw.write("abc2");
		// ʹ���ַ�������write��������������������д���ļ�
		bw.flush();
		// �رջ�����ͬʱҲ�ر��ַ������
		bw.close();

	}

}
