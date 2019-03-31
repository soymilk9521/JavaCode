package com.arc.learn.constructor;

public class ConstDemo {

	public static void main(String[] args) {
		/*
		 * ���캯��
		 *   1. �ص㣺
		 *     1.1. �������ƺ�����һ��
		 *     1.2. �����巵��ֵ����
		 *     1.3. û�о���ķ���ֵ
		 *   2. ���ã�
		 *     2.1 �������ʼ��
		 *   3. ϸ�ڣ�
		 *     3.1  Ĭ�Ϲ��캯��
		 *     3.2 ���캯����������
		 *   4. ���ͣ�
		 *     4.1 �����������ʱ�����õĺ�����  
		 *   5. Ĭ�Ϲ��캯����
		 *     5.1 ͨ��new��������ʱ��������ù��캯����
		 *     5.2 ���û�У�ϵͳ���Զ�Ϊ���ഴ��һ���޲εĹ��캯����
		 *   6. ���캯����һ�㺯��������
		 *     6.1 ���캯������������ʱ���ã�һ�����캯��ֻ����һ�Ρ�
		 *     6.2 һ�㺯���������������ã���Ҫʹ��ʱ�ŵ��ã������ظ�ʹ�á�
		 *   7. ʲôʱ��ʹ�ù��캯����
		 *     7.1 ��������ʱ�������������Ը�ֵ��
		 *   8. �в����Ĺ��캯��
		 *     8.1 Person p = new Person(name);
		 *   9. ���캯������
		 *     9.1 Person p = new Person(name, age);
		 *     9.2 Person p2 = new Person(age, name); �ع�����
		 *   10. ���캯���ڴ�����ͼ��
		 *   11. ���캯��ϸ�ڣ� 
		 *   	11.1. ������ֵʱ�����캯����һ�㺯������ͬʱ���ڡ�
		 *      11.2. ���캯�����Ե���һ�㺯����һ�㺯��������ֱ�ӵ��ù��캯��
		 *      11.3. ���캯��ǰ�Ƿ���Լ�void�� -- ������
		 *      11.4. ���캯����û��return�ؼ��֣� -- ����
		 */
		Person p = new Person();
		p.speak();
		// 6.1 ���ù��캯��
		Person p2 = new Person("JAY");
		p2.speak();
		Person p3 = new Person("Kr", 20);
		// 6.2 �ظ�����һ�㺯��
		p3.speak();
		p3.speak();
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
	
	// 1.1. ����һ���޲ι��캯��
	public Person() {
		// 1.1. ���һ�����
		System.out.println("person is running");
		speak(); // ���캯�����Ե���һ�㺯��
		return;  // ���캯������ʹ��return�ؼ���
	}
	
	// 8.1. ����һ�����캯������һ������
	// 8.1. ʹ���вι��캯�������Ը�ֵ
	public Person(String n) {
		name = n;
	}
	
	// 9.1. ����һ�����캯��������������
	// 10. ���캯���ڴ�����
	public Person(String n, int a) {
		name=n;
		age=a;
	}
	
	public Person(int a, String n) {
		name=n;
		age=a;
	}
	
	// 11.1. ����setName��name������
	public void setName(String n) {
		// 7.1. һ�㺯�������Ը�ֵ��
		name = n;
	}
	
	void speak() {
//		Person(); // һ�㺯������ֱ�ӵ��ù��캯��
		System.out.println(name + ":" + age);
	}
	
	public void getAge() {
//		return ; // return�ؼ��ֽ��ͺ���
	}
}