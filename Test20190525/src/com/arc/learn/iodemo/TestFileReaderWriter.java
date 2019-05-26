package com.arc.learn.iodemo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestFileReaderWriter {

	/**
	 * ��C��һ���ļ����Ƶ�D��
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
//		testFileReaderWriter();
		testFileReaderWriter2();
	}

	/**
	 * �����ļ�����һ
	 * @throws IOException
	 */
	public static void testFileReaderWriter() throws IOException {
		// ��ȡһ�������ļ���ʹ���ַ����������ļ������
		FileReader fr = new FileReader("C:\\demo\\a.txt"); // ���û�ҵ��ļ������׳��쳣
		
		// ����һ��Ŀ���ļ���ʹ���ַ���������������ַ�д��Ŀ���ļ�
		FileWriter fw = new FileWriter("D:\\demo\\a.txt"); // ���û�и��ļ����򴴽�������и��ļ��򸲸ǡ�
//		FileWriter fw = new FileWriter("D:\\demo\\a.txt",true); // ���û�и��ļ����򴴽�������и��ļ��������ӡ�
		
		// ����������
		char[] buf = new char[1024];
		
		int len = 0;
		// ѭ����д
		while((len = fr.read(buf)) != -1 ) {
			System.out.println(new String(buf, 0 , len));
			fw.write(buf, 0, len);
		}
		// �ر�����Դ
		fr.close();
		fw.close();
	}
	
	/**
	 * �����ļ�������(���쳣����)
	 */
	public static void testFileReaderWriter2() {
		FileReader fr = null;
		FileWriter fw = null;
		
		try {
			// ��ȡһ�������ļ���ʹ���ַ����������ļ������
			fr = new FileReader("C:\\demo\\a.txt");
			// ����һ��Ŀ���ļ���ʹ���ַ���������������ַ�д��Ŀ���ļ�
			fw = new FileWriter("D:\\demo\\a.txt"); 
			// ����������
			char[] buf = new char[1024];
			int len = 0;
			// ѭ����д
			while((len = fr.read(buf)) != -1 ) {
				System.out.println(new String(buf, 0 , len));
				fw.write(buf, 0, len);
			}
		} catch (FileNotFoundException e) {
			System.out.println("�ļ�������");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("�ļ���ȡʧ��");
			e.printStackTrace();
		}finally {
			try {
				if (fr != null) {
					fr.close();
				}
				if (fw != null) {
					fw.close();
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
