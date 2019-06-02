package com.arc.learn.iodemo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {

	public static void main(String[] args) throws IOException {
		/**
		 * BufferedReader
		 * 	read()：覆盖了父类中的read()方法，从缓冲区中读取数据
		 *  readLine()：从缓冲区中读取一行数据，遇到换行符（\n）,回车符（\r）读取下一行
		 */
		
//		testBufferedFileReader();
		
//		testBufferedFileReader2();
		
		testBufferedFileReader3();
		
	}

	private static void testBufferedFileReader() throws IOException {
		// 创建字符读取流，关联一个文件，如果文件不存在则抛出异常
		FileReader fr = new FileReader("c:\\demo\\a.txt");
		// 创建字符读取流的缓冲流
		BufferedReader br = new BufferedReader(fr);
		// 告诉这个流是否准备好被读取
		System.out.println(br.ready()); 
		
		String line = br.readLine();// 读取一行
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
		// 创建字符读取流，关联一个文件，如果文件不存在则抛出异常
		FileReader fr = new FileReader("c:\\demo\\a.txt");
		// 创建字符读取流的缓冲流
		BufferedReader br = new BufferedReader(fr);
		String line = null;
		// 循环读取
		while((line = br.readLine()) != null) {
			System.out.println(line);
		}
	}
	
	private static void testBufferedFileReader3() throws IOException {
		// 创建字符读取流，关联一个文件，如果文件不存在则抛出异常
		FileReader fr = new FileReader("c:\\demo\\a.txt");
		// 创建字符读取流的缓冲流
		BufferedReader br = new BufferedReader(fr);
		// 告诉这个流是否准备好被读取
		System.out.println(br.ready()); 
		while(br.ready()) {
			String line = br.readLine();// 读取一行
			System.out.println(line);
		}
		br.close();
	}
	
}
