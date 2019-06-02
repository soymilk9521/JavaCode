package com.arc.learn.iodemo4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class IOSummary {

	public static void main(String[] args) throws IOException {
		/**
		 * IO使用总结（四个明确）
		 * 1. 明确源和目的
		 * 		源：    InputStream，Reader
		 * 		目的：OutputStream，Writer
		 * 2. 明确数据是否是纯文本
		 * 		是：  
		 * 			源：    Reader
		 * 			目的：Writer
		 * 		不是：
		 * 			源：     InputStream
		 * 			目的： OutputStream
		 * 3. 明确操作的设备：
		 * 		硬盘：File
		 * 		键盘：System.in
		 * 		内存：数组
		 * 		网络：Socket
		 * 4. 明确是否有增强功能
		 * 		是否使用缓冲区
		 * 		是否需要字节流与字符流转换			
		 * 				
		 */
		
		// 练习一：复制一个文件
//		testFileToFile();
		// 练习二：将键盘录入信息，写入到文件中。
//		testSystemInToFile();
		// 练习三：将文件数据显示在控制台上
		testFileToSystemOut();
	}

	private static void testFileToFile() throws IOException {
		/**
		 * 1. 明确源和目的
		 * 		源：    InputStream，Reader
		 * 		目的：OutputStream，Writer
		 * 2. 明确数据是否是纯文本
		 * 		是：  
		 * 			源：    Reader
		 * 			目的：Writer
		 * 3. 明确操作的设备：
		 * 		源：
		 * 			硬盘：File
		 * 		目的：
		 * 			硬盘：File
		 * 4. 需要增强功能吗：
		 * 		需要：
		 * 			添加缓冲区
		 */
		BufferedReader br = new BufferedReader(new FileReader("c:\\demo\\a.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("c:\\demo\\aa.txt")); 
//		char[] buf = new char[1024];
//		int len = -1;
//		while((len = fr.read(buf)) != -1) {
//			System.out.println(new String(buf, 0, len));
//			fw.write(buf, 0, len);
//		}
		String line = null;
		while((line = br.readLine()) != null) {
			System.out.println(line);
			bw.write(line);
			bw.newLine();
		}
		br.close();
		bw.close();
		
	}
	
	private static void testSystemInToFile() throws IOException {
		/**
		 * 1. 明确源和目的
		 * 		源：    InputStream，Reader
		 * 		目的：OutputStream，Writer
		 * 2. 明确数据是否是纯文本
		 * 		是：  
		 * 			源：    Reader
		 * 			目的：Writer
		 * 3. 明确操作的设备：
		 * 		源：
		 * 			键盘：System.in
		 * 		目的：
		 * 			硬盘：File
		 * 4. 需要增强功能吗：
		 * 		需要：
		 * 			是否需要字节流与字符流转换		
		 * 			添加缓冲区
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new FileWriter("c:\\demo\\TTT.txt"));
		String line = null;
		while((line = br.readLine()) != null) {
			System.out.println(line);
			if(line.contains("over")) {
				break;
			}
			bw.write(line);
			bw.newLine();
		}
		br.close();
		bw.close();
		
	}

	private static void testFileToSystemOut() throws IOException {
		/**
		 * 1. 明确源和目的
		 * 		源：    InputStream，Reader
		 * 		目的：OutputStream，Writer
		 * 2. 明确数据是否是纯文本
		 * 		是：  
		 * 			源：    Reader
		 * 			目的：Writer
		 * 3. 明确操作的设备：
		 * 		源：
		 * 			硬盘：File
		 * 		目的：
		 * 			键盘：System.out
		 * 			
		 * 4. 需要增强功能吗：
		 * 		需要：
		 * 			是否需要字节流与字符流转换		
		 * 			添加缓冲区
		 */
		
		BufferedReader br = new BufferedReader(new FileReader("c:\\demo\\TTT.txt"));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String line = null;
		while((line = br.readLine()) != null) {
			bw.write(line);
			bw.newLine();
		}
		br.close();
		bw.close();
	}
}
