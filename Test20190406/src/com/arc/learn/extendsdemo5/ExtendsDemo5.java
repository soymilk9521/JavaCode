package com.arc.learn.extendsdemo5;

public class ExtendsDemo5 {

	public static void main(String[] args) {
		Son son = new Son();
		son.show(); // ˼��1�����н��
	}

}

/**
 * 
 * �̳�ʵ��������ͼ��
 * Person p = new Person������
 * һ������ʵ��������
 * 1. JVM���ȡָ��·����Person.class�ļ��������ؽ��ڴ棬�������ȼ���Person��ĸ���
 * 2. �ڶ��ڴ��п����ڴ�ռ䣬�����ڴ��ַ��
 * 3. ���ڶ���ռ��У��Զ������Խ���Ĭ�ϳ�ʼ����
 * 4. ���ö�Ӧ�Ĺ��캯�����г�ʼ����
 * 5. �ڹ��캯���У���һ�л��ȵ��ø���Ĺ��캯�����г�ʼ��
 * 6. �����ʼ����Ϻ��ٶ���������Խ�����ʾ��ʼ����
 * 7. �ٽ������๹�캯���ض���ʼ����
 * 8. ��ʼ����Ϻ� ����ַ��ֵ�����ñ�����
 * 
 */
class Father extends Object{
	Father() {
		super();
		this.show();
		return;
	}
	public void show() {
		System.out.println("Father is showing ...");
	}
}

class Son extends Father {
	int num = 8;
	Son(){
		super();
		// ͨ��super��ʼ������ʱ�������Ա������δ��ʾ��ʼ����
		// ��super()�����ʼ����Ϻ󣬲Ž�������ĳ�Ա������ʾ��ʼ����
		System.out.println("Son cons is running ..." + num);
		return;
	}
	public void show() {
//		super.show();
		System.out.println("Son is showing ..." + num);
	}
}
