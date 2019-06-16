package com.arc.learn.iodemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectStreamDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		writeObject();
		readObject();
	}

	/**
	 * 可以实现对象的持久存储
	 * @throws IOException
	 */
	private static void writeObject() throws IOException {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.object"));
		// 将指定的对象写入流中
		oos.writeObject(new Person("Tom", 18));
		oos.close();
	}

	/**
	 * 从流中读取被持久化存储的对象
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	private static void readObject() throws IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.object"));
		//readObject用于从流中读取对象。
		Person p = (Person) ois.readObject();
		System.out.println(p.getName() + "..." + p.getAge());
	}
}
