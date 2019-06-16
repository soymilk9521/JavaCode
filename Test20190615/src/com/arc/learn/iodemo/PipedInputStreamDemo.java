package com.arc.learn.iodemo;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipedInputStreamDemo {

	public static void main(String[] args) throws IOException {
		PipedInputStream pis = new PipedInputStream();
		PipedOutputStream pos = new PipedOutputStream(pis);
		pos.write("двдвдв".getBytes());
		int len = -1;
		byte[] buff = new byte[1024];
		while ((len = pis.read(buff)) != -1) {
			System.out.println(new String(buff, 0, len));
		}
		pos.close();
		pis.close();
	}

}
