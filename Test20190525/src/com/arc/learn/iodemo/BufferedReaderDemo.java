package com.arc.learn.iodemo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {

	public static void main(String[] args) throws IOException {
		/**
		 * BufferedReader
		 * 	read()�������˸����е�read()�������ӻ������ж�ȡ����
		 *  readLine()���ӻ������ж�ȡһ�����ݣ��������з���\n��,�س�����\r����ȡ��һ��
		 */
		
//		testBufferedFileReader();
		
//		testBufferedFileReader2();
		
		testBufferedFileReader3();
		
	}

	private static void testBufferedFileReader() throws IOException {
		// �����ַ���ȡ��������һ���ļ�������ļ����������׳��쳣
		FileReader fr = new FileReader("c:\\demo\\a.txt");
		// �����ַ���ȡ���Ļ�����
		BufferedReader br = new BufferedReader(fr);
		// ����������Ƿ�׼���ñ���ȡ
		System.out.println(br.ready()); 
		
		String line = br.readLine();// ��ȡһ��
		System.out.println(line);
		
		String line2 = br.readLine();
		System.out.println(line2);
		
		String line3 = br.readLine();
		System.out.println(line3);
		
		String line4 = br.readLine();
		System.out.println(line4);
		
		String line5 = br.readLine();
		System.out.println(line5);
		
		line = br.readLine();// null
		System.out.println(line);
		
		br.close();
	}
	
	
	private static void testBufferedFileReader2() throws IOException {
		// �����ַ���ȡ��������һ���ļ�������ļ����������׳��쳣
		FileReader fr = new FileReader("c:\\demo\\a.txt");
		// �����ַ���ȡ���Ļ�����
		BufferedReader br = new BufferedReader(fr);
		String line = null;
		// ѭ����ȡ
		while((line = br.readLine()) != null) {
			System.out.println(line);
		}
	}
	
	private static void testBufferedFileReader3() throws IOException {
		// �����ַ���ȡ��������һ���ļ�������ļ����������׳��쳣
		FileReader fr = new FileReader("c:\\demo\\a.txt");
		// �����ַ���ȡ���Ļ�����
		BufferedReader br = new BufferedReader(fr);
		// ����������Ƿ�׼���ñ���ȡ
		System.out.println(br.ready()); 
		while(br.ready()) {
			String line = br.readLine();// ��ȡһ��
			System.out.println(line);
		}
		br.close();
	}
	
}
