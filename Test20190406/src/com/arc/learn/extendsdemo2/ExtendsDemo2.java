package com.arc.learn.extendsdemo2;

public class ExtendsDemo2 {

	public static void main(String[] args) {
		Son son = new Son();
		son.show();
	}

}

/**
 * �̳й�ϵ�г�Ա�����ص㣺
 * 1. ������ĳ�Ա�����;ֲ���������ʱ����this�ؼ�������
 * 2. ������͸����г�Ա��������ʱ����super�ؼ�������
 * 3. this��super�÷����ƣ�����
 *		3.1. this�������������á�
 * 		3.2. super������Ŀռ䡣
 * 4. �̳й�ϵ��Ա�������ڴ�ͼ��
 * 
 */
class Father {
	// ˼��1: ��������������г�Ա����ͬ��
	int num = 5; 
}

class Son extends Father {
	int num = 8;
	void show() {
		// ����̳и��࣬����Ϳ���ֱ�ӷ��������еĳ�Ա����
		// ˼��2�� ��������н���Ա����˽�л������ܷ���ʵ�����ĳ�Ա����
		System.out.println(this.num + "..." + super.num); 
	}
}