package com.arc.learn.vars;

public class VarDemo3 {

	public static void main(String[] args) {
		// 基本数据类型 和字符串相加都会转换成字符串拼接。
		String str = "he" + "llo" + 12;
		System.out.println(str);
		
		String str2 = "hello";
		str2 = str2 + 1+9;
		System.out.println(str2);
		
		String str3 = "hello";
		str3 = 1+9 + str3;
		System.out.println(str3);
		
//		System.out.println(str);
//		str = true + "hello";
//		System.out.println(str);
	}

}
