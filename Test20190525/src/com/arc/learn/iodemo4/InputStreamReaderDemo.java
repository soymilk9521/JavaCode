package com.arc.learn.iodemo4;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputStreamReaderDemo {

	public static void main(String[] args) throws IOException {
//		testInputStreamReader();
		testInputStreamReader2();
	}

	private static void testInputStreamReader() throws FileNotFoundException, IOException {
		// ����һ���ֽ��������� ����һ���ļ�������ļ����������׳��쳣
		FileInputStream fis = new FileInputStream("c:\\demo\\a.txt");
		// ���ֽ���ת��Ϊ�ַ���
		InputStreamReader isr = new InputStreamReader(fis);
		// ����һ���ַ����Ļ�����
		BufferedReader br = new BufferedReader(isr);
		String line = null;
		// ѭ����ȡһ��
		while((line=br.readLine()) != null) {
			System.out.println(line);
		}
		br.close();
	}
	
	/**
	 * �ֽ������ַ�������
	 * @throws IOException
	 */
	private static void testInputStreamReader2() throws IOException {
		// �ֽ���
		InputStream is = System.in;
//		int ch = is.read(); // �ֽ���һ��ֻ��һ���ֽڣ������������ֽ����Զ�����
//		System.out.println(ch);
//		ch = is.read();
//		System.out.println(ch);
//		ch = is.read();
//		System.out.println(ch);
//		ch = is.read();
//		System.out.println(ch);
		
		// ת����:���ֽ�ת�����ַ�
		InputStreamReader isr = new InputStreamReader(is);
		int ch = isr.read(); // �ַ���һ�ζ�һ���ַ�����ʹ�����������ֽڣ�Ҳֻ��һ��
//		System.out.println((char)ch);
		
//		// �ַ���
		BufferedReader br = new BufferedReader(isr);
		String line = null;
//		// ѭ����ȡһ��
		while((line=br.readLine()) != null) {
			if(line.contains("over")) {
				break;
			}
			System.out.println(line);
		}
	}
}
