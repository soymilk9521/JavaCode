package com.arc.learn.ifdemo;

/**
 * @author kr
 *
 */
public class IfDemo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * if语句第二种格式 :
		 * if（条件表达式） { 
		 * 	执行语句 1
		 * }else {
		 * 	执行语句2
		 * }
		 */
		int x = 2;
		// if语句控制范围line22~26后的右大括号结束
		if(x>1) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
		// 三元运算符，就是if else语句的简写形式
		// 两者之间的区别：
		// 三元运算符必须有返回结果
		String c = (x>1)? "yes": "no";
		System.out.println(c);
 	}

}
