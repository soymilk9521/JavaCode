package com.arc.learn.iodemo2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestCopyMp3 {

	public static void main(String[] args) throws IOException {
		testCopy1();
		testCopy2();
		testCopy3();
	}

	private static void testCopy1() throws IOException {
		// 创建字节输入流，并关联一个文件，如果文件不存在， 则抛出异常
		FileInputStream fis = new FileInputStream("c:\\demo\\m.mp3");
		// 创建字节输出流，并指定目标文件，如果文件不存在， 则创建
		FileOutputStream fos = new FileOutputStream("d:\\demo\\m1.mp3");  // 文件路径不存在也会抛出异常
		byte[] bs = new byte[1024];
		int len = 0;
		while((len = fis.read(bs)) != -1) {
			fos.write(bs, 0, len);
		}
		fis.close();
		fos.close();
	}
	
	private static void testCopy2() throws IOException {
		// 创建字节输入流，并关联一个文件，如果文件不存在， 则抛出异常
		FileInputStream fis = new FileInputStream("c:\\demo\\m.mp3");
		// 创建字节输出流，并指定目标文件，如果文件不存在， 则创建
		FileOutputStream fos = new FileOutputStream("d:\\demo\\m1.mp3");  // 文件路径不存在也会抛出异常
		// 创建一个字节数组缓冲区，数组长度为文件长度。 （不推荐使用）
		byte[] bs = new byte[fis.available()]; 
		int len = 0;
		while((len = fis.read(bs)) != -1) {
			fos.write(bs, 0, len);
		}
		fis.close();
		fos.close();
	}
	
	private static void testCopy3() throws IOException {
		// 创建字节输入流，并关联一个文件，如果文件不存在， 则抛出异常
		FileInputStream fis = new FileInputStream("c:\\demo\\m.mp3");
		// 创建字节输入流的缓冲流
		BufferedInputStream bis = new BufferedInputStream(fis);
		// 创建字节输出流，并指定目标文件，如果文件不存在， 则创建
		FileOutputStream fos = new FileOutputStream("d:\\demo\\m2.mp3");  // 文件路径不存在也会抛出异常
		// 创建字节流输出流的缓冲流
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		int ch = -1;
		while((ch = bis.read()) != -1) {
			bos.write(ch);
		}
		bis.close();
		bos.close();
	}


}
