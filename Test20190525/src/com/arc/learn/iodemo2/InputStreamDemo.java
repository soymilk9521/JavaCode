package com.arc.learn.iodemo2;

import java.io.FileInputStream;
import java.io.IOException;

public class InputStreamDemo {

	public static void main(String[] args) throws IOException {
		/**
		 * InputStream 
		 * 		|-- FileInputStream
		 */
//		testFileInputStream();
//		testFileInputStream2();
//		testFileInputStream3();
//		testFileInputStream4();
		testFileInputStream5();
	}

	private static void testFileInputStream() throws IOException {
		// 创建一个字节输入流对象，读取一个文件，如果文件不存在，则抛出异常。
		FileInputStream fis = new FileInputStream("c:\\demo\\b.txt");
		// 读取一个字节
		int b = fis.read();
		System.out.println((char)b);
		int b1 = fis.read();
		System.out.println(b1);
		int b2 = fis.read();
		System.out.println(b2);
		int b3 = fis.read();
		System.out.println(b3);
		int b4 = fis.read();
		System.out.println(b4); // 如果读取不到数据返回-1
		fis.close();
	}

	private static void testFileInputStream2() throws IOException {
		// 创建一个字节输入流对象，读取一个文件，如果文件不存在，则抛出异常。
		FileInputStream fis = new FileInputStream("c:\\demo\\b.txt");
		// 循环读取
		int b = -1;
		while ((b = fis.read()) != -1) {
			System.out.println(b);
		}
		fis.close();
	}

	private static void testFileInputStream3() throws IOException {
		// 创建一个字节输入流对象，读取一个文件，如果文件不存在，则抛出异常。
		FileInputStream fis = new FileInputStream("c:\\demo\\b.txt");
		// 创建一个缓冲区
		byte[] buf = new byte[3];
		// 读取到的字节长度
		int len = fis.read(buf);
		System.out.println(len + ":" + new String(buf));
		int len2 = fis.read(buf);
		System.out.println(len2 + ":" + new String(buf));
//		System.out.println(len2 + ":" + new String(buf,0, len2));
		int len3 = fis.read(buf);
		System.out.println(len3 + ":" + new String(buf)); // 如果读取不到数据返回-1
		fis.close();
	}

	private static void testFileInputStream4() throws IOException {
		// 创建一个字节输入流对象，读取一个文件，如果文件不存在，则抛出异常。
		FileInputStream fis = new FileInputStream("c:\\demo\\b.txt");
		// 创建一个缓冲区
		byte[] buf = new byte[3];
		// 读取到的字节长度
		int len = 0;
		// 循环读取
		while ((len = fis.read(buf)) != -1) {
			System.out.println(len + ":" + new String(buf, 0, len));
		}
		fis.close();
	}

	private static void testFileInputStream5() throws IOException {
		// 创建一个字节输入流对象，读取一个文件，如果文件不存在，则抛出异常。
		FileInputStream fis = new FileInputStream("c:\\demo\\b.txt");
		// 输出被读取的文件中字节个数
		System.out.println(fis.available());
	}
}
