package com.arc.learn.staticdemo;

public class StaticDemo3 {

	public static void main(String[] args) {
		/*
		 * 1. static�ڴ�ͼ�⣺
		 * 	1.1. �������� һ�㷽������ ��̬�� 
		 * 	1.2. �����ࣺstaticDemo3���Person��
		 * 	1.3. this����:��̬�����в���ʹ��this�ؼ���
		 * 2. static�ؼ���Ӧ�ó�����
		 * 	2.1. ��̬����
		 * 		���������������еĳ�Ա������ֵ������ͬ�ģ���ʱ����ʹ��static�ؼ������γ�Ա��
		 * 		ֻҪ����������ֵ�����в�ͬ�����Ƕ�����������ݣ�����洢�ڶ����У�������static���Ρ�
		 *  2.2. ��̬����
		 *  	�����Ƿ���static���βο�һ�㣬���Ǹú����Ƿ���ʶ����е��������ݡ�
		 */
		Person.method();
		Person p = new Person("Jhon", 20);
		p.show();
	}
	
}

class Person {
	private String name;
	private int age;
	static String country = "CHINA";
	public Person(String name, int age) {
		this.name = name;
		this.age  = age;
	}
	
	void show() {
		System.out.println(Person.country + ":" + this.name + ":" + this.age);
	}
	
	public static void method() {
		System.out.println(Person.country);
	}
	
	
}