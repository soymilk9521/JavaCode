package com.arc.learn.innerclass2;

public class InnerclassDemo2 {

	public static void main(String[] args) {
		/**
		 * Ϊʲô�ڲ�����Է����ⲿ���еĳ�Ա��
		 * ��Ϊ�ڲ����г����ⲿ���е����á� --�ⲿ��.this
		 */
		Outer.Inner in = new Outer().new Inner();
		in.show();
	}

}

class Outer {
	int num = 3;
	Inner getInner() {
		return new Inner();
	}
	class Inner {
		int num = 4;
		void show() {
			int num = 5;
			System.out.println(num);
			System.out.println(Inner.this.num);
			System.out.println(Outer.this.num);
		}
	}
}
