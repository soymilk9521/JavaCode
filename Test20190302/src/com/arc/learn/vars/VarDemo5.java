package com.arc.learn.vars;

public class VarDemo5 {

	public static void main(String[] args) {
		int a = 2;
		int b = 3;
		// ==�Ƚ�������������Ƚ�������ֵ�Ƿ���ȣ���ȷ���true�����򷵻�false��
		System.out.println(a==b);
		// !=�Ƚ�������������Ƚ�������ֵ�Ƿ���ȣ�����ȷ���true�����򷵻�false��
		System.out.println(a!=b);
		System.out.println(b>=a);
		
		// & �����������������ͬΪtrue��ʱ�򷵻�true�����򷵻�false
		// true & false = false  
		// false & true = false
		// false & false = false
		// true & true  = true
		
		// | �������������������һ��Ϊtrue��ʱ�򷵻�true�����򷵻�false
		// true | false = true  
		// false | true = true
		// false | false = false
		// true | true  = true
		
		// ^ �����������������߲�ͬ��ʱ�򷵻�true�����򷵻�false
		// true ^ false = true  
		// false ^ true = true
		// false ^ false = false
		// true ^ true  = false 
		
		// ! ������������漴�٣��Ǽټ���
		// !true  = false
		// !false = true 
		
		// && �����������������ͬΪtrue��ʱ�򷵻�true�����򷵻�false
		// true && false = false  
		// false && true = false
		// false && false = false
		// true && true  = true
		
		// || �������������������һ��Ϊtrue��ʱ�򷵻�true�����򷵻�false
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
