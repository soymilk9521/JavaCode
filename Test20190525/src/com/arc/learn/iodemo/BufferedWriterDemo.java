package com.arc.learn.iodemo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {

	// 系统换行符
	private static final String LINE_SEPARATOR = System.getProperty("line.separator");

	public static void main(String[] args) throws IOException {

		testBufferedWriter();

		testBufferedWriter2();

		testBufferedWriter3();
	}

	private static void testBufferedWriter() throws IOException {
		// 创建一个字符输出流，与buf.txt关联，如果文件不存在则创建
		FileWriter fw = new FileWriter("buff.txt");
		// 创建一个字符输出流的缓冲区
		BufferedWriter bw = new BufferedWriter(fw);
		// 使用字符缓冲流write方法，将数据写入缓冲区中
		bw.write("abcddd");
		// 使用字符缓冲流write方法，将缓冲区中数据写入文件
		bw.flush();
		// 关闭缓冲区同时也关闭字符输出流
		bw.close();
//		fw.write("abc"); // 写入失败，字符输出流已关闭 
	}

	private static void testBufferedWriter2() throws IOException {
		// 创建一个字符输出流，与buf.txt关联，如果文件不存在则创建
		FileWriter fw = new FileWriter("buff.txt");
		// 创建一个字符输出流的缓冲区
		BufferedWriter bw = new BufferedWriter(fw);
		// 使用字符缓冲流write方法，将数据写入缓冲区中
		bw.write("abc" + LINE_SEPARATOR + "ddd");
		// 使用字符缓冲流write方法，将缓冲区中数据写入文件
		bw.flush();
		// 关闭缓冲区同时也关闭字符输出流
		bw.close();

	}

	private static void testBufferedWriter3() throws IOException {
		// 创建一个字符输出流，与buf.txt关联，如果文件不存在则创建
		FileWriter fw = new FileWriter("buff.txt");
		// 创建一个字符输出流的缓冲区
		BufferedWriter bw = new BufferedWriter(fw);
		// 使用字符缓冲流write方法，将数据写入缓冲区中
		bw.write("abc1");
		// 输出一个换行符
		bw.newLine(); 
		bw.write("abc2");
		// 使用字符缓冲流write方法，将缓冲区中数据写入文件
		bw.flush();
		// 关闭缓冲区同时也关闭字符输出流
		bw.close();

	}

}
