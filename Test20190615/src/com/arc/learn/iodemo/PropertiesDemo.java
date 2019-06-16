package com.arc.learn.iodemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) throws IOException {
//		testConstructor();
//		testList();
//		testLoad();
		testStore();
	}

	private static void testConstructor() {
		// 调用Properties的无参构造函数，创建对象
		Properties prop = new Properties();
		System.out.println(prop);
		System.out.println("--------------");
		// 通过System对象获取系统属性
		prop = System.getProperties();
		System.out.println(prop);
		System.out.println("--------------");
		Properties prop2 = new Properties(prop);
		System.out.println(prop2);
		System.out.println(prop2.getProperty("os.name"));
		System.out.println(prop2.getProperty("user.dir"));
	}
	
	/**
	 * 将此属性列表打印到指定的输出流。 
	 * @throws IOException
	 */
	private static void testList() throws IOException {
		Properties prop = System.getProperties();
		prop.list(System.out);
		PrintWriter pw = new PrintWriter("prop.properties");
		prop.list(pw);
		pw.close();
	}

	/**
	 * 	从输入字节流读取属性列表（键和元素对）。 
	 * @throws IOException
	 */
	private static void testLoad() throws IOException {
		Properties prop = new Properties();
		prop.load(new FileInputStream("prop.properties"));
		System.out.println(prop.getProperty("os.name"));
		System.out.println(prop.getProperty("user.dir"));
	}
	
	/**
	 * 将此属性列表（键和元素对）写入此 Properties表中
	 * @throws IOException
	 */
	private static void testStore() throws IOException {
		Properties prop = new Properties();
		prop.load(new FileInputStream("prop.properties"));
		prop.setProperty("name", "Tom");
		prop.setProperty("age", "18");
		prop.list(System.out);
		prop.store(new FileOutputStream("prop.properties"), "hhhh");
		
	}
	
}
