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
	 * ����ʵ�ֶ���ĳ־ô洢
	 * @throws IOException
	 */
	private static void writeObject() throws IOException {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.object"));
		// ��ָ���Ķ���д������
		oos.writeObject(new Person("Tom", 18));
		oos.close();
	}

	/**
	 * �����ж�ȡ���־û��洢�Ķ���
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	private static void readObject() throws IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.object"));
		//readObject���ڴ����ж�ȡ����
		Person p = (Person) ois.readObject();
		System.out.println(p.getName() + "..." + p.getAge());
	}
}
