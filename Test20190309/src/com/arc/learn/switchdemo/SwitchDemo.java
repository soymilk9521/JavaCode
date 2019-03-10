package com.arc.learn.switchdemo;

public class SwitchDemo {

	public static void main(String[] args) {
		/*
		 * switch(表达式){
		 * 	case 取值1:
		 * 		执行语句；
		 * 		break；
		 *  case 取值2：
		 *  	执行语句；
		 * 		break；
		 *  ...
		 *  default:
		 *  	执行语句；
		 *  	break；
		 * }
		 */
		
		int x = 4; 
		switch(x) { // byte, short, int, char， 字符串类型String
		case 4:
			System.out.println("a");
			break;
		case 2:
			System.out.println("b");
			break;
		case 3:
			System.out.println("c");
			break;
		default:
			System.out.println("d");
			break;
		}
		
		
		// 简单的计算器
		int m = 4; int n = 6;
		char c = '^';
		switch(c) { // byte, short, int, char, String
		default:
			System.out.println("不知道");
//			break;
		case '+':
			System.out.println(m + n);
			break;
		case '-':
			System.out.println(m - n);
			break;
		case '*':
			System.out.println(m * n);
			break;
		case '/':
			System.out.println(m / n);
			break;
		}
		
		// break作用
		// case语句顺序可变
		
		if(c == '^') {
			System.out.println("true");
		}
	}

}
