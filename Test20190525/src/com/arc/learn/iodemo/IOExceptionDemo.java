package com.arc.learn.iodemo;

import java.io.FileWriter;
import java.io.IOException;

public class IOExceptionDemo {

	/**
	 * IO流异常处理
	 * @param args
	 */
	public static void main(String[] args) {
		FileWriter fw = null;
		try {
			fw = new FileWriter("demo.txt");
			fw.write("abc1");
			fw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if (fw != null) {
					// 及时出现IO异常也会关闭IO流
					fw.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
