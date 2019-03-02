package com.arc.learn.vars;

public class VarDemo2 {

	public static void main(String[] args) {
		System.out.println('a');
		System.out.println('a' + 1);
		/**
		 ACSII
		 GB2313 
		 GBK
		 Unicode
		*/
		byte b1=3,b2=4,b;
		// b=b1+b2;
		b=3+4;
		
		// 取余运算过程中符号和被取余的数保持一致
		// -5 % 2 = -1;
		// 5 % -2 = 1;
		int mod = 5 % -2;
		System.out.println(mod);
		
		int i = 5;
		// ++i  i+1;
		//int i2 = ++i;
		//System.out.println(i2);
//		int i3 = i++;
//		System.out.println(i3);
//		System.out.println(i);
//		int i4 = --i;
//		System.out.println(i4);
		int i5 = i--;
		System.out.println(i5);
		System.out.println(i);
		
		
		
		
		

	}

}
