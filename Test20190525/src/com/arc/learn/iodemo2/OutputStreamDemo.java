package com.arc.learn.iodemo2;

import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamDemo {

	public static void main(String[] args) throws IOException {
		/**
		 * OutputStream 
		 * 		|-- FileOutputStream 
		 * 
		 */
		testFileOutputStream();
	}

	public static void testFileOutputStream() throws IOException {
		// 创建字节输出流对象。关联一个文件，如果文件不存在，则创建。
		FileOutputStream fos = new FileOutputStream("c:\\demo\\b.txt");
		// 写数据
		fos.write('B'); // 写一个字节
		fos.write(65);  // 写一个字节
		fos.write("BGM".getBytes()); // 写一个字节数组

//		fos.flush();// 不做任何处理
		fos.close();
	}

}
