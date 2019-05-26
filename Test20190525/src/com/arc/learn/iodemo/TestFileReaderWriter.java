package com.arc.learn.iodemo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestFileReaderWriter {

	/**
	 * 将C盘一个文件复制到D盘
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
//		testFileReaderWriter();
		testFileReaderWriter2();
	}

	/**
	 * 复制文件方法一
	 * @throws IOException
	 */
	public static void testFileReaderWriter() throws IOException {
		// 读取一个已有文件，使用字符输入流和文件相关连
		FileReader fr = new FileReader("C:\\demo\\a.txt"); // 如果没找到文件，则抛出异常
		
		// 创建一个目标文件，使用字符输出流将读到的字符写入目的文件
		FileWriter fw = new FileWriter("D:\\demo\\a.txt"); // 如果没有该文件，则创建，如果有该文件则覆盖。
//		FileWriter fw = new FileWriter("D:\\demo\\a.txt",true); // 如果没有该文件，则创建，如果有该文件则继续添加。
		
		// 创建缓冲区
		char[] buf = new char[1024];
		
		int len = 0;
		// 循环读写
		while((len = fr.read(buf)) != -1 ) {
			System.out.println(new String(buf, 0 , len));
			fw.write(buf, 0, len);
		}
		// 关闭流资源
		fr.close();
		fw.close();
	}
	
	/**
	 * 复制文件方法二(带异常处理)
	 */
	public static void testFileReaderWriter2() {
		FileReader fr = null;
		FileWriter fw = null;
		
		try {
			// 读取一个已有文件，使用字符输入流和文件相关连
			fr = new FileReader("C:\\demo\\a.txt");
			// 创建一个目标文件，使用字符输出流将读到的字符写入目的文件
			fw = new FileWriter("D:\\demo\\a.txt"); 
			// 创建缓冲区
			char[] buf = new char[1024];
			int len = 0;
			// 循环读写
			while((len = fr.read(buf)) != -1 ) {
				System.out.println(new String(buf, 0 , len));
				fw.write(buf, 0, len);
			}
		} catch (FileNotFoundException e) {
			System.out.println("文件不存在");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("文件读取失败");
			e.printStackTrace();
		}finally {
			try {
				if (fr != null) {
					fr.close();
				}
				if (fw != null) {
					fw.close();
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
