package com.arc.learn.iodemo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo2 {

	public static void main(String[] args) throws IOException {
//		testWrite();
//		testRead();
//		testRead2();
//		testRead3();
//		testRead4();
//		testBufferWriter();
//		testBufferReader();
		testCopy();
	}

	private static void testRead() throws IOException {
		// FileReader输入流，关联一个文件，如果文件不存在，则抛异常。
		FileReader fr = new FileReader("c:\\demo\\file-writer.txt");
		int ch = fr.read();
		System.out.println(ch);
		System.out.println((char)ch);
		ch = fr.read();
		System.out.println(ch);
		ch = fr.read();
		System.out.println(ch);
		fr.close();
	}
	
	private static void testRead2() throws IOException {
		// FileReader输入流，关联一个文件，如果文件不存在，则抛异常。
		FileReader fr = new FileReader("c:\\demo\\file-writer.txt");
		int ch = -1;
		while((ch = fr.read()) != -1) {
			System.out.println((char)ch);
		}
		fr.close();
	}
	
	private static void testRead3() throws IOException {
		// FileReader输入流，关联一个文件，如果文件不存在，则抛异常。
		FileReader fr = new FileReader("c:\\demo\\file-writer.txt");
		// 缓冲区
		char[] buff = new char[1024];
		int len = fr.read(buff);
		System.out.println(len);
		System.out.println(new String(buff));
		len = fr.read(buff);
		System.out.println(len);
		System.out.println(new String(buff));
		len = fr.read(buff);
		System.out.println(len);
		System.out.println(new String(buff, 0 , len));
		fr.close();
	}
	
	private static void testRead4() throws IOException {
		// FileReader输入流，关联一个文件，如果文件不存在，则抛异常。
		FileReader fr = new FileReader("c:\\demo\\file-writer.txt");
		char[] buff = new char[3];
		int len = -1;
		while((len = fr.read(buff))!= -1) {
			System.out.println(new String(buff, 0, len));
		}
		fr.close();
	}
	
	
	private static void testWrite() throws IOException {
		// FileWriter输出流，关联一个文件，如果文件不存在，则创建。
		FileWriter fw = new FileWriter("c:\\demo\\file-writer.txt");
		fw.write("abc");
		fw.write("啊啊啊");
		fw.write('d');
//		fw.flush();
		fw.close();
	}
	
	private static void  testBufferWriter() throws IOException {
		FileWriter fw = new FileWriter("c:\\demo\\file-writer.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		String lineSeparator =  System.getProperty("line.separator");
		bw.write("asdfasdfsfd" + lineSeparator);
		bw.write("asdfasdfsfd");
		bw.newLine();
		bw.write("asdfasdfsfd");
//		bw.flush();
		bw.close();
	}
	

	private static void testBufferReader() throws IOException {
		FileReader fr = new FileReader("c:\\demo\\file-writer.txt");
		BufferedReader br = new BufferedReader(fr);
//		String line = br.readLine();
//		System.out.println(line);
//		line = br.readLine();
//		System.out.println(line);
//		line = br.readLine();
//		System.out.println(line);
//		line = br.readLine();
//		System.out.println(line);
		String line = null;
		while((line = br.readLine()) != null) {
			System.out.println(line);
		}
		br.close();
	}
	
	
	/**
	 * 练习：复制文件
	 * 源：c:\\demo\\file-writer.txt
	 * 目的地：d:\\demo\\file-writer.txt
	 * @throws IOException 
	 */
	
	public static void testCopy() throws IOException {
		FileReader fr = new FileReader("c:\\demo\\file-writer.txt");
		BufferedReader br = new BufferedReader(fr);
		FileWriter fw = new FileWriter("d:\\demo\\file-writer.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		String line = null;
		while ((line = br.readLine()) != null) {
			bw.write(line);
			bw.newLine();
		}
		br.close();
		bw.close();
		
	}

}
