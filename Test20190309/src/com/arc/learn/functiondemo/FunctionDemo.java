package com.arc.learn.functiondemo;

public class FunctionDemo {

	public static void main(String[] args) {
//		int sum = add2(3, 4);
//		System.out.println(sum);
//		int sum2 = add2(7,8);
//		System.out.println(sum2);
//		
//		System.out.println(add2(9,100));
//		System.out.println(sub(111,20));
//		noreturnMethod();
//		draw(4,5);
//		draw(8,9);
//		System.out.println(equals(4,5));
//		mul99();
		System.out.println(level(79));
		
		
	}
	public static int add2(int a, int b){
		return a + b;
	}
	/*
	 * 格式：
	 * 修饰符 返回值类型 函数名（参数类型 参数名1， 参数类型 参数2， ....） {
	 * 		执行语句；
	 * 		return 返回值；
	 * }
	 */
	public static int add(int a, int b) {
		return a + b;
	}
	
	public static int sub(int a, int b) {
		return a-b;
	}
	
	// 特殊情况，没有返回值
	public static void noreturnMethod() {
		System.out.println("hello world ");
//		return;
	}
	
	/**
	 * 定义一个功能，在控制台画一个row行，col列的矩形
	 * 明确返回值为： void
	 * 明确参数列表： row行， col列
	 * 
	 */
	public static void draw(int row, int col) {
		for(int i = 1; i<= row; i++) {
			for(int y=1; y<=col; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	
	
	/**
	 * 定义一个功能，比较两个数是否相等
	 * 明确参数列表： 两个数值
	 * 明确返回值类型: true/false
	 * 
	 * 1. if else方式 
	 * 2. 三元运算符方式
	 * 3. 直接返回比较运算符
	 */
	public static boolean equals(int a, int b) {
//		if(a == b) {
//			return true;
//		}else {
//			return false;
//		}
//		return (a==b)?true:false;
		return a==b;
	}
	
	
	
	/**
	 * 定义一个功能，打印九九乘法表
	 * 明确返回值： void
	 * 明确参数： 没有参数
	 * 
	 * 外层循环9行.
	 * 内层循环循环行数次
	 * \t制表符
	 */
	public static void mul99() {
		for(int x=1; x<=9; x++) {
			for(int y=1; y<=x; y++) {
				System.out.print(y + "*" + x + "=" + y*x + "\t");
			}
			System.out.println();
		}
	}
	
	
	
	/**
	 * 根据考试成绩获取学生分数对应等级
	 * 90~100   A
	 * 80~89    B
	 * 70~79    C
	 * 60~69    D
	 * 60以下       E
	 * 
	 * 明确返回结果： 等级 char类型
	 * 明确参数列表： 分数 int类型
	 * 
	 */
	public static char level(int score) {
		if(score>=90 && score <=100) {
			return 'A';
		}else if(score>=80 && score <=89) {
			return 'B';
		}else if(score>=70 && score <=79) {
			return 'C';
		}else if(score>=60 && score <=69) {
			return 'B';
		}else {
			return 'E';
		}
	}
	
	
}
