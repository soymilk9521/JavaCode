package com.arc.learn.iodemo4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class IOSummary {

	public static void main(String[] args) throws IOException {
		/**
		 * IOʹ���ܽᣨ�ĸ���ȷ��
		 * 1. ��ȷԴ��Ŀ��
		 * 		Դ��    InputStream��Reader
		 * 		Ŀ�ģ�OutputStream��Writer
		 * 2. ��ȷ�����Ƿ��Ǵ��ı�
		 * 		�ǣ�  
		 * 			Դ��    Reader
		 * 			Ŀ�ģ�Writer
		 * 		���ǣ�
		 * 			Դ��     InputStream
		 * 			Ŀ�ģ� OutputStream
		 * 3. ��ȷ�������豸��
		 * 		Ӳ�̣�File
		 * 		���̣�System.in
		 * 		�ڴ棺����
		 * 		���磺Socket
		 * 4. ��ȷ�Ƿ�����ǿ����
		 * 		�Ƿ�ʹ�û�����
		 * 		�Ƿ���Ҫ�ֽ������ַ���ת��			
		 * 				
		 */
		
		// ��ϰһ������һ���ļ�
//		testFileToFile();
		// ��ϰ����������¼����Ϣ��д�뵽�ļ��С�
//		testSystemInToFile();
		// ��ϰ�������ļ�������ʾ�ڿ���̨��
		testFileToSystemOut();
	}

	private static void testFileToFile() throws IOException {
		/**
		 * 1. ��ȷԴ��Ŀ��
		 * 		Դ��    InputStream��Reader
		 * 		Ŀ�ģ�OutputStream��Writer
		 * 2. ��ȷ�����Ƿ��Ǵ��ı�
		 * 		�ǣ�  
		 * 			Դ��    Reader
		 * 			Ŀ�ģ�Writer
		 * 3. ��ȷ�������豸��
		 * 		Դ��
		 * 			Ӳ�̣�File
		 * 		Ŀ�ģ�
		 * 			Ӳ�̣�File
		 * 4. ��Ҫ��ǿ������
		 * 		��Ҫ��
		 * 			��ӻ�����
		 */
		BufferedReader br = new BufferedReader(new FileReader("c:\\demo\\a.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("c:\\demo\\aa.txt")); 
//		char[] buf = new char[1024];
//		int len = -1;
//		while((len = fr.read(buf)) != -1) {
//			System.out.println(new String(buf, 0, len));
//			fw.write(buf, 0, len);
//		}
		String line = null;
		while((line = br.readLine()) != null) {
			System.out.println(line);
			bw.write(line);
			bw.newLine();
		}
		br.close();
		bw.close();
		
	}
	
	private static void testSystemInToFile() throws IOException {
		/**
		 * 1. ��ȷԴ��Ŀ��
		 * 		Դ��    InputStream��Reader
		 * 		Ŀ�ģ�OutputStream��Writer
		 * 2. ��ȷ�����Ƿ��Ǵ��ı�
		 * 		�ǣ�  
		 * 			Դ��    Reader
		 * 			Ŀ�ģ�Writer
		 * 3. ��ȷ�������豸��
		 * 		Դ��
		 * 			���̣�System.in
		 * 		Ŀ�ģ�
		 * 			Ӳ�̣�File
		 * 4. ��Ҫ��ǿ������
		 * 		��Ҫ��
		 * 			�Ƿ���Ҫ�ֽ������ַ���ת��		
		 * 			��ӻ�����
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new FileWriter("c:\\demo\\TTT.txt"));
		String line = null;
		while((line = br.readLine()) != null) {
			System.out.println(line);
			if(line.contains("over")) {
				break;
			}
			bw.write(line);
			bw.newLine();
		}
		br.close();
		bw.close();
		
	}

	private static void testFileToSystemOut() throws IOException {
		/**
		 * 1. ��ȷԴ��Ŀ��
		 * 		Դ��    InputStream��Reader
		 * 		Ŀ�ģ�OutputStream��Writer
		 * 2. ��ȷ�����Ƿ��Ǵ��ı�
		 * 		�ǣ�  
		 * 			Դ��    Reader
		 * 			Ŀ�ģ�Writer
		 * 3. ��ȷ�������豸��
		 * 		Դ��
		 * 			Ӳ�̣�File
		 * 		Ŀ�ģ�
		 * 			���̣�System.out
		 * 			
		 * 4. ��Ҫ��ǿ������
		 * 		��Ҫ��
		 * 			�Ƿ���Ҫ�ֽ������ַ���ת��		
		 * 			��ӻ�����
		 */
		
		BufferedReader br = new BufferedReader(new FileReader("c:\\demo\\TTT.txt"));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String line = null;
		while((line = br.readLine()) != null) {
			bw.write(line);
			bw.newLine();
		}
		br.close();
		bw.close();
	}
}
