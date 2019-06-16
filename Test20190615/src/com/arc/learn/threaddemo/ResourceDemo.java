package com.arc.learn.threaddemo;

public class ResourceDemo {

	public static void main(String[] args) {
		/**
		 * �̼߳�ͨѶ��
		 * ����̲߳���ͬһ����Դ
		 * �����̰߳�ȫ����
		 * 
		 */
		
		Resource r = new Resource();
		Input input = new Input(r);
		Output output = new Output(r);
		
		Thread t0 = new Thread(input);
		Thread t1 = new Thread(output);
		
		t0.start();
		t1.start();
				
	}

}


class Resource {
	public String name;
	public String sex;
	
}

class Input implements Runnable {
	
	Resource r;
	
	Input(Resource r){
		this.r = r;
	}
	@Override
	public void run() {
		int x = 0;
		while(true) {
			if(x==0) {
				r.name = "Tom";
				r.sex = "male";
			}else {
				r.name = "����";
				r.sex = "ŮŮŮŮ";
			}
			x  = (x+1) % 2;
		}
		
	}
	
}

class Output implements Runnable {

	Resource r;
	
	Output(Resource r){
		this.r = r;
	}
	
	@Override
	public void run() {
		while(true) {
			System.out.println(r.name + "..." + r.sex);
		}
	}
	
}