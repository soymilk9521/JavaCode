package com.arc.learn.staticdemo;

public class StaticDemo {

	public static void main(String[] args) {
		/*
		 * static关键字：
		 *  1. 用于修饰成员：成员变量和成员函数
		 *  2. 被修饰的成员具备以下特点：
		 *  	2.1. static是一个修饰符，用于修饰成员。
		 *    	2.2. static修饰的成员被对象共享。
		 *      2.3. static随着类的加载而加载。static修饰的成员，优先对象存在，。
		 *      2.4. static修饰的成员可以直接被类名调用。
		 *      2.5. static修饰的是共享数据，对象中存储的是特有数据。
		 *  3. 使用注意：
		 *  	3.1. 静态方法只能访问静态成员。
		 *  	3.2. 静态方法中不可以写this、super关键字。
		 *  	3.3. 主函数是静态方法。
		 *  4. 实例变量，成员变量，静态变量，类变量
		 *  5. 成员变量和静态变量的区别：
		 *  	5.1. 生命周期不同 
		 *  		成员变量随着对象的创建而存在，随着对象的消失而释放。
		 *          静态变量随着类的加载而加载，随着类的消失而消失。
		 *      5.2. 调用方式不同
		 *      	成员变量只能用对象调用
		 *          静态变量可以用对象调用也可以使用类名直接调用。
		 *      5.3. 别名不同
		 *      	成员变量又叫实例变量
		 *      	静态变量又叫类变量
		 *      5.4. 数据存储位置不同
		 *      	成员变量存储在堆内存的对象中，是对象特有数据。
		 *          静态变量存储在方法区中，是对象的共享数据 。 
		 */
		Student stu = new Student();
		stu.name = "Jay";
		stu.grade = "三年二班";
		stu.show();
		Student stu2 = new Student();
		stu2.name = "JJ";
		stu2.grade = "三年二班";
		stu2.show();
		// System.out.println(Student.grade);
	}

}

class Student {
	String name;
	String grade; // TODO 画图解释多个学生同一个年级问题，引出static关键字
	
	void show() {
		System.out.println(grade + ":" +name);
	}
}