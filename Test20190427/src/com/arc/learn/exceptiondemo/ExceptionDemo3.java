package com.arc.learn.exceptiondemo;

public class ExceptionDemo3 {

	public static void main(String[] args) {//throws MinusAgeException {
		/**
		 * 1. �Զ����쳣
		 * 	1.1. �̳�Exception��
		 *  1.2. �̳�RuntimeException��
		 * 2. �쳣����
		 * 	2.1. ����ʱ����쳣��Exception�༰�����ࡣ
		 *  2.2. ����ʱ����쳣��RuntimeException�༰�����ࡣ
		 * 3. throw��throws����
		 * 	3.1. throwsʹ���ں����ϣ�throwʹ���ں����ڲ���
		 *  3.2. throws�����׳�����쳣�࣬�ö��Ÿ�����throw�׳�һ���쳣����
		 * 4. ��ͼ����쳣�׳����й��̡�
		 */
		
		Person p = new Person(12, "karl");
//		System.out.println(p.getAge());
//		System.out.println(p.getName());
//		p.setAge(-20);
		p.setAge2(-20);
		
	}
}


class Person {
	private int age;
	private String name;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) throws MinusAgeException, Exception {
		if(age < 0) {
//			System.out.println("�������ô���...");
			throw new MinusAgeException("�������ô���...");
			// 1.�׳��쳣�� 2.�׳�����message�쳣 
		}
		this.age = age;
	}
	
	public void setAge2(int age) {
		if (age <0) {
			throw new MinusAgeException2("�������ô���...");
		}
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * �޲ι��캯��
	 */
	public Person() {
		super();
	}
	
	/**
	 * �в������캯��
	 * @param age ����
	 * @param name ����
	 */
	public Person(int age, String name) {
		super();
		if (age<0) {
//			System.out.println("�������ô���");
			throw new RuntimeException("�������ô���");
//			return;
		}
		this.age = age;
		this.name = name;
	}
}

class MinusAgeException extends Exception {
	public MinusAgeException(String msg) {
		super(msg);
	}
}

class MinusAgeException2 extends RuntimeException {
	public MinusAgeException2(String msg) {
		super(msg);
	}
}
