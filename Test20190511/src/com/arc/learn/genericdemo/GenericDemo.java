package com.arc.learn.genericdemo;

import java.util.ArrayList;
import java.util.Iterator;

import com.arc.learn.classesdemo.Person;
import com.sun.org.apache.bcel.internal.generic.NEW;

public class GenericDemo<T> {

	GenericDemo(T t) {
		
	}
	
	
	public static void main(String[] args) {
		
		/**
		 * ���ͣ�Java1.5���ֵ�һ�ְ�ȫ����
		 * 	�ô��� �����ڼ������
		 * 		 �����ڽ�������ת���쳣
		 *  ʲôʱ��ʹ�ã�
		 * 
		 */
		
		// TODO ��ӷ���
		ArrayList<Person> al = new ArrayList<Person>();
		al.add(new Person("abc", 20));
//		al.add("abc2");
//		al.add(123);
//		al.add(new Integer(1));
		Iterator it = al.iterator();
		while(it.hasNext()) {
			Person p = (Person)it.next();
			System.out.println(p.getName());
		}
		
		testGeneric(new Person("tt", 20));
//		testGeneric(new String());
		
	}
	
	public static <E extends Person> void testGeneric(E t) {
		t.getAge();
//		System.out.println(p.getAge());
	}
	

}


class Son extends Person {
	
}