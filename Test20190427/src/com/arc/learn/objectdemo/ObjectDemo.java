package com.arc.learn.objectdemo;


import com.arc.learn.exceptiondemo.MinusNumberException;

public class ObjectDemo {

	public static void main(String[] args) {
		/**
		 * 1. Object��Ϊ������ĸ��ࡣ
		 *   1.1. �����κ��඼���Ե���Object���й���������
		 * 2. Object��-equals()������
		 *   2.1. ���Ǹ���equals����
		 * 3. Object��-hashCode()����
		 *   3.1. �����ϣֵ��ʾ System.out.println(p1);
		 * 4. Object��-getClass()����
		 * 	 4.1. Java�ֽ��루��class�ļ����ж�����name��field��constructor��method
		 * 		  Java��Class���������ֽ����ļ���
		 * 5. Object��-toString()���� 
		 *    toString():className@hashCode
		 * 6. ��
		 *    6.1. ����
		 *    6.2. protected�ؼ��� 
		 */
		
		Person p1 = new Person(20);
		Person p2 = new Person(21);
//		Demo demo = new Demo();
//		System.out.println(p1);
//		System.out.println(p1.hashCode());
//		System.out.println(Integer.toHexString(p1.hashCode()));

		System.out.println(p1 == p2); // == �Ƚ��ڴ��ַ
		System.out.println(p1.equals(p2));// equals�����Ƚ�����
		
		
		
		
		Class class1 = p1.getClass();
		Class class2 = p2.getClass(); 
		
//		System.out.println(class1.getName());
//		System.out.println(class1.getSimpleName());
//		Method[] m = class1.getMethods();
//		for(int i=0; i<m.length; i++) {
//			System.out.println(m[i].getName());
//		}
		
		System.out.println(class1 == class2);
		
		System.out.println(p1);
		System.out.println(p1.getClass().getName() + "!" + Integer.toHexString(p1.hashCode()));
		
		
	}

}

class Person extends Object {
	private int age;
	public Person(int age) {
		this.age = age;
	}
//	public boolean compare(Person person) {
//		if (person == null) {
//			throw new NullPointerException("���޴��ˡ�");
//		}
//		return this.age == person.age;
//	}
//	
	@Override
	public boolean equals(Object object) { // Object object = new Person();
		if (!(object instanceof Person)) {
			return false;
		}
		Person p = (Person)object;
		return this.age == p.age;
	}
	
	public String toString() {
		return "[age=" + this.age + "]";
	}
	
	@Override
	public int hashCode() {
		return Integer.valueOf(Integer.toHexString(this.age));
	}
	
	public void show() throws MinusNumberException {
		
	}
	
	
}

