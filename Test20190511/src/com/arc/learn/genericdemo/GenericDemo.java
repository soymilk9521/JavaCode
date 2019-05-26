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
		 * 泛型：Java1.5出现的一种安全机制
		 * 	好处： 编译期检查类型
		 * 		 运行期降低类型转换异常
		 *  什么时候使用？
		 * 
		 */
		
		// TODO 添加泛型
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