package com.arc.learn.abstractdemo2;

public class AbstractDemo {

	public static void main(String[] args) {
//		Demo demo = new Demo(); // �����಻��ʵ����
	}

}

/**
 *  1. ������ϸ�ڣ�
 *  1.1. ��������û�й��캯���� --����
 *  1.2. ����������зǳ��󷽷��� --����
 *  1.3. abstract�ؼ��ֲ���������Щ�ؼ���һ��ʹ�ã� -- final��private��static
 *  1.4. ��������һ���������
 *  	1.4.1. ��ͬ�㣺��������һ���඼������һ������������Ժ���Ϊ
 *  	1.4.2. ��ͬ�㣺
 *  		һ�������㹻����Ϣ����һ�����������������Ϣ����
 *  		һ�����в��ܶ�����󷽷����������п����зǳ��󷽷�
 *  		һ�������ʵ���������󷽷�����ʵ����
 *  1.5. ������һ���Ǹ����� -- �ǵ�
 */
abstract class Demo {
	Demo() { //1.1 ���캯��
		
	}
	
	abstract void show(); // ���󷽷�
	
	int add(int a, int b) { // 1.2. �ǳ��󷽷�
		return a + b;
	}
	
	
}