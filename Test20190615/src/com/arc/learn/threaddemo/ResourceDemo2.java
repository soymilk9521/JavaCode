package com.arc.learn.threaddemo;

public class ResourceDemo2 {

	public static void main(String[] args) {
		/**
		 * �̼߳�ͨѶ��
		 * ����̲߳���ͬһ����Դ
		 * ���úͶ�ȡ��Դ���ͬ����������̰߳�ȫ����
		 */
		
		Resource r = new Resource();
		Input2 input = new Input2(r);
		Output2 output = new Output2(r);
		
		Thread t0 = new Thread(input);
		Thread t1 = new Thread(output);
		
		t0.start();
		t1.start();
				
	}

}

class Input2 implements Runnable {
	
	Resource r;
	
	Input2(Resource r){
		this.r = r;
	}
	@Override
	public void run() {
		int x = 0;
		while(true) {
			synchronized(r) {
				if(x==0) {
					r.name = "Tom";
					r.sex = "male";
				}else {
					r.name = "����";
					r.sex = "ŮŮŮŮ";
				}
			}
			x  = (x+1) % 2;
		}
		
	}
	
}

class Output2 implements Runnable {

	Resource r;
	
	Output2(Resource r){
		this.r = r;
	}
	
	@Override
	public void run() {
		while(true) {
			synchronized(r) {
				System.out.println(r.name + "..." + r.sex);
			}
		}
	}
	
}