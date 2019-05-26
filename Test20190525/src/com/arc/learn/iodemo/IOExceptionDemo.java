package com.arc.learn.iodemo;

import java.io.FileWriter;
import java.io.IOException;

public class IOExceptionDemo {

	/**
	 * IO���쳣����
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
					// ��ʱ����IO�쳣Ҳ��ر�IO��
					fw.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
