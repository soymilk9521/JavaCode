package com.arc.learn.objectdemo;

public class PersonDemo {

	public static void main(String[] args) {
		// ����Person�����ʵ����
		Person p = new Person();
		// ����Ա������ֵ
//		p.age = 20;
		p.setAge(20);
		p.name = "Eason";

		// ���ó�Ա����
//		p.speak();
		int x = p.getAge();
		System.out.println(x);
		
		Person p2 = new Person();
		// ���ݲ�����
//		p2.age = -10;
//		p2.setAge(-10);
		p2.name = "Karen";
//		p2.speak();
		
		
		
		/*
		 * ��װ��
		 * ��װ��Encapsulation����������󷽷�����Ҫ���������ǰѶ�������Ժ���Ϊ���Ϊһ�����������壬
		 * �����������ض�����ڲ�ʵ��ϸ�ڡ������ṩ���������ʷ�ʽ��
		 * 
		 * �������ʼǱ����ԣ���CPU��Ӳ�̡��ڴ����ȵ���Ԫ������װ������������ṩ��ꡢ���̺���Ļ���û�������
		 * ����ʹ�ñʼǱ��Ĺ����У�������ļ�����ڲ�������еģ�ֱ��ʹ�����ṩ�Ĺ��ܼ��ɡ�
		 * 
		 * ��Java��ͨ���ؼ���private��protected��publicʵ�ַ�װ����Щ�ؼ����ֽз������η���
		 * 
		 * �ô���
		 *   ���仯���� -- �Ӹ��ڴ������Ӹ���̬Ӳ��
		 *   ����ʹ��    -- ��װΪһ�����壬����Я��ʹ�� 
		 *   ��������� -- ��������
		 *   ��߰�ȫ�� -- ���˷Ƿ����ݣ���߰�ȫ
		 * ��װ��ԭ��
		 * 	 ������Ҫ�����ṩ�����ݶ�����������
		 *  �����Զ����������������ṩ�������ʷ�����
		 *  
		 * Java����С�ķ�װ����Ǻ�����swap��������
		 * 
		 * private�ؼ���
		 * 	�����޶�����
		 *  �������γ�Ա�����ͳ�Ա����
		 *  ��private���εı����ͷ�����ֻ�ڱ�������Ч��
		 * public�ؼ��� 
		 *  �����޶���
		 *  ���γ�Ա�����ͳ�Ա����
		 *  ��public���εı����ͷ��������κεط�������ʹ�á�
		 */
		
	}
}



/**
 * 
 * ������
 * ���ԣ�
 *  ���֣�name��
 *  ���䣨age��
 * ��Ϊ��
 * 	˵����speak��
 *
 */
class Person {
	// ����
	String name;
	// ����
	private int age;
	
	// ˵��
	void speak() {
		System.out.println(name + "����" + age + "��");
	}
	
	/**
	 * ��������(public)
	 * @param age
	 */
	public void setAge(int a) {
		checkAge(a);
		age = a;
	}
	
	private void checkAge(int a) {
		if(a < 0) {
			System.out.println("�������");
			return;
		}
	}
	
	/**
	 * ȡ������ (public)
	 * @return
	 */
	public int getAge() {
		return age;
	}
	
}