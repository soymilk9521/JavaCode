package com.arc.learn.thisdemo;

public class ThisDemo {

	public static void main(String[] args) {
		/*
		 * this�ؼ���
		 *  1. �ص㣺
		 *   1.1. this�������ں���������������á�
		 *   1.2. ����֮��this������������á�
		 *   1.3. ��˵���ĸ��������this���ڵĺ�����this�ʹ����ĸ��������á�
		 *  2. this�ؼ����ڴ�ͼ�⣺
		 *  3. ���캯�����ù��캯��
		 *  	3.1. this.Person(); ��X�� 
		 *  		����ԭ�򣺹��캯���Ǵ�������ʱ�������ʼ��ʹ�ã�this����ǰ����
		 *                  ���캯������this�ؼ��ֲ���������ʧ��
		 *  	3.2. ע�⣺���캯���е��ù��캯��ʱ��������ڵ�һ�С�ԭ���캯����ʼ��Ҫ��ִ�С�
		 *  	          ��ȷд����this(name);
		 *      3.3. ͼ�⹹�캯�����ù��캯��
		 *  4. this���ñ��ຯ����   
		 *  5. �Ƚ������������Ƿ����
		 *   
		 */
		Person p = new Person("Eason");
		p.speak();
		Person p2 = new Person("Karen");
		p2.speak();
		Person p3 = new Person();
		p3.speak();
	}
}
/**
 * ���ԣ�
 *  ����
 *  ����
 * ��Ϊ��
 *  ˵��
 * @author kr
 *
 */
class Person {
	String name;
	int age;

	public Person() {
	}

	// 1.1. ͬ������this�ؼ���
	// 
	public Person(String name) { // �в������캯��
		this.name = name;
	}
	void speak() {
		// 4. this���ñ����еĺ���
		this.openMouse();
		System.out.println(this.name + ":" + this.age);
	}
	
	void openMouse() {
		System.out.print("��~ ���ǣ�");
	}
	
	// 5. �Ƚ������������Ƿ����
	boolean compare(Person person) {
		// TODO ����Ƚ�
		return false;
	}
}