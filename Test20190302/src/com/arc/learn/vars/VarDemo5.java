package com.arc.learn.vars;

public class VarDemo5 {

	public static void main(String[] args) {
		int a = 2;
		int b = 3;
		// ==比较运算符，用来比较两个数值是否相等，相等返回true，否则返回false。
		System.out.println(a==b);
		// !=比较运算符，用来比较两个数值是否相等，不相等返回true，否则返回false。
		System.out.println(a!=b);
		System.out.println(b>=a);
		
		// & 当与运算符左右两边同为true的时候返回true，否则返回false
		// true & false = false  
		// false & true = false
		// false & false = false
		// true & true  = true
		
		// | 当或运算符左右两边有一个为true的时候返回true，否则返回false
		// true | false = true  
		// false | true = true
		// false | false = false
		// true | true  = true
		
		// ^ 当异或运算符左右两边不同的时候返回true，否则返回false
		// true ^ false = true  
		// false ^ true = true
		// false ^ false = false
		// true ^ true  = false 
		
		// ! 非运算符，非真即假，非假即真
		// !true  = false
		// !false = true 
		
		// && 当与运算符左右两边同为true的时候返回true，否则返回false
		// true && false = false  
		// false && true = false
		// false && false = false
		// true && true  = true
		
		// || 当或运算符左右两边有一个为true的时候返回true，否则返回false
		// true || false = true  
		// false || true = true
		// false || false = false
		// true || true  = true
		
		String str = 5<3? "true":"false";
		System.out.println(str);
		
		int x = 5;
		int y = 9;
		int max = x>y ? x: y;
		System.out.println(max);
		
	}

}
