package com.arc.learn.objectdemo;

/**
 * һ. ����Car�ࣨJava����������������
 * ������
 * 	1. ���ԣ�
 * 		��̥��
 * 		��ɫ
 *  2. ��Ϊ��
 *  	����
 *  
 */
class Car {
	// ��Ա������
	int num; 
	String color;
	// ��Ա��������������
	public void run() {
//		int x ;
//		System.out.println(x);
//		int num = 5;
//		System.out.println(num);
		System.out.println("��������:" + num + ", " + "������ɫ��" + color);
	}
}

public class CarDemo {
	
	public static void main(String[] args) {
		/**
		 *  ��. ����Carʵ����
		 *  1. ��Java�У�ͨ��new�ؼ��ִ���һ��Car���͵�ʵ��
		 *  2. ����bmw����һ�������͵����ñ�����ָ�����Ķ���
		 *  3. Ҫʹ�ö����е����ݣ�����ͨ������.��Ա����ʽ����ɵ���
		 *  4. ����ʵ����װ�˸ö�����������
		 */
		
		Car bmw = new Car(); 
//		bmw.num = 4;
		bmw.color = "red";
//		bmw.run();
		
		/**
		 * ��. �ڴ�ͼ��
		 * ջ�ڴ桢���ڴ�
		 */
		
		// �ڴ�����ͼ��
		Car c1 = new Car();
		Car c2 = new Car();
		c1.num = 5;
		c2.color = "blue";
//		c1.run();
		
		// �ڴ�����ͼ��
		Car c3 = new Car();
		Car c4 = c3;
		c3.num = 8;
		c4.color = "red";
//		c3.run();
		c3 = null;
//		c3.run();
//		c4.run();
		/*
		 * ��. ��Ա��������Ա����
		 * ��Ա������
		 * 	 �������
		 * ��Ա������
		 *   �����Ϊ
		 *   
		 * ��Ա�����;ֲ�����������
		 * 1. ����λ�ò�ͬ
		 * ��Ա�������������У�����������������ж����Է���
		 * �ֲ����������ں�������䣬�ֲ�������У�ֻ������������Ч
		 * 2. �ڴ���䲻ͬ
		 * ��Ա�������ڶ��ڴ�Ķ�����
		 * �ֲ���������ջ�ڴ�ķ�����
		 * 3. �������ڲ�ͬ
		 * ��Ա�������Ŷ���Ĵ��������ڣ����Ŷ������ʧ����ʧ
		 * �ֲ������������������ִ�ж����ڣ��������������ִ�н������ͷš�
		 * 4. ��ʼ����ͬ
		 * ��Ա��������Ĭ�ϳ�ʼ��ֵ��
		 * �ֲ�����û��Ĭ�ϳ�ʼ��ֵ���ֲ������������ʼ��������ʹ��
		 */
		
		/*
		 * ��. ��������Ա�����;ֲ�����ͬ������
		 * Ĭ�ϳ�ʼ������ʾ��ʼ��
		 */
		
		
		/**
		 * ��. �����Ͳ���
		 *  ����c1��carFactory�Ĳ���
		 */
//		System.out.println("Car��װǰ:");
//		c1.run(); 
//		carFactory(c1);
//		System.out.println("Car��װ��:");
//		c1.run();
		
		
		/**
		 * ��. ��������
		 * ������������ͼ��
		 */
		new Car().num = 5;
		new Car().color = "green";
//		new Car().run();
		/*
		 * ����������Ǵ�������ļ�д��ʽ
		 * ʹ�ó�����
		 * 1. ������ѷ���������һ�η���ʱ���Ϳ���ʹ����������
		 * 2. �������������Ϊ�������д��ݡ�
		 */
		carFactory2(new Car());
	}
	
	/**
	 * ��װ����
	 * ��ȷ��������� ����
	 * ��ȷ����ֵ�� void
	 */
	public static void carFactory(Car car) { 
		car.num = 4;
		car.color = "yellow";
	}
	
	public static void carFactory2(Car car) {
		car.num = 6;
		car.color = "greeeeeeeee";
		System.out.println("��̥����:" + car.num + ", ������ɫ:" + car.color );
	}

}

