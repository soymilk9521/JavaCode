package com.arc.learn.extendsdemo;

public class ExtendsDemo {

	public static void main(String[] args) {
		/*
		 * һ���̳и�����
		 * 	1. ������д�����ͬ���Ժ���Ϊʱ������Щ���ݳ�ȡ������һ�����У�
		 *     ��ô����������ٶ�����Щ���Ժ���Ϊ��ֻҪ���Ǹ��༴�ɡ�
		 *  2. �������Գ�Ϊ���࣬����������Ϊ������߳��ࡣ
		 *  3. �������ֱ�ӷ��ʸ����еķ�˽�е����Ժ���Ϊ��
		 *  4. ͨ�� extends �ؼ�����������֮������̳й�ϵ��
		 * 
		 * �����̳е��ص㣺
		 *  1. �̳еĳ�������˴���ĸ����ԡ�
		 *  2. �̳еĳ�����������֮������˹�ϵ���ṩ�˶�̬��ǰ�ᡣ
		 *  
		 * �������̳����̳У�
		 * 	Java֧�ֵ��̳У���ֱ��֧�ֶ�̳У���C++�еĶ�̳н����˸�����
		 *  ��ֱ��֧�ֶ�̳У���Ϊ��������������ͬ��Ա���ᵼ�µ��õĲ�ȷ���ԡ�
		 *  1. ���̳У�һ������ֻ��һ��ֱ�Ӹ��ࣨJava��
		 *  2. ��̳У�һ��������ж��ֱ�Ӹ��ࣨC++ ��
		 *  3. Java֧�ֶ��̳У����ؼ̳У������磺A�̳�B��B�̳�C
		 * 
		 * �ġ�ʲôʱ��ʹ�ü̳�
		 * 	�����������������ϵ��ʱ�򣬾Ϳ��Զ���̳С�
		 *  è�� �ϻ� --> è�ƶ���
		 *  ���� �� --> Ȯ�ƶ���
		 *  �������������ͬ���Ի���Ϊ��ʱ�򣬾Ϳ���������ȡΪ���ࡣ 
		 *     
		 */
		Student student = new Student();
		student.name = "Kr";
		student.age  = 20;
		student.color = "red";
		student.study();
		student.speak();
		Worker worker = new Worker();
		worker.name = "Jay";
		worker.age = 28;
		worker.work();
		worker.speak();
	}
	

}

/**
 * 
 * ѧ��
 *
 */
class Student extends Person {
	public void study() {
		System.out.println(name + ":" + age);
	}
}

/**
 * 
 * ����
 *
 */
class Worker extends Person {
	public void work() {
		System.out.println(name + ":" + age);
	}
}

/**
 * 
 *����
 *
 */
class Person extends Demo {
	// ����
	public String name;
	// ����
	public int age;
	
	public void speak() {
		System.out.println("Hello World...");
	}
}

class Demo {
	public String color ;
}