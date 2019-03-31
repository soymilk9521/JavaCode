package com.arc.learn.objectdemo;

/**
 * 一. 创建Car类（Java语言描述汽车）：
 * 分析：
 * 	1. 属性：
 * 		轮胎数
 * 		颜色
 *  2. 行为：
 *  	运行
 *  
 */
class Car {
	// 成员变量：
	int num; 
	String color;
	// 成员函数（方法）：
	public void run() {
//		int x ;
//		System.out.println(x);
//		int num = 5;
//		System.out.println(num);
		System.out.println("轮子数量:" + num + ", " + "汽车颜色：" + color);
	}
}

public class CarDemo {
	
	public static void main(String[] args) {
		/**
		 *  二. 创建Car实例：
		 *  1. 在Java中，通过new关键字创建一个Car类型的实例
		 *  2. 变量bmw就是一个类类型的引用变量，指向该类的对象。
		 *  3. 要使用对象中的内容，可以通过对象.成员的形式来完成调用
		 *  4. 对象实例封装了该对象特有数据
		 */
		
		Car bmw = new Car(); 
//		bmw.num = 4;
		bmw.color = "red";
//		bmw.run();
		
		/**
		 * 三. 内存图解
		 * 栈内存、堆内存
		 */
		
		// 内存运行图解
		Car c1 = new Car();
		Car c2 = new Car();
		c1.num = 5;
		c2.color = "blue";
//		c1.run();
		
		// 内存运行图解
		Car c3 = new Car();
		Car c4 = c3;
		c3.num = 8;
		c4.color = "red";
//		c3.run();
		c3 = null;
//		c3.run();
//		c4.run();
		/*
		 * 四. 成员变量、成员方法
		 * 成员变量：
		 * 	 类的属性
		 * 成员方法：
		 *   类的行为
		 *   
		 * 成员变量和局部变量的区别：
		 * 1. 定义位置不同
		 * 成员变量定义在类中，作用域最大，整个类中都可以访问
		 * 局部变量定义在函数，语句，局部代码块中，只有所属区域有效
		 * 2. 内存分配不同
		 * 成员变量存在堆内存的对象中
		 * 局部变量存在栈内存的方法中
		 * 3. 生命周期不同
		 * 成员变量随着对象的创建而存在，随着对象的消失而消失
		 * 局部变量随着所属区域的执行而存在，随着所属区域的执行结束而释放。
		 * 4. 初始化不同
		 * 成员变量都有默认初始化值。
		 * 局部变量没有默认初始化值。局部变量如果不初始化不可以使用
		 */
		
		/*
		 * 五. 面向对象成员变量和局部变量同名问题
		 * 默认初始化与显示初始化
		 */
		
		
		/**
		 * 六. 类类型参数
		 *  变量c1是carFactory的参数
		 */
//		System.out.println("Car改装前:");
//		c1.run(); 
//		carFactory(c1);
//		System.out.println("Car改装后:");
//		c1.run();
		
		
		/**
		 * 七. 匿名对象
		 * 匿名函数运行图解
		 */
		new Car().num = 5;
		new Car().color = "green";
//		new Car().run();
		/*
		 * 匿名对象就是创建对象的简写形式
		 * 使用场景：
		 * 1. 当对象堆方法进进行一次访问时，就可以使用匿名对象。
		 * 2. 匿名对象可以作为参数进行传递。
		 */
		carFactory2(new Car());
	}
	
	/**
	 * 改装汽车
	 * 明确传入参数： 汽车
	 * 明确返回值： void
	 */
	public static void carFactory(Car car) { 
		car.num = 4;
		car.color = "yellow";
	}
	
	public static void carFactory2(Car car) {
		car.num = 6;
		car.color = "greeeeeeeee";
		System.out.println("轮胎数量:" + car.num + ", 汽车颜色:" + car.color );
	}

}

