package com.arc.learn.switchdemo;

public class SwitchTest {

	public static void main(String[] args) {
		/*
		 switch语句实现数字转星期
		 1 ... 星期一
		 2 ... 星期二
		 3 ... 星期三
		 4 ... 星期四
		 5 ... 星期五
		 6 ... 星期六
		 7 ... 星期日
		 */
		int x = 3;
		switch(x) {
		case 1:
			System.out.println("星期一");
			break;
		case 2:
			System.out.println("星期二");
			break;
		case 3:
			System.out.println("星期三");
			break;
		case 4:
			System.out.println("星期四");
			break;
		case 5:
			System.out.println("星期五");
			break;
		case 6:
			System.out.println("星期六");
			break;
		case 7:
			System.out.println("星期日");
			break;
		default:
			System.out.println("不知道");
		}
	}

}
