package com.arc.learn.iodemo4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class OutputStreamWriterDemo {

	public static void main(String[] args) throws IOException {
//		testOutputStreamWriter();
//		testOutputStreamWriter2();
//		testOutputStreamWriter3();
//		testOutputStreamWriter4();
		testOutputStreamWriter5();
	}

	private static void testOutputStreamWriter() throws IOException {
		// �ֽ���
		InputStream in = System.in;
		// ת������ �ֽ� to �ַ�
		InputStreamReader isr = new InputStreamReader(in);
		// ������
		BufferedReader br = new BufferedReader(isr);
		// �ֽ���
		OutputStream os = System.out;
		// ת�������ַ� to �ֽ�
		OutputStreamWriter osr = new OutputStreamWriter(os);
		// ������
		BufferedWriter bw = new BufferedWriter(osr);
		String line = null;
		while((line=br.readLine()) != null) {
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		bw.close();
		br.close();
	}
	
	
	/**
	 * ������¼�������ڿ���̨���
	 * @throws IOException
	 */
	private static void testOutputStreamWriter2() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String line = null;
		while((line=br.readLine()) != null) {
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		bw.close();
		br.close();
	}
	
	/**
	 * ������¼������д���ļ�
	 * @throws IOException
	 */
	private static void testOutputStreamWriter3() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("c:\\demo\\writer.txt")));
		String line = null;
		while((line=br.readLine()) != null) {
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		bw.close();
		br.close();
	}
	
	/**
	 * ���ı��ļ������ڿ���̨���
	 * @throws IOException
	 */
	private static void testOutputStreamWriter4() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("c:\\demo\\writer.txt")));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String line = null;
		while((line=br.readLine()) != null) {
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		bw.close();
		br.close();
	}

	/**
	 * ���ı��ļ������ڿ���̨���
	 * @throws IOException
	 */
	private static void testOutputStreamWriter5() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("c:\\demo\\writer.txt")));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("c:\\demo\\writer2.txt")));
		String line = null;
		while((line=br.readLine()) != null) {
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		bw.close();
		br.close();
	}

}
