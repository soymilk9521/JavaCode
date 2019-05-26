package com.arc.learn.iodemo2;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStreamDemo {

	public static void main(String[] args) throws IOException {
		testBufferedInputStream2();
	}

	private static void testBufferedInputStream() throws IOException {
		// 创建一个字节输入流对象，读取一个文件，如果文件不存在，则抛出异常。
		FileInputStream fis = new FileInputStream("c:\\demo\\a.txt");
		// 创建一个缓冲区
		BufferedInputStream bis = new BufferedInputStream(fis);
		// 读取到的字节长度
		int len = 0;
		// 循环读取
		while ((len = bis.read()) != -1) {
			System.out.println((char)len);
		}
		fis.close();
	}
	
	private static void testBufferedInputStream2() throws IOException {
		// 创建一个字节输入流对象，读取一个文件，如果文件不存在，则抛出异常。
		FileInputStream fis = new FileInputStream("c:\\demo\\a.txt");
		// 创建一个缓冲区， 同时可以指定缓冲区内数组长度
		BufferedInputStream bis = new BufferedInputStream(fis, 1024);
		// 读取到的字节长度
		int len = 0;
		byte[] buff = new byte[1024];
		// 循环读取
		while ((len = bis.read(buff)) != -1) {
			System.out.println(new String(buff, 0, len));
		}
		fis.close();
	}
}
