package com.arc.learn.iodemo3;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

public class SystemInDemo {

	public static void main(String[] args) throws IOException {
//		testSystemIn();
//		testSystemIn2();
//		testSystemIn3();
//		testSystemIn4();
//		
		System.out.println((int)'\r');
		System.out.println((int)'\n');
	}

	private static void testSystemIn() throws IOException {
		// 获取控制台输入字节流
		InputStream is = System.in;
		// 读取控制台输入的一个字节
		int ch = is.read(); // read方法是阻塞的，如果读取不到数据则等待, 不会返回-1
		System.out.println(ch);
		int ch2 = is.read();
		System.out.println(ch2);
		int ch3 = is.read();
		System.out.println(ch3);
		int ch4 = is.read();
		System.out.println(ch4);

		int ch5 = is.read();
		System.out.println(ch5);
		
		// 不需要关闭流
//		is.close();
//		is = System.in; // 输入流被关闭，则抛出异常
//		is.read();
	}
	
	private static void testSystemIn2() throws IOException {
		// 控制台输入
		InputStream is = System.in; 
		int ch = 0;
		// 循环从控制台读取输入的一个字节
		while((ch=is.read()) != -1) { // read方法是阻塞的，如果读取不到数据则等待, 不会返回-1
			System.out.println(ch);
		}
	}
	
	private static void testSystemIn3() throws IOException {
		// 控制台输入
		InputStream is = System.in; 
		// 读取长度
		int len = 0;
		byte[] buff = new byte[10];
		// 循环从控制台读取输入的一个字节
		while((len=is.read(buff)) != -1) { // read方法是阻塞的，如果读取不到数据则等待, 不会返回-1
			System.out.println(new String(buff, 0, len));
		}
	}
	
	private static void testSystemIn4() throws IOException {
		// 控制台输入
		InputStream is = System.in; 
		BufferedInputStream bis = new BufferedInputStream(is);
		// 读取长度
		int len = 0;
		byte[] buff = new byte[10];
		// 循环从控制台读取输入的一个字节
		while((len=bis.read(buff)) != -1) { // read方法是阻塞的，如果读取不到数据则等待, 不会返回-1
			System.out.println(new String(buff, 0, len));
		}
	}
	

}
