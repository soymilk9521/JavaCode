package com.arc.learn.iodemo;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayInputStreamDemo {

	public static void main(String[] args) throws IOException {
		byte[] buf = "╪ссм".getBytes();
		ByteArrayInputStream bs = new ByteArrayInputStream(buf);
		ByteArrayOutputStream bo = new ByteArrayOutputStream();
		
//		int b = -1;
//		while ((b = bs.read()) != -1) {
//			System.out.println(b);
//			bo.write(b);
//		}

		int len = -1;
		byte[] buff = new byte[2];
		while ((len = bs.read(buff)) != -1) {
			System.out.println(new String(buff, 0, len));
			bo.write(buff,0 , len);

		}
		System.out.println("--------------");
		bo.writeTo(System.out);
		bo.writeTo(new FileOutputStream("byte-array.txt"));
		bo.close();
		bs.close();

	}

}
