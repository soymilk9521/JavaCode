package com.arc.learn.interfacedemo4;

public class InterfaceDemo4 {
	public static void main(String[] args) {
		
	}
}	

/**
 * 1. 接口的特点：
 *  1.1. 接口是对外暴露的规则
 *  1.2. 接口是程序的功能扩展
 *  1.3. 接口的出现降低了耦合性
 *  1.4. 接口可以用来多实现
 * 
 * 举列：安卓手机type-c接口，苹果手机充电接口
 * 
 */

/**
 * 
 * 使用笔记本电脑
 * 笔记本可以使用的外置设备（device）：
 * 	鼠标、优盘等
 *
 */
class BookPC {
	
	void useMouse(Mouse m) {
		
	}
	
}

/**
 * 
 * 鼠标（mouse）
 *
 */
class Mouse {
	void run() {
		System.out.println("Mouse is running ...");
	}
}

/**
 * 
 * 优盘（USB flash drive）
 *
 */
class UDisc {
	void run() {
		System.out.println("UDisc is running ...");
	}
}

/**
 * 
 * 无线鼠标（wireless mouse）
 *
 */
class WirelessMouse{
	void run() {
		System.out.println("WirelessMouse is running ...");
	}
}