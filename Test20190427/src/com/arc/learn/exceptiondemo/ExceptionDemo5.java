package com.arc.learn.exceptiondemo;

public class ExceptionDemo5 {

	public static void main(String[] args) {
		/**
		 * 异常处理事例
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
			throw new BlueScreenException("电脑蓝屏了");
		}
		if (state == 2) {
			throw new NoPowerException("电脑没电了");
		}
		System.out.println("电脑正常运行");
	}
	
	public void reset() {
		this.state = 0;
		System.out.println("电脑正在重启ing");
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
			System.out.println(name +" 老师开始上课");
		} catch (BlueScreenException e) {
			System.out.println(e.getMessage());
			computer.reset();
			teach();
			 e.printStackTrace();
		} catch (NoPowerException e) {
			System.out.println(e.getMessage());
			test();
//			throw e;
			throw new NoPlanException("课程无法进行，原因：" + e.getMessage());
		}
	}

	private void test() {
		System.out.println("大家自习");
	}
}

/**
 * 蓝屏异常
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
 * 没电异常
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