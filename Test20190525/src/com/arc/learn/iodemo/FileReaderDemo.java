package com.arc.learn.iodemo;

import java.io.FileReader;
import java.io.IOException;

import sun.font.TrueTypeFont;

public class FileReaderDemo {

	/**
	 * 需求：读取一个文件，将读取到的字符写到控制台
	 * 
	 * @param args
	 * @throws IOExceptionException
	 */
	public static void main(String[] args) throws IOException {

//		testFileReader();

//		testFileReader2();
//
//		testFileReader3();
//
		testFileReader4();
	}

	private static void testFileReader() throws IOException {
		// 创建一个字符流的读取流关联文件，如果文件不存在，则抛出异常
		FileReader fr = new FileReader("demo.txt");
		// 读取一个字符, 返回该字符整数值，ch代表读取到的字符
		int ch = fr.read(); 
		System.out.println(ch);
		ch = fr.read();
		// 将整数强转为字符
		System.out.println((char) ch);
		ch = fr.read();
		System.out.println((char) ch);
		ch = fr.read();
		// -1：返回-1读取完毕
		System.out.println(ch); 
		// 关闭流资源
		fr.close();
	}

	private static void testFileReader2() throws IOException {
		// 创建一个字符流的读取流关联文件，如果文件不存在，则抛出异常
		FileReader fr = new FileReader("demo.txt");
		int ch = 0;
		// 循环读取，只要读取到的不是-1就继续循环
		while ((ch = fr.read()) != -1) { 
			System.out.println((char) ch);
		}
		// 关闭流资源
		fr.close();
	}

	private static void testFileReader3() throws IOException {
		// 创建一个字符流的读取流关联文件，如果文件不存在，则抛出异常
		FileReader fr = new FileReader("demo.txt");
		// 创建一个字符数组缓冲区
		char[] buf = new char[3];
		// 将读取到的数据存储到数组中，num表示读取到的字符个数
		int num = fr.read(buf); 
		// 将字符数组转换为字符串输出
		System.out.println(num + ":" + new String(buf)); 
		num = fr.read(buf); 
		System.out.println(num + ":" + new String(buf, 0, num)); // 0 count
		num = fr.read(buf); 
		System.out.println(num);
		System.out.println(num + ":" + (num !=-1 ? new String(buf) : ""));// false ? 表达式1：表达式2
		// 关闭流资源
		fr.close();
	}

	private static void testFileReader4() throws IOException {
		// 创建一个字符流的读取流关联文件，如果文件不存在，则抛出异常
		FileReader fr = new FileReader("demo.txt");
		// 创建一个字符数组缓冲区
		char[] buf = new char[1024*2];
		// 定义变量len代表读取到字符个数
		int len = 0;
		// 循环读取
		while ((len = fr.read(buf)) != -1) {
			// 将字符数组转换为字符串输出
			System.out.println(len + ":" + new String(buf, 0, len));
		}
		fr.close();
	}

}
