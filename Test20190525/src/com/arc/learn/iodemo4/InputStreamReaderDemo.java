package com.arc.learn.iodemo4;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputStreamReaderDemo {

	public static void main(String[] args) throws IOException {
//		testInputStreamReader();
		testInputStreamReader2();
	}

	private static void testInputStreamReader() throws FileNotFoundException, IOException {
		// 创建一个字节输入流， 关联一个文件，如果文件不存在则抛出异常
		FileInputStream fis = new FileInputStream("c:\\demo\\a.txt");
		// 将字节流转换为字符流
		InputStreamReader isr = new InputStreamReader(fis);
		// 创建一个字符流的缓冲区
		BufferedReader br = new BufferedReader(isr);
		String line = null;
		// 循环读取一行
		while((line=br.readLine()) != null) {
			System.out.println(line);
		}
		br.close();
	}
	
	/**
	 * 字节流和字符流区别
	 * @throws IOException
	 */
	private static void testInputStreamReader2() throws IOException {
		// 字节流
		InputStream is = System.in;
//		int ch = is.read(); // 字节流一次只读一个字节，汉字有两个字节所以读两次
//		System.out.println(ch);
//		ch = is.read();
//		System.out.println(ch);
//		ch = is.read();
//		System.out.println(ch);
//		ch = is.read();
//		System.out.println(ch);
		
		// 转换流:将字节转换成字符
		InputStreamReader isr = new InputStreamReader(is);
		int ch = isr.read(); // 字符流一次读一个字符，即使汉字有两个字节，也只读一次
//		System.out.println((char)ch);
		
//		// 字符流
		BufferedReader br = new BufferedReader(isr);
		String line = null;
//		// 循环读取一行
		while((line=br.readLine()) != null) {
			if(line.contains("over")) {
				break;
			}
			System.out.println(line);
		}
	}
}
