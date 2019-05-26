package com.arc.learn.iodemo4;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderDemo {

	public static void main(String[] args) throws IOException {
		testInputStreamReader();
		
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
	}
	

}
