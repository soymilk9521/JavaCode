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
		// 字节流
		InputStream in = System.in;
		// 转换流： 字节 to 字符
		InputStreamReader isr = new InputStreamReader(in);
		// 缓冲流
		BufferedReader br = new BufferedReader(isr);
		// 字节流
		OutputStream os = System.out;
		// 转换流：字符 to 字节
		OutputStreamWriter osr = new OutputStreamWriter(os);
		// 缓冲区
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
	 * 将键盘录入数据在控制台输出
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
	 * 将键盘录入数据写入文件
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
	 * 将文本文件内容在控制台输出
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
	 * 将文本文件内容在控制台输出
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
