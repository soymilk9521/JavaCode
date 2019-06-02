package com.arc.learn.filedemo;

import java.io.File;
import java.io.IOException;

public class FileDemo3 {

	public static void main(String[] args) throws IOException {
		testConstructor();
		
	}

	private static void testConstructor() throws IOException {
		File f1 = new File("demo.txt");
		if (!f1.exists()) {
			f1.createNewFile();
		}
		File dir = new File("directory");
		if (!dir.exists()) {
			dir.mkdir();
		}
		File f2 = new File(dir, "demo2.txt");
		f2.createNewFile();
		
		File f3 = new File("directory", "demo3.txt");
		f3.createNewFile();
		
		
		File dir2 = new File("directory\\a\\a\\c\\d");
		dir2.mkdirs();
	}

}
