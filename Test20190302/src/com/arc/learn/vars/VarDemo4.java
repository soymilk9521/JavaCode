package com.arc.learn.vars;

public class VarDemo4 {
	public static void main(String[] args) {
		// 整型计算完的结果还是整型
		int a = 1256/1000*1000;
		System.out.println(a);
		
		System.out.println("5+5="+5+5);
		/*
		 * b += 3
		 * b = b + 3;    
		 * b -= 3;
		 * b = b -3;
		 */
		
		int b = 3;
		b += 2;
		System.out.println(b);
		
		byte c = 4;
		c+=2;   // += 不进行变量提升，byte类型直接的加运算不报错
		//c = c + 2; 变量提升为int类型，将int类型赋值给byte类型，类型不匹配报错。
		System.out.println(c);
		
	}
}
