package com.arc.learn.fordemo;

public class ForTest {

	public static void main(String[] args) {
		/*
		 * �ۼ��㷨
		 * ��1-10�ĺ�
		 */
		int sum = 0;
		for(int i = 1; i<=10; i++) {
			sum +=i;
		}
		System.out.println(sum);
		
		
		/*
		 * �������㷨
		 * ��1-100֮��6�ı����ж��ٸ�
		 */
		int count = 0;
		for (int i = 1; i <=100; i++) {
			if(i%6 == 0) {
				count++;
			}
		}
		System.out.println(count);
		
		
		// for��while ������
		int x = 1;
		while(x<5) {
			System.out.println("x=" + x);
			x++;
		}
		System.out.println("x=" + x);
		System.out.println("--------------");
		for(int y=1;y <5; y++) {
			System.out.println("y=" + y);
		}
		//System.out.println("y=" + y);
		
		
		//����ѭ����﷽ʽ
//		while(true) {}
//		for(;;) {}
		
	}

}
