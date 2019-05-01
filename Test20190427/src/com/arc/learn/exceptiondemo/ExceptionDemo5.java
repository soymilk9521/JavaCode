package com.arc.learn.exceptiondemo;

public class ExceptionDemo5 {

	public static void main(String[] args) {
		/**
		 * �쳣��������
		 * 
		 */
		Teacher teacher = new Teacher("Tom");
		try {
			teacher.teach();
		} catch (NoPlanException e) {
			e.printStackTrace();
		}
	}

}

class Computer {
	public int state = 2;
	public void run() throws BlueScreenException, NoPowerException {
		if (state == 1) {
			throw new BlueScreenException("����������");
		}
		if (state == 2) {
			throw new NoPowerException("����û����");
		}
		System.out.println("������������");
	}
	
	public void reset() {
		this.state = 0;
		System.out.println("������������ing");
	}
}

class Teacher {
	private String name;
	private Computer computer;
	public Teacher(String name) {
		this.name = name;
		computer = new Computer();
	}
	
	public void teach() throws NoPlanException {
		try {
			computer.run();
			System.out.println(name +" ��ʦ��ʼ�Ͽ�");
		} catch (BlueScreenException e) {
			System.out.println(e.getMessage());
			computer.reset();
			teach();
			 e.printStackTrace();
		} catch (NoPowerException e) {
			System.out.println(e.getMessage());
			test();
//			throw e;
			throw new NoPlanException("�γ��޷����У�ԭ��" + e.getMessage());
		}
	}

	private void test() {
		System.out.println("�����ϰ");
	}
}

/**
 * �����쳣
 */
class BlueScreenException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public BlueScreenException() {
		super();
	}
	public BlueScreenException(String message) {
		super(message);
	}
}

/**
 * û���쳣
 *
 */
class NoPowerException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	public NoPowerException() {
		super();
	}
	
	public NoPowerException(String message) {
		super(message);
	}
}

class NoPlanException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NoPlanException() {
		super();
	}
	
	public NoPlanException(String message) {
		super(message);
	}
}