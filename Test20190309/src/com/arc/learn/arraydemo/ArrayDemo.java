package com.arc.learn.arraydemo;

public class ArrayDemo {

	int x = 4;
	
	public static void main(String[] args) {
		/*
		 * 同一种数据的集合， 其实数组就是一个容器
		 * 变量只能存放一个值。数组可以存放多个值 
		 * 
		 * 如果班级是一个数组，那么学生是班级的一员，也就是数组中的一个元素，给每个同学分配学号，相当于数组的索引。
		 * 找到班级通过学号就可以找到某位同学。
		 * 
		 * 通过new关键字创建数组，在内存中分配空间。
		 * Java运行会在内存中划分一片空间。
		 * Java的内存划分：
		 * 寄存器： CPU相关
		 * 本地方法区： 本地系统平台相关
		 * 方法区：
		 * 栈内存：局部变量，凡是定义在方法中的变量都是局部变量；变量所属作用域一旦结束， 该变量就自动释放。
		 * 堆内存：
		 */
		
		// 元素类型[] 数组名 = new 元素类型[元素个数或数组长度];
		int[] arr = new int[3];
		
		
		{// 局部代码块， 限定局部比那里的生命周期
			// 局部变量
			int age = 18;
		}
//		 System.out.println(age);
		
		for(int i=0; i<10; i++) {
			System.out.println(i);
		}
//		System.out.println(i);
	}

}
