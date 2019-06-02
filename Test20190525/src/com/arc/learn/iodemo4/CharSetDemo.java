package com.arc.learn.iodemo4;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class CharSetDemo {

	public static void main(String[] args) throws IOException {
		/**
		 * 1. 字符流使用系统默认字符集，不能设置字符集
		 * 2. 转换流可以指定字符集
		 * 3. 常见字符集
		 * 		GBK：一个汉字占两个字节
		 * 		UTF-8：一个汉字占三个字节，数字和字母占一个字节
		 * 
		 * 转换流：
		 *   源或者目的是字节流， 但操作的是文本数据，为了操作便捷可以使用转换流
		 *   需要转换字符集时，必须使用转换流
		 */
		
		writeTest4();
//		System.out.println(System.getProperties());
	}

	private static void writeTest() throws IOException {
		// 使用默认字符集，不能更改字符集
		FileWriter fw = new FileWriter("c:\\demo\\write-text.txt");
		fw.write("你好");
		fw.close();
	}
	
	private static void writeTest2() throws IOException {
		FileOutputStream fos = new FileOutputStream("c:\\demo\\write-text2.txt");
		OutputStreamWriter osw = new OutputStreamWriter(fos, "GBK");
		osw.write("你好");
		osw.close();
	}
	
	private static void writeTest3() throws IOException {
		FileOutputStream fos = new FileOutputStream("c:\\demo\\write-text3.txt");
		// 如果要更改字符集，必须使用转换流
		OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
		osw.write("你好");
		osw.close();
	}
	
	private static void writeTest4() throws IOException {
		// 如果要更改字符集，必须使用转换流
		OutputStreamWriter osw = new OutputStreamWriter(System.out, "GBK");
		osw.write("你好");
		osw.close();
	}
	

}
