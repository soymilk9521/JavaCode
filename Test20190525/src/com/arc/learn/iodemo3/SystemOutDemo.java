package com.arc.learn.iodemo3;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class SystemOutDemo {

	public static void main(String[] args) throws IOException {
		testSystemOut2();
	}

	private static void testSystemOut() throws IOException {
		// 控制台输出
		OutputStream os = System.out;
		os.write('a');
		os.write(98);
		os.write("abc".getBytes());
		
	}
	
	private static void testSystemOut2() throws IOException {
		// 控制台输出
		OutputStream os = System.out;
		// 缓冲区
		BufferedOutputStream bos = new BufferedOutputStream(os);
		bos.write('a');
		bos.write(98);
		bos.write("哈哈".getBytes());
		bos.close();
	}

}
