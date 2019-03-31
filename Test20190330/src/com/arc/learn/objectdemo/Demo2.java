package com.arc.learn.objectdemo;

/**
 * 引用数据类型传递
 * @author kr
 *
 */
public class Demo2 {
	
	public static void main(String[] args) {
		// 图解引用类型传递
		Demo d  = new Demo();
		d.x = 9;
		System.out.println(d.x);
		d.show(d);
		System.out.println(d.x);
		
	}
}

class Demo {
	// 成员变量
	int x=3;
	
	/**
	 * 类类型参数传递
	 * @param car
	 */
	public void show(Demo demo) {
		demo.x = 4;
	}
}
