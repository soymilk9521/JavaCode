package com.arc.learn.iodemo;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	/**
	 * 写入数据到文件中
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

//		testFileWriter();
		
		testFileWriter2();
		
	}

	private static void testFileWriter() throws IOException {
		// 如果demo.txt文件不存在，则自动创建； 如果demo.txt文件存在，则将其覆盖
		FileWriter fw = new FileWriter("d:\\demo.txt");
		// 写入数据，将数据写入到临时存储缓冲区中
		fw.write("abc1");
		fw.write("abc2");
		fw.write("\r\nabc3"); // 换行
		// 刷新缓冲区，将缓冲区数据写入文件
//		fw.flush();
		// 先刷新缓冲区后关闭输出流
		fw.close();
		// 流关闭后，不可继续操作
		// fw.write("exception");
	}
	
	private static void testFileWriter2() throws IOException {
		// 如果demo.txt文件不存在，则自动创建；如果demo.txt文件存在，则继续向文件中添加（续写）
		FileWriter fw = new FileWriter("d:\\demo.txt", true);
		// 写入数据，将数据写入到临时存储缓冲区中
		fw.write("abc1");
		fw.write("abc2");
		fw.write("\r\nabc3"); // 换行
		// 刷新缓冲区，将缓冲区数据写入文件
		fw.flush();
		// 先刷新缓冲区后关闭输出流
		fw.close();
	}

}
