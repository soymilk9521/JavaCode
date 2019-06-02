package com.arc.learn.iodemo4;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class CharSetDemo {

	public static void main(String[] args) throws IOException {
		/**
		 * 1. �ַ���ʹ��ϵͳĬ���ַ��������������ַ���
		 * 2. ת��������ָ���ַ���
		 * 3. �����ַ���
		 * 		GBK��һ������ռ�����ֽ�
		 * 		UTF-8��һ������ռ�����ֽڣ����ֺ���ĸռһ���ֽ�
		 * 
		 * ת������
		 *   Դ����Ŀ�����ֽ����� �����������ı����ݣ�Ϊ�˲�����ݿ���ʹ��ת����
		 *   ��Ҫת���ַ���ʱ������ʹ��ת����
		 */
		
		writeTest4();
//		System.out.println(System.getProperties());
	}

	private static void writeTest() throws IOException {
		// ʹ��Ĭ���ַ��������ܸ����ַ���
		FileWriter fw = new FileWriter("c:\\demo\\write-text.txt");
		fw.write("���");
		fw.close();
	}
	
	private static void writeTest2() throws IOException {
		FileOutputStream fos = new FileOutputStream("c:\\demo\\write-text2.txt");
		OutputStreamWriter osw = new OutputStreamWriter(fos, "GBK");
		osw.write("���");
		osw.close();
	}
	
	private static void writeTest3() throws IOException {
		FileOutputStream fos = new FileOutputStream("c:\\demo\\write-text3.txt");
		// ���Ҫ�����ַ���������ʹ��ת����
		OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
		osw.write("���");
		osw.close();
	}
	
	private static void writeTest4() throws IOException {
		// ���Ҫ�����ַ���������ʹ��ת����
		OutputStreamWriter osw = new OutputStreamWriter(System.out, "GBK");
		osw.write("���");
		osw.close();
	}
	

}
