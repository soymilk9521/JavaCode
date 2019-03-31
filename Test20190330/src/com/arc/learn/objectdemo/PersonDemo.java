package com.arc.learn.objectdemo;

public class PersonDemo {

	public static void main(String[] args) {
		// 创建Person类对象（实例）
		Person p = new Person();
		// 给成员变量赋值
//		p.age = 20;
		p.setAge(20);
		p.name = "Eason";

		// 调用成员方法
//		p.speak();
		int x = p.getAge();
		System.out.println(x);
		
		Person p2 = new Person();
		// 数据不合理
//		p2.age = -10;
//		p2.setAge(-10);
		p2.name = "Karen";
//		p2.speak();
		
		
		
		/*
		 * 封装：
		 * 封装（Encapsulation）是面向对象方法的重要特征，就是把对象的属性和行为结合为一个独立的整体，
		 * 并尽可能隐藏对象的内部实现细节。对外提供公共方访问方式。
		 * 
		 * 举例：笔记本电脑！将CPU、硬盘、内存条等电子元器件组装到壳子里，对外提供鼠标、键盘和屏幕与用户交互。
		 * 我们使用笔记本的过程中，无需关心计算机内部如何运行的，直接使用其提供的功能即可。
		 * 
		 * 在Java中通过关键字private、protected和public实现封装，这些关键字又叫访问修饰符。
		 * 
		 * 好处：
		 *   将变化隔离 -- 加个内存条，加个固态硬盘
		 *   便于使用    -- 封装为一个整体，便于携带使用 
		 *   提高重用性 -- 拿来即用
		 *   提高安全性 -- 过滤非法数据，提高安全
		 * 封装的原则：
		 * 	 将不需要对外提供的内容都隐藏起来。
		 *  把属性都隐藏起来，对外提供公共访问方法。
		 *  
		 * Java中最小的封装体就是函数。swap（）函数
		 * 
		 * private关键字
		 * 	修饰限定符。
		 *  用于修饰成员变量和成员方法
		 *  被private修饰的变量和方法，只在本类中有效。
		 * public关键字 
		 *  修饰限定符
		 *  修饰成员变量和成员方法
		 *  被public修饰的变量和方法，在任何地方都可以使用。
		 */
		
	}
}



/**
 * 
 * 描述人
 * 属性：
 *  名字（name）
 *  年龄（age）
 * 行为：
 * 	说话（speak）
 *
 */
class Person {
	// 名字
	String name;
	// 年龄
	private int age;
	
	// 说话
	void speak() {
		System.out.println(name + "今年" + age + "岁");
	}
	
	/**
	 * 设置年龄(public)
	 * @param age
	 */
	public void setAge(int a) {
		checkAge(a);
		age = a;
	}
	
	private void checkAge(int a) {
		if(a < 0) {
			System.out.println("年龄错误");
			return;
		}
	}
	
	/**
	 * 取得年龄 (public)
	 * @return
	 */
	public int getAge() {
		return age;
	}
	
}