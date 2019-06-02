package com.arc.learn.propertiesdemo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) throws IOException {
		testConstructor();
		testList();
	}

	private static void testList() throws IOException {
		Properties prop = System.getProperties();
		prop.list(System.out);
		PrintWriter pw = new PrintWriter("c:\\demo\\prop.txt");
		prop.list(pw);
		pw.close();
	}

	private static void testConstructor() {
		// ����Properties���޲ι��캯������������
		Properties prop = new Properties();
		System.out.println(prop);
		System.out.println("--------------");
		// ͨ��System�����ȡϵͳ����
		prop = System.getProperties();
		System.out.println(prop);
		System.out.println("--------------");
		Properties prop2 = new Properties(prop);
		System.out.println(prop2);
		System.out.println(prop2.getProperty("os.name"));
		System.out.println(prop2.getProperty("user.dir"));
	}

}
