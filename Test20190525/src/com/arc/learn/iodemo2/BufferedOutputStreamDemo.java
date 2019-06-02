package com.arc.learn.iodemo2;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamDemo {

	public static void main(String[] args) throws IOException {
		testBufferOutputStream2();
	}

	private static void testBufferOutputStream() throws IOException {
		// 创建一个字节输出流对象，并关联一个文件， 如果文件不存在则创建
		FileOutputStream fos = new FileOutputStream("c:\\demo\\buff.txt");
		// 创建一个字节输出流的缓冲区
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		bos.write('a');// 写一个字节
		bos.write(98);// 写一个字节
		bos.write("defj".getBytes()); // 写一个字节数组
		bos.close();
	}
	
	private static void testBufferOutputStream2() throws IOException {
		// 创建一个字节输出流对象，并关联一个文件， 如果文件不存在则创建
		FileOutputStream fos = new FileOutputStream("c:\\demo\\buff.txt");
		// 创建一个字节输出流的缓冲区, 同时可以知道缓冲区内数组长度
		BufferedOutputStream bos = new BufferedOutputStream(fos, 1024);
		bos.write('a');// 写一个字节
		bos.write(98);// 写一个字节
		bos.write("defj".getBytes()); // 写一个字节数组
		bos.close();
	}

}
