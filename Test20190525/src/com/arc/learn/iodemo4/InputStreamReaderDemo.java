package com.arc.learn.iodemo4;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderDemo {

	public static void main(String[] args) throws IOException {
		testInputStreamReader();
		
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
	}
	

}
