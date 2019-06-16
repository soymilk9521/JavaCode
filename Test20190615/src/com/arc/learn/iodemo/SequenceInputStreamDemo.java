package com.arc.learn.iodemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

public class SequenceInputStreamDemo {

	public static void main(String[] args) throws IOException {
		testSeparatorFile();
		testSequenceInputStream();
	}

	private static void testSeparatorFile() throws IOException {
		FileInputStream fis = new FileInputStream("aaa.jpg");
		FileOutputStream fos = null;
		byte[] buff = new byte[1024 * 1024];
		int len = -1;
		int count = 0;
		while ((len = fis.read(buff)) != -1) {
			fos = new FileOutputStream("img" + (++count) + ".part");
			fos.write(buff, 0, len);
		}
		fos.close();
		fis.close();
	}

	private static void testSequenceInputStream() throws IOException {
		List<FileInputStream> list = new ArrayList<>();
		list.add(new FileInputStream("img1.part"));
		list.add(new FileInputStream("img2.part"));
		list.add(new FileInputStream("img3.part"));
		list.add(new FileInputStream("img4.part"));
		list.add(new FileInputStream("img5.part"));
		Enumeration<FileInputStream> em = Collections.enumeration(list); 
		SequenceInputStream sis = new SequenceInputStream(em);
		FileOutputStream fos = new FileOutputStream("bbb.jpg");
		int b = -1;
		while ((b = sis.read()) != -1) {
			fos.write(b);
		}
		sis.close();
		fos.close();
	}

}
