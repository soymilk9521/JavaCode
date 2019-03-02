package com.arc.learn.vars;

public class VarDemo {

	public static void main(String[] args) {
		// 定义一个变量
		// 变量类型   变量名称 = 变量值
		int age = 180;
		
		byte b = 10;
		
		// 自动类型转换
		int sum = b + age ;
		
		// 强制类型转换
		byte b2 = (byte)age;
		
		System.out.println("age=" + age);
		System.out.println("b2=" + b2);
		
		
	    // byte， short， char计算过程中会自动转换为int类型，然后参与运算。
		byte b3 = 5;
		// byte b4 =  b2 + b3 ; 发生错误，由于运算过程中变量自动提升为int类型，将int类型付给byte类型，类型不匹配所以错误。
		byte b4 = (byte) (b2 + b3);
		
		short s = 100;
		short s2 = 50;
		short s3 = (short) (s + s2);
		
		long l = 99999999999L;
		
		float f = 2.3f;
		float f1 = 50.25f;
		float f2 = f + f1;
	}

}
